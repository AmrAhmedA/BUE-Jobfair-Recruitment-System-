/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rminewserver;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import rmi.*;

/**
 *
 * @author Cal
 */
public class RMINewServer {

    public static void main(String[] args) {

        try {

            // Create remote objects
            EmployerInterface e = new Employer("AMC", 1, "Amr", 27, "amc123", "Amr@AMC.gov.eg", "Egyptian", 01024141, "Fifth Settlement", "Employer");
            AdminInterface admin = Admin.GetInstance();
            Application app = new Application(1);
            ApplicationInterface ai = app;
            ApplicantInterface a = new Applicant(app, "bachelor in Computer Information Systems", "Worked at IBM", "Information Systems", 1, 1, "Zeyad Mohamed", 23, "zeyad123",
                    "Zeyad@bue.edu.eg", "Egyptian", 0104243252, "Fifth Settlement", "Applicant");
            ArrayList<Application> ReceivedApplications = new ArrayList<Application>();
            Vacancy v = new Vacancy(1, "Data Scientist", 7262, 3, "AI", "3-4 Years of Experience", "Analyze Data and manipulate it", ReceivedApplications);

            // An RMI Registry initialized 
            Registry ee = LocateRegistry.createRegistry(1098);
            Registry adminadmin = LocateRegistry.createRegistry(1098);
            Registry aiai = LocateRegistry.createRegistry(1098);
            Registry aa = LocateRegistry.createRegistry(1098);
            Registry vv = LocateRegistry.createRegistry(1098);

            // Our remote object g is binded to the name "grade"
            ee.bind("Employer", e);
            adminadmin.bind("Admin", admin);
            aiai.bind("Application", ai);
            aa.bind("Applicant", a);
            vv.bind("Vacancy", v);

            // Outputs that the server is ready
            System.out.println("It runs!");
        } catch (Exception ex) {
            System.out.println("Exception Occured");
        }
    }
}
