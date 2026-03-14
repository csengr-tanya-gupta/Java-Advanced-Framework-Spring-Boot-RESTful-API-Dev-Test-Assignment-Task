package com.capgemini.controller;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TaskManager implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World!");
	}
}