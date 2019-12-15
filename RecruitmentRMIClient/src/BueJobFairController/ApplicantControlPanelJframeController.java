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
import BUEJobFairJframe.ApplicantControlPanelJframe;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ApplicantControlPanelJframeController {
    ApplicantControlPanelJframe gui;
    Registry r;

    public ApplicantControlPanelJframeController(ApplicantControlPanelJframe gui, Registry r) {
        this.gui = gui;
        this.r = r;
    }
    
    
}
