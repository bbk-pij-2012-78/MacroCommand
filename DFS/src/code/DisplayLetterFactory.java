package code;

public class DisplayLetterFactory {

	public DisplayALetter Display(String letter){
		
		if (letter.equalsIgnoreCase("A")){
			return new DisplayTheLetterA();
		} else if (letter.equalsIgnoreCase("B")) {
			return new DisplayTheLetterB();
		} else if (letter.equalsIgnoreCase("C")) {
			return new DisplayTheLetterC();
		}
		return null;
	}
	
}
