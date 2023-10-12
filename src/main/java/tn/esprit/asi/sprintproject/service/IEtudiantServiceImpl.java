package tn.esprit.asi.sprintproject.service;

import tn.esprit.asi.sprintproject.entities.Etudiant;
import tn.esprit.asi.sprintproject.repository.EtudiantRepository;

import java.util.List;

public class IEtudiantServiceImpl implements  IEtudiantService{

     private EtudiantRepository etudiantRepository;


    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(Long idEtudiant) {
        return etudiantRepository.findById(idEtudiant).get();
    }

    @Override
    public void removeEtudiant(Long idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);
    }
}
