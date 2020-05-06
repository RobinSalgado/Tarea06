package com.iteso.juegos;

import java.util.ArrayList;
import java.util.Collections;

public  class CartaEspanola extends Baraja<CartaEspanola>{

	private final int MAX_NUM_CARTAS = 40;

	public enum Figura {Uno,Dos,Tres,Cuatro,Cinco,Seis,Siete,Sota,Caballo,Rey}
	public enum Palo {Espadas, Bastos, Oros, Copas}

	private Figura figura;
	private Palo palo;

	/*Se tiene que inicializar el array de objetos, de lo contrario regresará la 
	 * JVM (" NullPointerException "). De tal suerte que se agrega 
	 * ( "new Carta[MAX_NUM_CARTAS]" ) para que NO apunte a null al principio*/
	private CartaEspanola mazoCartas[] = new CartaEspanola[MAX_NUM_CARTAS];

	public CartaEspanola() {
	
	}

	public CartaEspanola(Palo palo, Figura figura) {
		setPalo (palo);
		setFigura (figura);
	}
	
	public CartaEspanola[] CrearCartas() {

		Figura figuras[] = Figura.values(); //Obtengo el enum de Figuras en un array.
		Palo palos[] = Palo.values();//Obtengo el enum de Palos en un array.

		int contadorCartas = 0;
		for ( int i = 0; i < palos.length; i++) {
			for (int j = 0; j < figuras.length; j++) {
				mazoCartas[contadorCartas] = new CartaEspanola( palos[i] , figuras[j] );
				contadorCartas++;
			}
		}
		return this.mazoCartas;
	}// Fin de CrearCartas.

	
	
	public Palo getPalo () { return palo; }
	public Figura getFigura () { return figura; }
	public void setPalo ( Palo palo ) { this.palo = palo; }
	public void setFigura ( Figura figura ) { this.figura = figura; }

	@Override
	public void desplegar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void barajar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public  repartirCarta() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T[] repartirCarta(int n) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T[] mazo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int cartasDisponibles() {
		// TODO Auto-generated method stub
		return 0;
	}

}//Fin de la clase Carta
