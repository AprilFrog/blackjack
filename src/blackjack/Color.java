package blackjack;

public enum Color {
	/**
	 * OBJETS CLASSES ET TRIES DANS L'ordre de déclaration
	 */
	TREFLE(1), CARREAU(3), COEUR(7), PIQUE(11);

	private int value;

	public int getValue() {
		return value;
	}

	Color(int value) {
		this.value = value;
	}

	/**
	 * METHODES issues de la classe java.lang.Enum et java.lang.Objet
	 *
	 * @param args @http://blog.paumard.org/cours/java/
	 *             chap04-structure-classe-enumeration.html
	 */

}