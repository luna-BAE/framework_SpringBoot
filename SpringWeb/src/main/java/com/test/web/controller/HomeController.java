package com.test.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

//	@RequestMapping("/customer/notice/list") 
//	public String list() {
//		return "";
//	} // 이렇게 만들 수도 있지 근데 규모가 클 때는 이 안에 모든 맵핑을 할 수 없지
	
	@RequestMapping("/index")
	public String index() {
		
		return "home.index"; // 실제로 있는 디렉토리는 아니지만, *를 사용하기 위해서 tiles.xml 파일과 디렉토리를 맞춰준다.
	}
	
	@RequestMapping("/help")
	public String aaa() {
		return "home.help";
	}
	
}
