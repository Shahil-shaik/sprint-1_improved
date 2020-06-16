package com.capgemini.online_test.dao;
import com.capgemini.online_test.util.*;
import java.util.HashMap;

import com.capgemini.online_test.dto.*;

public class UserDao {
	
	public static User getUserObject(long userId) {
		UserRepository userRepoObj = new UserRepository();
	  HashMap<Long,User> map=userRepoObj.gettable();
	  return map.get(userId);
	}
	public static void putUserObject(User user) {
		UserRepository UserRepoObj = new UserRepository();
		UserRepoObj.putData(user);
	}
}