package com.timekeep.timekeeping.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timekeep.timekeeping.converter.UserLogMapperImp;
import com.timekeep.timekeeping.dto.UserDto;
import com.timekeep.timekeeping.dto.UserLogDto;
import com.timekeep.timekeeping.entity.Role;
import com.timekeep.timekeeping.entity.User;
import com.timekeep.timekeeping.entity.UserLog;
import com.timekeep.timekeeping.repository.RoleRepository;
import com.timekeep.timekeeping.repository.UserLogRepository;
import com.timekeep.timekeeping.repository.UserRepository;
import com.timekeep.timekeeping.repository.UserRepositorys;
import com.timekeep.timekeeping.service.INewService;

import java.util.List;

@Service
public class UserService implements INewService{

    @Autowired
    UserRepository userRepository;
    
    @Autowired
    UserLogMapperImp userLogMapperImp;
   
    @Autowired
    RoleRepository roleRepository;
    
    @Autowired
    UserRepositorys userRepositorys;
    
    @Override
    public UserDto addUser(UserDto userDto) {
    	Role role = roleRepository.findFirstByName(userDto.getRole());
    	User user = userLogMapperImp.toUserEntity(userDto); 
    	user.setRole(role);

    	user = userRepositorys.save(user);

    	return userLogMapperImp.toUserDTO(user);
    }
    public List<User> findAllUser() {
        return userRepository.findAll();
    }
	@Override
	public void delete(long[] ids) {
		for(long item: ids) {
			userRepository.deleteById(item);
		}
	}
	@Override
	public UserDto updateUser(UserDto userDto) {
		User user = new User();
		if(userDto.getCode() != null) {
			User users = userRepository.getOne(userDto.getCode());
			user = userLogMapperImp.toUser(userDto, users);
		}else {
			user = userLogMapperImp.toUserEntity(userDto);
		}
		Role role = roleRepository.findFirstByName(userDto.getRole());
		user.setRole(role);
		user = userRepository.save(user);
		return userLogMapperImp.toUserDTO(user);
	}
}
