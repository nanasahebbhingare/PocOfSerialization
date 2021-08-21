package com.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationStudentObject {
	public static void main(String[] args) {
		Student student = new Student();
		student.setRollNo(100);
		student.setName("Nana");

		// Serialize object write on file
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		try {
			// Saving of object in a file
			// CompileTimeException:FileNotFoundException occures When file not
			// found in system.
			fileOutputStream = new FileOutputStream("src/main/resources/fileoprations/writeObject.txt");

			objectOutputStream = new ObjectOutputStream(fileOutputStream);

			objectOutputStream.writeObject(student);

			objectOutputStream.close();
			fileOutputStream.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// De-Serialization object read into file
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		try {
			// Saving of object in a file
			// CompileTimeException:FileNotFoundException occures When file not
			// found in system.
			fileInputStream = new FileInputStream("src/main/resources/fileoprations/writeObject.txt");

			objectInputStream = new ObjectInputStream(fileInputStream);

			//Default constructor not call here.
			Student studentRead = (Student) objectInputStream.readObject();

			System.out.println("De-Serialization :" + studentRead);
	
			System.out.println("De-Serialization Get Values: " + studentRead.getRollNo() +"----"+ studentRead.getName() );

			objectOutputStream.close();
			fileOutputStream.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
