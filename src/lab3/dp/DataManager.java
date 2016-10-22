/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.dp;

import java.util.Date;

/**
 *
 * @author Lucas
 */
public class DataManager {
    private Date _date;
    public Date getDate(){
        return _date;
    }
    
    private Person _sender;
    public Person getSender(){
        return _sender;
    }
    
    private Person _receiver;
    public Person getReceiver(){
        return _receiver;
    }
    
    private String _subject;
    public String getSubject(){
        return _subject;
    }
}
