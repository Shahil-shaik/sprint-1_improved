package com.capgemini.online_test.util;
import com.capgemini.online_test.dto.*;
import java.util.*;
public class UserRepository 
		{
		static HashMap<Long, User> table = new HashMap<Long,User>();
		
		static {
			putData(new User("shahil",11615915,true,null,"Abc-1234"));
			putData(new User("harish",11605004,false,null,"Abc-1235"));
			putData(new User("satish",11604993,false,null,"Abc-1236"));
		}

		public static HashMap<Long,User> gettable() {
			return table;
		}

		public void setTable(HashMap<Long, User> table) 
		{
			UserRepository.table = table;
		}
		public static void putData(User ob)
		{
		table.put(ob.getUserId(),ob);	
		}
		}
