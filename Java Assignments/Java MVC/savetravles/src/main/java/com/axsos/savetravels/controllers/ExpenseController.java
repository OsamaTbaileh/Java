package com.axsos.savetravels.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.axsos.savetravels.models.Expense;
import com.axsos.savetravels.services.ExpenseService;

@Controller
public class ExpenseController {
	@Autowired
	ExpenseService expenseService;

	
	@GetMapping("/")
	public String main() {
		return "redirect:/expenses";
	}
	
	@GetMapping("/expenses")
	public String viewMain(@ModelAttribute("expense") Expense expense, Model model) {
		List<Expense> expenses = expenseService.findAll();
		model.addAttribute("expenseFromMyController", expenses);
		return "index.jsp";
	}
	
	@PostMapping("/expenses")
	public String create(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Expense> expenses = expenseService.findAll();
			model.addAttribute("expenseFromMyController", expenses);
			return "index.jsp";
		}
		else {
			expenseService.CreateExpense(expense);
			return "redirect:/expenses";
		}
	}
	
	
	@GetMapping("/expenses/edit/{id}")
	public String viewEditPage(@PathVariable("id") Long id,@ModelAttribute("expense") Expense expense, Model model) {
		model.addAttribute("expense", expenseService.findExpense(id));
		return "edit.jsp";
	}
	
	
	@PutMapping("/expenses/edit/{id}")
	public String editExpense(@Valid @PathVariable("id") Long id,@ModelAttribute("expense") Expense expense, BindingResult result) {
		if(result.hasErrors()) {
			return "edit.jsp";
		}
		else {
			expenseService.CreateExpense(expense);
			return "redirect:/expenses";
		}
	}
	
	
	@GetMapping("/expenses/{id}")
	public String showExpense(@PathVariable("id") Long id, Model model) {
		model.addAttribute("expense", expenseService.findExpense(id));
		return "show.jsp";
	}
	
	@DeleteMapping("/expenses/delete/{id}")
	public String deleteExpense(@PathVariable("id") Long id) {
		expenseService.deleteExpense(id);
		return "redirect:/expenses";
	}
	
	
}
