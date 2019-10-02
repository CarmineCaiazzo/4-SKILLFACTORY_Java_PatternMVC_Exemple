package CONTROLLER;

import MODEL.Persona; //Importa Persona

import VIEW.View;

public class TestMain {

	public static void main(String[] args) {
		
		Persona p= new Persona();//Richiamo di Persona.
		View v=new View(); //Costruttore View per Richiamare Metodi.+
		
		
//Con leggi Stringa Inseriamo il Nome
//Che va a finire in SetNome
		
		p.setNome(v.leggiStringa("Inserire Nome della Persona: "));
		p.setCognome(v.leggiStringa("Inserisci Cognome della Persona: "));
		p.setEta(v.leggiIntero("Inserisci Età della Persona: "));
		
//Stampa Persona
	
		v.stampaPersona(p); //Richiamo di StampaPersona in View
		
		
	
	}

}
