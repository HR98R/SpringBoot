package tn.esprit.asi.sprintproject.service;

import tn.esprit.asi.sprintproject.entities.Chambre;
import tn.esprit.asi.sprintproject.repository.ChambreRepository;

import java.util.List;

public class IChambreServiceImpl implements  IChambreService{
    private ChambreRepository chambreRepository;
    @Override
    public List<Chambre> retrieveAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre retrieveChambre(long idChambre) {
        return chambreRepository.findById(idChambre).get();
    }
}
