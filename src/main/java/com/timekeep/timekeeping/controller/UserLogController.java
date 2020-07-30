package com.timekeep.timekeeping.controller;

import com.timekeep.timekeeping.dto.temp.TotalDayDTO;
import com.timekeep.timekeeping.entity.TotalDay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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
import com.timekeep.timekeeping.entity.UserLog;
import com.timekeep.timekeeping.service.impl.UserLogService;
import com.timekeep.timekeeping.service.impl.UserService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class UserLogController {
    @Autowired
    UserService userService;

    @Autowired
    UserLogService userLogService;

    /*
     * @PostMapping("userlog") public UserLog getUserLog(@RequestBody UserLogDto
     * userLogDto) {
     *
     * return userLogService.createUserLog(userLogDto); }
     */
    @PostMapping(value = "/addUserLog",consumes = MediaType.APPLICATION_JSON_VALUE)
    public UserLogDto createUserLogDto(@RequestBody UserLogDto model) {
        model.setDate(new Date());

        return userLogService.addUserLog(model);
    }


    @PutMapping(value = "/updateUserLog/{id}")
    public UserLogDto updateUserLogDto(@RequestBody UserLogDto model, @PathVariable("id") long id) {
        model.setId(id);
        return userLogService.updateUserLog(model);
    }

    @DeleteMapping(value = "/deleteUserLog")
    public void deleteUserLog(@RequestBody long[] ids) {
        userLogService.deleteUserLog(ids);
    }

    @GetMapping(value = "/getUserLog")
    public UserLogOutput showUserLog(@RequestParam("page") int page, @RequestParam(required = false,name = "limit") int limit) {
        UserLogOutput result = new UserLogOutput();

        result.setPage(page);
        //Pageable pageable = new PageRequest(page-1,limit);
        //result.setListUserLog(userLogService.findAll(page));
        return null;
    }


}
