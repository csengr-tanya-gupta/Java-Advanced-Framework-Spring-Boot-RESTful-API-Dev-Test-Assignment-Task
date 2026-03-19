package com.capgemini.serialization.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student implements Serializable{
	
	private int id;
	private String name;
	private String mailId;
	private long contactNum;
	

}
