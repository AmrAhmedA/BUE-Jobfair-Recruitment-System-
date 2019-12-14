/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author Cal
 */
public interface EmployerInterface extends Remote{
    
    
    
    public void AddAcceptedVacancy (int VacancyID)throws RemoteException;
     public void RemoveAcceptedVacancy (int VacancyID)throws RemoteException;
     public Vacancy GetAcceptedVacancy(int id)throws RemoteException;
    
    
    
    
}
