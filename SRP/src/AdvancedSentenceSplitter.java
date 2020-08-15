
public class AdvancedSentenceSplitter implements SentenceSplitter{

	private String delimeter;
		
	public AdvancedSentenceSplitter(String delimeter) {		
		this.delimeter = delimeter;
	}

	@Override
	public String[] split(String sentence) {
		return sentence.replaceAll("\\s+", "").split(delimeter);
	}
}


