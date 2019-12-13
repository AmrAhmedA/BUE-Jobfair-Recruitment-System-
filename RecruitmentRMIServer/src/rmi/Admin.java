/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.util.ArrayList;

/**
 *
 * @author Cal
 */
public class Admin implements Subject2 {
    
 private final String AdminEmail="Admin@recruitment.com";
    private final String AdminPassword="Admin";
    
    private ArrayList<Observer2> Observers2 = new ArrayList<Observer2>();
 
    private void Admin () 
    {
        
    }
    
       public String getAdminEmail()
    {
        return AdminEmail;
    }

    public String getAdminPassword() {
        return AdminPassword;
    }
    
    private static Admin UniqueAdmin;
    private String AdminName="SystemAdmin";
    
    
    public static Admin GetInstance()
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
  

public void RecommendVacancy(Applicant A,Vacancy V)
{
    
}

public void RemoveApplicant(int id)
{
    
}

public void RemoveUser(int id)
{
    
}

public void AdminLogin(String Email, String Password)
{
    
}  

public void DeclineVacancyRequest(Vacancy V)
{
    
}

public void AcceptVacancyRequest(Vacancy V)
{
    
    
    
    NotifyEmployer();
}

    @Override
    public void AddObserver(Observer2 o2) {
       Observers2.add(o2);
    }

    @Override
    public void RemoveObserver(Observer2 o2) {
        Observers2.remove(o2);
    }

    @Override
    public void NotifyEmployer() {
             for (int i = 0; i < Observers2.size(); i++) {
            Observers2.get(i).Update2();
        }
    }


}
