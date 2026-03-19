package com.capgemini.serialization.filehandler;

import java.io.File;
import java.io.IOException;

import com.capgemini.serialization.entity.Student;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class FileHandler {
	
	private static final String PATH = "src/main/resources/Student.json";
	private static final File FILE = new File(PATH);
	private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
	
	public static void createtheFile() throws IOException {
		if (FILE.createNewFile()) {
			System.out.println("JSON File created successfully");
			
		}
		else {
			System.out.println("File already exists");
		}
	}
	
	public static void serialization() throws StreamWriteException, DatabindException, IOException {
		Student student = new Student(1, "raja", "raja@gmail.com", 236417890L);
		OBJECT_MAPPER.writeValue(FILE, student);
		System.out.println("Serialisation done successfully..");
	}
	
	public static void deserilaization() throws StreamReadException, DatabindException, IOException {
		Student student = OBJECT_MAPPER.readValue(FILE, Student.class);
		System.out.println();
		System.out.println(student);
		System.out.println();
		System.out.println("Deserialisation done successfully");
		
		
		
	}
	
	public static void deleteFile() {
		if (FILE.delete()) {
			System.out.println("JSON deleted successfully");
			
		}
		else {
			System.out.println("file doesnt exist");
		}
		
	}
	
	

}
