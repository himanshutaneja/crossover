package com.dev.crossover.customer;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.dev.crossover.Application;

@ContextConfiguration(classes = { Application.class })
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@TestPropertySource(locations = "classpath:application.properties")
public class CustomerControllerTest {

	@Autowired
	CustomerRepository customerRepository;

	Customer c;

	protected MockMvc mockMvc;
	@Autowired
	protected WebApplicationContext context;

	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
		customerRepository.deleteAll();
		c = new Customer();
		c.setCode("15");
		c.setName("name");
		c.setPhone1("+91100");
		c.setAddress("India");
		customerRepository.save(c);
	}

	@Test
	public void shouldGetCustomer() throws Exception {
		mockMvc.perform(get("/customers")).andExpect(status().isOk()).andExpect(jsonPath("$[0].code", equalTo("15")))
				.andExpect(jsonPath("$[0].name", equalTo("name")));
	}

}
