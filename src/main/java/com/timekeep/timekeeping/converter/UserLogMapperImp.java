package com.timekeep.timekeeping.converter;

<<<<<<< HEAD
import com.timekeep.timekeeping.dto.UserLogDto;
=======
import com.timekeep.timekeeping.dto.UserDto;
import com.timekeep.timekeeping.dto.UserLogDto;
import com.timekeep.timekeeping.entity.User;
>>>>>>> add files
import com.timekeep.timekeeping.entity.UserLog;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserLogMapperImp implements UserLogMapper {
    @Override
    public UserLog toEntity(UserLogDto dto) {
        UserLog userLog = new UserLog();
        userLog.setDate(dto.getDate());
<<<<<<< HEAD


=======
        
>>>>>>> add files
        return userLog;
    }

    @Override
    public UserLogDto toDTO(UserLog entity) {
        UserLogDto userLogDto = new UserLogDto();
<<<<<<< HEAD
        userLogDto.setDate(entity.getDate());
        userLogDto.setId(entity.getId());
        userLogDto.setUserCode(entity.getUser().getCode());

        return userLogDto;
    }

=======
        if(entity.getId() != null) {
        	 userLogDto.setId(entity.getId());
        }
        userLogDto.setDate(entity.getDate());
       
       // userLogDto.setUserCode(entity.getUser().getCode());

        return userLogDto;
    }
    
>>>>>>> add files
    @Override
    public List<UserLog> toEntity(List<UserLogDto> dtoList) {
        return null;
    }

    @Override
    public List<UserLogDto> toDto(List<UserLog> entityList) {
        return null;
    }
<<<<<<< HEAD
=======

	@Override
	public UserLog toEntity(UserLogDto dto, UserLog entity) {
        entity.setDate(dto.getDate());
        
        return entity;
	}
	
	@Override
	public User toUserEntity(UserDto dto) {
		User user = new User();
		user.setName(dto.getName());
		user.setCode(dto.getCode());
		return user;
	}
	
	@Override
	public UserDto toUserDTO(User entity) {
		UserDto userDto = new UserDto();
		//if(entity.getCode() != null) {
			userDto.setCode(entity.getCode());
	//	}
	//	userDto.setCode(entity.getCode());
		userDto.setName(entity.getName());
		return userDto;
	}

	@Override
	public User toUser(UserDto userDto, User user) {
		//user.setCode(userDto.getCode());
		user.setName(userDto.getName());
		return user;
	}

	
>>>>>>> add files
}
