/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Amr
 */
public interface RecruitmentInterface extends Remote {
    String getAchievement() throws RemoteException;
    String getDegree() throws RemoteException;
    int getYearsOfExpertise()  throws RemoteException;
    String getPastJobs() throws RemoteException;
}
