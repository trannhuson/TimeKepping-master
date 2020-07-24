package com.timekeep.timekeeping.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.timekeep.timekeeping.dto.UserLogDto;
import com.timekeep.timekeeping.entity.UserLog;

public interface UserLogServiceImpl {
	UserLogDto addUserLog(UserLogDto userLogDto);
	UserLogDto updateUserLog(UserLogDto userLogDto);
	void deleteUserLog(long []  ids);
	List<UserLogDto> findAll(Long id);
	int totalItem();
}
