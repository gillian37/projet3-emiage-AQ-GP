package fr.bicomat.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@DiscriminatorValue(value = "CLIENT")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CompteClient extends Compte implements java.io.Serializable {

	/**
	 * Identifiant de sérialisation 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Etat du découvert
	 */
	String etatDecouvert = EtatDecouvert.PAS_AUTORISER.getEtat();
	
	/**
	 * Solde du compte.
	 */
	private double solde = 0;
	
	/**
	 * Montant du découvert
	 */
	private double montantDecouvert = 0 ;
	private String iban;
	private String bic;
	
	
	@Column(name = "montant_decouvert", nullable = false, precision = 22, scale = 0)
	public double getMontantDecouvert() {
		return this.montantDecouvert;
	}

	public void setMontantDecouvert(double montantDecouvert) {
		this.montantDecouvert = montantDecouvert;
	}
	
	@Column(name = "etat_decouvert", length = 8)
	public String getEtatDecouvert() {
		return this.etatDecouvert;
	}

	public void setEtatDecouvert(String etatDecouvert) {
		this.etatDecouvert = etatDecouvert;
	}
	
	@Column(name = "solde", nullable = false, precision = 22, scale = 0)
	public double getSolde() {
		return this.solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	@Column(name = "iban", length = 34)
	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	@Column(name = "bic", length = 11)
	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

}
