package tn.esprit.asi.sprintproject.service;

import tn.esprit.asi.sprintproject.entities.Foyer;
import tn.esprit.asi.sprintproject.repository.FoyerRepository;

import java.util.List;

public class IFoyerServiceImpl implements  IFoyerService{

    private FoyerRepository foyerRepository;

    @Override
    public List<Foyer> retrieveAllFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer retrieveFoyer(long idFoyer) {
        return foyerRepository.findById(idFoyer).get();
    }

    @Override
    public void removeFoyer(long idFoyer) {
     foyerRepository.deleteById(idFoyer);
    }
}
