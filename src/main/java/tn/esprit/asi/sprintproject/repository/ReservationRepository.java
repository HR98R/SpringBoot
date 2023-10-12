package tn.esprit.asi.sprintproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.asi.sprintproject.entities.Etudiant;
import tn.esprit.asi.sprintproject.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,String> {
}
