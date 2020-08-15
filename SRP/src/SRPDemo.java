
public class SRPDemo {
	public static void main(String[] args) {
		String sentence = "    Is_nitin_a_good_345_programmer_23   ";
		WordCounter counter = new WordCounter(new AdvancedSentenceSplitter("_"), new PalindromeChecker());
		System.out.println("No of palindrome words = " + counter.count(sentence));
	}
}
