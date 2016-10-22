/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import lab3.dp.DataManager;
import lab3.dp.PortugueseComercialLetter;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Lucas
 */
public class PortugueseComercialLetterTest {
    
    
    private DataManager data1;
    private DataManager data2;
    
    public PortugueseComercialLetterTest() {
    }
    
    @Before
    public void setUp(){
        
        data1 = DataMocker.mockData1();
        data2 = DataMocker.mockData2();
    }
    
    @Test
    public void testHeader(){
        PortugueseComercialLetter letter1 = new PortugueseComercialLetter(data1);
        String expected1 = "18/10/2016\n\nDe: Lucas França, Rua H8A, 118\nPara: Gustavo Mirisola, Praça Marechal Eduardo Gomes, 50\n\n";
        assertEquals(expected1, letter1.header());
        
        PortugueseComercialLetter letter2 = new PortugueseComercialLetter(data2);
        String expected2 = "19/10/2016\n\nDe: Gustavo Mirisola, Praça Marechal Eduardo Gomes, 50\nPara: Lucas França, Rua H8A, 118\n\n";
        assertEquals(expected2, letter2.header());
    }
    
    @Test
    public void testBody(){
        PortugueseComercialLetter letter1 = new PortugueseComercialLetter(data1);
        String expected1 = "Caro Sr Gustavo Mirisola,\n\n";
        assertEquals(expected1, letter1.body());
        
        PortugueseComercialLetter letter2 = new PortugueseComercialLetter(data2);
        String expected2 = "Caro Sr Lucas França,\n\n";
        assertEquals(expected2, letter2.body());
    }
    
    @Test
    public void testConclusion(){
        PortugueseComercialLetter letter1 = new PortugueseComercialLetter(data1);
        String expected1 = "Sinceramente,\n";
        assertEquals(expected1, letter1.conclusion());
        
        PortugueseComercialLetter letter2 = new PortugueseComercialLetter(data2);
        String expected2 = "Sinceramente,\n";
        assertEquals(expected2, letter2.conclusion());
    }
    
    @Test
    public void testSignature(){
        PortugueseComercialLetter letter1 = new PortugueseComercialLetter(data1);
        String expected1 = "\n"
                + "                                                    __________________\n"
                + "                                                          Lucas França\n"
                + "                                                    telefone: 11223344\n"
                + "                                             email: lucas@labces28.com";
        assertEquals(expected1, letter1.signature());
        
        PortugueseComercialLetter letter2 = new PortugueseComercialLetter(data2);
        String expected2 = "\n"
                + "                                                    __________________\n"
                + "                                                      Gustavo Mirisola\n"
                + "                                                    telefone: 55667788\n"
                + "                                          email: mirisola@labces28.com";
        assertEquals(expected2, letter2.signature());
    }
}
