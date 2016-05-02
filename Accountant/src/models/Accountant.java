package models;

public class Accountant{

	public int getNumberElements(String phrase, char caracter){
		int numberCaracter = 0;
		int size = phrase.length();
		for (int i = 0; i < size; i++){
			if (caracter == phrase.charAt(i)){
				numberCaracter++;
			}
		}
		return numberCaracter;
	}

	public boolean getBinary(String number){
		int numberCaracter = 0;
		int size = number.length();
		for (int i = 0; i < size; i++){
			if (number.charAt(i) == '1' || number.charAt(i) == '0'){
				numberCaracter++;
				return true;
			} 
			return false;
		}
		return false;
	}

	public int getNumberWords(String phrase){
		int numberWords = 0;
		int size = phrase.length();
		for (int i = 0; i < size; i++){
			if (phrase.charAt(i) == ' '){
				numberWords++;
			}
		}
		return numberWords + 1;
	}


	public int getNumberSimbols(String phrase){
		char symbol = 'v';
		int numberSymbols = 0;
		int size = phrase.length();
		for (int i = 0; i < size; i++){
			if (phrase.charAt(i) == ':' + (symbol)){
					numberSymbols++;
			}
		}
		return numberSymbols;
	}

	public int getAddNumber(String phrase){
		int totalAdd = 0;
		int numberCaracter = 0;
		int size = phrase.length();
		for (int i = 0; i < size; i++){
			if(phrase.charAt(i) >= 1 && phrase.charAt(i) <= 9){
				numberCaracter++;
				return totalAdd += phrase.charAt(i);
			}
		}
		return totalAdd;
	}

	public int getBiggerNumber(String phrase){
		int biggerNumber = 0;
		int posicion = 0;
		int size = phrase.length();
		for (int i = 0; i < size; i++){
			if(phrase.charAt(i) > biggerNumber){
				posicion++;
			}
			return biggerNumber;
		}
		return biggerNumber;
	}


	public static void main(String[] args){
		Accountant elements = new Accountant();
		System.out.println("numero de carateres solicitado en la frase: " + elements.getNumberElements("hola como estas", ' '));
		System.out.println(elements.getBinary("10001"));
		System.out.println("Numero de palabras: " + elements.getNumberWords("Hola mundo con popo"));
		System.out.println("Numero de :v : " + elements.getNumberSimbols("hola :v como estas :v hola:"));
		System.out.println("Total de la suma de los numeros: " + elements.getAddNumber("9d1"));
		System.out.println("Numero mayor: " + elements.getBiggerNumber("12, 2, 4"));
	}
}