package com.axsos.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axsos.savetravels.models.Expense;
import com.axsos.savetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	@Autowired
	ExpenseRepository expenseRepository;
	
	
	public List<Expense> findAll() {
		return expenseRepository.findAll();
	}
	
	public Expense CreateExpense(Expense expense) {
		return expenseRepository.save(expense);
	}
	
	public Expense findExpense(Long id) {
		Optional<Expense> optional = expenseRepository.findById(id);
			if(optional.isPresent()) {
				return optional.get();
			}
			else {
				return null;
			}
	}
	
	public void deleteExpense(Long id) {
		expenseRepository.deleteById(id);
	}
}
