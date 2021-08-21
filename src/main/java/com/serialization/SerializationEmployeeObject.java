package com.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationEmployeeObject {
	public static void main(String[] args) {
		Employee employee = new Employee(101, "Nana");
		AddressPermanent addressPermanent = new AddressPermanent();
		addressPermanent.setPermanentAddress("Pandharpur");
		employee.setAddressPermanent(addressPermanent);
		employee.display("Hello Nana !!!!");
		// Serialize object write on file
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		try {
			// Saving of object in a file
			// CompileTimeException:FileNotFoundException occures When file not
			// found in system.
			fileOutputStream = new FileOutputStream("src/main/resources/fileoprations/writeObject.txt");

			objectOutputStream = new ObjectOutputStream(fileOutputStream);

			objectOutputStream.writeObject(employee);

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

			// Default constructor not call here.
			Employee employeeRead = (Employee) objectInputStream.readObject();

			System.out.println("De-Serialization :" + employeeRead);

			System.out.println(
					"De-Serialization Get Values: " + employeeRead.getEmpId() + "----" + employeeRead.getName());

			System.out.println("De-Serialization Get Values: " + employeeRead.msg);

			fileInputStream.close();
			objectInputStream.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
