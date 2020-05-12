package kr.or.mha;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.mha.dto.UserVO;
import kr.or.mha.service.UserService;

@Controller
public class HelloController {
	
	@Autowired
	private UserService service;
	
	private static final Logger log = LoggerFactory.getLogger(HelloController.class);
	
	@RequestMapping("/home")
	public String hello(Locale locale, Model model) throws Exception {
		log.debug("hello~~~");
		List<UserVO> userList = service.selectUser();
		
		model.addAttribute("userList", userList);
		
		return "home";
		
		
		
		/*
		 * if(bindingResult.hasErrors()) { log.debug("Binding Result has error");
		 * List<ObjectError> errors = bindingResult.getAllErrors(); for(ObjectError
		 * error : errors) { log.debug("error {} {}", error, error.getDefaultMessage());
		 * } return "index"; }
		 * 
		 * log.debug("logback setting sucess!!");
		 * System.out.println("Hello--------------------------------"); return "login";
		 */
	}

}
