package tn.esprit.asi.sprintproject.service;

import tn.esprit.asi.sprintproject.entities.Reservation;
import tn.esprit.asi.sprintproject.repository.ReservationRepository;

import java.util.List;

public class IRerservationServiceImpl implements  IRerservationService{

    private ReservationRepository reservationRepository;

    @Override
    public List<Reservation> retrieveAllReservation() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation addReservation(Reservation res) {
        return reservationRepository.save(res);
    }

    @Override
    public Reservation updateReservation(Reservation res) {
        return reservationRepository.save(res);
    }

    @Override
    public Reservation retrieveReservation(long idReservation) {
        return reservationRepository.findById(String.valueOf(idReservation)).get();
    }
}
