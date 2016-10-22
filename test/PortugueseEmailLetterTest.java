/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import lab3.dp.DataManager;
import lab3.dp.PortugueseEmailLetter;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Lucas
 */
public class PortugueseEmailLetterTest {
    
    private DataManager data1;
    private DataManager data2;
    
    public PortugueseEmailLetterTest() {
    }
    
    @Before
    public void setUp(){
        
        data1 = DataMocker.mockData1();
        data2 = DataMocker.mockData2();
    }
    
    @Test
    public void testHeader(){
        PortugueseEmailLetter letter1 = new PortugueseEmailLetter(data1);
        String expected1 = "De: Lucas França [lucas@labces28.com]\n" +
                           "Enviado: 18/10/2016\n" +
                           "Para: Gustavo Mirisola [mirisola@labces28.com]\n" +
                           "Assunto: Data de prova\n"
                + "______________________________________________________________________\n";
        assertEquals(expected1, letter1.header());
        
        PortugueseEmailLetter letter2 = new PortugueseEmailLetter(data2);
        String expected2 = "De: Gustavo Mirisola [mirisola@labces28.com]\n" +
                           "Enviado: 19/10/2016\n" +
                           "Para: Lucas França [lucas@labces28.com]\n" +
                           "Assunto: Re: Data de prova\n"
                + "______________________________________________________________________\n";
        assertEquals(expected2, letter2.header());
    }
    
    @Test
    public void testBody(){
        PortugueseEmailLetter letter1 = new PortugueseEmailLetter(data1);
        String expected1 = "Olá Sr Gustavo Mirisola,\n\n";
        assertEquals(expected1, letter1.body());
        
        PortugueseEmailLetter letter2 = new PortugueseEmailLetter(data2);
        String expected2 = "Olá Sr Lucas França,\n\n";
        assertEquals(expected2, letter2.body());
    }
    
    @Test
    public void testConclusion(){
        PortugueseEmailLetter letter1 = new PortugueseEmailLetter(data1);
        String expected1 = "Abraços,\n";
        assertEquals(expected1, letter1.conclusion());
        
        PortugueseEmailLetter letter2 = new PortugueseEmailLetter(data2);
        String expected2 = "Abraços,\n";
        assertEquals(expected2, letter2.conclusion());
    }
    
    @Test
    public void testSignature(){
        PortugueseEmailLetter letter1 = new PortugueseEmailLetter(data1);
        String expected1 = "\nLucas França";
        assertEquals(expected1, letter1.signature());
        
        PortugueseEmailLetter letter2 = new PortugueseEmailLetter(data2);
        String expected2 = "\nGustavo Mirisola";
        assertEquals(expected2, letter2.signature());
    }
}
