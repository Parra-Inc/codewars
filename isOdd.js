function isOdd(n) {
	//var m = n;
	var n = document.getElementById('number');
	//startVal != Math.floor(startVal)
	
	if(Math.abs(n)%2!=0) {
	    if(n == Math.floor(n)) {
	      //return true;
	      alert("OK");
	    }else {
	      //return false;
	      alert("not OK");
	    }
	}else {
    	//return false;
    	alert("not OK");
  }
}