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
}
