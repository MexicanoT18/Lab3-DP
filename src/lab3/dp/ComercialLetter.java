/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.dp;

import javax.naming.ldap.ManageReferralControl;

/**
 *
 * @author Lucas
 */
public class ComercialLetter implements Model{
    
    private DataManager _dataManager;
    private final int WIDTH = 100;
    
    public ComercialLetter(DataManager manager) {
        _dataManager = manager;
    }
    
    @Override
    public String model() {
        return header() + body() + conclusion() + signature();
    }
    
    @Override
    public String header() {
        return _dataManager.getDate() + "\n\n"
                + _dataManager.getSenderName() + ", " + _dataManager.getSenderAddress() + "\n"
                + _dataManager.getReceiverName() + ", " + _dataManager.getReceiverAddress() + "\n";
    }
    
    @Override
    public String body() {
        return "Dear " + _dataManager.getReceiverName() + ",\n\n";
    }
    
    @Override
    public String conclusion() {
        return "Sincerely,\n";
    }
    
    @Override
    public String signature() {
        return "\n\n" + fitToRight("__________________") + "\n"
                + fitToRight(_dataManager.getSenderName()) + "\n"
                + fitToRight("phone: " +_dataManager.getSenderPhone()) + "\n"
                + fitToRight("email: " + _dataManager.getSenderEmail());
    }
    
    public String fitToRight(String text) throws IllegalArgumentException{
        if (text.length() > WIDTH){
            throw new IllegalArgumentException("Text too big to fit commercial letter");
        }
        while(text.length() < WIDTH){
            text = " " + text;
        }
        return text;
    }
}
