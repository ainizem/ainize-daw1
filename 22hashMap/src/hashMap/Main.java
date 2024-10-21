package hashMap;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
//HASHMAP:  no autogenera un indice, se lo damos nosotros
		
		HashMap<String, String>	historial = new HashMap<>(); //k: clave- el segunfo:  value
		
		historial.put("San Luis", "http:////www.centrosanluis.com"); 
		
		historial.containsKey("Alberto"); //esto dará false porque esa Key no exite
		
		System.out.println(historial.get("San Luis")); //cuando no quiero una clave d numeros, un nobre que es ma rapido
		
	
	
	}

}
