/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;
import java.util.ArrayList;
import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author Cal
 */
public class Applicant extends UnicastRemoteObject implements RecruitmentInterface,Observer1 {
    
    private Application ApplicationObj;
    private ArrayList <Application> SubmittedApplications= new ArrayList <Application>();
    private String Achievement;
    private String PastJobs;
    private String Degree;
    private int YearsOfExpertise;

    public Applicant(Application ApplicationObj, String Achievement, String PastJobs, String Degree, int YearsOfExpertise, int i) throws RemoteException {
        super(i);
        this.ApplicationObj = ApplicationObj;
        this.Achievement = Achievement;
        this.PastJobs = PastJobs;
        this.Degree = Degree;
        this.YearsOfExpertise = YearsOfExpertise;
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
       // AddAcceptedVacancy();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
