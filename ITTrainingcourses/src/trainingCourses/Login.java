package trainingCourses;


import java.io.InputStream;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;
import org.w3c.dom.css.CSSStyleSheet;

class Login {
	
	String username ;
	String password ;
	
	
	void userPass() {
				boolean b = false;
				Scanner input = new Scanner(System.in);
			do {
				try {
					
					System.out.print("Please, Enter your Username: ");
					username = input.nextLine();
					System.out.print("Please, Enter Your Password: ");
					password = input.nextLine();
					if(username.equals("Mohamed") && password.equals("12345"))
						b = true;
					else 
						throw new Exception();
				} catch (Exception e) {
					System.out.println("Invalid password and Username");
				}
			} while (b == false);
		
			
			entry();	
	}
	
	void entry() {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("\nThe Titles :-"
				+ "\r"
				+ "\t1: Course"
				+ "\r"
				+ "\t2: Client"
				+ "\n"
				+ "\t3: Full Time Instractor"
				+ "\n"
				+ "\t4: Part Time Instractor");
		System.out.println("Please choose Your Title:");
		int title = input.nextInt();
		switch (title) {
		case 1:
			
			Course course = new Course();
			System.out.println("The Min Hour rate : "+course.minHourRate);
			System.out.print("\tThe Id: ");
			String id = input.next();
			course.setId(id);
			
			System.out.print("\tThe Title: ");
			String t = input.next();
			 course.setTitle(t);
			
			System.out.print("\tHours: ");
			double h = input.nextDouble();
			 course.setHours(h);
			
			System.out.print("\tThe Rate Per Hour: ");
			double r = input.nextDouble();
			 course.setRatePerHour(r);
			 
			 System.out.print(" Enter The change Min Rate: ");
			 double ra = input.nextDouble();
			 Course.setMinRate(ra);
			
			
			break;
			
		case 2:
			Client client = new Client();
			System.out.print("\tEnter The client Name: ");
			String name = input.next();
			client.setName(name);
			
			System.out.print("\tThe Phone: ");
			String phone = input.next();
			client.setPhone(phone);
			
			System.out.print("\tThe Email: ");
			String email = input.next();
			client.setEmail(email);
			
			System.out.print("\t The payment:");
			String pay = input.next();
			client.payClient();
		
			break;
		case 3:
			FullTimeInstractor fTimeInst = new FullTimeInstractor();
			System.out.print("\t The Instractor Name: ");
			String  instName = input.next();
			fTimeInst.setName(instName);
			
			System.out.print("\t The Id: ");
			String id2 = input.next();
			fTimeInst.setId(id2);
			
			System.out.print("\t The Phone: ");
			String phone2 = input.next();
			fTimeInst.setPhone(phone2);
			
			System.out.print("\t The Bonus: ");
			double bonus = input.nextDouble();
			fTimeInst.setBonus(bonus);
			
			System.out.print("\tEnter The salary: ");
			double salary = input.nextDouble();
			fTimeInst.setSalary(salary);
			
			
			
			break;
		case 4:
			PartTimeInstractor pTimeInst = new PartTimeInstractor();
			System.out.print("\t The Instractor Name: ");
			String nam = input.next();
			pTimeInst.setName(nam);
			
			System.out.print("\tThe Id: ");
			String id3 = input.next();
			pTimeInst.setId(id3);
			
			System.out.print("\t The Phone: ");
			String ph = input.next();
			pTimeInst.setPhone(ph);
			
			System.out.print("\t The Hours: ");
			double hou = input.nextDouble();
			pTimeInst.setHours(hou);
			
			System.out.print("\t The rate per Hour: ");
			double rh = input.nextDouble();
			pTimeInst.setRatePerHour(rh);
		
			break;

		default:
			System.out.println("Wrong Choose......");
			break;
		}
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
