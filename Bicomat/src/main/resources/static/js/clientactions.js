/**
 * Gestions des interactions de l'index client
 */
$(document).ready(function() {
	$("#navHome").on("click",function(){
afficherConteneur("#home");
});

$("#navCompte").on("click",function(){
	afficherConteneur("#compte");
	chargerPage("/client/comptes","#compteLoad");
});
$("#navCarte").on("click",function(){
	afficherConteneur("#cartes");
});

$("#navEpargne").on("click",function(){
	afficherConteneur("#epargne");
});

$("#navCredit").on("click",function(){
	afficherConteneur("#credit");
});

$("#navAssurance").on("click",function(){
	afficherConteneur("#assurance");
});
$("#loadAlerte").on("click",function(){
	chargerPage("/client/alertes","#compteLoad");
});
$("#loadDocuments").on("click",function(){
	chargerPage("/client/documents","#compteLoad");
});
$("#loadOperations").on("click",function(){
	chargerPage("/client/operations/","#compteLoad");
});
$("#btn-iban").on("click",function(){
	chargerPage("/client/iban/","#compteLoad");
});
	
	
$("#loadTiers").on("click",function(){
	chargerPage("/client/comptetiers","#compteLoad");
});
$("#updateTiers").on("click",function(){
	chargerPage("/client/updatetiers","#compteLoad");
});
$("#deleteTiers").on("click",function(){
	if(confirm('Etes-vous sûr de vouloir supprimer ce bénéficiaire ?')) chargerPage("/client/deletetiers","#compteLoad");
});
  
$("#loadPrelevement").on("click",function(){
	chargerPage("/client/prelevement","#compteLoad");
});
$("#loadOpposition").on("click",function(){
	chargerPage("/client/prelevement","#compteLoad");
});

afficherConteneur("#home");
	
	
});

