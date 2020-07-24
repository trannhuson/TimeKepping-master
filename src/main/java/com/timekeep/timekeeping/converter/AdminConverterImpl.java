package com.timekeep.timekeeping.converter;

import com.timekeep.timekeeping.dto.AdminDto;
import com.timekeep.timekeeping.entity.Admin;

public interface AdminConverterImpl {
	Admin entity(AdminDto adminDto);
	AdminDto dto(Admin adminEntity);
	Admin adminEntity(AdminDto adminDto,Admin admin);
}
