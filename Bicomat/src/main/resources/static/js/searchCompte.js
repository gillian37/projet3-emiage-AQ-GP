/**
 * Lancement de recherche du compte
 */

$compte = "";

$(document).ready(function() {
	
	$(".btn-iban").on("click", function(e){
		
		var code = 0;
		var message = "";
		$.ajax({
			type : "GET",
			url :"/client/iban",
			data: {idCompte: this.id},
			dataType: 'json',
	        contentType:"application/json",
			success: function(result){
				compte = result;
			},
			error : function(e) {
				swal(
					'Oops...',
					'Une erreur est survenue lors du chargement de l\'IBAN',
					'error'
				)
			},
			complete : function(xhr, status){
				loadIban();
			}
		});
	});
	
	/* Affichage des éléments de l'IBAN */
	function loadIban(){
		$('#iban').html("<h2>Relevé d'Identité Bancaire</h2><br>");
		
		$('#iban').append("<div class='columns'><div class='column is-one-fifth'><img src='../images/logo.png' width='100'></div>" +
				"<div class='column is-four-fith'><p>N° compte : " + compte.numecompte + "<br>Titulaire du compte : "+compte.client.prenomClient+" " + compte.client.nomClient+"</p>" + 
				"IBAN : "+compte.iban + "<br>" +
				"BIC : "+compte.bic +
				"</div></div>");
		
	};
});