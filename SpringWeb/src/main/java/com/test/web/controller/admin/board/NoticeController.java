package com.test.web.controller.admin.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.web.entity.Notice;
import com.test.web.service.NoticeService;

@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice/")
public class NoticeController {

	@Autowired
	private NoticeService service; // 컨트롤러가 필요로 하는 것의 기능을 집합해놓고 있는 인터페이스
	
	@RequestMapping("list")
	public String list() {
		
		List<Notice> list = service.getList();
		
		return "admin.board.notice.list";
		
	}
	
	@RequestMapping("detail")
	public String detail() {
		
		Notice notice = service.get(1);
		
		return "admin.board.notice.detail";
	}
	
	@RequestMapping("reg")
	public String reg() {
		return "admin.board.notice.reg";
	}
	
}
