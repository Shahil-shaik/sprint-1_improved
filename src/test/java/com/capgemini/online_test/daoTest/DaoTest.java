package com.capgemini.online_test.daoTest;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;

import org.junit.Test;

import com.capgemini.online_test.dao.TestDao;
import com.capgemini.online_test.dao.UserDao;
import com.capgemini.online_test.dao.UserTestDao;
import com.capgemini.online_test.dto.*;

public class DaoTest {
	@Test
	public void AcessTestRepoTest1() {
		test testObj = new test();
		BigInteger testId=new BigInteger("111222");
		testObj.setTestId(testId);
		TestDao.putTestObject(testObj);
		assertEquals(testObj,TestDao.getTestObject(testId));
	}
	@Test
	public void AcessTestRepoTest2() {
		test testObj = new test();
		BigInteger testId=new BigInteger("111122");
		testObj.setTestId(testId);
		TestDao.putTestObject(testObj);
		assertNotEquals(testObj,TestDao.getTestObject(new BigInteger("112233")));
	}
	@Test
	public void AccessUserrepoTest1() {
		BigInteger testId=new BigInteger("123456");
		UserTestDao.putData((long) 11611111, testId);
		assertEquals(testId,UserTestDao.getTestId(11611111));
	}
	@Test
	public void AccessUserrepoTest2() {
		BigInteger testId=new BigInteger("111111");
		UserTestDao.putData((long) 11615101, testId);
		assertNotEquals(testId,UserTestDao.getTestId(11615004));
	}
	@Test
	public void AcessUserIdRepo_getUserObjectTest1() {
		User user = new User();
		user.setIsAdmin(false);
		user.setUserId(11612222);
		user.setUserName("random"); 
		user.setUserPassword("Abc-123");
		UserDao.putUserObject(user);
		assertEquals(user,UserDao.getUserObject(11612222));
	}
	@Test
	public void AcessUserIdRepo_getUserObjectTest2() {
		User user = new User();
		user.setIsAdmin(false);
		user.setUserId(11613333);
		user.setUserName("satish"); 
		user.setUserPassword("Abc-123");
		UserDao.putUserObject(user);
		assertNotEquals(user,UserDao.getUserObject(11615915));
	}
	
}
