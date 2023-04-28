package controller;

public class Controller {

	public static int contNum(int num) {
		// Condição de parada, se o número for menor que 9 depois de ser dividido por 10 múltiplas vezes.
		if (num <= 9) {
			return 1;
		} else {
			// Função para o termo n em função do termo anterior:
			return 1 + contNum(num / 10);
		}
	}
}