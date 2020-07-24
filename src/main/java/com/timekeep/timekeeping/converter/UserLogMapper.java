package com.timekeep.timekeeping.converter;

import com.timekeep.timekeeping.dto.UserLogDto;
import com.timekeep.timekeeping.entity.UserLog;
import org.springframework.stereotype.Component;

@Component
public interface UserLogMapper extends EntityMapper<UserLogDto, UserLog> {
    
}
