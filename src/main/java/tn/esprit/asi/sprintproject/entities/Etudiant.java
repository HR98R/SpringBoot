package tn.esprit.asi.sprintproject.entities;
import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name="Etudiant")
public class Etudiant implements Serializable {
        @Id
        @GeneratedValue (strategy = GenerationType.IDENTITY)
        @Column(name="idEtudiant")
        private  Long idEtudiant ; // Clé primaire
        private String nomEt ;
        private String prenomEt ;
        private Long cin;
        private  String ecole ;
        @Temporal(TemporalType.DATE)//definir le format de date
        private Date dateNaissance ;

        @ManyToMany(cascade = CascadeType. ALL )
        private List<Reservation> reservationSet ;




        public Long getIdEtudiant() {
                return idEtudiant;
        }

        public void setIdEtudiant(Long idEtudiant) {
                this.idEtudiant = idEtudiant;
        }

        public String getNomEt() {
                return nomEt;
        }

        public void setNomEt(String nomEt) {
                this.nomEt = nomEt;
        }

        public String getPrenomEt() {
                return prenomEt;
        }

        public void setPrenomEt(String prenomEt) {
                this.prenomEt = prenomEt;
        }

        public Long getCin() {
                return cin;
        }

        public void setCin(Long cin) {
                this.cin = cin;
        }

        public String getEcole() {
                return ecole;
        }

        public void setEcole(String ecole) {
                this.ecole = ecole;
        }

        public Date getDateNaissance() {
                return dateNaissance;
        }

        public void setDateNaissance(Date dateNaissance) {
                this.dateNaissance = dateNaissance;
        }


}
