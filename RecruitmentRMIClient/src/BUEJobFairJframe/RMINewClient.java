/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUEJobFairJframe;

import BueJobFairController.AdminControlPanelJframeController;
import BueJobFairController.ApplicantControlPanelJframeController;
import BueJobFairController.EmployerControlPanelJframeController;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import rmi.*;

/**
 *
 * @author Amr
 */
public class RMINewClient {

    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        // We create an object from the GUI window

        AdminControlPanelJframe Admingui = new AdminControlPanelJframe();
        ApplicantControlPanelJframe Applicantgui = new ApplicantControlPanelJframe();
        EmployerControlPanelJframe Employergui = new EmployerControlPanelJframe();

        // We connect to the RMI Registry
        Registry r1 = LocateRegistry.getRegistry(1099);
        Registry r2 = LocateRegistry.getRegistry(1098);
        Registry r3 = LocateRegistry.getRegistry(1098);
        // we create a new object from the controller and we pass it the
        // gui object along with the registry object
        AdminControlPanelJframeController AdminController = new AdminControlPanelJframeController(Admingui, r1);
        ApplicantControlPanelJframeController ApplicantController = new ApplicantControlPanelJframeController(Applicantgui, r2);
        EmployerControlPanelJframeController EmployerController = new EmployerControlPanelJframeController(Employergui, r3);
    }
}
