package com.timekeep.timekeeping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.timekeep.timekeeping.dto.RoleDto;
import com.timekeep.timekeeping.service.RolesService;
import com.timekeep.timekeeping.service.impl.UserService;

@RestController
public class RoleController {
	@Autowired
	RolesService roleService;
	
	@PostMapping("/addRole")
	public RoleDto createRole(@RequestBody RoleDto role) {
		return roleService.addRole(role);
	}
	
	@PutMapping("/updateRole/{id}")
	public RoleDto updateRole(@RequestBody RoleDto role,@PathVariable("id") long id) {
		role.setId(id);
		return roleService.updateRole(role);
	}
	@DeleteMapping("/deleteRole")
	public void deleteRole(@RequestBody long[] id) {
		roleService.deleteRole(id);
	}
}
