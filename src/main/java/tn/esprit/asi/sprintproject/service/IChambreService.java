package tn.esprit.asi.sprintproject.service;

import tn.esprit.asi.sprintproject.entities.Chambre;

import java.util.List;

public interface IChambreService {

    List<Chambre> retrieveAllChambres();

    Chambre  addChambre(Chambre c); // ajouter l’équipe avec son détail

    Chambre updateChambre (Chambre  c);

    Chambre retrieveChambre (long idChambre);

}
