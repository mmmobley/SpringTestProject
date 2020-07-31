package com.tts.PracticeApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SubscriberController {
	
	@Autowired
	private SubscriberRepository subscriberRepository;
	
	
	
	@GetMapping(value= "/")
	public String index(Subscriber subscriber) {
		return"index";
	}
	
	@GetMapping(value= "/signup")
	public String signup(Subscriber subscriber) {
		return"signup";
	}
	
	private Subscriber subscriber;
	
	@PostMapping(value = "/")
	public String addNewSubscriber(Subscriber subscriber, Model model) {
		
		subscriberRepository.save(new Subscriber(subscriber.getName(), subscriber.getUserName(), subscriber.getEmail(), subscriber.getPassWord(), subscriber.getSignUp()));
		model.addAttribute("name", subscriber.getName());
		model.addAttribute("userName", subscriber.getUserName());
		model.addAttribute("email", subscriber.getEmail());
		model.addAttribute("passWord", subscriber.getPassWord());
		return "result";
	}
}
