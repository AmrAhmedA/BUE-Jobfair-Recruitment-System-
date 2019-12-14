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
public class Application implements ApplicationInterface {
    private int ApplicationID;

    public Application(int ApplicationID) {
        this.ApplicationID = ApplicationID;
    }

    public int getApplicationID() {
        return ApplicationID;
    }

    public void setApplicationID(int ApplicationID) {
        this.ApplicationID = ApplicationID;
    }

    @Override
    public String toString() {
        return "Application{" + "ApplicationID=" + ApplicationID + '}';
    }
    
    @Override
  public boolean TrackApplication(Application App,Vacancy V) throws RemoteException
    {
              boolean x=false;
              for(int i=0;i<V.getReceivedApplications().size();i++)
              {
                  if(V.getReceivedApplications().get(i)==App)
                  {
                      x=true;
                  }
              }
              return x;
    }  
       
    @Override
    public void SubmitApplication(Application App,Applicant A) throws RemoteException
    {
        A.AddSubmittedApplication(App);
    }
    
    @Override
    public Application FilterApplication(int AppID,Applicant A) throws RemoteException
    {
        for(int i=0;i<A.getSubmittedApplications().size();i++)
              {
                  if(A.getSubmittedApplications().get(i).ApplicationID==AppID)
                  {
                      return A.getSubmittedApplications().get(i);
                  }
                  else
                      return null;
              }
             return null; 
    }    
}
