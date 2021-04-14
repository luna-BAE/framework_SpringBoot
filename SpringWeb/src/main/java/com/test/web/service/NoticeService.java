package com.test.web.service;

import java.util.List;

import com.test.web.entity.Notice;
import com.test.web.entity.NoticeView;

public interface NoticeService {

	List<NoticeView> getList();

	Notice get(int i);

}
