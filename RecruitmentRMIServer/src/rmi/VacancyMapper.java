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
public class VacancyMapper {
    
    private MongoClient client;
    private MongoDatabase database;
    private MongoCollection<Document> Vacancycollection;
    private Gson gson = new Gson();
    
         public VacancyMapper() {
        client = new MongoClient();
        database = client.getDatabase("Recruitment_System"); // Database name
        Vacancycollection = database.getCollection("Vacancies"); // Applicants Collection 
        

    }
         
        public void insertVacancy(Vacancy V) {
        Vacancycollection.insertOne(Document.parse(gson.toJson(V)));
    }

    public void deleteVacancy(Vacancy V) {
         Vacancycollection.deleteOne(Document.parse(gson.toJson(V)));

    }
    public ArrayList<Vacancy> RetrieveAll() {
    ArrayList<Document> docs = Vacancycollection.find().into(new ArrayList<Document>());
   ArrayList<Vacancy> V = new ArrayList<Vacancy>();
   for (int i=1;i<docs.size();i++){
       Document doc = docs.get(i);
       Vacancy vac = gson.fromJson(doc.toJson(), Vacancy.class);
       V.add(vac);
   }
    return V;

    }

  public Vacancy getVacancy(int id){
       Bson filter = new Document("VacancyID", id);
       Document doc = Vacancycollection.find(filter).first();
       Vacancy V = gson.fromJson(doc.toJson(), Vacancy.class);
       return V;
    } 
         
}
