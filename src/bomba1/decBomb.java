package bomba1;

//este es el decodificador de la bomba, hace lo mismo pero una vez para cada numero aleatorio
public class decBomb {
	
	private String abc="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private String frase="KNJG CRPD";
	private String fraseCod="";
	// como vemos, random no es un numero aleatorio, ira cambiando dentro del bucle for de codifica()
	private int random;
	
	public decBomb(){
		
		
	}
	
	public String getFrase(){
		return fraseCod;
	}
	
	public void decodifica(){
		//ejecutamos el decodificador tantas veces como posibles valores que pueda tomar el numero aleatorio(26) incluyendo el 0
		for(int a=0;a<26;a++){
			random=a;
				for(int i=0;i<frase.length();i++){			
					if(frase.charAt(i)==' '){
						fraseCod+=" ";				
					}else{
					fraseCod+=cambiaLetra(frase.charAt(i));			
					}			
				}	
			System.out.println(a+": "+fraseCod);
			fraseCod="";
		}
		
	}
	
	private char cambiaLetra(char caracter){
		int i=abc.indexOf(caracter)+random;
			while(i>abc.length()){
				i-=abc.length();
			}
			
			if((abc.length()-1-i)<0){
				return abc.charAt(0);
			}
			return abc.charAt(abc.length()-1-i);
			
	}	
	
	public static void main(String[] args) {

		decBomb bomba=new decBomb();
		bomba.decodifica();
		
				

	}

}
