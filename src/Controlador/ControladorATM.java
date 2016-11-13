/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import ModelosBanco.*;
import ModelosUsuario.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.ATM.*;

/**
 *
 * @author fernando
 */
public class ControladorATM implements ActionListener{
    ATM_ses Vista_ATM=new ATM_ses();
    CajeroATMDAO cajdao= new CajeroATMDAO();
    CajeroATM caj =new CajeroATM();
    Tarjeta tarj = new Tarjeta();
    
    public ControladorATM(ATM_ses Vista_ATM, CajeroATMDAO cajdao ){
        this.Vista_ATM=Vista_ATM;
        this.cajdao=cajdao;
        this.Vista_ATM.jButton1.addActionListener(this);        
    }
    
    public void Iniciar_ses_atm(){
        
    }
      
    public void actionPerformed(ActionEvent e) {
        String tarjeta= Vista_ATM.jTextField1.getText();
        String contraseña= String.valueOf(Vista_ATM.jPasswordField1.getPassword());
        //caj = cajdao.login(tarjeta, contraseña);
    }
   
    
}
