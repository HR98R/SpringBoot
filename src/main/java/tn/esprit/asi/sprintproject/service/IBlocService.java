package tn.esprit.asi.sprintproject.service;

import tn.esprit.asi.sprintproject.entities.Bloc;

import java.util.List;

public interface IBlocService {

    List<Bloc> retrieveBlocs();

    Bloc updateBloc (Bloc  bloc);

    Bloc addBloc (Bloc bloc);

    Bloc retrieveBloc (long  idBloc);

    void removeBloc (long idBloc);



}
