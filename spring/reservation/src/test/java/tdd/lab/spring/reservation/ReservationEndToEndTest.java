package tdd.lab.spring.reservation;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import tdd.lab.spring.reservation.domain.Reservation;

/**
 * Class that perform end to end tests through reservation API.
 * These tests take long time to execute because a Tomcat instance is necessary.
 * 
 * @author dannyelcf
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ReservationEndToEndTest {

	@Autowired
	private TestRestTemplate restTemplate;				 
	
	@Test
	public void getUserReservation_shouldReturnReservationDetails() {
		// Arrange
		
		// Act
		ResponseEntity<Reservation> response = restTemplate.getForEntity("/reservation/{username}", Reservation.class, "dannyelcf");
		
		// Assert
		Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		Assertions.assertThat(response.getBody().getId()).isInstanceOf(Number.class);
		Assertions.assertThat(response.getBody().getUsername()).isEqualTo("dannyelcf");
		Assertions.assertThat(response.getBody().getName()).isEqualTo("Dannyel Cardoso da Fonseca");
	}

}

