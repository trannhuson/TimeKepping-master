package com.timekeep.timekeeping.service;

import java.util.List;

import com.timekeep.timekeeping.dto.temp.TotalDayDTO;
import com.timekeep.timekeeping.entity.TotalDay;
import org.springframework.data.domain.Pageable;

import com.timekeep.timekeeping.dto.UserLogDto;
import com.timekeep.timekeeping.entity.UserLog;

public interface UserLogServiceImpl {
	UserLogDto addUserLog(UserLogDto userLogDto);
	UserLogDto updateUserLog(UserLogDto userLogDto);
	void deleteUserLog(long []  ids);
	List<UserLogDto> findAll(Long id);
	int totalItem();
//	TotalDayDTO cacleDate(Long code, int thang);
//	List<TotalDayDTO> cacleDate(int month);
}
