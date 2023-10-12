package tn.esprit.asi.sprintproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.asi.sprintproject.entities.Bloc;
import tn.esprit.asi.sprintproject.entities.Chambre;
import tn.esprit.asi.sprintproject.entities.Etudiant;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {

    List<Chambre> findByTypeCDoubleAndBlocNomBloc(String blocnom);
    List<Chambre> findByReservationsEstValideLike(Boolean estValide);
    List<Chambre> findByBlocNomBlocAndBlocCapaciteBlocGreaterThan(String NomBloc, Long capacitebloc );






}
