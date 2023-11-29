package com.wsu.library.entities;

import java.math.BigInteger;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class Books {
	
	@Id
	private BigInteger id;
	
	@Column
	private String title;
	
	@Column
	private String author;
	
	@Column
	private String publisher;
	
	@Column
	private String isbn;
	
	@Column
	private int publicationYear;
	
	@Column
	private int numberOfPages;
	
	@Column
	private int availableCopies;
	

}
