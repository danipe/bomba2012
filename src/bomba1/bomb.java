package bomba1;

public class bomb {
	
	private String abc="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private String frase="HEIL PACO";
	private String fraseCod="";
	private int random=(int) (1+(Math.random()*25));
	
	public bomb(){
		
	}
	
	public String getFrase(){
		return fraseCod;
	}
	
	public void codifica(){			
		for(int i=0;i<frase.length();i++){			
			if(frase.charAt(i)==' '){
				fraseCod+=" ";				
			}else{
			fraseCod+=cambiaLetra(frase.charAt(i));			
			}			
		}			
	}
	
	private char cambiaLetra(char caracter){
		int i=abc.indexOf(caracter)+random;
			while(i>abc.length()){
				i-=abc.length();
				
			}
		return abc.charAt(abc.length()-1-i);		
	}	
	
	public static void main(String[] args) {

		bomb bomba=new bomb();
		bomba.codifica();
		System.out.println(bomba.getFrase());
				

	}

}
