package tn.esprit.asi.sprintproject.service;

import tn.esprit.asi.sprintproject.entities.Universite;

import java.util.List;

public interface IUniversityService {
    List<Universite> retrieveAllUniversities();

    Universite addUniversity (Universite u);

    Universite updateUniversity (Universite u);

    Universite retrieveUniversity (long idUniversity);



}
