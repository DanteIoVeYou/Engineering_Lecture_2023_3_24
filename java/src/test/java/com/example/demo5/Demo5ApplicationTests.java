package com.example.demo5;

import com.example.demo5.controller.UserController;
import com.example.demo5.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo5ApplicationTests {

	@Autowired
	private UserController userController;

	@Test
	void addUserTest() {
		User user = new User(3, "tom", "123", "example@example.com");
		userController.add(user);
	}


}
