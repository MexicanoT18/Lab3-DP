/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import lab3.dp.EnglishInformalLetter;
import lab3.dp.DataManager;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Lucas
 */
public class EnglishInformalLetterTest {
    
    private DataManager data1;
    private DataManager data2;
    
    public EnglishInformalLetterTest() {
    }
    
    @Before
    public void setUp(){
        
        data1 = DataMocker.mockData1();
        data2 = DataMocker.mockData2();
    }
    
    @Test
    public void testHeader(){
        EnglishInformalLetter letter1 = new EnglishInformalLetter(data1);
        String expected1 = "From: Lucas França, Rua H8A, 118\nTo: Gustavo Mirisola, Praça Marechal Eduardo Gomes, 50\n\n";
        assertEquals(expected1, letter1.header());
        
        EnglishInformalLetter letter2 = new EnglishInformalLetter(data2);
        String expected2 = "From: Gustavo Mirisola, Praça Marechal Eduardo Gomes, 50\nTo: Lucas França, Rua H8A, 118\n\n";
        assertEquals(expected2, letter2.header());
    }
    
    @Test
    public void testBody(){
        EnglishInformalLetter letter1 = new EnglishInformalLetter(data1);
        String expected1 = "Hello Gustavo Mirisola,\n\n";
        assertEquals(expected1, letter1.body());
        
        EnglishInformalLetter letter2 = new EnglishInformalLetter(data2);
        String expected2 = "Hello Lucas França,\n\n";
        assertEquals(expected2, letter2.body());
    }
    
    @Test
    public void testConclusion(){
        EnglishInformalLetter letter1 = new EnglishInformalLetter(data1);
        String expected1 = "See ya,\n";
        assertEquals(expected1, letter1.conclusion());
        
        EnglishInformalLetter letter2 = new EnglishInformalLetter(data2);
        String expected2 = "See ya,\n";
        assertEquals(expected2, letter2.conclusion());
    }
    
    @Test
    public void testSignature(){
        EnglishInformalLetter letter1 = new EnglishInformalLetter(data1);
        String expected1 = "\n"
                + "                                                          Lucas França";
        assertEquals(expected1, letter1.signature());
        
        EnglishInformalLetter letter2 = new EnglishInformalLetter(data2);
        String expected2 = "\n"
                + "                                                      Gustavo Mirisola";
        assertEquals(expected2, letter2.signature());
    }
}
