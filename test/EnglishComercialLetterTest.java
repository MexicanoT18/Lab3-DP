/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import lab3.dp.EnglishComercialLetter;
import lab3.dp.DataManager;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Lucas
 */
public class EnglishComercialLetterTest {
    
    private DataManager data1;
    private DataManager data2;
    
    public EnglishComercialLetterTest() {
    }
    
    @Before
    public void setUp(){
        
        data1 = DataMocker.mockData1();
        data2 = DataMocker.mockData2();
    }
    
    @Test
    public void testHeader(){
        EnglishComercialLetter letter1 = new EnglishComercialLetter(data1);
        String expected1 = "10-18-2016\n\nFrom: Lucas França, Rua H8A, 118\nTo: Gustavo Mirisola, Praça Marechal Eduardo Gomes, 50\n\n";
        assertEquals(expected1, letter1.header());
        
        EnglishComercialLetter letter2 = new EnglishComercialLetter(data2);
        String expected2 = "10-19-2016\n\nFrom: Gustavo Mirisola, Praça Marechal Eduardo Gomes, 50\nTo: Lucas França, Rua H8A, 118\n\n";
        assertEquals(expected2, letter2.header());
    }
    
    @Test
    public void testBody(){
        EnglishComercialLetter letter1 = new EnglishComercialLetter(data1);
        String expected1 = "Dear Mr Gustavo Mirisola,\n\n";
        assertEquals(expected1, letter1.body());
        
        EnglishComercialLetter letter2 = new EnglishComercialLetter(data2);
        String expected2 = "Dear Mr Lucas França,\n\n";
        assertEquals(expected2, letter2.body());
    }
    
    @Test
    public void testConclusion(){
        EnglishComercialLetter letter1 = new EnglishComercialLetter(data1);
        String expected1 = "Sincerely,\n";
        assertEquals(expected1, letter1.conclusion());
        
        EnglishComercialLetter letter2 = new EnglishComercialLetter(data2);
        String expected2 = "Sincerely,\n";
        assertEquals(expected2, letter2.conclusion());
    }
    
    @Test
    public void testSignature(){
        EnglishComercialLetter letter1 = new EnglishComercialLetter(data1);
        String expected1 = "\n"
                + "                                                    __________________\n"
                + "                                                          Lucas França\n"
                + "                                                       phone: 11223344\n"
                + "                                             email: lucas@labces28.com";
        assertEquals(expected1, letter1.signature());
        
        EnglishComercialLetter letter2 = new EnglishComercialLetter(data2);
        String expected2 = "\n"
                + "                                                    __________________\n"
                + "                                                      Gustavo Mirisola\n"
                + "                                                       phone: 55667788\n"
                + "                                          email: mirisola@labces28.com";
        assertEquals(expected2, letter2.signature());
    }
}
