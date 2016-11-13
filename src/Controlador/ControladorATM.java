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
    CajeroATM caj =new CajeroATM();
    Tarjeta tarjeta = new Tarjeta();
    ATM_princ menuATM = new ATM_princ();
    
    public ControladorATM(ATM_ses sesATM, CajeroATMDAO cajdao ){
        this.sesATM=sesATM;
        this.cajdao=cajdao;
        this.tarjeta=tarjeta;
        this.sesATM.jButton1.addActionListener(this);        
    }
    
    public void Iniciar_ses_atm(){
        
    }
      
    public void actionPerformed(ActionEvent e) {

        String tarjeta= sesATM.Tarjeta.getText();
        String contraseña= String.valueOf(sesATM.Constraseña.getPassword());
        //caj = cajdao.login(tarjeta, contraseña);
    

        String tar = sesATM.Tarjeta.getText();
        //int tar = Integer.parseInt(tarjeta)
        String cont = String.valueOf(sesATM.Constraseña.getPassword());
       // tarjeta = cajdao.Login(tar, cont);
        if(tarjeta==null){
            JOptionPane.showMessageDialog(sesATM, "Datos incorrectos.");
           
        }else{     
            JOptionPane.showMessageDialog(sesATM, "Bienvenido", "Bienvenido", 1);
            menuATM.setVisible(true);
            sesATM.setVisible(false);
        }
        

   
    }
}
