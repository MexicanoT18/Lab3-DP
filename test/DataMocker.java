
import java.util.Date;
import lab3.dp.DataManager;
import lab3.dp.Person;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */
public class DataMocker {
    
    static public Person mockPerson1(){
        Person person1 = mock(Person.class);
        when(person1.getAddress()).thenReturn("Rua H8A, 118");
        when(person1.getEmail()).thenReturn("lucas@labces28.com");
        when(person1.getName()).thenReturn("Lucas França");
        when(person1.getSex()).thenReturn("male");
        when(person1.getPhone()).thenReturn("11223344");
        return person1;
    }
    
    static public Person mockPerson2(){
        Person person2 = mock(Person.class);
        when(person2.getAddress()).thenReturn("Praça Marechal Eduardo Gomes, 50");
        when(person2.getEmail()).thenReturn("mirisola@labces28.com");
        when(person2.getName()).thenReturn("Gustavo Mirisola");
        when(person2.getSex()).thenReturn("male");
        when(person2.getPhone()).thenReturn("55667788");
        return person2;
    }
    
    static public DataManager mockData1(){
        DataManager data1 = mock(DataManager.class);
        Person sender = mockPerson1();
        Person receiver = mockPerson2();
        Date date = mock(Date.class);
        when(date.getDay()).thenReturn(18);
        when(date.getMonth()).thenReturn(10);
        when(date.getYear()).thenReturn(2016);
        when(data1.getDate()).thenReturn(date);
        when(data1.getSender()).thenReturn(sender);
        when(data1.getReceiver()).thenReturn(receiver);
        when(data1.getSubject()).thenReturn("Data de prova");
        return data1;
    }
    
    static public DataManager mockData2(){
        DataManager data2 = mock(DataManager.class);
        Person sender = mockPerson2();
        Person receiver = mockPerson1();
        Date date = mock(Date.class);
        when(date.getDay()).thenReturn(19);
        when(date.getMonth()).thenReturn(10);
        when(date.getYear()).thenReturn(2016);
        when(data2.getDate()).thenReturn(date);
        when(data2.getSender()).thenReturn(sender);
        when(data2.getReceiver()).thenReturn(receiver);
        when(data2.getSubject()).thenReturn("Re: Data de prova");
        return data2;
    }
}
