package com.timekeep.timekeeping.controller;

<<<<<<< HEAD
import com.timekeep.timekeeping.dto.UserLogDto;
import com.timekeep.timekeeping.entity.UserLog;
import com.timekeep.timekeeping.service.UserLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class UserLogController {

=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.timekeep.timekeeping.controller.output.UserLogOutput;
import com.timekeep.timekeeping.dto.UserLogDto;
import com.timekeep.timekeeping.service.impl.UserLogService;
import com.timekeep.timekeeping.service.impl.UserService;

@CrossOrigin
@RestController
//@RequestMapping("/api/")
public class UserLogController {
	@Autowired
	UserService userService;
	
>>>>>>> add files
    @Autowired
    UserLogService userLogService;


<<<<<<< HEAD
    @PostMapping("userlog")
    public UserLog getUserLog(@RequestBody UserLogDto userLogDto) {

        return userLogService.createUserLog(userLogDto);
    }

=======
	/*
	 * @PostMapping("userlog") public UserLog getUserLog(@RequestBody UserLogDto
	 * userLogDto) {
	 * 
	 * return userLogService.createUserLog(userLogDto); }
	 */
    @PostMapping(value="/addUserLog")
    public UserLogDto createUserLogDto(@RequestBody UserLogDto model) {
    	return userLogService.addUserLog(model);
    }
    @PutMapping(value="/updateUserLog/{id}")
    public UserLogDto updateUserLogDto(@RequestBody UserLogDto model,@PathVariable("id") long id) {
    	model.setId(id);
    	return userLogService.updateUserLog(model);
    }
    @DeleteMapping(value="/deleteUserLog")
    public void deleteUserLog(@RequestBody long[] ids) {
    	userLogService.deleteUserLog(ids);
    }
    @GetMapping(value="/getUserLog")
    public UserLogOutput showUserLog(@RequestParam("page") int page,@RequestParam("limit") int limit) {
    	UserLogOutput result = new UserLogOutput();
    	result.setPage(page);
    	//Pageable pageable = new PageRequest(page-1,limit);
    	//result.setListUserLog(userLogService.findAll(page));
    	return null;
    }
    
>>>>>>> add files

}
