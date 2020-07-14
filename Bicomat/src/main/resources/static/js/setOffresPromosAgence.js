/**
 * 
 * Souscrit/se désinscrit des offres promotionnelles Agence 
 */

$(document).ready(function() {
	
	$("#offresPromosAgence").on("change", function(){
		
		$.ajax({
			type : "GET",
			url :"/api/client/souscrireOffresPromosAgence",
			dataType: "JSON",
			data: {idClient: $('#idClient').val()},
		});
	});
});