package com.timekeep.timekeeping.service;

import com.timekeep.timekeeping.dto.RoleDto;

public interface RolesService {
	RoleDto addRole(RoleDto role);
	RoleDto updateRole(RoleDto role);
	void deleteRole(long [] id);
}
