package com.taggs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.taggs.cloudjourney.persistence.dao.EmployeeRepository;
import com.taggs.cloudjourney.persistence.model.Employee;
@EnableAutoConfiguration
@Controller
public class Controller1 {
	@Autowired
	EmployeeRepository repo;
	public Controller1() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping(value="/employeess", method=RequestMethod.GET)
	public List<Employee> getEmployees(){
		return repo.findAll();
	}
	@RequestMapping("/")
    public String index(Model model) {
		model.addAttribute("employees", repo.findAll());
        return "home";
    }


}
