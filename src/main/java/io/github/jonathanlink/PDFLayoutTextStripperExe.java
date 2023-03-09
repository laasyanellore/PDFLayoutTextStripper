package io.github.jonathanlink;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.pdfbox.io.RandomAccessFile;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PDFLayoutTextStripperProgram {

    /**
     * @param args
     */
    public static void main(String[] args) {
		final String tablePDF = "samples/bus.pdf";
		prog.parsePDF(tablePDF);
    }

    protected void parsePDF(String filename) {
	String string = null;
	try {
	    PDFParser pdfParser = new PDFParser(new RandomAccessFile(new File(filename), "r"));
	    pdfParser.parse();
	    PDDocument pdDocument = new PDDocument(pdfParser.getDocument());
	    PDFTextStripper pdfTextStripper = new PDFLayoutTextStripper();
	    string = pdfTextStripper.getText(pdDocument);
	} catch (FileNotFoundException e) {
	    e.printStackTrace();
	} catch (IOException e) {
	    e.printStackTrace();
	}
	System.out.println(string);
    }
}