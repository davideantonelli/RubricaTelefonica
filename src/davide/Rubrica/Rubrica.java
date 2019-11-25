package davide.Rubrica;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


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
 * Scrivere una classe Rubrica che rappresenta una collezione di contatti
 */
public class Rubrica {
	/**
	 * @La classe memorizza i contatti per mezzo di una lista
	 */
	private List<Contatto> Contatti;
		/**
		 * Costruttore della classe rubrica
		 */
	public Rubrica () {
	this.Contatti=new ArrayList <Contatto> ();
	}
	
	/**
	 * Aggiunge un contatto alla rubrica;
	 * @param nome
	 * @param cognome
	 * @param telefono
	 */
	void aggiungiContatto(String nome, String cognome, String telefono) {
		this.Contatti.add(new Contatto(nome,cognome,telefono));
	}
	
	
	/**
	 * Rimuove dalla rubrica il contatto associato al nome e cognome dati;
	 * @param nome
	 * @param cognome
	 */
	void rimuoviContatto(String nome, String cognome) {
		boolean rimosso=false;
		Iterator<Contatto> cont = this.Contatti.iterator(); // creo l'iteratore di tipo Contatto associato all' ArrayList
		while (cont.hasNext() && !rimosso) {
			/*
			 * scorro il successivo contatto
			 */
			cont.next();
			if (cont.equals(nome)&& cont.equals(cognome)) {
				cont.remove();
				rimosso = true;			
			}
		}
	}
	/**
	 * dato un nome e cognome restituisce il numero di telefono associato a quel nome e cognome oppure null se il nome e cognome non sono presenti in rubrica;
	 * @param nome
	 * @param cognome
	 * @return
	 */
	String cerca(String nome, String cognome) {
		String numero=null;
		/*
		 *Creo l'iterator di tipo Contatto  e ci associo l'iteratore dell'arraylist Contatti
		 */
		Iterator <Contatto> cont =this.Contatti.iterator();
		/**
		 * Fino a quando Iterator ha un successivo, e numero == numm
		 */
		while (cont.hasNext() && numero==null ) {
			/**
			 * Creo un nuovo contatto e lo assoccio al contatto iterato
			 */
			Contatto ic=cont.next(); 
			if (ic.getNome()==nome && ic.getCognome()== cognome) {
				numero=ic.GetNumeroTelefonico();
			}
		}
		return numero;
		
	}
	/**
	 * restituisce una descrizione testuale dell’intera rubrica.
	 */
	public String toString() {
		
			String s="Rubrica\n";
			s+="---------------------------\n";
			Iterator<Contatto> it=this.Contatti.iterator();
			while(it.hasNext()){
			Contatto c=it.next();
			s+=c.toString()+"\n";
			}
			return s;
			}

		
	
}
