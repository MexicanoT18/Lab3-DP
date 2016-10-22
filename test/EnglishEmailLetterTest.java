/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import lab3.dp.EnglishEmailLetter;
import lab3.dp.DataManager;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Lucas
 */
public class EnglishEmailLetterTest {
    
    private DataManager data1;
    private DataManager data2;
    
    public EnglishEmailLetterTest() {
    }
    
    @Before
    public void setUp(){
        
        data1 = DataMocker.mockData1();
        data2 = DataMocker.mockData2();
    }
    
    @Test
    public void testHeader(){
        EnglishEmailLetter letter1 = new EnglishEmailLetter(data1);
        String expected1 = "From: Lucas França [lucas@labces28.com]\n" +
                           "Sent: 10-18-2016\n" +
                           "To: Gustavo Mirisola [mirisola@labces28.com]\n" +
                           "Subject: Data de prova\n"
                + "______________________________________________________________________\n";
        assertEquals(expected1, letter1.header());
        
        EnglishEmailLetter letter2 = new EnglishEmailLetter(data2);
        String expected2 = "From: Gustavo Mirisola [mirisola@labces28.com]\n" +
                           "Sent: 10-19-2016\n" +
                           "To: Lucas França [lucas@labces28.com]\n" +
                           "Subject: Re: Data de prova\n"
                + "______________________________________________________________________\n";
        assertEquals(expected2, letter2.header());
    }
    
    @Test
    public void testBody(){
        EnglishEmailLetter letter1 = new EnglishEmailLetter(data1);
        String expected1 = "Hello Mr Gustavo Mirisola,\n\n";
        assertEquals(expected1, letter1.body());
        
        EnglishEmailLetter letter2 = new EnglishEmailLetter(data2);
        String expected2 = "Hello Mr Lucas França,\n\n";
        assertEquals(expected2, letter2.body());
    }
    
    @Test
    public void testConclusion(){
        EnglishEmailLetter letter1 = new EnglishEmailLetter(data1);
        String expected1 = "Best regards,\n";
        assertEquals(expected1, letter1.conclusion());
        
        EnglishEmailLetter letter2 = new EnglishEmailLetter(data2);
        String expected2 = "Best regards,\n";
        assertEquals(expected2, letter2.conclusion());
    }
    
    @Test
    public void testSignature(){
        EnglishEmailLetter letter1 = new EnglishEmailLetter(data1);
        String expected1 = "\nLucas França";
        assertEquals(expected1, letter1.signature());
        
        EnglishEmailLetter letter2 = new EnglishEmailLetter(data2);
        String expected2 = "\nGustavo Mirisola";
        assertEquals(expected2, letter2.signature());
    }
}
