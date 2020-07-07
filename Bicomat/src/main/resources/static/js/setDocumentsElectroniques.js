/**
 * 
 * Souscrit/se désinscrit des documents électroniques
 */

$(document).ready(function() {
	
	$("#docsElectroniques").on("change", function(){
		
		$.ajax({
			type : "GET",
			url :"/api/client/souscrireDocsElectroniques",
			dataType: "JSON",
			data: {idClient: $('#idClient').val()},
		});
	});
});