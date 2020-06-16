package com.capgemini.online_test.dao;

import java.math.BigInteger;
import java.util.HashMap;
import com.capgemini.online_test.dto.test;
import com.capgemini.online_test.util.TestRepository;

public class  TestDao {
	
	public static test getTestObject(BigInteger testId) {
		HashMap<BigInteger,test> map=TestRepository.gettable();
		return map.get(testId);
	}
	public static void putTestObject(test obj) {
		TestRepository.putData(obj);
	}
}
