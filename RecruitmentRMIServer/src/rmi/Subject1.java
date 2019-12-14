/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

/**
 *
 * @author Cal
 */
public interface Subject1  {
    
    
    public void AddObserver(Observer1 o1);

    public void RemoveObserver(Observer1 o1);

    public void NotifyApplicant();
}
