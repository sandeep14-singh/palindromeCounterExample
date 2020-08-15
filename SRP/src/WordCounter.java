public class WordCounter {

	private SentenceSplitter sentenceSplitter;
	private WordChecker wordChecker;
	
	WordCounter(SentenceSplitter sentenceSplitter, WordChecker wordChecker){
		this.sentenceSplitter = sentenceSplitter;
		this.wordChecker = wordChecker;
	}	
	
	public int count(String sentence){
		String[] words = sentenceSplitter.split(sentence);
		int count = 0;
		for(String word : words){
			if(wordChecker.check(word)){
				count++;
			}
		}
		return count;
	}
}
