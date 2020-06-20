/**
 * Lancement de recherche d'opérations
 */
$listOperations=[];

$(document).ready(function() {
	
	$("#btnsearch").on("click", function(e){
		var code = 0;
		var message = "";
		$.ajax({
			type : "GET",
			url :"/api/client/searchOperations",
			dataType: "JSON",
			data: {dateDebut: $('#dateDebut').val(), dateFin: $('#dateFin').val()},
			success: function(result){
				
				$listOperations = result;
				code = 1;
				message = "Ok";
							
			},
			error : function(e) {
				code = -1;
				message = e.message;
			},
			complete: function(){
				
				if(code == 1) {
					loadOperations();
				}else{
					swal(
							'Oops...',
							message,
							'error'
					)
				}
			}
		});
	})
	

	/**
	 *  Chargment des clients dans la page.
	 */
	function loadOperations(){
		//$("#listOperations tr").remove();
		var row="<tr><th>N°</th>"+
				"<th>Libellé</th>"+
				"<th>Date</th>"+
				"<th>Type</th>" +
				"<th>Montant</th>" +
				"<th>Pointée ?</th></tr>";
		$('#listClient > tbody:last-child').append(row);

		_.forEach($listOperations, function(operation){
			var checked = "";
			if(operation.pointer != false)
				checked = "checked";
				
			row ="<tr><td> "+ operation.id +"</td> <td> "+ operation.libelleOperation +"</td><td> "+ operation.dateOperation +"</td><td> "+ operation.typeOperation +"</td><td>" + operation.montant + " €</td><td><input type='checkbox' name='pointer' " + checked + "></td><td><input type='hidden' name='id' value='" + operation.id + "'></td></tr>";
			$('#listOperations > tbody:last-child').append(row);	
		})
	}
	
	
});