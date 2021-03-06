//
// This file was generated by the JPA Modeler
//
package ci.kossovo.ecole.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Entity
@Table(name = "T_PERSONNE")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "TYPE_PERS", discriminatorType = DiscriminatorType.STRING, length = 2)
@DiscriminatorValue("PE")

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({ @Type(name = "PE", value = Personne.class), @Type(name = "AD", value = Administrateur.class),
		@Type(name = "EN", value = Enseignant.class), @Type(name = "ET", value = Etudiant.class) })
public class Personne extends AbstractEntity {
	private static final long serialVersionUID = 1L;

	private String titre;

	@Embedded
	private Adresse adresse;

	private String nom;

	private String prenom;
	private String numCni;

	private String nomComplet;

	@Column(name = "TYPE_PERS", insertable = false, updatable = false)
	private String type;

	public Personne() {

	}

	public Personne(String titre, Adresse adresse, String nom, String prenom) {
		super();
		this.titre = titre;
		this.adresse = adresse;
		this.nom = nom;
		this.prenom = prenom;
	}

	public Personne(String titre, String nom, String prenom) {
		super();
		this.titre = titre;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	
	

	public Personne(String titre, String nom, String prenom, String numCni) {
		super();
		this.titre = titre;
		this.nom = nom;
		this.prenom = prenom;
		this.numCni = numCni;
	}

	// Pour le test
	public Personne(Long id, String titre, String nom, String prenom, String numCni) {
		super(id);
		this.titre = titre;
		this.nom = nom;
		this.prenom = prenom;
		this.numCni = numCni;
	}
	
	@Override
	public String toString() {
		return String.format("Personne[%s,%s,%s,%s]", id, version, titre, nomComplet);
	}

	

	public String getNomComplet() {
		return nomComplet;
	}

	@PrePersist
	public void setNomComplet() {
		this.nomComplet = nom + " " + prenom;
	}

	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Adresse getAdresse() {
		return this.adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNumCni() {
		return numCni;
	}

	public void setNumCni(String numCni) {
		this.numCni = numCni;
	}
	
	

}
