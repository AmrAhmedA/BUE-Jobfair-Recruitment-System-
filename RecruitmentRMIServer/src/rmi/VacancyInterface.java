/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.RemoteException;

/**
 *
 * @author Cal
 */
public interface VacancyInterface {
    
    
    
    
    public void AddNewJob(int VacancyID)throws RemoteException;
     public void RemoveJob(int VacancyID)throws RemoteException;
      public void AddReceivedApplication(Application App)throws RemoteException;
      public void RemoveReceivedApplication(Application App)throws RemoteException;
       public Application GetReceivedApplication(int AppID)throws RemoteException;
}
