package com.example.jenkinstest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JenkinsTestApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void test1(){
		Assert.assertNotEquals(1.0,2.0);
	}

}
