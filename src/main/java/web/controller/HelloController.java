package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;
import web.entity.Car;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {


	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm Spring MVC application");
		messages.add("5.2.0 version by sep'19 ");
		model.addAttribute("messages", messages);
		return "index";
	}


	@GetMapping(value = "/cars")
	public String printAnotherPage(@RequestParam(required = false) Integer count, ModelMap model) {
		if (count != null  && count > 0 && count <= 5) {
			model.addAttribute("cars", CarService.returnSomeCars(count));
		} else {
			model.addAttribute("cars", CarService.getCars());
		}
		return "secondPage";
	}
}