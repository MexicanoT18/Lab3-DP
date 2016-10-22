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
public class EnglishComercialLetter extends ComercialLetter{
    
    public EnglishComercialLetter(DataManager manager) {
        _dataManager = manager;
    }
    
    @Override
    public String header() {
        return _dataManager.getDate().getMonth()+ "-" + _dataManager.getDate().getDay()+ "-" + _dataManager.getDate().getYear()+ "\n\n"
                + "From: " + _dataManager.getSender().getName() + ", " + _dataManager.getSender().getAddress() + "\n"
                + "To: " + _dataManager.getReceiver().getName() + ", " + _dataManager.getReceiver().getAddress() + "\n\n";
    }
    
    @Override
    public String body(){
        String pronoum;
        if (_dataManager.getReceiver().getSex().equals("male"))
            pronoum = "Dear Mr ";
        else if (_dataManager.getReceiver().getSex().equals("female"))
            pronoum = "Dear Ms ";
        else pronoum = null;
        return pronoum + _dataManager.getReceiver().getName() + ",\n\n";
    }
    
    @Override
    public String conclusion() {
        return "Sincerely,\n";
    }
    
    @Override
    public String signature() {
        return "\n" + fitToRight("__________________") + "\n"
                + fitToRight(_dataManager.getSender().getName()) + "\n"
                + fitToRight("phone: " +_dataManager.getSender().getPhone()) + "\n"
                + fitToRight("email: " + _dataManager.getSender().getEmail());
    }
    
    private String fitToRight(String text) throws IllegalArgumentException{
        if (text.length() > WIDTH){
            throw new IllegalArgumentException("Text too big to fit commercial letter");
        }
        while(text.length() < WIDTH){
            text = " " + text;
        }
        return text;
    }
}
