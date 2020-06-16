package com.capgemini.online_test.serviceTest;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


import java.math.BigInteger;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.capgemini.online_test.dao.TestDao;
import com.capgemini.online_test.dao.UserDao;
import com.capgemini.online_test.dao.UserTestDao;
import com.capgemini.online_test.dto.User;
import com.capgemini.online_test.dto.test;
import com.capgemini.online_test.exception.MyException;
import com.capgemini.online_test.services.AssignTestService;
import com.capgemini.online_test.services.LoginService;
import com.capgemini.online_test.util.UserRepository;

public class ServiceTest {
	LoginService object=new LoginService();
	
	@Rule
    public ExpectedException thrown = ExpectedException.none();
	
	
	@Test
	public void AssignTestServiceTest1() {
		User user = new User();
		user.setIsAdmin(false);
		user.setUserId(11614444);
		user.setUserName("ramesh"); 
		user.setUserPassword("Abc-123");
		UserDao.putUserObject(user);
		test testObj = new test();
		BigInteger testId=new BigInteger("112222");
		testObj.setTestId(testId);
		TestDao.putTestObject(testObj);
		AssignTestService.assignTest((long) 11614444, testId);
		assertEquals(testId,UserTestDao.getTestId(11614444));
	}
	@Test
	public void AssignTestServiceTest2() {
		assertNotEquals(new BigInteger("112232"),UserTestDao.getTestId(11614444));
	}
	@Test
	public void LoginServiceTest1() {
		User user = new User("rajesh",11615555,false,null,"Abc-12345");
		UserRepository.putData(user);
		assertEquals(2,LoginService.checkLogin(11615555, "Abc-12345"));
		}
	@Test()
	public void LoginServiceTest2() {
		thrown.expect(MyException.class);
	     thrown.expectMessage(equalTo("User doesn't exist/wrong userId"));
	     LoginService.checkLogin((long)11614923,"Abc-1234");
		
	}
	@Test ()
	public void LoginServiceTest3() {
		thrown.expect(MyException.class);
	    thrown.expectMessage(equalTo("Incorrect UserId / password"));
	    LoginService.checkLogin((long)11615915,"Abc-12345");
	}
	
}
