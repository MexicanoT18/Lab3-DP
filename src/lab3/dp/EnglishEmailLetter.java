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
public class EnglishEmailLetter extends EmailLetter{
    
    public EnglishEmailLetter(DataManager manager) {
        _dataManager = manager;
    }
    
    @Override
    public String model() {
        return header() + body() + conclusion() + signature();
    }
    
    @Override
    public String header() {
        return "From: " + _dataManager.getSender().getName() + " [" + _dataManager.getSender().getEmail() + "]\n"
            + "Sent: " + _dataManager.getDate().getMonth()+ "-" + _dataManager.getDate().getDay()+ "-" + _dataManager.getDate().getYear() + "\n"
            + "To: " + _dataManager.getReceiver().getName() + " [" + _dataManager.getReceiver().getEmail() + "]\n"
            + "Subject: " + _dataManager.getSubject() + "\n"
            + fillLine('_') + "\n";
    }
    
    @Override
    public String body() {
        String pronoum;
        if (_dataManager.getReceiver().getSex().equals("male"))
            pronoum = "Hello Mr ";
        else if (_dataManager.getReceiver().getSex().equals("female"))
            pronoum = "Hello Ms ";
        else pronoum = null;
        return pronoum + _dataManager.getReceiver().getName() + ",\n\n";
    }
    
    @Override
    public String conclusion() {
        return "Best regards,\n";
    }
    
    @Override
    public String signature() {
        return "\n" + _dataManager.getSender().getName();
    }
}
