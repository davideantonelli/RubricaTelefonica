package davide.Rubrica;


/*
 *Esercizio 1. Sia data una classe Contatto le cui istanze rappresentano contatti telefonici. Ogni contatto ha
un nome, un cognome e un numero telefonico (tutti di tipo String), un costruttore che riceve come parametro
il nome, il cognome e il numero di telefono associati al contatto, metodi per leggere tali valori e il metodo
toString() che restituisce una rappresentazione testuale del contatto.
Scrivere una classe Rubrica che rappresenta una collezione di contatti. La classe memorizza i contatti per
mezzo di una lista ed è dotata dei seguenti metodi:
- void aggiungiContatto(String nome, String cognome, String telefono) che aggiunge un contatto alla
rubrica;
- void rimuoviContatto(String nome, String cognome) che rimuove dalla rubrica il contatto associato
al nome e cognome dati;
- String cerca(String nome, String cognome) che dato un nome e cognome restituisce il numero di
telefono associato a quel nome e cognome oppure null se il nome e cognome non sono presenti in
rubrica;
- String toString() che restituisce una descrizione testuale dell’intera rubrica.
 */
/**
 * 
 * @author Davide
 *@version 1.0
 */
public class Contatto {

	private String nome,cognome,numeroTelefonico;
	/**
	 * 
	 * Costruttore che si occupa di impostare il nome, cognome ed il numero del telefono del contatto
	 * @param Nome  Nome del contatto
	 * @param Cognome Cognome del Contatto
	 * @param Numero Numero Telefonico del contatto
	 */
	public Contatto(String Nome,String Cognome,String Numero) {
		this.nome=Nome;
		this.cognome= Cognome;
		this.numeroTelefonico=Numero;
		
	}
	/**
	 * 
	 * @return Nome del contatto
	 */
	public String getNome() {
		return this.nome;
	}
	/**
	 * 
	 * @return Cognome del contatto
	 */
	public String getCognome() {
		return this.cognome;	
	}
	/**
	 * 
	 * @return NumeroTelefonico del contatto
	 */
	public String GetNumeroTelefonico() {
		return this.numeroTelefonico;
	}
	/**
	 * Questo metodo restituisce una rappresentazione testuale del contatto
	 * @param nome Nome del contatto
	 * @param cognome Cognome del Contatto
	 * @param numeroTelefonico Numero telefonico del contatto
	 * @return Contatto , la stringa ottenuta dallo string builder.
	 */
	public String ToString(String nome,String cognome,String numeroTelefonico) {
	StringBuilder sb1= new StringBuilder("Il contatto selezionato è il seguente: ");
	sb1.append("Nome "+ nome);
	sb1.append("Cognome "+ cognome);
	sb1.append("Numero telefonico "+ numeroTelefonico);
	String Contatto = sb1.toString();
		return Contatto;
	}
	
}
