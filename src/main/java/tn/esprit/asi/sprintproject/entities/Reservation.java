package tn.esprit.asi.sprintproject.entities;
import jakarta.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name="Reservation")
public class Reservation implements Serializable {
    @Id
    @Column(name="idReservation")
    private  String idReservation ; // Clé primaire
    private Boolean estValide ;
    @Temporal(TemporalType.DATE)//definir le format de date
    private Date dateUniversitaire ;

    @ManyToOne
    private Chambre chambre;

    @ManyToMany(mappedBy = "reservationSet", cascade = CascadeType. ALL )
    private List<Etudiant> etudiantSet ;



    public Boolean getEstValide() {
        return estValide;
    }

    public void setEstValide(Boolean estValide) {
        this.estValide = estValide;
    }

    public Date getDateUniversitaire() {
        return dateUniversitaire;
    }

    public void setDateUniversitaire(Date dateUniversitaire) {
        this.dateUniversitaire = dateUniversitaire;
    }

    public String getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(String idReservation) {
        this.idReservation = idReservation;
    }
}
