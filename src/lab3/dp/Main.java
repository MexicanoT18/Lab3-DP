/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.dp;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author Lucas
 */
public class Main {
    
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
    
    public static void main(String[] args) {
        
        DataManager data1 = mockData1();
        
        ModelBuilder builder = new ModelBuilder(data1);
        String comercialLetter1 = builder.getCommercialLetterModel();
        //System.out.println(comercialLetter1);
        
        String emailLetter = builder.getEmailLetterModel();
        System.out.println(emailLetter);
    }
    
}
