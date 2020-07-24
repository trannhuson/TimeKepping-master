package com.timekeep.timekeeping.converter;

import org.springframework.stereotype.Component;

import com.timekeep.timekeeping.dto.RoleDto;
import com.timekeep.timekeeping.entity.Role;

@Component
public class RoleConverter {
	public Role entity(RoleDto dto) {
		Role role = new Role();
		role.setName(dto.getName());
		return role;
	}
	public RoleDto toDTO(Role entity) {
		RoleDto dto = new RoleDto();
		if(entity.getId()!=null) {
			dto.setId(entity.getId());
		}
		dto.setName(entity.getName());
		return dto;
	}
	public Role roleEntity(RoleDto dto,Role role) {
		role.setName(dto.getName());
		return role;
	}
}
