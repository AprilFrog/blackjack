package blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {

	private List<Card> cardDeck;

	public CardDeck() {
		super();
		cardDeck = new ArrayList<>();

		Card aCard = new Card();

		for (int i = 0; i < 53; i++) {

		cardDeck + =Card.createCard();
		}
	}

	public void showContent() {
		// TODO Auto-generated method stub

		System.out.println("Affichage du contenu du paquet" + cardDeck);

	}

}
