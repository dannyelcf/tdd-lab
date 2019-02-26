package tdd.lab.spring.reservation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tdd.lab.spring.reservation.domain.Reservation;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

	@GetMapping("/{username}")
	public Reservation getReservation(@PathVariable String username) {
		return null;
	}
}
