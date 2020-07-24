package com.timekeep.timekeeping.service;

import com.timekeep.timekeeping.dto.UserDto;
import com.timekeep.timekeeping.dto.UserLogDto;

public interface INewService {
	UserDto addUser(UserDto userDto);
	UserDto updateUser(UserDto userDto);
	void delete(long [] ids);
}
