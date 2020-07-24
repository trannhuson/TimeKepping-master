package com.timekeep.timekeeping.converter;

import org.springframework.stereotype.Component;

import com.timekeep.timekeeping.dto.AdminDto;
import com.timekeep.timekeeping.entity.Admin;

@Component
public class AdminConverter implements AdminConverterImpl{

	@Override
	public Admin entity(AdminDto adminDto) {
		Admin admin = new Admin();
		admin.setPassword(adminDto.getPassword());
		admin.setUsername(adminDto.getUsername());
		return admin;
	}

	@Override
	public AdminDto dto(Admin adminEntity) {
		AdminDto adminDto = new AdminDto();
		if(adminEntity.getId() != null) {
			adminDto.setId(adminEntity.getId());
		}
		adminDto.setPassword(adminEntity.getPassword());
		adminDto.setUsername(adminEntity.getUsername());
		return adminDto;
	}

	@Override
	public Admin adminEntity(AdminDto adminDto, Admin admin) {
		admin.setPassword(adminDto.getPassword());
		admin.setUsername(adminDto.getUsername());
		return admin;
	}

}
