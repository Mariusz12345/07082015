package serwis.samochodowy;

import javax.swing.JList;

public class SLista {
	
	public String[] nazwaKolumn   = {"Nr Rejestracji" , "Klient","Data Ostatniego serwisu"};
	public String nazwaPola;
	
	//JList list = new JList(nazwaKolumn);
	
	public SLista(String nazwaPola) {
		super();
		this.nazwaPola = nazwaPola;
	}


	public String getNazwaPola() {
		return nazwaPola;
	}


	public void setNazwaPola(String nazwaPola) {
		this.nazwaPola = nazwaPola;
	}
	
}
