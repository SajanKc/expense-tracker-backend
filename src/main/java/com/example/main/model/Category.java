package com.example.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@Table(name = "category")
public class Category {

	@Id
	private Long id;

	@NotNull
	private String name;

//	@ManyToOne(cascade = CascadeType.PERSIST)
//	private User user;
}
