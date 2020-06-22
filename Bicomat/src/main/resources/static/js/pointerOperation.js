/**
 * 
 * Pointer/dépointe une opération
 */

function pointerOperation(id) {
	
	var code = 0;
	
	$.ajax({
		type : "GET",
		url :"/api/client/pointerOperation",
		dataType: "JSON",
		data: {idOperation: id}
	});
}