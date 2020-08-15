public class PalindromeChecker implements WordChecker {
	public boolean check(String word){
		String reverse = "";
		for(int i = word.length()-1 ; i >=0 ;i--){
			reverse = reverse + word.charAt(i);
		}
		return word.equals(reverse);
	}
}
