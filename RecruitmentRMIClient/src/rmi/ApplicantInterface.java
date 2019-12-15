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
public interface ApplicantInterface extends Remote {

    public void ViewJobVacancies() throws RemoteException;

    public void FilterJobVacancies() throws RemoteException;

    public void AddSubmittedApplication(Application A) throws RemoteException;

    public void RemoveSubmittedApplication(Application A) throws RemoteException;

}
