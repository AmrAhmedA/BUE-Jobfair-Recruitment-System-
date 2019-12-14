/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cal
 */
public class Employer extends User implements Observer2,EmployerInterface {
    
     private String CompanyName;
    private ArrayList <Vacancy> AcceptedVacancies= new ArrayList <Vacancy>();
    private EmployerMapper EM;
    
    public Employer(String CompanyName, int ID, String Name, int Age, String Password, String Email, String Nationality, int PhoneNumber, String Address, String AccountType) throws RemoteException {
        super(ID, Name, Age, Password, Email, Nationality, PhoneNumber, Address, AccountType);
        this.CompanyName = CompanyName;
        EM=new EmployerMapper();
        EM.insertEmployer(this);
    }

    public Employer(EmployerMapper EM) throws RemoteException {
        this.EM = EM;
    }
    
    

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    public ArrayList<Vacancy> getAcceptedVacancies() {
        return AcceptedVacancies;
    }

    public void setAcceptedVacancies(ArrayList<Vacancy> AcceptedVacancies) {
        this.AcceptedVacancies = AcceptedVacancies;
    }

    @Override
    public String toString() {
        return "Employer{" + "CompanyName=" + CompanyName + ", AcceptedVacancies=" + AcceptedVacancies + '}';
    }
    
     @Override
     public void AddAcceptedVacancy (int VacancyID) throws RemoteException
 {
     VacancyMapper vm = new VacancyMapper();
     Vacancy v = vm.getVacancy(VacancyID);
     this.AcceptedVacancies.add(v);
 }
 
     @Override
 public void RemoveAcceptedVacancy (int VacancyID) throws RemoteException
 {
     VacancyMapper vm = new VacancyMapper();
     Vacancy v = vm.getVacancy(VacancyID);
     this.AcceptedVacancies.remove(v);
 }
 
  @Override
 public Vacancy GetAcceptedVacancy(int id) throws RemoteException
 {
       VacancyMapper vm = new VacancyMapper();
     Vacancy v = vm.getVacancy(id);
     return v;
 }
 
    @Override
    public void Update2(int x) {
         try {
             AddAcceptedVacancy(x);
         } catch (RemoteException ex) {
             Logger.getLogger(Employer.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }

}
