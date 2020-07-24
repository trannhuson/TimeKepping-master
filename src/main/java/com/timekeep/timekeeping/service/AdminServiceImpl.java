package com.timekeep.timekeeping.service;

import com.timekeep.timekeeping.dto.AdminDto;

public interface AdminServiceImpl {
	AdminDto addAdmin(AdminDto adminDto);
	AdminDto updateAdmin(AdminDto adminDto);
	void deleteAdmin(long [] ids);
}
