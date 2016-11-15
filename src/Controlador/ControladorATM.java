/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import ModelosBanco.*;
import ModelosUsuario.*;
import java.awt.event.*;

import javax.swing.*;
import vista.ATM.*;

/**
 *
 * @author fernando
 */
public class ControladorATM implements ActionListener{
    ATM_ses sesATM=new ATM_ses();
    CajeroATMDAO cajdao= new CajeroATMDAO();
    CajeroATM caj= new CajeroATM();
    Tarjeta tarj = new Tarjeta();
    ATM_princ menuATM = new ATM_princ();
    Conexion conexion=new Conexion();
    
    public ControladorATM(ATM_ses sesATM, CajeroATMDAO cajdao, CajeroATM caj,Tarjeta tarj){
        this.caj = caj;
        this.sesATM=sesATM;
        this.cajdao=cajdao;
        this.tarj=tarj;
        this.sesATM.jButton1.addActionListener(this);        
    }
    
    public void Iniciar_ses_atm(){
        
    }
      
    public void actionPerformed(ActionEvent e) {
        
        String tarjeta= sesATM.Tarjeta.getText();
        String contraseña= String.valueOf(sesATM.Constraseña.getPassword());
        tarj=cajdao.Login(tarjeta, contraseña);
        if(tarjeta==null){
            JOptionPane.showMessageDialog(sesATM, "Datos incorrectos.","Datos Incorrectos",2);
           
        }else{     
            JOptionPane.showMessageDialog(sesATM, "Bienvenido", "Bienvenido", 1);
            menuATM.setVisible(true);
            sesATM.setVisible(false);
        }
        

   
    }
}
