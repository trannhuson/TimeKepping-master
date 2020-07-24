package com.timekeep.timekeeping.converter;

import org.springframework.stereotype.Component;

import com.timekeep.timekeeping.dto.UserDto;
import com.timekeep.timekeeping.entity.User;

@Component
public interface UserMapper extends EntityMapper<UserDto, User>{

}
