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
public interface UserInterface extends Remote {

    public void Login(String E,String P)throws RemoteException;
    public void CreateAccount(int id,String name,int age,String password, String mail, String nationality,int phonenumber,String address,String accType)throws RemoteException;
    public void EditAccount(int id)throws RemoteException;
    public void DeleteAccount(int id)throws RemoteException;
    public String getAchievement();
    
}