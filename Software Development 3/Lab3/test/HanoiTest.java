import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HanoiTest {

	private static ByteArrayOutputStream outContent;
	private static PrintStream sysOut;
	static String hanoi1, hanoi2, hanoi5, hanoi10;

	@BeforeClass
	public static void readFiles() {
		hanoi1 = readFile("hanoi-1.txt");
		hanoi2 = readFile("hanoi-2.txt");
		hanoi5 = readFile("hanoi-5.txt");
		hanoi10 = readFile("hanoi-10.txt");
		sysOut = System.out;
	}

	@Before
	public void setup() {
		outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
	}

	@Test
	public void testHanoi1() {
		Hanoi.movePile(1, "A", "B", "C");
		assertEquals(cleanString(hanoi1.trim()), cleanString(outContent.toString().trim()));
	}

	@Test
	public void testHanoi2() {
		Hanoi.movePile(2, "A", "B", "C");
		assertEquals(cleanString(hanoi2.trim()), cleanString(outContent.toString().trim()));
	}

	@Test
	public void testHanoi5() {
		Hanoi.movePile(5, "A", "B", "C");
		assertEquals(cleanString(hanoi5.trim()), cleanString(outContent.toString().trim()));
}

	@Test
	public void testHanoi10() {
		Hanoi.movePile(10, "A", "B", "C");
		assertEquals(cleanString(hanoi10.trim()), cleanString(outContent.toString().trim()));
}

	@AfterClass
	public static void restoreStreams() {
		System.setOut(sysOut);
	}

	private String cleanString(String s) {
		return s.replaceAll("\r", "").replaceAll("\n", "");
	}

	private static String readFile(String fname) {
		String content = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(fname));
			while (br.ready()) {
				content += br.readLine();
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return content;
	}

}
