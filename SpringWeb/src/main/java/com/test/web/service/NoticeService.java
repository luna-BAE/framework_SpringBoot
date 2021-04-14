package com.test.web.service;

import java.util.List;

import com.test.web.entity.Notice;

public interface NoticeService {

	List<Notice> getList();

	Notice get(int i);

}
