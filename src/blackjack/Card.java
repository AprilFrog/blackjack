package blackjack;

public class Card {

//	private int[] cardByNumber = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
	private int valeur;
	private Color couleur;

	/**
	 * Constructeur
	 *
	 * @param value
	 * @param color
	 */
	public Card(int valeur, Color couleur) {
		this.valeur = valeur;
		this.couleur = couleur;
	}

	public synchronized int getValeur() {
		return valeur;
	}

	public synchronized Color getCouleur() {
		return couleur;
	}

}
