package VIEW;
//Qui vanno i metodi Input/Output in Console.

import MODEL.Persona;//Importo di Persona.

import java.util.Scanner;


public class View {
	
	Scanner s=new Scanner(System.in);
	private int n;
	
//Leggi Stringa
	
	public String leggiStringa(String S1)
	{
		System.out.println(S1);//Stampa Stringa 
		return s.nextLine(); //Inserimento e Ritorno di Stringa
	}

//Leggi Intero
	
	public int leggiIntero(String S2)
	{
		boolean flag;
		n = 0;
		
	do {
		
		flag=false;
			
		System.out.println(S2);//Stampa Stringa
		
		try {
			
			n=Integer.parseInt(s.nextLine());
			
		} catch(NumberFormatException e) {
			
			System.out.println("Inserisci solo dei Numeri!! X.X");
			flag=true;
		}
		
	}while(flag);
	
		return Integer.parseInt(s.nextLine());//Inserimento e Ritorno Stringa con Conversione in intero.
	}
	
//Leggi Intero
	
//Metodo Stampa persona

//Il Parametro Passato e la Persona Stessa.
	public void stampaPersona(Persona p)
	{
		System.out.println("La Persona è --> Nome: "+p.getNome()+" Cognome: "+p.getCognome()+" Età: "+p.getEta());;
	}

	
}
	
