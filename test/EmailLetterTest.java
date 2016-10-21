/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import lab3.dp.EmailLetter;
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
public class EmailLetterTest {
    
    private DataManager data1;
    private DataManager data2;
    
    public EmailLetterTest() {
    }
    
    static public DataManager mockData1(){
        DataManager data1 = mock(DataManager.class);
        when(data1.getDate()).thenReturn("18/10/2016");
        when(data1.getSenderAddress()).thenReturn("Rua H8A, 118");
        when(data1.getSenderEmail()).thenReturn("lucas@labces28.com");
        when(data1.getSenderName()).thenReturn("Lucas França");
        when(data1.getSenderPhone()).thenReturn("11223344");
        when(data1.getReceiverAddress()).thenReturn("Praça Marechal Eduardo Gomes, 50");
        when(data1.getReceiverEmail()).thenReturn("mirisola@labces28.com");
        when(data1.getReceiverName()).thenReturn("Gustavo Mirisola");
        when(data1.getReceiverPhone()).thenReturn("55667788");
        when(data1.getSubject()).thenReturn("Data de prova");
        return data1;
    }
    
    static public DataManager mockData2(){
        DataManager data2 = mock(DataManager.class);
        when(data2.getDate()).thenReturn("19/10/2016");
        when(data2.getSenderAddress()).thenReturn("Praça Marechal Eduardo Gomes, 50");
        when(data2.getSenderEmail()).thenReturn("mirisola@labces28.com");
        when(data2.getSenderName()).thenReturn("Gustavo Mirisola");
        when(data2.getSenderPhone()).thenReturn("55667788");
        when(data2.getReceiverAddress()).thenReturn("Rua H8A, 118");
        when(data2.getReceiverEmail()).thenReturn("lucas@labces28.com");
        when(data2.getReceiverName()).thenReturn("Lucas França");
        when(data2.getReceiverPhone()).thenReturn("11223344");
        when(data2.getSubject()).thenReturn("Re: Data de prova");
        return data2;
    }
    
    @Before
    public void setUp(){
        
        data1 = mockData1();
        data2 = mockData2();
    }
    
    @Test
    public void testHeader(){
        EmailLetter letter1 = new EmailLetter(data1);
        String expected1 = "From: Lucas França [lucas@labces28.com]\n" +
                           "Sent: 18/10/2016\n" +
                           "To: Gustavo Mirisola [mirisola@labces28.com]\n" +
                           "Subject: Data de prova\n"
                + "______________________________________________________________________\n";
        assertEquals(expected1, letter1.header());
        
        EmailLetter letter2 = new EmailLetter(data2);
        String expected2 = "From: Gustavo Mirisola [mirisola@labces28.com]\n" +
                           "Sent: 19/10/2016\n" +
                           "To: Lucas França [lucas@labces28.com]\n" +
                           "Subject: Re: Data de prova\n"
                + "______________________________________________________________________\n";
        assertEquals(expected2, letter2.header());
    }
    
    @Test
    public void testBody(){
        EmailLetter letter1 = new EmailLetter(data1);
        String expected1 = "Hello Gustavo Mirisola,\n\n";
        assertEquals(expected1, letter1.body());
        
        EmailLetter letter2 = new EmailLetter(data2);
        String expected2 = "Hello Lucas França,\n\n";
        assertEquals(expected2, letter2.body());
    }
    
    @Test
    public void testConclusion(){
        EmailLetter letter1 = new EmailLetter(data1);
        String expected1 = "Best regards,\n";
        assertEquals(expected1, letter1.conclusion());
        
        EmailLetter letter2 = new EmailLetter(data2);
        String expected2 = "Best regards,\n";
        assertEquals(expected2, letter2.conclusion());
    }
    
    @Test
    public void testSignature(){
        EmailLetter letter1 = new EmailLetter(data1);
        String expected1 = "\nLucas França";
        assertEquals(expected1, letter1.signature());
        
        EmailLetter letter2 = new EmailLetter(data2);
        String expected2 = "\nGustavo Mirisola";
        assertEquals(expected2, letter2.signature());
    }
}
