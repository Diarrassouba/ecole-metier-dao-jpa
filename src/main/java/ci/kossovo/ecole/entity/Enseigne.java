//
// This file was generated by the JPA Modeler
//
package ci.kossovo.ecole.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "T_ENSEIGNE")
@IdClass(EnseigneID.class)
public class Enseigne implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long id_enseignant;
	@Id
	private Long id_promotion;
	@Id
	private Long id_matiere;

	private String annee;

	@Version
	private Long version;

	// Enseigne lié à eneignant
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "id_enseignant", insertable = false, updatable = false)
	private Enseignant enseignant;

	private boolean active;

	// Enseigne lié à matiere
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "id_matiere", insertable = false, updatable = false)
	private Matiere matiere;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "id_promotion", insertable = false, updatable = false)
	private Promotion promotion;

	public Enseigne() {

	}

	public Enseigne(Long id_enseignant, Long id_promotion, Long id_matiere, String annee, boolean active) {
		super();
		this.id_enseignant = id_enseignant;
		this.id_promotion = id_promotion;
		this.id_matiere = id_matiere;
		this.annee = annee;
		this.active = active;
	}

	public Enseigne(Long id_enseignant, Long id_promotion, Long id_matiere) {
		super();
		this.id_enseignant = id_enseignant;
		this.id_promotion = id_promotion;
		this.id_matiere = id_matiere;
	}

	@Override
	public String toString() {
		return String.format("Enseigne[%s,%s,%s,%s,%s]", id_enseignant,id_matiere,id_promotion, annee,active);
	}
	
	public String getAnnee() {
		return this.annee;
	}

	public void setAnnee(String annee) {
		this.annee = annee;
	}

	public Enseignant getEnseignant() {
		return this.enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Matiere getMatiere() {
		return this.matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}

	public Promotion getPromotion() {
		return this.promotion;
	}

	public void setPromotion(Promotion promotion) {
		this.promotion = promotion;
	}

	public Long getId_enseignant() {
		return id_enseignant;
	}

	public void setId_enseignant(Long id_enseignant) {
		this.id_enseignant = id_enseignant;
	}

	public Long getId_promotion() {
		return id_promotion;
	}

	public void setId_promotion(Long id_promotion) {
		this.id_promotion = id_promotion;
	}

	public Long getId_matiere() {
		return id_matiere;
	}

	public void setId_matiere(Long id_matiere) {
		this.id_matiere = id_matiere;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

}
