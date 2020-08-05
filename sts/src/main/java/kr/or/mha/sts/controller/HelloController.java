package kr.or.mha.sts.controller;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.or.mha.sts.dto.UserVO;
import kr.or.mha.sts.service.UserService;

@Controller
public class HelloController {
	
	@Autowired
	private UserService service;
	
	private static final Logger log = LoggerFactory.getLogger(HelloController.class);

	@RequestMapping("/home")
	public String home(Locale locale, Model model) throws Exception {
		List<UserVO> userList = service.selectUser();
		model.addAttribute("userList", userList);
		return "home";
	}
}
