package com.test.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.test.web.entity.Notice;

@Mapper
public interface NoticeDao {

	@Select("select * from dept") // 구현하고 싶은 것만 하면 됩니다
	List<Notice> getList();

	Notice get(int id);

}
