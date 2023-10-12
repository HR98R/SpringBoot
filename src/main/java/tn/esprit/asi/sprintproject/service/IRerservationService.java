package tn.esprit.asi.sprintproject.service;

import tn.esprit.asi.sprintproject.entities.Reservation;

import java.util.List;

public interface IRerservationService {
    List<Reservation> retrieveAllReservation();

    Reservation addReservation (Reservation  res);

    Reservation updateReservation (Reservation  res);

    Reservation retrieveReservation (long idReservation);

}
