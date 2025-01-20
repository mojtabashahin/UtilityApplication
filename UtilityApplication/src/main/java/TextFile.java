
public class TextFile {

	public TextFile ()
	{
		
	}
	public boolean SearchText (String sourceText, String word)
	{
		int index=sourceText.indexOf(word);
		if (index!=-1)
			return true;
		else 
			return false;
		
	}
	public int CountWord (String sourceText, String word)
	{
		int index = 0;
		int count=0;
		while (index != -1) {
		    index = sourceText.indexOf(word, index);
		    if (index != -1) {
		        index++;
		        count++;
		    }
		}
		return count;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextFile textfile = new TextFile();
		
		System.out.println(textfile.SearchText("He is a good person; no a nice person", "af"));
		System.out.println(textfile.CountWord("He is a good person; no a nice person", "no"));
		}

}
