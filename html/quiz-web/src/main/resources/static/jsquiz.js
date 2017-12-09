function copyText()
{
var radios = document.getElementsByClassName("radios");
var scores = 0;
for(var i=0;i<radios.length;i++){
	var fruit = document.getElementsByName("Fruit" + (i+1));
	for(var j=0;j<fruit.length;j++){
		if(fruit[j].checked){
			scores += fruit[j].value * 1;
		}
	}
}
document.getElementById("score").value=scores;
}
