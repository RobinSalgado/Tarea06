package com.iteso.juegos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public  class CartaEspanola extends Baraja<CartaEspanola> {

	private final int MAX_NUM_CARTAS = 40;

	public enum Figura {Uno,Dos,Tres,Cuatro,Cinco,Seis,Siete,Sota,Caballo,Rey}
	public enum Palo {Espadas, Bastos, Oros, Copas}

	private Figura figura;
	private Palo palo;

	/*Se tiene que inicializar el array de objetos, de lo contrario regresar� la 
	 * JVM (" NullPointerException "). De tal suerte que se agrega 
	 * ( "new Carta[MAX_NUM_CARTAS]" ) para que NO apunte a null al principio*/
	private Stack<CartaEspanola> mazoCartas;
	public CartaEspanola() {
		this.mazoCartas = new Stack<>();
	}

	public CartaEspanola(Palo palo, Figura figura) {
		setPalo (palo);
		setFigura (figura);
	}
	
	public List<CartaEspanola> CrearCartas() {
		Figura figuras[] = Figura.values(); //Obtengo el enum de Figuras en un array.
		Palo palos[] = Palo.values();//Obtengo el enum de Palos en un array.

		for ( int i = 0; i < palos.length; i++) {
			for (int j = 0; j < figuras.length; j++) {
				this.mazoCartas.add(new CartaEspanola( palos[i] , figuras[j]));
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
		for(CartaEspanola carta : this.mazoCartas) {
			System.out.println(carta.getPalo() + " de " + carta.getFigura());
		}
	}

	@Override
	public void barajar() {
		
		//Se revuelven los 40 n�meros.
		Collections.shuffle(this.mazoCartas);
	}

	@Override
	public void repartirCarta() {
		if(!this.mazoCartas.isEmpty()) {
			CartaEspanola cartaActual = this.mazoCartas.pop();
			System.out.println(cartaActual.getFigura() + " de " + cartaActual.getPalo());
		} else {
			System.err.println("ya no hay mas cartas para jugar");
		}
	}

	@Override
	public void repartirCarta(int n) {
		if(n > this.mazoCartas.size()) {
			System.out.println("quieres mas cartas de las que hay en el mazo");
		} else {
			for(int i = 0; i < n; i++) {
				CartaEspanola cartaActual = this.mazoCartas.pop();
				System.out.println(cartaActual.getFigura() + " de " + cartaActual.getPalo());
			}
		}
	}

	@Override
	public Stack<CartaEspanola> mazo() {
		for(CartaEspanola carta : this.mazoCartas) {
			System.out.println(carta.getFigura() + " de " + carta.getPalo());
		}
		return this.mazoCartas;
	}

	@Override
	public int cartasDisponibles() {
		System.out.println(this.mazoCartas.size());
		return this.mazoCartas.size();
	}

}//Fin de la clase Carta
