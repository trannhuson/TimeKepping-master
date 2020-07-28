package com.timekeep.timekeeping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.timekeep.timekeeping.dto.AdminDto;
import com.timekeep.timekeeping.service.impl.AdminService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
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
