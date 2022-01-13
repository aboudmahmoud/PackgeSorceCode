/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aboud.gradleproject1;

/**
 *
 * @author Aboud Mahmoud
 */
import com.itextpdf.text.BadElementException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.net.URL;
import javax.swing.JOptionPane;

public class PrintedrClass {

    void ts() {

    }

    public PrintedrClass(String name, String Dammpent, String price, String PhoneNumber, String ps, String ACount) throws BadElementException, IOException, DocumentException {

        Document document = new Document();

        PdfWriter.getInstance(document, new FileOutputStream("Bill.pdf"));
        document.open();
        Font f = FontFactory.getFont("22016-adobearabic.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
    f.setStyle(Font.BOLD);

        PdfPTable pdfTable = new PdfPTable(1);
        pdfTable.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        PdfPCell pdfPCell = new PdfPCell();
        pdfPCell.setBorder(Rectangle.NO_BORDER);
        URL url = new URL("https://firebasestorage.googleapis.com/v0/b/projectmangment-666fb.appspot.com/o/Webp.net-resizeimage%20(1).png?alt=media&token=72dc387b-ee6e-45fd-b563-d94c8e5b8a3c");
        Image img = Image.getInstance(url);
      //  img.setAbsolutePosition(250f, 0f);
        Paragraph paragraph1 = new Paragraph(" «·Ì «·”Ìœ: " + name + "\n",f);
        Paragraph paragraph2 = new Paragraph(" «·„œÌ‰…: " + Dammpent + "\n",f);
        Paragraph paragraph3 = new Paragraph(" ”⁄— «·ÿ—œ : " + price + " ‘Ìﬂ·\n",f);
        Paragraph paragraph4 = new Paragraph(" —ﬁ„ «·Â« › " + PhoneNumber + "\n",f);
        Paragraph paragraph5 = new Paragraph(" «·«„Ì· : " + ACount + "\n",f);
        Paragraph paragraph6 = new Paragraph("‘ﬂ—« ·«” ·«„ﬂ «·ÿ—œ ",f);
        Paragraph paragraph7 = new Paragraph(" „·«ÕŸ… : " + ps + "\n",f);

        paragraph1.setAlignment(PdfPCell.ALIGN_LEFT);
        paragraph2.setAlignment(PdfPCell.ALIGN_LEFT);
        paragraph3.setAlignment(PdfPCell.ALIGN_LEFT);
        paragraph4.setAlignment(PdfPCell.ALIGN_LEFT);
        paragraph5.setAlignment(PdfPCell.ALIGN_LEFT);
        paragraph6.setAlignment(PdfPCell.ALIGN_LEFT);
        paragraph7.setAlignment(PdfPCell.ALIGN_LEFT);
        pdfPCell.addElement(paragraph1);
        pdfPCell.addElement(paragraph2);
        pdfPCell.addElement(paragraph3);
        pdfPCell.addElement(paragraph4);
        pdfPCell.addElement(paragraph5);
        pdfPCell.addElement(paragraph6);
        pdfPCell.addElement(paragraph7);
        pdfTable.addCell(pdfPCell);
        document.add(img);
        document.add(pdfTable);
      
        document.close();

    }
}
