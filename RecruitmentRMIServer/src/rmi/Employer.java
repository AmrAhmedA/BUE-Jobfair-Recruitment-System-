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
public class Employer extends User implements Observer2 {
    
     private String CompanyName ;
    private ArrayList <Vacancy> AcceptedVacancies= new ArrayList <Vacancy>();

    public Employer(String CompanyName, int ID, String Name, int Age, String Password, String Email, String Nationality, int PhoneNumber, String Address, String AccountType) {
        super(ID, Name, Age, Password, Email, Nationality, PhoneNumber, Address, AccountType);
        this.CompanyName = CompanyName;
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
    
public void AddAcceptedVacancy (int VacancyID)
 {
     
 }
 
 public void RemoveAcceptedVacancy (int VacancyID)
 {
     
 }
 
 /*public Vacancy GetAcceptedVacancy()
 {
     
 }*/
 
 
 
 
 
    @Override
    public void Update2() {
        AddAcceptedVacancy();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
