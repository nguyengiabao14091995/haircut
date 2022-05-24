package net.javaguides.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/adminPage")
	public String adminPage() {
		return "adminPage";
	}

	@GetMapping("/home")
	public String home() {
		return "home";
	}

	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}

	@GetMapping("/booking")
	public String booking() {
		return "booking";
	}

	@GetMapping("/booking-home")
	public String bookingHome() {
		return "bookingHome";
	}

	@GetMapping("/shop-single")
	public String shopSingle() {
		return "shopSingle";
	}

	@GetMapping("/admin-table")
	public String adminTables() {
		return "adminTables";
	}
	
	@GetMapping("/about")
	public String about() {
		return "about";
	}
	

}
