package com.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizationObject {
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		teacher.setTeacherId(111);
		teacher.setName("SachinSir");
		teacher.setAge(33);
		// Serialize object write on file
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		try {
			// Saving of object in a file
			// CompileTimeException:FileNotFoundException occures When file not
			// found in system.
			fileOutputStream = new FileOutputStream("src/main/resources/fileoprations/writeExternalObject.txt");

			objectOutputStream = new ObjectOutputStream(fileOutputStream);

			objectOutputStream.writeObject(teacher);

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
			fileInputStream = new FileInputStream("src/main/resources/fileoprations/writeExternalObject.txt");

			objectInputStream = new ObjectInputStream(fileInputStream);

			// Default constructor not call here.
			Teacher teacherRead = (Teacher) objectInputStream.readObject();

			System.out.println("De-Serialization :" + teacherRead);

			System.out.println(
					"De-Serialization Get Values: " + teacherRead.getTeacherId() + "----" + teacherRead.getName());

			System.out.println("De-Serialization Get Values: " + teacherRead.getAge());

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
