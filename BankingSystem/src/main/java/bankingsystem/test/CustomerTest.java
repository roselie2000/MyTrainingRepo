package bankingsystem.test;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import bankingsystem.Customer;
import bankingsystem.Customrdb;
import bankingsystem.Validation;

public class CustomerTest {

	public static void main(String[] args) {
		Customer cust = new Customer();//Object creation for Customer
		Customrdb custd = new Customrdb();//Object creation for Customerdb
		Validation vd = new Validation();
		Scanner sn = new Scanner(System.in);
		
		
		System.out.println("Enter 'i' for insert");
		System.out.println("Enter 'd' for display the records");
		System.out.println("Enter 'r' for remove the records");
		System.out.println("Enter 'u' for update the records" );
		System.out.println("Enter your choice :");
		String msg = sn.next();
		if(msg.equals("i")) {
			System.out.println("Enter the customer name :");
			String name = sn.next();
			if(vd.checkName(name)) {
				cust.setCustName(name);//set customer name
				System.out.println("Enter the dob of the customer :");
				String date = sn.next();
				if(vd.checkDob(date)) {
					LocalDate locdob = LocalDate.parse(date);//change the string to local date
					Date dob = Date.valueOf(locdob);//change the local date to sql date
					cust.setDob(dob);//set customer dob
					System.out.println("Enter the phone number of the customer :");
					long phoneno = sn.nextLong();
					if(vd.checkPhno(phoneno)) {
						cust.setPhoneno(phoneno);//set phone no
						System.out.println("Enter the branch code :");
						String branchId = sn.next();
						if(vd.checkBranchId(branchId)) {
							cust.setBranchId(branchId);
							System.out.println("Enter the address of the customer :");
							String address = sn.next();
							cust.setAddress(address);//set address
							custd.insertCustDetailsFiles(cust);
						}
					}
				}
			}
		}
		else if(msg.equals("d")) {
			ArrayList<Customer> data = new ArrayList<Customer>();//create list in customer type
			data = (ArrayList<Customer>) custd.displayCustDetails();//get the data from the db
			//display the customer details
			for(int i=0; i<data.size(); i++) {
				System.out.println(data.get(i).getCustId() + " " +data.get(i).getCustName() + " " + data.get(i).getDob() + "  " + data.get(i).getAddress() + "  " + data.get(i).getPhoneno() + "  " + data.get(i).getBranchId());;
			}
		}
		else if(msg.equals("r")) {
			System.out.println("Enter the customer id which is wat to delete :");
			int id = sn.nextInt();
			if(vd.checkId(id)) {
				cust.setCustId(id);
				custd.removeCustDetails(cust);//calling removeCustDetails method

			}
		}
		else if(msg.equals("u")) {
			System.out.println("Enter which data is you want to update :");
			String updateMsg = sn.next();
			if(updateMsg.equals("address") || updateMsg.equals("addr")) {
				System.out.println("Enter the customer id which is want to change :");
				int id1 = sn.nextInt();
				if(vd.checkId(id1)) {
					cust.setCustId(id1);
					System.out.println("Enter the new address of the" + id1 + ":");
					String addr = sn.next();
					cust.setAddress(addr);
					custd.changeAddrOfCust(cust);//calling changeAddrOfCust method
				}
			}
			else if(updateMsg.equals("phone number") || updateMsg.equals("phno")) {
				System.out.println("Enter the customer id which is want to change :");
				int id1 = sn.nextInt();
				if(vd.checkId(id1)) {
					cust.setCustId(id1);
					System.out.println("Enter the new phone number :");
					long phno = sn.nextLong();
					if(vd.checkPhno(phno)) {
						cust.setPhoneno(phno);
						custd.changePhnoOfCust(cust);
					}
				}	
			}
			else {
				System.out.println("Please!, give a valid option");
			}
			
		}		
	}

}
