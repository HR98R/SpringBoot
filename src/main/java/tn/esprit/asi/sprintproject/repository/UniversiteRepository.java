package tn.esprit.asi.sprintproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.asi.sprintproject.entities.Etudiant;
import tn.esprit.asi.sprintproject.entities.Universite;

public interface UniversiteRepository extends JpaRepository<Universite,Long> {
}
