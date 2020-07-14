/**
 * 
 * Souscrit/se désinscrit des offres promotionnelles Agence 
 */

$(document).ready(function() {
	
	$("#offresPromosPartenaire").on("change", function(){
		
		$.ajax({
			type : "GET",
			url :"/api/client/souscrireOffresPromosPartenaire",
			dataType: "JSON",
			data: {idClient: $('#idClient').val()},
		});
	});
});