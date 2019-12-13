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
public class Application {
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

    /*public boolean TrackApplication ()
    {
       ///NOT DONE
    } */
    
    
    public void SubmitApplication(Application App,Applicant A)
    {
        
    }
    
    public void FilterApplication (int AppID)
    {
        
    }    
}
