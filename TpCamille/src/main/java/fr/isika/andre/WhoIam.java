package fr.isika.andre;

public class WhoIam {
	
	public static String whoAreYou(String name) {
		
		String reponse = "Vous n'�tes pas connu de nos services";
		
		if(name.equals("Camille")) {
			
			reponse = "je m'appelle "+ name;
		}
		
		return reponse;
	}

}
