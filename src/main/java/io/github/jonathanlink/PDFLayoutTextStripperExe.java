package io.github.jonathanlink;
import java.util.*;

public class PDFLayoutTextStripperExe {

    /**
     * @param args
     */
    public static void main(String[] args) {
		final String tablePDF = "samples/bus.pdf";
		PDFTextExtractor pdfTextExtractor = new PDFTextExtractor();
		ArrayList<String> pages = pdfTextExtractor.parsePDF(tablePDF);
		for (int p = 0; p < pages.length; p++) {
			System.out.println(pages[p]);
		}
    }
}
