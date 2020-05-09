package kr.or.mha;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	private static final Logger log = LoggerFactory.getLogger(HelloController.class);
	
	@RequestMapping("/hello")
	public String hello() {
		log.debug("logback setting sucess!!");
		System.out.println("Hello--------------------------------");
		return "login";
	}
}
