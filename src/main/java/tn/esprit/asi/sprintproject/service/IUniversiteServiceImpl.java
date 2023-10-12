package tn.esprit.asi.sprintproject.service;

import tn.esprit.asi.sprintproject.entities.Universite;
import tn.esprit.asi.sprintproject.repository.UniversiteRepository;

import java.util.List;

public class IUniversiteServiceImpl implements  IUniversityService{

    private  UniversiteRepository UniversiteRepository;
    @Override
    public List<Universite> retrieveAllUniversities() {
        return UniversiteRepository.findAll();
    }

    @Override
    public Universite addUniversity(Universite u) {
        return UniversiteRepository.save(u);
    }

    @Override
    public Universite updateUniversity(Universite u) {
        return UniversiteRepository.save(u);
    }

    @Override
    public Universite retrieveUniversity(long idUniversity) {
        return UniversiteRepository.findById(idUniversity).get();
    }
}
