package com.capgemini.online_test.util;
import java.math.BigInteger;
import java.util.*;

import com.capgemini.online_test.dto.*;

public class UserTestRepository {
	static Map<Long, BigInteger> table = new HashMap<Long, BigInteger>();

	static {
		putData((long)11605004,new BigInteger("123456"));
		putData((long)11604993,new BigInteger("112233"));
	}
	
	public static Map<Long, BigInteger> gettable() {
		return table;
	}
	
	public void setTable(Map<Long, BigInteger> table) 
	{
		this.table = table;
	}
	
	public static void putData(Long ob,BigInteger obj)
	{
		table.put(ob,obj);	
	}
}


