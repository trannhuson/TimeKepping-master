package com.timekeep.timekeeping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.timekeep.timekeeping.dto.AdminDto;
import com.timekeep.timekeeping.service.impl.AdminService;

@RestController
public class AdminController {
	@Autowired
	AdminService adminService;
	
	@PostMapping("/addAdmin")
	public AdminDto addAdmin(@RequestBody AdminDto adminDto) {
		return adminService.addAdmin(adminDto);
	}
	@PutMapping("/updateAdmin/{id}")
	public AdminDto updateAdmin(@RequestBody AdminDto adminDto,@PathVariable("id") long id) {
		adminDto.setId(id);
		return adminService.updateAdmin(adminDto);
	}
	@DeleteMapping("/deleteAdmin")
	public void delete(@RequestBody long [] ids) {
		adminService.deleteAdmin(ids);
	}
}	
