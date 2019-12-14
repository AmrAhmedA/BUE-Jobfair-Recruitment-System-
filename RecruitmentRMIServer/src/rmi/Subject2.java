/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.Remote;


/**
 *
 * @author Cal
 */
public interface Subject2 extends Remote {
    
    public void AddObserver(Observer2 o2) ;

    public void RemoveObserver(Observer2 o2) ;

    public void NotifyEmployer() ;
    
    
    
    
}
