package com.test.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.web.dao.NoticeDao;
import com.test.web.entity.Notice;

@Service // @Component, controller, repository, configuration ...
public class NoticeServiceImp implements NoticeService{

	@Autowired
	private NoticeDao noticeDao;
	
	@Override
	public List<Notice> getList() {
		
		List<Notice> list = noticeDao.getList();
		
		return list;
	}

	@Override
	public Notice get(int id) {
		
		Notice notice = noticeDao.get(id);
		
		return notice;
	}

}
