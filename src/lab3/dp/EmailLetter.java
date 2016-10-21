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
public class EmailLetter implements Model{
    
    private DataManager _dataManager;
    private final int WIDTH = 70;
    
    public EmailLetter(DataManager manager) {
        _dataManager = manager;
    }
    
    @Override
    public String model() {
        return header() + body() + conclusion() + signature();
    }
    
    @Override
    public String header() {
        return "From: " + _dataManager.getSenderName() + " [" + _dataManager.getSenderEmail() + "]\n"
            + "Sent: " + _dataManager.getDate() + "\n"
            + "To: " + _dataManager.getReceiverName() + " [" + _dataManager.getReceiverEmail() + "]\n"
            + "Subject: " + _dataManager.getSubject() + "\n"
            + fillLine('_') + "\n";
    }
    
    @Override
    public String body() {
        return "Hello " + _dataManager.getReceiverName() + ",\n\n";
    }
    
    @Override
    public String conclusion() {
        return "Best regards,\n";
    }
    
    @Override
    public String signature() {
        return "\n" + _dataManager.getSenderName();
    }
    
    private String fillLine(char carac){
        String line = new String();
        for(int i=0; i<WIDTH; i++){
            line = carac + line;
        }
        return line;
    }
}
