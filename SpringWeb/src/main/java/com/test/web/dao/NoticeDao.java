package com.test.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;

import com.test.web.entity.Notice;
import com.test.web.entity.NoticeView;

@Mapper
public interface NoticeDao {

	// @Result(property = "lecName", column = "lec_name")
	// 여러개의 컬럼명이 자바 객체의 이름과 다를 경우는 @Result를 쭉 나열하면 되고,
	// 너무 많다면 복수형s를 붙인 @Results({@Result(), @Result() ... }) 의 배열 형태로 만들면 된다
	@Select("select * from studentView where ${field} like '%${query}%' order by stuNo desc limit #{offset}, #{size}") // 구현하고 싶은 것만 하면 됩니다
	List<NoticeView> getList(int offset, int size, String field, String query);

	Notice get(int id);

}
