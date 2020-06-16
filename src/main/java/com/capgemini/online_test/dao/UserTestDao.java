package com.capgemini.online_test.dao;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import com.capgemini.online_test.dto.test;
import com.capgemini.online_test.util.TestRepository;
import com.capgemini.online_test.util.UserTestRepository;

public class UserTestDao {
	
	public static BigInteger getTestId(long UserId) {
		Map<Long, BigInteger> map=UserTestRepository.gettable();
		return map.get(UserId);
	}
	public static void putData(Long userId,BigInteger testId) {
		UserTestRepository obj = new UserTestRepository();
		obj.putData(userId,testId);
	}
}
