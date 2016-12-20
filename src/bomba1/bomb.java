package bomba1;


//clase de la bomba
public class bomb {
	//creamos los strings y un numero aleatoio que tendra un valor de 0 a 25
	private String abc="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private String frase="HEIL PACO";
	private String fraseCod="";
	private int random=(int)(Math.random()*25);
	//El constructor de la bomba estará vacío
	public bomb(){
		
	}
	//devuelve la frase codificada
	public String getFrase(){
		return fraseCod;
	}
	//codifica el mensaje
	public void codifica(){		
		//iremos recorriendo cada caracter de la frase original para cambiarlos por otro caracter utilizando el string abc
		for(int i=0;i<frase.length();i++){			
			//si el caracter es un espacio pondremos un espacio en la frase codificada
			if(frase.charAt(i)==' '){
				fraseCod+=" ";				
			}else{
			//si no cambiamos la letra mediante el metodo cambiaLetra
			fraseCod+=cambiaLetra(frase.charAt(i));			
			}			
		}		
	}
	
	private char cambiaLetra(char caracter){
		//creamos un numero i que será la posición de la letra en el abecedario mas el numero aleatorio, claro está
		//si i fuese mas grande que el abecedario no podriamos cambiarlo porque nos daria error, asi que lo reducimos tantas veces
		// como sean necesarias para que i sea mas pequeño que el abecedario
		int i=abc.indexOf(caracter)+random;
			while(i>abc.length()){
				i-=abc.length();
			}
			//La gracia del metodo es que no te devuelva la misma letra que le has introducido, te saca la letra que está al "otro lado" del abecedario,
			//es como si pudiesemos doblar el abecedario por la mitad y intercambiar una letra por la otra, las dos estan a la misma distancia de la letra del medio
			//del abecedario, es como crear un agujero de gusano en el espacio tiempo. Entonces claro, si i es 25, lo siguiente que hace es restarle i al tamaño del abecedario
			// y luego le resta -1, eso nos dejaria con -1, y eso no es una posicion del string, por eso existe este if.
			if((abc.length()-1-i)<0){
				return abc.charAt(0);
			}
			return abc.charAt(abc.length()-1-i);
			
	}	
	
	public static void main(String[] args) {
		// creamos la bomba
		bomb bomba=new bomb();
		// codificamos el mensaje de la bomba
		bomba.codifica();
		// imprimimos por pantalla la frase codificada
		System.out.println(bomba.getFrase());
		
				

	}

}
