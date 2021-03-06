//
// This file was generated by the JPA Modeler
//
package ci.kossovo.ecole.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "T_ETUDIANT_PROMO")
@IdClass(EtudiantPromoID.class)
public class EtudiantPomo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long id_etudiant;
	@Id
	private Long id_promotion;
	@Id
	@Column(name = "id_annee")
	private int annee;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "id_etudiant", insertable = false, updatable = false)
	private Etudiant etudiant;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "id_promotion", insertable = false, updatable = false)
	private Promotion promotion;

	public EtudiantPomo() {

	}

	public EtudiantPomo(Long id_etudiant, Long id_promotion, int annee) {
		super();
		this.id_etudiant = id_etudiant;
		this.id_promotion = id_promotion;
		this.annee = annee;
	}

	@Override
	public String toString() {
		return String.format("EtudiantPromo[%s,%s,%s]", id_etudiant, id_promotion, annee);
	}

	public Etudiant getEtudiant() {
		return this.etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	public Promotion getPromotion() {
		return this.promotion;
	}

	public void setPromotion(Promotion promotion) {
		this.promotion = promotion;
	}

	public Long getId_etudiant() {
		return id_etudiant;
	}

	public void setId_etudiant(Long id_etudiant) {
		this.id_etudiant = id_etudiant;
	}

	public Long getId_promotion() {
		return id_promotion;
	}

	public void setId_promotion(Long id_promotion) {
		this.id_promotion = id_promotion;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

}
