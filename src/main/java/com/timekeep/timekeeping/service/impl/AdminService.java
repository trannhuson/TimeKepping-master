package com.timekeep.timekeeping.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.timekeep.timekeeping.converter.AdminConverter;
import com.timekeep.timekeeping.dto.AdminDto;
import com.timekeep.timekeeping.entity.Admin;
import com.timekeep.timekeeping.entity.Role;
import com.timekeep.timekeeping.repository.AdminRepository;
import com.timekeep.timekeeping.repository.RoleRepository;
import com.timekeep.timekeeping.service.AdminServiceImpl;

import java.util.Optional;

@Service
public class AdminService implements AdminServiceImpl {

    @Autowired
    AdminConverter adminConverter;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    AdminRepository adminRepository;



    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public AdminDto addAdmin(AdminDto adminDto) {
        Admin admin = adminConverter.entity(adminDto);
		String passwordHash = passwordEncoder.encode(admin.getPassword());

		admin.setPassword(passwordHash);
		Optional<Role> roleOptional = roleRepository.findByNameContaining(adminDto.getRole());
        admin.setRole(roleOptional.get());
        admin = adminRepository.save(admin);
        return adminConverter.dto(admin);
    }

    @Override
    public AdminDto updateAdmin(AdminDto adminDto) {
        Admin admin = new Admin();
        if (adminDto.getId() != null) {
            Admin admins = adminRepository.getOne(adminDto.getId());
            admin = adminConverter.adminEntity(adminDto, admins);
        } else {
            admin = adminConverter.entity(adminDto);
        }
        Role role = roleRepository.findFirstByName(adminDto.getRole());
        admin.setRole(role);
        admin = adminRepository.save(admin);
        return adminConverter.dto(admin);
    }

    @Override
    public void deleteAdmin(long[] ids) {
        for (long item : ids) {
            adminRepository.deleteById(item);
        }
    }

}
