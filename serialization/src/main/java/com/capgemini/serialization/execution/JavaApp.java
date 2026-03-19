package com.capgemini.serialization.execution;

import java.io.IOException;

import com.capgemini.serialization.filehandler.FileHandler;

public class JavaApp {
	public static void execute() {
		try {
			FileHandler.createtheFile();
			FileHandler.serialization();
			FileHandler.deserilaization();
			FileHandler.deleteFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
			
		
	}

}
