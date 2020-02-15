package com.keyword.test;

import org.testng.annotations.Test;

import com.keyword.engine.KeyWordEngine;

public class LoginTestcases {

	public KeyWordEngine keyWordEngine;
	
	@Test
	public void loginTest(){
		keyWordEngine = new KeyWordEngine();
		keyWordEngine.startExecution("login");
	}
	
	@Test
	public void signUpTest(){
		keyWordEngine = new KeyWordEngine();
		keyWordEngine.startExecution("signup");
	}
	

}
