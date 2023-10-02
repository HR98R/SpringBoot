package tn.esprit.asi.sprintproject.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.asi.sprintproject.entities.Bloc;

import java.util.List;

public interface BlocRepository extends JpaRepository<Bloc,Long>{

List<Bloc> findByFoyerUniversiteNomUniversite(String UniversiteNom);





}
