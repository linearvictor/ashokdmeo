package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model){
		System.out.println("This is home URL");
		model.addAttribute("name", "Marry Anne , You are so cute");
		model.addAttribute("id",1421);
		
		List<String> friends=new ArrayList<String>();
		friends.add("rahil");
		friends.add("raju");
		friends.add("mehul");
		model.addAttribute("f", friends);
		
		return "index";
	}
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about controller");
		return "about";
	}
	@RequestMapping("/services")
	public String services() {
		System.out.println("This is services controller");
		return "services";
	}
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help controller");
//		Creating model and view object
		ModelAndView modelAndView = new ModelAndView();
//		Setting the data
		modelAndView.addObject("name", "Puttam");
		modelAndView.addObject("rollnumber", 12345);
		LocalDateTime now=LocalDateTime.now();
		modelAndView.addObject("time",now);
		
//		marks
		List<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(34);
		list.add(65);
		list.add(456);
		list.add(34567);
		
		modelAndView.addObject("marks",list);
		

//		setting the view name
		modelAndView.setViewName("help");
		return modelAndView;
	}
	

}
