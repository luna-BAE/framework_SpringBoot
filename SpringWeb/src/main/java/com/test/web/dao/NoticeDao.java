package com.test.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;

import com.test.web.entity.Notice;
import com.test.web.entity.NoticeView;

@Mapper
public interface NoticeDao {
	
	/*
	 * 이렇게 어노테이션을 통해 쿼리를 수행하는 것은 크게 세가지 문제를 가지고 있다.
	 * 1. 복잡한 쿼리를 작성하는 데 어려움이 있다.
	 * 2. 인터페이스와 mybatis가 지나치게 밀접한 관계를 맺고 있다.
	 * 3. 인터페이스 함수를 찾기가 어려워지며, 코드 관리가 불편하다.
	 */

//	// @Result(property = "lecName", column = "lec_name")
//	// 여러개의 컬럼명이 자바 객체의 이름과 다를 경우는 @Result를 쭉 나열하면 되고,
//	// 너무 많다면 복수형s를 붙인 @Results({@Result(), @Result() ... }) 의 배열 형태로 만들면 된다
//	@Select("select * from studentView where ${field} like '%${query}%' order by stuNo desc limit #{offset}, #{size}") // 구현하고 싶은 것만 하면 됩니다
//	List<NoticeView> getList(int offset, int size, String field, String query);

//	Notice getView(int stuNo);

	List<NoticeView> getViewList(int offset, int size, String field, String query);

	int getCount(String field, String query);

	NoticeView getView(int stuNo);

	Notice getNext(int stuNo);

	Notice getPrev(int stuNo);
	
	int updatePubsAll(int[] ids, boolean pub);

//	int updatePubsAll(int[] pubIds, int[] closeIds);

	int deleteAll(int[] ids);

	int update(Notice notice);

	int delete(int stuNo);

	int insert(Notice notice);
	
	
	
//	int update(Notice notice);
//	
//	int insert(Notice notice);
//	
//	int delete(int stuNo);

}
