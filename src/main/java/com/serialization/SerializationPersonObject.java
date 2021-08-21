package com.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationPersonObject {
	public static void main(String[] args) {
		Person person = new Person();
		person.setId(100);
		person.setName("Nana");

		// Serialize object write on file
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		try {
			// Saving of object in a file
			// CompileTimeException:FileNotFoundException occures When file not
			// found in system.
			fileOutputStream = new FileOutputStream("src/main/resources/fileoprations/writeObjectPerson.txt");

			objectOutputStream = new ObjectOutputStream(fileOutputStream);

			objectOutputStream.writeObject(person);

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
			fileInputStream = new FileInputStream("src/main/resources/fileoprations/writeObjectPerson.txt");

			objectInputStream = new ObjectInputStream(fileInputStream);

			// Default constructor not call here.
			Person personRead = (Person) objectInputStream.readObject();

			System.out.println("De-Serialization :" + personRead);

			System.out.println("De-Serialization Get Values: " + personRead.getId() + "----" + personRead.getName());

			objectInputStream.close();
			fileInputStream.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
