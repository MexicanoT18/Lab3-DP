/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.dp;

/**
 *
 * @author Lucas
 */
public class PortugueseEmailLetter extends EmailLetter{
    
    public PortugueseEmailLetter(DataManager manager) {
        _dataManager = manager;
    }
    
    @Override
    public String model() {
        return header() + body() + conclusion() + signature();
    }
    
    @Override
    public String header() {
        return "De: " + _dataManager.getSender().getName() + " [" + _dataManager.getSender().getEmail() + "]\n"
            + "Enviado: " +_dataManager.getDate().getDay()+ "/" + _dataManager.getDate().getMonth()+ "/" + _dataManager.getDate().getYear() + "\n"
            + "Para: " + _dataManager.getReceiver().getName() + " [" + _dataManager.getReceiver().getEmail() + "]\n"
            + "Assunto: " + _dataManager.getSubject() + "\n"
            + fillLine('_') + "\n";
    }
    
    @Override
    public String body() {
        String pronoum;
        if (_dataManager.getReceiver().getSex().equals("male"))
            pronoum = "Olá Sr ";
        else if (_dataManager.getReceiver().getSex().equals("female"))
            pronoum = "Olá Sra ";
        else pronoum = null;
        return pronoum + _dataManager.getReceiver().getName() + ",\n\n";
    }
    
    @Override
    public String conclusion() {
        return "Abraços,\n";
    }
    
    @Override
    public String signature() {
        return "\n" + _dataManager.getSender().getName();
    }
}
