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
public class EmployerMapper {

    private MongoClient client;
    private MongoDatabase database;
    private MongoCollection<Document> Employercollection;
    private Gson gson = new Gson();

    public EmployerMapper() {
        client = new MongoClient();
        database = client.getDatabase("Recruitment_System"); // Database name
        Employercollection = database.getCollection("Employers"); // Applicants Collection      
    }

    public void insertEmployer(Employer A) {
        Employercollection.insertOne(Document.parse(gson.toJson(A)));
    }

    public void deleteEmployer(Employer E) {
        Employercollection.deleteOne(Document.parse(gson.toJson(E)));

    }

    public ArrayList<Employer> RetrieveAll() {
        ArrayList<Document> docs = Employercollection.find().into(new ArrayList<Document>());
        ArrayList<Employer> E = new ArrayList<Employer>();
        for (int i = 1; i < docs.size(); i++) {
            Document doc = docs.get(i);
            Employer emp = gson.fromJson(doc.toJson(), Employer.class);
            E.add(emp);
        }
        return E;
    }

  public Employer getEmployer(int n){
       Bson filter = new Document("ID", n);
       Document doc = Employercollection.find(filter).first();
       Employer E = gson.fromJson(doc.toJson(), Employer.class);
       return E;
    }
}
