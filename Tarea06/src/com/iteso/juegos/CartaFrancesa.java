package com.iteso.juegos;

import java.util.Stack;

public class CartaFrancesa extends Baraja<CartaFrancesa> {

	enum Suits 	   { DIMANETES, PICAS, CORAZONES, TREBOLES}
	enum FaceCards { As,Dos,Tres,Cuatro,Cinco, Seis, Siete, Ocho, Nueve, Diez, Joto, Reina, Rey} 

	private Suits suits;
	private FaceCards faceCards;
	private final int MAX_NUM_CARDS = 52;

	private  CartaFrancesa deckCarts[];

	public CartaFrancesa() {
		deckCarts = new CartaFrancesa[MAX_NUM_CARDS];
	}

	public CartaFrancesa(Suits suits, FaceCards faceCards) {
		setSuits(suits);
		setFaceCards(faceCards);
	}

	public CartaFrancesa[] createCards() {

		Suits suitsArr[] = Suits.values(); //Obtengo el enum de Figuras en un array.
		FaceCards faceCardsArr[] = FaceCards.values();//Obtengo el enum de Palos en un array.

		int contadorCartas = 0;
		for ( int i = 0; i < suitsArr.length; i++) {
			for (int j = 0; j < faceCardsArr.length; j++) {
				deckCarts[contadorCartas] = new CartaFrancesa( suitsArr[i] , faceCardsArr[j] );
				contadorCartas++;
			}
		}		

		return this.deckCarts;
	}// Fin de CrearCartas.

	public void printCartaFrancesa() {
		for ( int i = 0; i < this.deckCarts.length; i++) {
			System.out.println(this.deckCarts[i].getFaceCards()+" de "+ this.deckCarts[i].getSuits());
		}
	}
	
	public Suits getSuits() {
		return suits;
	}

	public void setSuits(Suits suits) {
		this.suits = suits;
	}

	public FaceCards getFaceCards() {
		return faceCards;
	}

	public void setFaceCards(FaceCards faceCards) {
		this.faceCards = faceCards;
	}
	@Override
	public Stack<CartaFrancesa> crearCartas() {
		return null;
	}
	@Override
	public void desplegar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void barajar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void repartirCarta() {
	}

	@Override
	public void repartirCarta(int n) {
	}

	@Override
	public Stack<CartaFrancesa> mazo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int cartasDisponibles() {
		// TODO Auto-generated method stub
		return 0;
	}

}
