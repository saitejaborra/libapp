package com.wsu.library.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Students {
	
@Column
@Id
private String id;

@Column
private String name;

@Column
private String address;

@Column
private String phoneNumber;

@Column
private String email;

@Column
private String major;

}
