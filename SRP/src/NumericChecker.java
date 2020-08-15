
public class NumericChecker implements WordChecker {

	@Override
	public boolean check(String word) {
		boolean isNumeric = true;
		for(char ch : word.toCharArray()){
			isNumeric = isNumeric & isNumeric(ch);			
		}
		return isNumeric;
	}

	private boolean isNumeric(char ch) {
		return Character.isDigit(ch);
	}
}
