package project_1;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class ParserTest {
	Logger l = Logger.getLogger("testLog");
	Parser p;


	/**
	 * Tests valid input, no title
	 */
	@Test
	void testNoTitle() {
		p = new Parser("inputs/notitle.json", l);
		ArrayList<Article> a = p.parse();
		assertEquals(0, a.size());
	}
	
	/**
	 * Tests valid input, no date
	 */
	@Test
	void testNoDate() {
		p = new Parser("inputs/nodate.json", l);
		ArrayList<Article> a = p.parse();
		assertEquals(0, a.size());
	}
	
	/**
	 * Tests valid input, no url
	 */
	@Test
	void testNoURL() {
		p = new Parser("inputs/nourl.json", l);
		ArrayList<Article> a = p.parse();
		assertEquals(0, a.size());
	}
	
	/**
	 * Tests valid input, no desc
	 */
	@Test
	void testNoDesc() {
		p = new Parser("inputs/nodesc.json", l);
		ArrayList<Article> a = p.parse();
		assertEquals(0, a.size());
	}
	/**
	 * Tests valid input, no desc
	 */
	@Test
	void testAllValid() {
		p = new Parser("inputs/example.json", l);
		ArrayList<Article> a = p.parse();
		assertEquals(20, a.size());
	}
	
	@Test
	void testTwoValid() {
		p = new Parser("inputs/2good3bad.json", l);
		ArrayList<Article> a = p.parse();
		assertEquals(2, a.size());
	}

}
