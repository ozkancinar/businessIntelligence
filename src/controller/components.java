/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.ComboBox;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author ozkan
 */
public class components {
    
    
    // Comboboxlara şehir adlarını gir
    public DefaultComboBoxModel comboSehirler(){
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        List<veriler> liste = null;
        
        try {
            liste = new controller.veriler().sehirleriOku();
        } catch (SQLException ex) {
            Logger.getLogger(components.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.addElement("Şehirler");
        for(int i=0;i<liste.size();i++){
            model.addElement(liste.get(i).getSehirAd());
        }
        return model;
        
    }
    
  
}
