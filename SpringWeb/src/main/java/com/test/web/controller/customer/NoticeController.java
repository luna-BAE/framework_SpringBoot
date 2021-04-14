package com.test.web.controller.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.web.entity.Notice;
import com.test.web.entity.NoticeView;
import com.test.web.service.NoticeService;

@Controller
// restcontroller는 컨트롤러들이 그냥 사용자에게 문자열로 반환하기 때문에 
// jsp같은 뷰를 가지고 있는 경우에는 controller를 사용해야 함
@RequestMapping("/customer/notice/") // 옛날 방식의 맵핑
public class NoticeController {

	@Autowired // ioc 컨테이너에 인터페이스 구현하고 있는 객체가 존재한다는 가정하에 
	private NoticeService service;
	
	@RequestMapping("list") 
	public String list(Model model) { // 여기에 모델 객체를 만들기만 하면 스프링이 알아서 모델 객체를 참조시켜줌
		
		int page = 2;
		String field = "stuNo";
		String query = "";
		
		List<NoticeView> list = service.getViewList(page, field, query);
		model.addAttribute("list", list);
		
		// return "customer/notice/list"; // ResourceViewResolver
		return "customer.notice.list"; // TilesViewResolver
	}
	
	@RequestMapping("detail") 
	public String detail() {
		return "customer.notice.detail";
	}
	
}
