package com.timekeep.timekeeping.converter;

import java.util.List;
import com.timekeep.timekeeping.dto.UserDto;
import com.timekeep.timekeeping.entity.User;

public interface EntityMapper<D, E> {
    E toEntity(D dto);

    D toDTO(E entity);
    E toEntity(D dto, E entity);
    
    User toUserEntity(UserDto dto);
    
    User toUser(UserDto userDto, User user);
    
    UserDto toUserDTO(User dto);
    
    List<E> toEntity(List<D> dtoList);

    List<D> toDto(List<E> entityList);
}
