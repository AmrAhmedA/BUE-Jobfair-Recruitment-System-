/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rminewserver;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import rmi.Applicant;
import rmi.Application;
import rmi.RecruitmentInterface;
/**
 *
 * @author Cal
 */
public class RMINewServer {
    
    
    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        
        
        Application A=new Application(1);
        
        // Here we create our remote object
        RecruitmentInterface g = new Applicant(A,"String1","String2","String3",22,1);
        
        // An RMI Registry initialized on port 1099
        Registry r = LocateRegistry.createRegistry(1098);
        
        // Our remote object g is binded to the name "grade"
        r.bind("Applicant", g);
        
        // Outputs that the server is ready
        System.out.println("It runs!");
        System.out.println(g);
    }
    
    
    
}
