package com.flight.checkin.integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.flight.checkin.dto.Reservation;
import com.flight.checkin.dto.ReservationUpdateRequest;

@Component
public class ReservationRestClientImpl implements ReservationRestClient
{

	private static final String RESERVATION_REQUEST_URL = "http://localhost:8080/flightreservation/reservations/";

	@Override
	public Reservation findReservation(Long id) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.getForObject(RESERVATION_REQUEST_URL+id, Reservation.class);
		return reservation;
	}

	@Override
	public Reservation updateReservation(ReservationUpdateRequest request) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.postForObject(RESERVATION_REQUEST_URL, request, Reservation.class);
		return reservation;
	}

}
