package com.shivam.fullstackchallenge.expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivam.fullstackchallenge.expense.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense,Long> {
	
}
