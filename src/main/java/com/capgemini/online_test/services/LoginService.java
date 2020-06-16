package com.capgemini.online_test.services;
import com.capgemini.online_test.dao.*;

import java.io.Console;
import java.util.Scanner;
import com.capgemini.online_test.dto.User;
import com.capgemini.online_test.util.*;
import com.capgemini.online_test.exception.*;

public class LoginService {
	long userId;
	String password;
	
	public static long checkLogin(long userId,String password) {
		UserDao userDaoObj = new UserDao();
		User user = userDaoObj.getUserObject(userId);
		try {
			if(user==null) {
				throw new MyException("User doesn't exist/wrong userId");
			}
		try {
			if(password.equals(user.getUserPassword())) {
				if(user.getIsAdmin())
					return 1;
				return 2;
		}
			else {
				throw new MyException("Incorrect UserId / password");
			}
	}
		finally {
			
		}
		}
		catch (MyException exp) {
			System.out.println(exp);
			Scanner input=new Scanner(System.in);
			System.out.println("Enter UserId :");
			long userId1=input.nextLong();
			Console console = System.console();
			String password1 = String.valueOf(console.readPassword("Enter password")) ;
			return checkLogin(userId1,password1);
		}
}
}
