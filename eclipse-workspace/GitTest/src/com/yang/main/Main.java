package com.yang.main;

import java.util.List;

import com.yang.dao.UserDao;
import com.yang.entity.User;

public class Main {

	public static void main(String [] args) {
		UserDao dao = new UserDao();
		List<User> list = dao.getUserList();
		
		for(User user : list){
			System.out.println(user.getName() +", "+user.getAge()+", "+user.getScore());
		}
	}

}