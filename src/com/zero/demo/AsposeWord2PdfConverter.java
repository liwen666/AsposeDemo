package com.zero.demo;

import java.io.File;
import java.io.FileOutputStream;

import com.aspose.words.Document;

/**
 * Neither need license.xml, nor invoke getLicense() 
 * 
 * @author Louisling
 * @version 2018-07-27
 */
public class AsposeWord2PdfConverter {

    public static void main(String[] args) {
        doc2pdf("c:/aaa.doc", "c:/aaa.pdf");
        doc2pdf("c:/bbb.docx", "c:/bbb.pdf");
    }

    //doc/docx to PDF (use aspose-words-16.4.0-jdk16.jar, need no license.xml)
    //Support DOC, DOCX, OOXML, RTF HTML, OpenDocument, PDF, EPUB, XPS, SWF
    //doc2pdf("c:/aaa.doc", "c:/aaa.pdf");
    public static void doc2pdf(String wordPath, String pdfPath) {        
        try {
            long start = System.currentTimeMillis();
            File file = new File(pdfPath);
            FileOutputStream os = new FileOutputStream(file);
            Document doc = new Document(wordPath);
            doc.save(os, com.aspose.words.SaveFormat.PDF);
            os.close();
            System.out.println("It took time(seconds): " + ((System.currentTimeMillis() - start) / 1000.0));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
      
}
