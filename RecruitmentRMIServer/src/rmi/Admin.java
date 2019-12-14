/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;


/**
 *
 * @author Cal
 */
public class Admin extends UnicastRemoteObject implements AdminInterface,Subject2 {
    
    private final String AdminEmail="Admin@recruitment.com" ;
    private final String AdminPassword="Admin";
    public int x;
    private ArrayList<Observer2> Observers2 = new ArrayList<Observer2>();
 
   private  Admin() throws RemoteException
    {
     
    }
            
       public String getAdminEmail  () 
    {
        return AdminEmail;
    }

    public String getAdminPassword() {
        return AdminPassword;
    }
    
    private static Admin UniqueAdmin;
    private String AdminName="SystemAdmin";
    
    
    public static Admin GetInstance()  throws RemoteException
    {
        if(UniqueAdmin==null)
        {
            UniqueAdmin=new Admin();
        }
        return UniqueAdmin; 
    }

 public static Admin getUniqueAdmin() {
        return UniqueAdmin;
    }
    
    
     public static void setUniqueAdmin(Admin UniqueAdmin) {
        Admin.UniqueAdmin = UniqueAdmin;
    }
     
         public String getAdminName() {
        return AdminName;
    }

    public void setAdminName(String AdminName) {
        this.AdminName = AdminName;
    }

    @Override
    public String toString() {
        return "Admin{" + "AdminEmail=" + AdminEmail + ", AdminPassword=" + AdminPassword + ", AdminName=" + AdminName + '}';
    }
  
  @Override
public void RecommendVacancy (Applicant A,Vacancy V) throws RemoteException
{
    ApplicantMapper am = new ApplicantMapper();
    A.AddRecommendedJob(V);
    am.Insert(A);
    System.out.println("Job Recommended!"); 
}
  @Override
public void RemoveApplicant(int id) throws RemoteException
{
 ApplicantMapper am = new ApplicantMapper();
    Applicant A = am.getApplicant(id);
    am.Delete(A);
}
  @Override
public void RemoveEmployer(int id) throws RemoteException
{
    EmployerMapper em = new EmployerMapper();
    Employer E = em.getEmployer(id);
    em.deleteEmployer(E);
}
   @Override
public boolean AdminLogin(String Email, String Password) throws RemoteException
{
    boolean x=false;
    if (Email==AdminEmail && Password==AdminPassword)
    {
     x= true;
    }
    return x;
}  

  @Override
public void DeclineVacancyRequest(Vacancy V)throws RemoteException
{
    
    
    
}

    @Override
    public void AcceptVacancyRequest(Vacancy V,Employer E)throws RemoteException
{
     EmployerMapper em = new EmployerMapper();
     E.AddAcceptedVacancy(V.getVacancyID());
     em.insertEmployer(E);
    NotifyEmployer();
}

    @Override
    public void AddObserver(Observer2 o2)   {
       Observers2.add(o2);
    }

    @Override
    public void RemoveObserver(Observer2 o2)  {
        Observers2.remove(o2);
    }

    @Override
    public void NotifyEmployer()  {
             for (int i = 0; i < Observers2.size(); i++) {
         
                     Observers2.get(i).Update2(x);

        }
    }

}
