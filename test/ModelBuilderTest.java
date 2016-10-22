/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import lab3.dp.DataManager;
import lab3.dp.ModelBuilder;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Lucas
 */
public class ModelBuilderTest {
    
    private DataManager _data;
    private ModelBuilder _builder;
    
    public ModelBuilderTest() {
    }
    
    @Before
    public void setUp(){
        _data = DataMocker.mockData1();
        _builder = new ModelBuilder(_data);
    }
    
    @Test
    public void testComercialLetter(){
        String expected = "10-18-2016\n" +
            "\n" +
            "From: Lucas França, Rua H8A, 118\n" +
            "To: Gustavo Mirisola, Praça Marechal Eduardo Gomes, 50\n" +
            "\n" +
            "Dear Mr Gustavo Mirisola,\n" +
            "\n" +
            "Sincerely,\n" +
            "\n" +
            "                                                    __________________\n" +
            "                                                          Lucas França\n" +
            "                                                       phone: 11223344\n" +
            "                                             email: lucas@labces28.com";
        assertEquals(expected, _builder.getCommercialLetterModel("english"));
        
        expected = "18/10/2016\n" +
            "\n" +
            "De: Lucas França, Rua H8A, 118\n" +
            "Para: Gustavo Mirisola, Praça Marechal Eduardo Gomes, 50\n" +
            "\n" +
            "Caro Sr Gustavo Mirisola,\n" +
            "\n" +
            "Sinceramente,\n" +
            "\n" +
            "                                                    __________________\n" +
            "                                                          Lucas França\n" +
            "                                                    telefone: 11223344\n" +
            "                                             email: lucas@labces28.com";
        assertEquals(expected, _builder.getCommercialLetterModel("portuguese"));
    }
    
    @Test
    public void testEmailLetter(){
        String expected = "From: Lucas França [lucas@labces28.com]\n" +
            "Sent: 10-18-2016\n" +
            "To: Gustavo Mirisola [mirisola@labces28.com]\n" +
            "Subject: Data de prova\n" +
            "______________________________________________________________________\n" +
            "Hello Mr Gustavo Mirisola,\n" +
            "\n" +
            "Best regards,\n" +
            "\n" +
            "Lucas França";
        assertEquals(expected, _builder.getEmailLetterModel("english"));
        
        expected = "De: Lucas França [lucas@labces28.com]\n" +
            "Enviado: 18/10/2016\n" +
            "Para: Gustavo Mirisola [mirisola@labces28.com]\n" +
            "Assunto: Data de prova\n" +
            "______________________________________________________________________\n" +
            "Olá Sr Gustavo Mirisola,\n" +
            "\n" +
            "Abraços,\n" +
            "\n" +
            "Lucas França";
        assertEquals(expected, _builder.getEmailLetterModel("portuguese"));
    }
    
    @Test
    public void testInformalLetter(){
        String expected = "From: Lucas França, Rua H8A, 118\n" +
            "To: Gustavo Mirisola, Praça Marechal Eduardo Gomes, 50\n" +
            "\n" +
            "Hello Gustavo Mirisola,\n" +
            "\n" +
            "See ya,\n" +
            "\n" +
            "                                                          Lucas França";
        assertEquals(expected, _builder.getInformalLetterModel("english"));
        
        expected = "De: Lucas França, Rua H8A, 118\n" +
            "Para: Gustavo Mirisola, Praça Marechal Eduardo Gomes, 50\n" +
            "\n" +
            "Olá Gustavo Mirisola,\n" +
            "\n" +
            "Até mais,\n" +
            "\n" +
            "                                                          Lucas França";
        assertEquals(expected, _builder.getInformalLetterModel("portuguese"));
        
    }
}
