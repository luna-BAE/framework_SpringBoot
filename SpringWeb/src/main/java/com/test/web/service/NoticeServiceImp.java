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
	public List<NoticeView> getViewList() {
		// TODO Auto-generated method stub
		return getViewList(1, "stuNo", "");
	}

	@Override
	public List<NoticeView> getViewList(String field, String query) {
		// TODO Auto-generated method stub
		return getViewList(1, field, query);
	}

	
	@Override
	public List<NoticeView> getViewList(int page, String field, String query) {
		
		int size = 10;
		int offset = 0+(page-1)*10; // 공차수열
		
		List<NoticeView> list = noticeDao.getViewList(offset, size, field, query);
		
		return list;
	}

	@Override
	public int getCount() {
		return getCount("stuNo", "");
	}

	@Override
	public int getCount(String field, String query) {
		// TODO Auto-generated method stub
		return noticeDao.getCount(field, query);
	}

	@Override
	public NoticeView getView(int stuNo) {

		NoticeView notice = noticeDao.getView(stuNo);
		
		return notice;
	}

	@Override
	public Notice getNext(int stuNo) {
		// TODO Auto-generated method stub
		return noticeDao.getNext(stuNo);
	}

	@Override
	public Notice getPrev(int stuNo) {
		// TODO Auto-generated method stub
		return noticeDao.getPrev(stuNo);
	}

	@Override
	public int updatePubAll(int[] pubIds, int[] closeIds) {
		// TODO Auto-generated method stub
		return noticeDao.updatePubsAll(pubIds, closeIds);
	}

	@Override
	public int delteAll(int[] ids) {
		// TODO Auto-generated method stub
		return noticeDao.deleteAll(ids);
	}

	@Override
	public int update(Notice notice) {
		// TODO Auto-generated method stub
		return noticeDao.update(notice);
	}

	@Override
	public int delete(int stuNo) {
		// TODO Auto-generated method stub
		return noticeDao.delete(stuNo);
	}

	@Override
	public int insert(Notice notice) {
		// TODO Auto-generated method stub
		return noticeDao.insert(notice);
	}

}
