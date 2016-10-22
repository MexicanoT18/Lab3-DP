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
public abstract class InformalLetter implements Model{
    
    protected DataManager _dataManager;
    protected final int WIDTH = 70;
    
    @Override
    public String model() {
        return header() + body() + conclusion() + signature();
    }
    
    public abstract String header();
    public abstract String body();
    public abstract String conclusion();
    public abstract String signature();
    
    protected String fitToRight(String text) throws IllegalArgumentException{
        if (text.length() > WIDTH){
            throw new IllegalArgumentException("Text too big to fit commercial letter");
        }
        while(text.length() < WIDTH){
            text = " " + text;
        }
        return text;
    }
}
