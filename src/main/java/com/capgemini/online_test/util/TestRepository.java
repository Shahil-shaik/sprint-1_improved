package com.capgemini.online_test.util;
import com.capgemini.online_test.dto.test;
import java.math.BigInteger;
import java.util.*;
public class TestRepository {
	static HashMap<BigInteger, test> table = new HashMap<BigInteger,test>();
	
	static {
		test testObj = new test();
		testObj.setTestId(new BigInteger("123456"));
		testObj.setTestTitle("CA-1");
		putData(testObj);
		
		testObj.setTestId(new BigInteger("112233"));
		testObj.setTestTitle("CA-2");
		putData(testObj);
	}

	public static HashMap<BigInteger,test> gettable() {
		return table;
	}

	public void setTable(HashMap<BigInteger, test> table) 
	{
		TestRepository.table = table;
	}
	public static void putData(test ob)
	{
		table.put(ob.getTestId(),ob);	
	}
	}