package com.timekeep.timekeeping.controller;

<<<<<<< HEAD
import com.timekeep.timekeeping.entity.User;
import com.timekeep.timekeeping.repository.UserRepository;
import com.timekeep.timekeeping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
=======
import com.timekeep.timekeeping.dto.UserDto;
import com.timekeep.timekeeping.entity.User;
import com.timekeep.timekeeping.repository.UserRepository;
import com.timekeep.timekeeping.service.impl.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
>>>>>>> add files
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
<<<<<<< HEAD
@RequestMapping("/api/")
=======
>>>>>>> add files
public class UserController {


    @Autowired
    UserService userService;

<<<<<<< HEAD
    @GetMapping("users")
    public ResponseEntity<List<User>> getAllUser() {
        return new ResponseEntity<>(userService.findAllUser(), HttpStatus.OK);
    }

=======
//    @GetMapping("users")
//    public ResponseEntity<List<User>> getAllUser() {
//        return new ResponseEntity<>(userService.findAllUser(), HttpStatus.OK);
//    }
    @PostMapping("/addUser")
    public UserDto createUser(@RequestBody UserDto userDto) {
    	return userService.addUser(userDto); 
    }
    
    @PutMapping("/updateUser/{id}")
    public UserDto updateUser(@RequestBody UserDto userDto,@PathVariable("id") long id) {
    	userDto.setCode(id);
    	return userService.updateUser(userDto);
    }
    @DeleteMapping("/deleteUser")
    public void deleteUser(@RequestBody long[] ids) {
    	userService.delete(ids);
    }
>>>>>>> add files
}
