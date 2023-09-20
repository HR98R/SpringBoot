package tn.esprit.asi.sprintproject.entities;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
@Table(name="Chambre")
public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idChambre")
    private  long  idChambre;
    private long numeroChambre;




    @Enumerated(EnumType.STRING)
    private  TypeChambre typeC;

    public long getIdChambre() {
        return idChambre;
    }

    public void setIdChambre(long idChambre) {
        this.idChambre = idChambre;
    }

    public long getNumeroChambre() {
        return numeroChambre;
    }

    public void setNumeroChambre(long numeroChambre) {
        this.numeroChambre = numeroChambre;
    }

    public TypeChambre getTypeC() {
        return typeC;
    }

    public void setTypeC(TypeChambre typeC) {
        this.typeC = typeC;
    }
}
