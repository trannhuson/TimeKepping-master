package com.timekeep.timekeeping.service.impl;

import com.timekeep.timekeeping.converter.UserLogMapperImp;
import com.timekeep.timekeeping.dto.UserLogDto;
import com.timekeep.timekeeping.entity.User;
import com.timekeep.timekeeping.entity.UserLog;
import com.timekeep.timekeeping.repository.UserLogRepository;
import com.timekeep.timekeeping.repository.UserRepository;
import com.timekeep.timekeeping.service.UserLogServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserLogService implements UserLogServiceImpl{

    @Autowired
    UserLogRepository userLogRepository;

    @Autowired
    UserRepository userRepository;
    
    @Autowired
    UserLogMapperImp userLogMapperImp;
    
    @Override
    public UserLogDto addUserLog(UserLogDto userLogDto) {
    	User users = userRepository.findFistByCode(userLogDto.getUserCode());
    	UserLog userLog = userLogMapperImp.toEntity(userLogDto);
    	userLog.setUser(users);
    	userLog = userLogRepository.save(userLog);
    	return userLogMapperImp.toDTO(userLog);
    }
    public UserLog createUserLog(UserLogDto userLogDto) {
        return null;
    }
	@Override
	public UserLogDto updateUserLog(UserLogDto userLogDto) {
		UserLog userLog = new UserLog();
		if(userLogDto.getId() != null) {
			UserLog userLogs = userLogRepository.getOne(userLogDto.getId());
			userLog = userLogMapperImp.toEntity(userLogDto, userLogs);
		}else {
			userLog = userLogMapperImp.toEntity(userLogDto);
		}
		User user = userRepository.findFistByCode(userLogDto.getUserCode());
		userLog.setUser(user);
		userLog = userLogRepository.save(userLog);
    	return userLogMapperImp.toDTO(userLog);
	}
	@Override
	public void deleteUserLog(long[] ids) {
		for(long item: ids) {
			userLogRepository.deleteById(item);
		}
	}
	@Override
	public List<UserLogDto> findAll(Long ids) {
		List<UserLogDto> result = new ArrayList<>();
		List<UserLog> userLogs = userLogRepository.findAll();
		for(UserLog item: userLogs) {
			UserLogDto userLogDto = userLogMapperImp.toDTO(item);
			result.add(userLogDto);
		}
		return result;
	}
	@Override
	public int totalItem() {
		return (int) userLogRepository.count();
	}
	


}
