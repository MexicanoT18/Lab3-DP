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
public class PortugueseInformalLetter extends InformalLetter{
    
    public PortugueseInformalLetter(DataManager manager) {
        _dataManager = manager;
    }
    
    @Override
    public String model() {
        return header() + body() + conclusion() + signature();
    }
    
    @Override
    public String header() {
        return "De: " + _dataManager.getSender().getName() + ", " + _dataManager.getSender().getAddress() + "\n"
                + "Para: " + _dataManager.getReceiver().getName() + ", " + _dataManager.getReceiver().getAddress() + "\n\n";
    }
    
    @Override
    public String body() {
        return "Olá " + _dataManager.getReceiver().getName() + ",\n\n";
    }
    
    @Override
    public String conclusion() {
        return "Até mais,\n";
    }
    
    @Override
    public String signature() {
        return "\n" + fitToRight(_dataManager.getSender().getName());
    }
    
}
