package com.iteso.juegos;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public abstract class Baraja<T> {
	List<T> cartas;
//	private T   cartas[]; //Agregaci�n de la clase Carta.
	public  T cartasRepartir[];//Utilizado x el m�todo repartirCartas().
	public  T cartasTmp2[];//Utilizado x el m�todo []repartirCartas(). 
	public  T cartasDspnb[];//Utilizado x el m�todo []mazo().

	public Baraja () {
		this.cartas = new ArrayList<T>();
	}//Fin de Constructor.
	public abstract Stack<T> crearCartas();
	public abstract void desplegar();

	public abstract void barajar(); 

	public abstract void repartirCarta();

	public abstract void repartirCarta(int n);
		
	public abstract Stack<T> mazo();
		
	public abstract int cartasDisponibles();
		
}//Fin de la clase Barajar.
