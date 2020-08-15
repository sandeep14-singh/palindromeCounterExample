
public class BasicSentenceSplitter implements SentenceSplitter{
	public String[] split(String sentence){
		return sentence.split(" ");
	}
}


