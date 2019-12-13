/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUE_JobFairDatabase;

/**
 *
 * @author Zeyad Mohamed
 */
import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;

import org.bson.Document;
import org.bson.conversions.Bson;

public class Database {
     private MongoClient client;
    private MongoDatabase database;
    private MongoCollection<Document> Applicantcollection;
    private MongoCollection<Document> Employercollection;
    private Gson gson = new Gson();

    public Database() {
        client = new MongoClient();
        database = client.getDatabase("Recruitment_System"); // Database name
        Applicantcollection = database.getCollection("Applicants"); // Applicants Collection 
        Employercollection = database.getCollection("Employers"); // Employer Collection
        
    }
    public void insertApplicant(Applicant A) {
        Applicantcollection.insertOne(Document.parse(gson.toJson(A)));
    }

    public void deleteApplicant(Applicant A) {
         Applicantcollection.deleteOne(Document.parse(gson.toJson(A)));
        
    }
    public void getAllApplicants() {
    ArrayList<Document> docs = Applicantcollection.find().into(new ArrayList<Document>());
   ArrayList<Applicant> A = new ArrayList<Applicant>();
   for (int i=1;i<docs.size();i++){
       Document doc = docs.get(i);
       Applicant app = gson.fromJson(doc.toJson(), Applicant.class);
       A.add(app);
   }
    return A;    
    
    }
     public void insertEmployer(Employer A) {
        Applicantcollection.insertOne(Document.parse(gson.toJson(A)));
    }

    public void deleteEmployer(Employer E) {
         Applicantcollection.deleteOne(Document.parse(gson.toJson(E)));
        
    }
    public void getAllEmployers() {
    ArrayList<Document> docs = Applicantcollection.find().into(new ArrayList<Document>());
    ArrayList<Employer> E = new ArrayList<Employer>();
    for (int i=1;i<docs.size();i++){
       Document doc = docs.get(i);
       Employer emp = gson.fromJson(doc.toJson(), Employer.class);
       E.add(emp);
   }
    return E;    
    
    }
    
}
