package com.example.DevOps.web;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration
public class welcomeControllerTest {

	private MockMvc mockMVC;

	@Autowired
	private WebApplicationContext context;

	@Before
	public void setUp() {
		mockMVC = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@Test
	public void welcomeTest() throws Exception {

		/*
		 * mockMVC.perform(get("/")).andExpect(status().isOk())
		 * .andExpect(model().attribute("Course", containsString("DevOps")));
		 */

	}

}
