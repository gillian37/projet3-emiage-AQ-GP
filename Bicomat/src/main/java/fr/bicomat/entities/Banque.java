package fr.bicomat.entities;
// default package
// Generated 8 déc. 2018 07:10:38 by Hibernate Tools 5.2.11.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Banque generated by hbm2java
 */
@Entity
@Table(name = "banque")
public class Banque implements java.io.Serializable {

	private Integer idbanque;
	private String nomBanque;
	private String adresse;
	private Set<Client> clients = new HashSet<Client>(0);

	public Banque() {
	}

	public Banque(String nomBanque) {
		this.nomBanque = nomBanque;
	}

	public Banque(String nomBanque, String adresse, Set<Client> clients) {
		this.nomBanque = nomBanque;
		this.adresse = adresse;
		this.clients = clients;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idbanque", unique = true, nullable = false)
	public Integer getIdbanque() {
		return this.idbanque;
	}

	public void setIdbanque(Integer idbanque) {
		this.idbanque = idbanque;
	}

	@Column(name = "nom_banque", nullable = false, length = 45)
	public String getNomBanque() {
		return this.nomBanque;
	}

	public void setNomBanque(String nomBanque) {
		this.nomBanque = nomBanque;
	}

	@Column(name = "adresse", length = 100)
	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "banque_client", joinColumns = {
			@JoinColumn(name = "banque_idbanque", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "client_idclient", nullable = false, updatable = false) })
	public Set<Client> getClients() {
		return this.clients;
	}

	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}

}
