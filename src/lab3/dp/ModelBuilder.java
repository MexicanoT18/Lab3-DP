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
    
    public String getCommercialLetterModel(String language) throws IllegalArgumentException{
        if (language.equals("english")){
            EnglishComercialLetter letter = new EnglishComercialLetter(_dataManager);
            return letter.model();
        }
        else if (language.equals("portuguese")){
            PortugueseComercialLetter letter = new PortugueseComercialLetter(_dataManager);
            return letter.model();
        }
        else throw new IllegalArgumentException("Invalid language");
    }
    
    public String getEmailLetterModel(String language) throws IllegalArgumentException{
        if (language.equals("english")){
            EnglishEmailLetter letter = new EnglishEmailLetter(_dataManager);
            return letter.model();
        }
        else if (language.equals("portuguese")){
            PortugueseEmailLetter letter = new PortugueseEmailLetter(_dataManager);
            return letter.model();
        }
        else throw new IllegalArgumentException("Invalid language");
    }
    
    public String getInformalLetterModel(String language)throws IllegalArgumentException{
        if (language.equals("english")){
            EnglishInformalLetter letter = new EnglishInformalLetter(_dataManager);
            return letter.model();
        }
        else if (language.equals("portuguese")){
            PortugueseInformalLetter letter = new PortugueseInformalLetter(_dataManager);
            return letter.model();
        }
        else throw new IllegalArgumentException("Invalid language");
    }
}
