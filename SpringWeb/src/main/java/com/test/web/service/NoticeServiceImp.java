package com.test.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.web.dao.NoticeDao;
import com.test.web.entity.Notice;
import com.test.web.entity.NoticeView;

@Service // @Component, controller, repository, configuration ...
public class NoticeServiceImp implements NoticeService{

	@Autowired
	private NoticeDao noticeDao;
	
	@Override
	public List<NoticeView> getList(int page, String field, String query) {
		
		int size = 10;
		int offset = 0+(page-1)*10; // 공차수열
		
		List<NoticeView> list = noticeDao.getList(offset, size, field, query);
		
		return list;
	}

	@Override
	public Notice get(int id) {
		
		Notice notice = noticeDao.get(id);
		
		return notice;
	}

}
