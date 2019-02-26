package tdd.lab.spring.reservation.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.fail;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * Class that perform tests on ReservationController (reservation REST API).
 * These tests take long time to execute because a Tomcat instance is necessary.
 * 
 * @author dannyelcf
 *
 */
@RunWith(SpringRunner.class)
@WebMvcTest(ReservationController.class)
public class ReservationControllerTest {
	@Autowired
	MockMvc mvc;
	
	@Test
	public void getUserReservation_shouldReturnReservationDetails() {
		// Arrange
		
		try {
			// Act
			mvc.perform(MockMvcRequestBuilders.get("/reservation/dannyelcf"))
			// Assert
			   .andExpect(MockMvcResultMatchers.status().isOk())
			   .andExpect(MockMvcResultMatchers.jsonPath("$.id").isNumber())
			   .andExpect(MockMvcResultMatchers.jsonPath("$.username").value("dannyelcf"))
			   .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("Dannyel Cardoso da Fonseca"));  
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
}
