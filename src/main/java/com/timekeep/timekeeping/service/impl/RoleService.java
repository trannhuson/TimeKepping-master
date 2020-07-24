package com.timekeep.timekeeping.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timekeep.timekeeping.converter.RoleConverter;
import com.timekeep.timekeeping.dto.RoleDto;
import com.timekeep.timekeeping.entity.Role;
import com.timekeep.timekeeping.repository.RoleRepository;
import com.timekeep.timekeeping.service.RolesService;
@Service
public class RoleService implements RolesService{
	
	@Autowired
	RoleRepository roleRepository;
	
	@Autowired
	RoleConverter roleConverter;
	@Override
	public RoleDto addRole(RoleDto role) {
		Role roleDto = roleConverter.entity(role);
		roleDto = roleRepository.save(roleDto);
		return roleConverter.toDTO(roleDto);
	}
	@Override
	public RoleDto updateRole(RoleDto roleDto) {
		Role role = new Role();
		if(roleDto.getId() != null) {
			Role roles = roleRepository.getOne(roleDto.getId());
			role = roleConverter.roleEntity(roleDto, roles);
		}else {
			role = roleConverter.entity(roleDto);
		}
		role = roleRepository.save(role);
		return roleConverter.toDTO(role);
	}
	@Override
	public void deleteRole(long[] id) {
		for(long item: id) {
			roleRepository.deleteById(item);
		}
	}
	
}
