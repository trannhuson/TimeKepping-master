package com.timekeep.timekeeping.controller.output;

import java.util.ArrayList;
import java.util.List;

import com.timekeep.timekeeping.dto.UserLogDto;

public class UserLogOutput {
	private int page;
	private int totalPage;
	private List<UserLogDto> listUserLog = new ArrayList<>();
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public List<UserLogDto> getListUserLog() {
		return listUserLog;
	}
	public void setListUserLog(List<UserLogDto> listUserLog) {
		this.listUserLog = listUserLog;
	}
	
}
