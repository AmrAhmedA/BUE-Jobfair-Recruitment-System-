/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;
import java.util.ArrayList;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cal
 */
public class Applicant extends User implements Observer1,ApplicantInterface {
    
    private Application ApplicationObj;
    private ArrayList <Application> SubmittedApplications= new ArrayList <Application>();
    private String Achievement;
    private String PastJobs;
    private String Degree;
    private int YearsOfExpertise;
    private ApplicantMapper AM;
    private ArrayList<Vacancy> RecommendedVacancies = new ArrayList <Vacancy>();

    public Applicant(Application ApplicationObj, String Achievement, String PastJobs, String Degree, int YearsOfExpertise, ApplicantMapper AM, int ID,
            String Name, int Age, String Password, String Email, String Nationality, int PhoneNumber, String Address, String AccountType) throws RemoteException {
        super(ID, Name, Age, Password, Email, Nationality, PhoneNumber, Address, AccountType);
        this.ApplicationObj = ApplicationObj;
        this.Achievement = Achievement;
        this.PastJobs = PastJobs;
        this.Degree = Degree;
        this.YearsOfExpertise = YearsOfExpertise;
        this.AM = AM;
    }

    public Applicant(Application ApplicationObj, String Achievement, String PastJobs, String Degree, int YearsOfExpertise, int ID, String Name, int Age
            , String Password, String Email, String Nationality, int PhoneNumber, String Address, String AccountType) throws RemoteException {
        super(ID, Name, Age, Password, Email, Nationality, PhoneNumber, Address, AccountType);
        this.ApplicationObj = ApplicationObj;
        this.Achievement = Achievement;
        this.PastJobs = PastJobs;
        this.Degree = Degree;
        this.YearsOfExpertise = YearsOfExpertise;
    }

    public Applicant() throws RemoteException {
    }

 

    
 

    public Applicant(ApplicantMapper AM) throws RemoteException {
        this.AM = AM;
    }

    public Application getApplicationObj() {
        return ApplicationObj;
    }

    public void setApplicationObj(Application ApplicationObj) {
        this.ApplicationObj = ApplicationObj;
    }

    public ArrayList<Application> getSubmittedApplications() {
        return SubmittedApplications;
    }

    public void setSubmittedApplications(ArrayList<Application> SubmittedApplications) {
        this.SubmittedApplications = SubmittedApplications;
    }

    public String getAchievement() {
        return Achievement;
    }

    public void setAchievement(String Achievement) {
        this.Achievement = Achievement;
    }

    public String getPastJobs() {
        return PastJobs;
    }

    public void setPastJobs(String PastJobs) {
        this.PastJobs = PastJobs;
    }

    public String getDegree() {
        return Degree;
    }

    public void setDegree(String Degree) {
        this.Degree = Degree;
    }

    public int getYearsOfExpertise() {
        return YearsOfExpertise;
    }

    public void setYearsOfExpertise(int YearsOfExpertise) {
        this.YearsOfExpertise = YearsOfExpertise;
    }

    @Override
    public String toString() {
        return "Applicant{" + "ApplicationObj=" + ApplicationObj + ", SubmittedApplications=" + SubmittedApplications + ", Achievement=" + Achievement + ", PastJobs=" + PastJobs + ", Degree=" + Degree + ", YearsOfExpertise=" + YearsOfExpertise + '}';
    }
    
    @Override
    public void Update1() {
        System.out.println("Your application has been recived");
        //Change it according to GUI
    }

    public ArrayList<Vacancy> getRecommendedVacancies() {
        return RecommendedVacancies;
    }

    public void setRecommendedVacancies(ArrayList<Vacancy> RecommendedVacancies) {
        this.RecommendedVacancies = RecommendedVacancies;
    }
        
     
    
    
    
    @Override
    public void ViewJobVacancies() throws RemoteException
    {
        
    }
    
      @Override
    public void FilterJobVacancies() throws RemoteException
    {
        
    }
    
    
     @Override
     public void AddSubmittedApplication(Application A) throws RemoteException
     {
         SubmittedApplications.add(A);
     }
     
        @Override
     public void RemoveSubmittedApplication(Application A) throws RemoteException
     {
         SubmittedApplications.remove(A);
        
     }
     
     public void AddRecommendedJob(Vacancy V){
       this.RecommendedVacancies.add(V);

   }
    
}
