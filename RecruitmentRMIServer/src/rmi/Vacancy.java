/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cal
 */
public class Vacancy extends UnicastRemoteObject implements Subject1,VacancyInterface {
    private int VacancyID;
    private String VacancyJobTitle;
    private int VacancyJobSalary;
    private int VacancyJobYearsOfExperienceRequired;
    private String VacancyJobType;
    private String VacancyJobRequirements;
    private String VacancyJobResponsibilities;
    private ArrayList<Application> ReceivedApplications;
    private ApplicantDTO ApplicantData;
    private ArrayList<Observer1> Observers1 = new ArrayList<Observer1>();

    public Vacancy(int VacancyID, String VacancyJobTitle, int VacancyJobSalary, int VacancyJobYearsOfExperienceRequired, String VacancyJobType, String VacancyJobRequirements,
            String VacancyJobResponsibilities, ArrayList<Application> ReceivedApplications)throws RemoteException { 
       
        this.VacancyID = VacancyID;
        this.VacancyJobTitle = VacancyJobTitle;
        this.VacancyJobSalary = VacancyJobSalary;
        this.VacancyJobYearsOfExperienceRequired = VacancyJobYearsOfExperienceRequired;
        this.VacancyJobType = VacancyJobType;
        this.VacancyJobRequirements = VacancyJobRequirements;
        this.VacancyJobResponsibilities = VacancyJobResponsibilities;
        this.ReceivedApplications = ReceivedApplications;
        
    }

   public Vacancy(int VacancyID, String VacancyJobTitle, int VacancyJobSalary, int VacancyJobYearsOfExperienceRequired, String VacancyJobType, 
           String VacancyJobRequirements, String VacancyJobResponsibilities, ArrayList<Application> ReceivedApplications, ApplicantDTO ApplicantData)throws RemoteException {
       
        
        this.VacancyID = VacancyID;
        this.VacancyJobTitle = VacancyJobTitle;
        this.VacancyJobSalary = VacancyJobSalary;
        this.VacancyJobYearsOfExperienceRequired = VacancyJobYearsOfExperienceRequired;
        this.VacancyJobType = VacancyJobType;
        this.VacancyJobRequirements = VacancyJobRequirements;
        this.VacancyJobResponsibilities = VacancyJobResponsibilities;
        this.ReceivedApplications = ReceivedApplications;
        this.ApplicantData = ApplicantData;
    } 
    
    

    public Vacancy()throws RemoteException {
    }
    
    

    public int getVacancyID() {
        return VacancyID;
    }

    public void setVacancyID(int VacancyID) {
        this.VacancyID = VacancyID;
    }

    public String getVacancyJobTitle() {
        return VacancyJobTitle;
    }

    public void setVacancyJobTitle(String VacancyJobTitle) {
        this.VacancyJobTitle = VacancyJobTitle;
    }

    public int getVacancyJobSalary() {
        return VacancyJobSalary;
    }

    public void setVacancyJobSalary(int VacancyJobSalary) {
        this.VacancyJobSalary = VacancyJobSalary;
    }

    public int getVacancyJobYearsOfExperienceRequired() {
        return VacancyJobYearsOfExperienceRequired;
    }

    public void setVacancyJobYearsOfExperienceRequired(int VacancyJobYearsOfExperienceRequired) {
        this.VacancyJobYearsOfExperienceRequired = VacancyJobYearsOfExperienceRequired;
    }

    public String getVacancyJobType() {
        return VacancyJobType;
    }

    public void setVacancyJobType(String VacancyJobType) {
        this.VacancyJobType = VacancyJobType;
    }

    public String getVacancyJobRequirements() {
        return VacancyJobRequirements;
    }

    public void setVacancyJobRequirements(String VacancyJobRequirements) {
        this.VacancyJobRequirements = VacancyJobRequirements;
    }

    public String getVacancyJobResponsibilities() {
        return VacancyJobResponsibilities;
    }

    public void setVacancyJobResponsibilities(String VacancyJobResponsibilities) {
        this.VacancyJobResponsibilities = VacancyJobResponsibilities;
    }

    public ArrayList<Application> getReceivedApplications() {
        return ReceivedApplications;
    }

    public void setReceivedApplications(ArrayList<Application> ReceivedApplications) {
        this.ReceivedApplications = ReceivedApplications;
    }

    public ApplicantDTO getApplicantData() {
        return ApplicantData;
    }

    public void setApplicantData(ApplicantDTO ApplicantData) {
        this.ApplicantData = ApplicantData;
    } 

    @Override
    public String toString() {
        return "Vacancy{" + "VacancyID=" + VacancyID + ", VacancyJobTitle=" + VacancyJobTitle + ", VacancyJobSalary=" + VacancyJobSalary + ", VacancyJobYearsOfExperienceRequired=" + VacancyJobYearsOfExperienceRequired + ", VacancyJobType=" + VacancyJobType + ", VacancyJobRequirements=" + VacancyJobRequirements + ", VacancyJobResponsibilities=" + VacancyJobResponsibilities + ", ReceivedApplications=" + ReceivedApplications + ", Observers1=" + Observers1 + '}';
    }


    
    @Override
    public void AddNewJob(int VacancyID) throws RemoteException
    {
   
    }
    
    @Override
    public void RemoveJob(int VacancyID) throws RemoteException { 
    
    }
    
    @Override
    public void AddReceivedApplication(Application App)throws RemoteException {
    
        ReceivedApplications.add(App);
        NotifyApplicant();
    }
    
    @Override
    public void RemoveReceivedApplication(Application App) throws RemoteException {
        ReceivedApplications.remove(App);
    }
    
    @Override
    public Application GetReceivedApplication(int AppID) throws RemoteException
    {
        
     for(int i=0;i<ReceivedApplications.size();i++)
              {
                  if(ReceivedApplications.get(i).getApplicationID()==AppID)
                  {
                      return ReceivedApplications.get(i);
                  }
                  else
                      return null;
              }
             return null; 
    }
    
        @Override
    public void AddObserver(Observer1 o1) {
       Observers1.add(o1);
    }

    @Override
    public void RemoveObserver(Observer1 o1) {
        Observers1.remove(o1);
    }

    @Override
    public void NotifyApplicant() {
             for (int i = 0; i < Observers1.size(); i++) {
  Observers1.get(i).Update1();
        }
    }
    
}
