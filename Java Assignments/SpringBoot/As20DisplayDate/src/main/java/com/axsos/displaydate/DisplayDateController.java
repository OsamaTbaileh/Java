package com.axsos.displaydate;

import java.text.SimpleDateFormat;
import java.util.Date;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DisplayDateController {

	@RequestMapping("")
	public String mainRoute() {
		return "main.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		SimpleDateFormat format = new SimpleDateFormat("EEEE, 'the 'dd' of' MMMM ,yyyy");
		Date date = new Date();
		
		String currentDate = format.format(date);
		model.addAttribute("currentDate", currentDate);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		SimpleDateFormat format = new SimpleDateFormat("h:mm a");
		Date date = new Date();
		
		String time = format.format(date);		
		model.addAttribute("time", time);
		
		
		return "time.jsp";
	}
}
