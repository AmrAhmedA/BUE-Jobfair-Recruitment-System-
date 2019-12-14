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
public class RemoteFacade implements ApplicantROI,EmployerROI
{

   ApplicantMapper H = new ApplicantMapper();
    Applicant M;
    
    EmployerMapper E= new EmployerMapper();
    Employer P;
 
    public RemoteFacade() throws RemoteException 
    {
        this.M = new Applicant(H);
        this.P = new Employer(E);
    }
    
    
    
    
    @Override
    public void GetApplicantInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void GetEmployerInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void GetAllApplicantsInfo() {
        H.RetrieveAll();
    }

    @Override
    public void GetAllEmployersInfo() {
        E.RetrieveAll();
    }
    
    

    
    
    
    
    
    
    
}
