package com.capgemini.online_test.UI;
import java.io.Console;
import java.math.BigInteger;
import java.util.Scanner;


import com.capgemini.online_test.dao.TestDao;
import com.capgemini.online_test.dao.UserDao;
import com.capgemini.online_test.dao.UserTestDao;
import com.capgemini.online_test.dto.User;
import com.capgemini.online_test.dto.test;
import com.capgemini.online_test.exception.MyException;
import com.capgemini.online_test.services.AssignTestService;
import com.capgemini.online_test.services.LoginService;
import com.capgemini.online_test.util.UserRepository;

public class main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter UserId :");
		long userId=input.nextLong();
		Console console = System.console();
		String password = String.valueOf(console.readPassword("Enter password")) ; 
		
		LoginService loginServiceObj= new LoginService();
		if(loginServiceObj.checkLogin(userId, password) ==1) {
			System.out.println("welcome admin");
			System.out.println("Assign Test");
			System.out.println("Enter userId and TestId");
			userId=input.nextLong();
			BigInteger testId=input.nextBigInteger();
			AssignTestService assignTestServiceObj = new AssignTestService();
			assignTestServiceObj.assignTest(userId, testId);
		}
		else {
			
			System.out.println("welcome user");
		}
		System.out.println("END");
}
}