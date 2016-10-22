/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import lab3.dp.DataManager;
import lab3.dp.PortugueseInformalLetter;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Lucas
 */
public class PortugueseInformalLetterTest {
    
    private DataManager data1;
    private DataManager data2;
    
    public PortugueseInformalLetterTest() {
    }
    
    @Before
    public void setUp(){
        
        data1 = DataMocker.mockData1();
        data2 = DataMocker.mockData2();
    }
    
    @Test
    public void testHeader(){
        PortugueseInformalLetter letter1 = new PortugueseInformalLetter(data1);
        String expected1 = "De: Lucas França, Rua H8A, 118\nPara: Gustavo Mirisola, Praça Marechal Eduardo Gomes, 50\n\n";
        assertEquals(expected1, letter1.header());
        
        PortugueseInformalLetter letter2 = new PortugueseInformalLetter(data2);
        String expected2 = "De: Gustavo Mirisola, Praça Marechal Eduardo Gomes, 50\nPara: Lucas França, Rua H8A, 118\n\n";
        assertEquals(expected2, letter2.header());
    }
    
    @Test
    public void testBody(){
        PortugueseInformalLetter letter1 = new PortugueseInformalLetter(data1);
        String expected1 = "Olá Gustavo Mirisola,\n\n";
        assertEquals(expected1, letter1.body());
        
        PortugueseInformalLetter letter2 = new PortugueseInformalLetter(data2);
        String expected2 = "Olá Lucas França,\n\n";
        assertEquals(expected2, letter2.body());
    }
    
    @Test
    public void testConclusion(){
        PortugueseInformalLetter letter1 = new PortugueseInformalLetter(data1);
        String expected1 = "Até mais,\n";
        assertEquals(expected1, letter1.conclusion());
        
        PortugueseInformalLetter letter2 = new PortugueseInformalLetter(data2);
        String expected2 = "Até mais,\n";
        assertEquals(expected2, letter2.conclusion());
    }
    
    @Test
    public void testSignature(){
        PortugueseInformalLetter letter1 = new PortugueseInformalLetter(data1);
        String expected1 = "\n"
                + "                                                          Lucas França";
        assertEquals(expected1, letter1.signature());
        
        PortugueseInformalLetter letter2 = new PortugueseInformalLetter(data2);
        String expected2 = "\n"
                + "                                                      Gustavo Mirisola";
        assertEquals(expected2, letter2.signature());
    }
}
