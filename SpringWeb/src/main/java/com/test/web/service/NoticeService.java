package com.test.web.service;

import java.util.List;

import com.test.web.entity.Notice;
import com.test.web.entity.NoticeView;

public interface NoticeService {

	// 페이지를 요청할 때
	List<NoticeView> getViewList(boolean pub);

	// 검색을 요청할 때
	List<NoticeView> getViewList(String field, String query, boolean pub);

	// 페이지를 요청할 때
	List<NoticeView> getViewList(int page, String field, String query, boolean pub);

	int getCount();

	int getCount(String field, String query);

	// 자세한 페이지 요청할 때
	NoticeView getView(int stuNo);

	Notice getNext(int stuNo);

	Notice getPrev(int stuNo);

	// 일괄공개 요청할 때
	int updatePubAll(int[] pubIds, int[] closeIds);

	// 일괄 삭제 요청할 때
	int delteAll(int[] ids);

	// 수정 페이지를 요청할 때
	int update(Notice notice);

	int delete(int stuNo);

	int insert(Notice notice);

}
