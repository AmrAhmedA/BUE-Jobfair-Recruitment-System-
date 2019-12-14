/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BueJobFairController;

/**
 *
 * @author Amr
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import BUEJobFairJframe.AdminControlPanelJframe;
import java.rmi.AccessException;
import java.rmi.Naming;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import rmi.EmployerInterface;
import rmi.RecruitmentInterface;

public class AdminControlPanelJframeController {

    AdminControlPanelJframe gui;
    Registry r;

    public AdminControlPanelJframeController(AdminControlPanelJframe gui, Registry r) {
        this.gui = gui;
        this.r = r;
    }

    public class user {

        String x1;
        String x2;
        String x3;
        int x4;

        public user(String x1, String x2, String x3, int x4) {
            this.x1 = x1;
            this.x2 = x2;
            this.x3 = x3;
            this.x4 = x4;
        }

    }

    class GetViewApplicantsBtnAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                RecruitmentInterface R = (RecruitmentInterface) r.lookup("Test");

                // we should use for loop in order to complete the iterations incase of displaying the whole applicants for the admin
                String ApplicantAchievement = R.getAchievement();
                String ApplicantDegree = R.getDegree();
                String ApplicaPastJob = R.getPastJobs();
                int ApplicantYOEXP = R.getYearsOfExpertise();
                
                user u1 = new user(ApplicaPastJob, ApplicaPastJob, ApplicaPastJob, ApplicantYOEXP);
                
                DefaultTableModel model = (DefaultTableModel)gui.getApplicant().getModel();
                Object rowData[] = new Object[1]; //Creating an Object to add the output in it
                rowData[0] = u1; //inserting the Object in it 
                model.addRow(rowData); // adding the row to be viewed on the Jtable
                gui.setApplicant(model); //calling Set Applicant Function to add the table model

                //gui.setApplicant(Applicant);
            } catch (RemoteException ex) {
                Logger.getLogger(AdminControlPanelJframeController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NotBoundException ex) {
                Logger.getLogger(AdminControlPanelJframeController.class.getName()).log(Level.SEVERE, null, ex);
            }

            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }

    class GetViewEmployers implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                EmployerInterface E = (EmployerInterface) r.lookup("Test");
                String EmployerName = E.getCompanyName();
            } catch (RemoteException ex) {
                Logger.getLogger(AdminControlPanelJframeController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NotBoundException ex) {
                Logger.getLogger(AdminControlPanelJframeController.class.getName()).log(Level.SEVERE, null, ex);
            }
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }
}
