import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTextFile {

	@Test
	void test_SearchText() {
		
		TextFile textfile = new TextFile();
		
		assertEquals(textfile.SearchText("He is a good person; no a nice person", "af"),false);
		assertEquals(textfile.SearchText("He is a good person; no a nice person", "is"),true);
	}
	@Test
	void test_WordCount() {
		
		TextFile textfile = new TextFile();
		
		assertEquals(textfile.CountWord("He is a good person; no a nice person", "no"),1);
		assertEquals(textfile.CountWord("He is a good person; no a nice person", "person"),2);

	}

}
