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
public abstract class User {
    
    private int ID;
    private String Name;
    private int Age;
    private String Password;
    private String Email;
    private String Nationality;
    private int PhoneNumber;
    private String Address;
    private String AccountType;

    public User(int ID, String Name, int Age, String Password, String Email, String Nationality, int PhoneNumber, String Address, String AccountType) {
        this.ID = ID;
        this.Name = Name;
        this.Age = Age;
        this.Password = Password;
        this.Email = Email;
        this.Nationality = Nationality;
        this.PhoneNumber = PhoneNumber;
        this.Address = Address;
        this.AccountType = AccountType;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String AccountType) {
        this.AccountType = AccountType;
    }

    @Override
    public String toString() {
        return "User{" + "ID=" + ID + ", Name=" + Name + ", Age=" + Age + ", Password=" + Password + ", Email=" + Email + ", Nationality=" + Nationality + ", PhoneNumber=" + PhoneNumber + ", Address=" + Address + ", AccountType=" + AccountType + '}';
    }
    
     public void Login(String E,String P)
    {
        
    }
    
    public void CreateAccount(int id,String name,int age,String password, String mail, String nationality,int phonenumber,String address,String accType)
    {
        
    }
    
    public void EditAccount(int id){
    }
    
    public void DeleteAccount(int id){
    }
    
    
}
