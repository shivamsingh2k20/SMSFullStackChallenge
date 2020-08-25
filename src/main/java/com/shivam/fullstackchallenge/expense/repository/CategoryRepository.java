package com.shivam.fullstackchallenge.expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivam.fullstackchallenge.expense.model.Category;

public interface CategoryRepository  extends JpaRepository<Category, Long>{
	Category findByName(String name);
}
