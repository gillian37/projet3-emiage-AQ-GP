$(document).ready(function() {
	
	$("#exportExcel").on("click", function(){
		
	    var tab_text="<table border='2px'><tr>";
	    var textRange; var j=0;
	    tab = document.getElementById('listOperations');
	
	    for(j = 0 ; j < tab.rows.length ; j++){     
	        tab_text=tab_text+tab.rows[j].innerHTML+"</tr>";
	        tab_text= tab_text.replace("€", "");
	        tab_text= tab_text.replace("é", "e");
	        tab_text= tab_text.replace("è", "e");
	    }
	
	    tab_text=tab_text+"</table>";
	
	    var ua = window.navigator.userAgent;
	    var msie = ua.indexOf("MSIE "); 
	
	    // Pour Internet Explorer
	    if (msie > 0 || !!navigator.userAgent.match(/Trident.*rv\:11\./)){
	    	
	        txtArea1.document.open("txt/html","replace");
	        txtArea1.document.write(tab_text);
	        txtArea1.document.close();
	        txtArea1.focus(); 
	        sa=txtArea1.document.execCommand("SaveAs",true,"Operations.xlsx");
	    }  
	    else // Pour les autres navigateurs
	        sa = window.open('data:application/vnd.ms-excel,' + encodeURIComponent(tab_text));  
	
	    return (sa);
	});
});