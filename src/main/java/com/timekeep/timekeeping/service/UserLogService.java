package com.timekeep.timekeeping.service;

import com.timekeep.timekeeping.dto.UserLogDto;
import com.timekeep.timekeeping.entity.UserLog;
import com.timekeep.timekeeping.repository.UserLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLogService {

    @Autowired
    UserLogRepository userLogRepository;


    public UserLog createUserLog(UserLogDto userLogDto) {
        return null;
    }


}
