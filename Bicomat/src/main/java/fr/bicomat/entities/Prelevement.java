package fr.bicomat.entities;
// default package
// Generated 8 déc. 2018 07:10:38 by Hibernate Tools 5.2.11.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Virement generated by hbm2java
 */
@Entity
@Table(name = "prelevement")
public class Prelevement implements java.io.Serializable {

	/**
	 * Identifiant de la serialisation.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Identifiant du prelevement
	 */
	private Integer idprelevement;
	
	/**
	 * Client qui gére le virement. 
	 */
	private Client client;

	/**
	 * Compte débiteur.
	 */
	private Compte compteByCompteDebiteur;
	
	/**
	 * Date de la création du prélévement.
	 */
	private Date dateCreation;
	
	/**
	 * Montant à prélever.
	 */
	private double montant;

	/**
	 * Libellé du prélévement.
	 */
	private String libelle;

	/**
	 * Date à partir de laquelle le prélèvement est actif. 
	 */
	private Date dateEcheance;
	
	/**
	 * Etat du prélévement.
	 */
	private String etatPrelevement = EtatPrelevement.ACTIF.getCode();

	/**
	 * Constructeur du prélévement.
	 */
	public Prelevement() {
	}

	/**
	 * Constructeur du prélévement. 
	 * @param client Client qui a créé le prélévement.
	 * @param compteByCompteDebiteur Compte à créditer.
	 * @param dateCreation Date de la création du prélévement.
	 * @param etatPrelevement etat de prélévement.
	 * @param libelle Libelle .
	 */
	public Prelevement(Client client, Compte compteByCompteDebiteur, Date dateCreation,
			String etatPrelevement, String libelle) {
		this.client = client;
		this.compteByCompteDebiteur = compteByCompteDebiteur;
		this.dateCreation = dateCreation;
		this.etatPrelevement = etatPrelevement;
		this.libelle = libelle;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idprelevement", unique = true, nullable = false)
	public Integer getId() {
		return this.idprelevement;
	}

	public void setId(Integer idprelevement) {
		this.idprelevement = idprelevement;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "client_idclient", nullable = false)
	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "compte_Debiteur", nullable = false)
	public Compte getCompteByCompteDebiteur() {
		return this.compteByCompteDebiteur;
	}

	public void setCompteByCompteDebiteur(Compte compteByCompteDebiteur) {
		this.compteByCompteDebiteur = compteByCompteDebiteur;
	}
	@Temporal(TemporalType.DATE)
	@Column(name = "dateCreation", nullable = false, length = 19)
	public Date getDateCreation() {
		return this.dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	@Column(name = "etatPrelevement", nullable = false, length = 5)
	public String getEtatPrelevement() {
		return this.etatPrelevement;
	}

	public void setEtatPrelevement(String etatPrelevement) {
		this.etatPrelevement = etatPrelevement;
	}
	
	@Column(name = "libelle", nullable = true, length = 50)
	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
	@Column(name = "montant", nullable = false, precision = 22, scale = 0)
	public double getMontant() {
		return this.montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dateEcheance", nullable = false, length = 19)
	public Date getDateEcheance() {
		return this.dateEcheance;
	}

	public void setDateEcheance(Date dateEcheance) {
		this.dateEcheance = dateEcheance;
	}

	
}