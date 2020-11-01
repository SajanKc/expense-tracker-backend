package com.example.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.main.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}
