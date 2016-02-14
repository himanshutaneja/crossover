package com.dev.crossover.saleOrder;

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
public class SaleOrderControllerTest {

	@Autowired
	SaleOrderRepository saleOrderRepository;

	SaleOrders so;

	protected MockMvc mockMvc;
	@Autowired
	protected WebApplicationContext context;

	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
		saleOrderRepository.deleteAll();
		so = new SaleOrders();
		so.setCustCode("12");
		so.setOrderNo("1a");
		saleOrderRepository.save(so);
	}

	@Test
	public void shouldGetCustomer() throws Exception {
		mockMvc.perform(get("/saleOrders")).andExpect(status().isOk()).andExpect(jsonPath("$[0].custCode", equalTo("15")))
				.andExpect(jsonPath("$[0].orderNo", equalTo("1a")));
	}
}
