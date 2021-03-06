package com.example.demo;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@Autowired
	private PostRepository postRepository;
	
	@RequestMapping("/")
	public String home(Model m) {
		Iterable<Post> posts = postRepository.findAll();
		m.addAttribute("list", posts);
		return "index";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}

}
