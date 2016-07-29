window.onload = function(){
	
	var senha  = document.getElementById("senha");
	var textoPadrao = "Senha";

	senha.value = textoPadrao;
	senha.style.color = "#CCC";
    senha.setAttribute("type","text");

	senha.onfocus = function() {
	  if (this.value == textoPadrao) {
	    this.value = "";
	    this.style.color = "#000";
	    this.setAttribute("type","password");
	  }
	}

	senha.onblur = function() {
	  if (this.value == "") {
	    this.value = textoPadrao;
	    this.style.color = "#CCC";
	    this.setAttribute("type","text");
	  }
	}
	
};