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
public interface AdminInterface extends Remote {
    
 public void RecommendVacancy(Applicant A,Vacancy V) throws RemoteException;
 public void RemoveApplicant(int id)throws RemoteException ;
 public void RemoveEmployer(int id)throws RemoteException ;
 public boolean AdminLogin(String Email, String Password)throws RemoteException ;
 public void DeclineVacancyRequest(Vacancy V)throws RemoteException;
 public void AcceptVacancyRequest(Vacancy V,Employer E)throws RemoteException;
 
    
}
