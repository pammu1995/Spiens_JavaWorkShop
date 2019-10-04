package com.chetank.controller;

//All Import Files
import java.util.List;
import java.util.Optional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.chetank.model.Address;
import com.chetank.model.Employee;
import com.chetank.model.Project;
import com.chetank.service.AddService;
import com.chetank.service.EmpService;
import com.chetank.service.ProjectService;

@Controller
public class EmployeeController {

	@Autowired
	private EmpService empService;
	@Autowired
	private AddService addService;
	@Autowired
	private ProjectService projectService;

	private Employee employee;

	//Method To Display employee registration page
	@RequestMapping(value = "/empreg")
	public String reg(ModelMap model) {
		Employee e = new Employee();
		model.addAttribute("employee", e);
		return "empreg";
	}

	//method to save employee details and return address form
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveEmp(@ModelAttribute("employee") Employee e, Model model) {
		System.out.println("Employeed Details Saved!!");
		employee = empService.add(e);
		Address address = new Address();
		model.addAttribute("address", address);
		return "addreg";
	}

	//method to save address details of employee and return project form
	@RequestMapping(value = "/saveadd", method = RequestMethod.POST)
	public String saveAdd(@ModelAttribute("address") Address a, Model model) {
		System.out.println("Address Details Saved!!");
		a.setEmployee(employee);
		addService.add(a);
		Project project = new Project();
		model.addAttribute("project", project);
		return "projectreg";
	}
	
	//method to save project details of employee and return same form for another project if any
	@RequestMapping(value = "/savepro ", params = "action1", method = RequestMethod.POST)
	public String addPro(@ModelAttribute("project") Project p,
			@RequestParam(name = "action2", required = false) String action2,
			@RequestParam(name = "action1", required = false) String action1,
			Model model) {
		System.out.println("Project Details Saved!!");
		p.setEmployee(employee);
		projectService.add(p);
		return "projectreg";
	}
	
	//method to save project details and return list of employees
	@RequestMapping(value = "/savepro", params = "action2", method = RequestMethod.POST)
	public String savePro(@ModelAttribute("project") Project p, Model model) {
		System.out.println("Project Details Saved!!");
		p.setEmployee(employee);
		projectService.add(p);
		List<Employee> employees = empService.view();
		for (Object e : employees) {
			Address a = (Address) e;
			System.out.println(e);
			Employee ee = a.getEmployee();
			System.out.println(ee);
		}
		model.addAttribute("elist", employees);
		return "list";
	}

	//method to obtain employee details by Id and return update form
	@RequestMapping(value = "/edit/{Id}", method = RequestMethod.GET)
	public String editData(@PathVariable("Id") Integer id, Model model) {
		System.out.println("in edit");
		Employee e = empService.getById(id);
		model.addAttribute("editemployee", e);
		return "update";
	}

	//method to display list of all employees
	@RequestMapping(value = "/list")
	public String view(Model model) {
		List<Employee> employees = empService.view();
		for (Object e : employees) {
			Address a = (Address) e;
			System.out.println(e);
			Employee ee = a.getEmployee();
			System.out.println(ee);
		}
		model.addAttribute("elist", employees);
		return "list";
	}

	//method to update employee details and return list
	@RequestMapping(value = "edit/update", method = RequestMethod.POST)
	public String updateEmp(@ModelAttribute("employee") Employee employee, Model model) {
		System.out.println("Employeed Details updated!!");
		System.out.println(employee);
		empService.update(employee);
		List<Employee> employees = empService.view();
		for (Object e : employees) {
			Address a = (Address) e;
			System.out.println(e);
			Employee ee = a.getEmployee();
			System.out.println(ee);
		}
		model.addAttribute("elist", employees);
		return "list";
	}

	//method to delete employee from the database
	@RequestMapping(value = "/delete/{Id}", method = RequestMethod.GET)
	public String deleteData(@PathVariable("Id") Integer id, Model model) {
		System.out.println("in delete");
		empService.remove(id);
		List<Employee> employees = empService.view();
		for (Object e : employees) {
			Address a = (Address) e;
			System.out.println(e);
			Employee ee = a.getEmployee();
			System.out.println(ee);
		}
		model.addAttribute("elist", employees);
		return "list";
	}
}
