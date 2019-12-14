/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;
import org.bson.Document;
import org.bson.conversions.Bson;
import rmi.*;
import rminewserver.RMINewServer;

/**
 *
 * @author Cal
 */
public class ApplicantMapper {
    
     private MongoClient client;
    private MongoDatabase database;
    private MongoCollection<Document> Applicantcollection;
    private Gson gson = new Gson();
    
        public ApplicantMapper()  {
        client = new MongoClient();
        database = client.getDatabase("Recruitment_System"); // Database name
        Applicantcollection = database.getCollection("Applicants"); // Applicants Collection 
        

    }
        public void Insert(Applicant A) {
        Applicantcollection.insertOne(Document.parse(gson.toJson(A)));
    }
        
            public void Delete(Applicant A) {
        Applicantcollection.deleteOne(Document.parse(gson.toJson(A)));

    }
        
    
    public ArrayList <Applicant> RetrieveAll() {
        
       
        ArrayList<Document> docs = Applicantcollection.find().into(new ArrayList<Document>());
        ArrayList<Applicant> A = new ArrayList<Applicant>();
        for (int i = 1; i < docs.size(); i++) {
            Document doc = docs.get(i);
            Applicant app = gson.fromJson(doc.toJson(), Applicant.class);
            A.add(app);
        }
        return A;
    }
    
public Applicant getApplicant(int n){
       Bson filter = new Document("ID", n);
       Document doc = Applicantcollection.find(filter).first();
       Applicant A = gson.fromJson(doc.toJson(), Applicant.class);
       return A; 

      }
    
    
    
}
