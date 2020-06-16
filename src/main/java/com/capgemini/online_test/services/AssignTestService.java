package com.capgemini.online_test.services;

import com.capgemini.online_test.dao.*;
import com.capgemini.online_test.dto.*;
import com.capgemini.online_test.exception.MyException;
import com.capgemini.online_test.util.*;

import java.math.BigInteger;

public class AssignTestService {
	public static  void assignTest(Long userId,BigInteger testId) {
		UserTestDao userTestDaoObj = new UserTestDao();
		UserDao userDaoObj = new UserDao();
		userTestDaoObj.putData(userId,testId);
		User obj = UserDao.getUserObject(userId);
		test obj1=TestDao.getTestObject(testId);
		try {
			
			if(obj==null) {
				throw new MyException("user not found");
			}
			
			if(obj1==null) {
				throw new MyException("test not found");
			}
		} catch (MyException e) {
			e.printStackTrace();
		}
		finally {
			
		}
		obj.setUserTest(obj1);
		userDaoObj.putUserObject(obj);
	}
}
