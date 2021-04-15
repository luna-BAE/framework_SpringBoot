package com.test.web.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.web.dao.NoticeDao;
import com.test.web.entity.Notice;
import com.test.web.entity.NoticeView;

@Repository
public class MybatisNoticeDao implements NoticeDao{

	private NoticeDao mapper;
	
	@Autowired
	public MybatisNoticeDao(SqlSession sqlSession) {
		mapper = sqlSession.getMapper(NoticeDao.class);
	}
	
	@Override
	public List<NoticeView> getViewList(int offset, int size, String field, String query, boolean pub) {
		
		return mapper.getViewList(offset, size, field, query, pub);
	}

	@Override
	public int getCount(String field, String query) {
		return mapper.getCount(field, query);
	}

	@Override
	public NoticeView getView(int stuNo) {
		return mapper.getView(stuNo);
	}

	@Override
	public Notice getNext(int stuNo) {
		return mapper.getNext(stuNo);
	}

	@Override
	public Notice getPrev(int stuNo) {
		return mapper.getPrev(stuNo);
	}

	@Override
	public int updatePubsAll(int[] ids, boolean pub) {
		return mapper.updatePubsAll(ids, pub);
	}

	@Override
	public int deleteAll(int[] ids) {
		return mapper.deleteAll(ids);
	}

	@Override
	public int update(Notice notice) {
		return mapper.update(notice);
	}

	@Override
	public int delete(int stuNo) {
		return mapper.delete(stuNo);
	}

	@Override
	public int insert(Notice notice) {
		return mapper.insert(notice);
	}

}
