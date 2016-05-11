package models;

public class Toolkit{

	public static final char PUNTO = '.';

	public void getMostDamagetSection(String section){
		int countInitial = 0;
		int countFinal = 0;
		boolean isPunto = false;
		for (int i = 0; i < section.length(); i++){
			if (section.charAt(i) == PUNTO && !isPunto){
					isPunto = true;
			}
			if ((section.charAt(i) == PUNTO && isPunto) || isPunto && i == section.length() -1) {
				countInitial++;
				countFinal +=countInitial;
				isPunto = false;
				
			}
		}
		System.out.println("tramo mas deteriorado: " + countInitial + "-" + countFinal);
	}

	public int sumUnitNumbers(String text){
		int sum = 0;
		boolean isNumber = false;
		for (int i = 0; i < text.length(); i++){
			if (Character.isDigit(text.charAt(i)) && text.charAt(i) != ','){
				isNumber = true;
			}
			if (isNumber) {
				sum += Character.getNumericValue(text.charAt(i));
				isNumber = false;
				
			}
		}
		return sum;
	}

	
	public static void main(String[] args){
		Toolkit t = new Toolkit();
		t.getMostDamagetSection("___.....____.._");
		System.out.println("Suma total de los numeros: " + t.sumUnitNumbers("8,4,2"));
		//System.out.println(t.getStudenMostNote("juan, 1; daniel, 0; alejandra, 4"));
	}
}