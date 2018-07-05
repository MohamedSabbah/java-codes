package io;

import java.util.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class Entry {
	public static void main(String[] args) {
		
		// serlialization
		
		Employee emp = new Employee("Mohamed", 12344, 2000.0, "louan1223");
		try(ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream("object.txt"))){
			oo.writeObject(emp);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		try(ObjectInputStream oi= new ObjectInputStream(new FileInputStream("object.txt"))){
			Employee emp1 = (Employee)oi.readObject();
			System.out.println(emp1.toString());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		List<Employee> l = new ArrayList<>();
		l.add(new Employee("ahmed", 12234,2233, "asdcvgt"));
		l.add(new Employee("mohamed", 17555, 200, "askjkvx"));
		l.add(new Employee("mohamed", 12234, 200, "askjkvx"));
		Collections.sort(l);
		for(Employee emp1 : l)
			System.out.println(emp1);
		
	}

}
