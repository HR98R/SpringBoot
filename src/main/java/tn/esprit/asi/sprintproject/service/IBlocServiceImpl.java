package tn.esprit.asi.sprintproject.service;

import tn.esprit.asi.sprintproject.entities.Bloc;
import tn.esprit.asi.sprintproject.repository.BlocRepository;

import java.util.List;

public class IBlocServiceImpl implements  IBlocService{

    private BlocRepository blocRepository;

    @Override
    public List<Bloc> retrieveBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc retrieveBloc(long idBloc) {
        return blocRepository.findById(idBloc).get();
    }

    @Override
    public void removeBloc(long idBloc) {
        blocRepository.deleteById(idBloc);
    }
}
