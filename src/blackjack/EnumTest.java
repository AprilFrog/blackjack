package blackjack;

public class EnumTest {

	public static void main(String[] args) {
		for (Color color : Color.values()) {
			System.out.println("Mes couleurs sont " + color.toString() + " de valeur : " + color.getValue());
		}

		Card myCard = new Card(6, Color.PIQUE);
		System.out.println("Ma carte : " + myCard.getValeur() + " de " + myCard.getCouleur());

	}

}
