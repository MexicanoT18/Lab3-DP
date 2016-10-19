/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import lab3.dp.ComercialLetter;
import lab3.dp.DataManager;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author Lucas
 */
public class ComercialLetterTest {
    
    private DataManager data1;
    private DataManager data2;
    
    public ComercialLetterTest() {
    }
    
    @Before
    public void setUp(){
        data1 = mock(DataManager.class);
        data2 = mock(DataManager.class);
        
        when(data1.getDate()).thenReturn("18/10/2016");
        when(data2.getDate()).thenReturn("19/10/2016");
        
        when(data1.getSenderAddress()).thenReturn("Rua H8A, 118");
        when(data2.getSenderAddress()).thenReturn("Praça Marechal Eduardo Gomes, 50");
        
        when(data1.getSenderEmail()).thenReturn("lucas@labces28.com");
        when(data2.getSenderEmail()).thenReturn("mirisola@labces28.com");
        
        when(data1.getSenderName()).thenReturn("Lucas França");
        when(data2.getSenderName()).thenReturn("Gustavo Mirisola");
        
        when(data1.getSenderPhone()).thenReturn("11223344");
        when(data2.getSenderPhone()).thenReturn("55667788");
        
        when(data2.getReceiverAddress()).thenReturn("Rua H8A, 118");
        when(data1.getReceiverAddress()).thenReturn("Praça Marechal Eduardo Gomes, 50");
        
        when(data2.getReceiverEmail()).thenReturn("lucas@labces28.com");
        when(data1.getReceiverEmail()).thenReturn("mirisola@labces28.com");
        
        when(data2.getReceiverName()).thenReturn("Lucas França");
        when(data1.getReceiverName()).thenReturn("Gustavo Mirisola");
        
        when(data2.getReceiverPhone()).thenReturn("11223344");
        when(data1.getReceiverPhone()).thenReturn("55667788");
    }
    
    @Test
    public void testHeader(){
        ComercialLetter letter1 = new ComercialLetter(data1);
        String expected1 = "18/10/2016\n\nLucas França, Rua H8A, 118\nGustavo Mirisola, Praça Marechal Eduardo Gomes, 50\n";
        assertEquals(expected1, letter1.header());
        
        ComercialLetter letter2 = new ComercialLetter(data2);
        String expected2 = "19/10/2016\n\nGustavo Mirisola, Praça Marechal Eduardo Gomes, 50\nLucas França, Rua H8A, 118\n";
        assertEquals(expected2, letter2.header());
    }
    
    @Test
    public void testBody(){
        ComercialLetter letter1 = new ComercialLetter(data1);
        String expected1 = "Dear Gustavo Mirisola,\n\n";
        assertEquals(expected1, letter1.body());
        
        ComercialLetter letter2 = new ComercialLetter(data2);
        String expected2 = "Dear Lucas França,\n\n";
        assertEquals(expected2, letter2.body());
    }
    
    @Test
    public void testConclusion(){
        ComercialLetter letter1 = new ComercialLetter(data1);
        String expected1 = "Sincerely,\n";
        assertEquals(expected1, letter1.conclusion());
        
        ComercialLetter letter2 = new ComercialLetter(data2);
        String expected2 = "Sincerely,\n";
        assertEquals(expected2, letter2.conclusion());
    }
}
