package com.iteso.juegos;

public abstract class Baraja <T>{

//	private T   cartas[]; //Agregación de la clase Carta.
	public  T cartasRepartir[];//Utilizado x el método repartirCartas().
	public  T cartasTmp2[];//Utilizado x el método []repartirCartas(). 
	public  T cartasDspnb[];//Utilizado x el método []mazo().

	public Baraja () {
//		cartas =  (T[]) new CartaEspanola().CrearCartas();
//		cartasRepartir = (T[]) new CartaEspanola().CrearCartas();

	}//Fin de Constructor.

	public abstract void desplegar();

	public abstract void barajar(); 

	public abstract T repartirCarta();

	public abstract T[] repartirCarta(int n);
		
	public abstract T[] mazo();
		
	public abstract int cartasDisponibles();
		
}//Fin de la clase Barajar.
