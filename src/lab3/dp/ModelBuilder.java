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
public class ModelBuilder {
    
    private DataManager _dataManager;
    
    public ModelBuilder(DataManager manager){
        _dataManager = manager;
    }
    
    public String getCommercialLetterModel(){
        ComercialLetter comercialLetter = new ComercialLetter(_dataManager);
        return comercialLetter.model();
    }
    
    public String getEmailLetterModel(){
        EmailLetter emailLetter = new EmailLetter(_dataManager);
        return emailLetter.model();
    }
}
