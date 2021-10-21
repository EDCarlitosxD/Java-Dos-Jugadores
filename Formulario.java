package com.mycompany.adivinadoss;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
import java.awt.Color;
/**
 * @author JUAN CARLOS UCH DZIB
 */
public class Formulario  extends JFrame implements ActionListener{
 
    
    //Objetos
    Random Numero = new Random();
    

    // VARIABLES GLOBALES
    int x1 = 1;
    int x2=1;
    int numero = Numero.nextInt(100)+1;
    String cadena1 = "---COLOCA UN NUMERO---  \n";
     String cadena2 = "---COLOCA UN NUMERO---  \n";
    // JFrame
    private JLabel copyright;
    private JTextField NumeroUser;
    private JTextArea PrintIntentos1, PrintIntentos2;
    private JButton Jugador1,Jugador2, Reiniciar;
    
    public Formulario(){
        setLayout(null);
        getContentPane().setBackground(new Color(255,255,255));
        setTitle("Adivina el numero Aleatorio");
        
        copyright = new JLabel("copyright: Juan Carlos Uch Dzib");
        copyright.setBounds(170,470,200,30);
        add(copyright);
        
        NumeroUser = new JTextField();
        NumeroUser.setBounds(10,5,150,30);
        add(NumeroUser);
        
        PrintIntentos1 = new JTextArea();
        PrintIntentos1.setBounds(10,60,400,400);
        PrintIntentos1.setEnabled(false);
        PrintIntentos1.setText(cadena1);
        add(PrintIntentos1);
        
        PrintIntentos2 = new JTextArea();
        PrintIntentos2.setBounds(430,60,400,400);
        PrintIntentos2.setEnabled(false);
        PrintIntentos2.setText(cadena2);
        add(PrintIntentos2);
        
        Jugador1 = new JButton("Jugador1");
        Jugador1.setBounds(180,5,100,30);
        Jugador1.addActionListener(this);
        add(Jugador1);
        
        Jugador2 = new JButton("Jugador2");
        Jugador2.setBounds(300, 5, 100, 30);
        Jugador2.addActionListener(this);
        Jugador2.setEnabled(false);
        add(Jugador2);
        
        Reiniciar = new JButton("Reiniciar");
        Reiniciar.setBounds(450, 5, 100, 30);
        Reiniciar.addActionListener(this);
        add(Reiniciar);
        
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == Jugador1){
            int numUser = Integer.parseInt(NumeroUser.getText());
            cadena1 +=  Integer.toString(numUser);
            if(numUser == numero){  
                cadena1 += "\n"+ "----Ganaste---- FELICIDADES "+"\n"+ "Acertastes con "+x1 + " Intentos";
                cadena1 += "\n JUGADOR UNO FELICIDADES";
                PrintIntentos1.setText(cadena1);
                Jugador1.setEnabled(false);
                Jugador2.setEnabled(false);
                getContentPane().setBackground(new Color(0,255,0));
            }else if(numUser < numero){
                NumeroUser.setText("");
                cadena1+= "\n"+"Estas cerca" + "\n";
                PrintIntentos1.setText(cadena1);
                x1++;
                Jugador1.setEnabled(false);
                Jugador2.setEnabled(true);
                
            }else if(numUser > numero){
                NumeroUser.setText("");
                cadena1+= "\n"+"Estas lejos"+ "\n";
                PrintIntentos1.setText(cadena1);  
                x1++;
                Jugador1.setEnabled(false);
                Jugador2.setEnabled(true);
            }
            if(x1 == 11){
            cadena1 += "Lo siento perdiste todas las oportunidades \n Jugador1";
            PrintIntentos1.setText(cadena1);
            Jugador1.setEnabled(false);
            getContentPane().setBackground(new Color(255,0,0));
            }
        }
            if(e.getSource() == Jugador2){
            int numUser = Integer.parseInt(NumeroUser.getText());
            cadena2 +=  Integer.toString(numUser);
            if(numUser == numero){  
                cadena2 += "\n"+ "----Ganaste---- FELICIDADES "+"\n"+ "Acertastes con "+x2 + " Intentos";
                cadena2 += "\n JUGADOR DOS FELICIDADES";
                PrintIntentos2.setText(cadena2);
                Jugador1.setEnabled(false);
                Jugador2.setEnabled(false);
                getContentPane().setBackground(new Color(0,255,0));
            }else if(numUser < numero){
                NumeroUser.setText("");
                cadena2+= "\n"+"Estas cerca" + "\n";
                PrintIntentos2.setText(cadena2);
                x2++;
                Jugador2.setEnabled(false);
                Jugador1.setEnabled(true);
                
            }else if(numUser > numero){
                NumeroUser.setText("");
                cadena2+= "\n"+"Estas lejos"+ "\n";
                PrintIntentos2.setText(cadena2);  
                x1++;
                Jugador1.setEnabled(true);
                Jugador2.setEnabled(false);
            }
            if(x2 == 11){
            cadena2 += "Lo siento perdiste todas las oportunidades \n Jugador dos";
            PrintIntentos2.setText(cadena2);
            Jugador2.setEnabled(false);
            getContentPane().setBackground(new Color(255,0,0));
            }
            
            
        }//IF VERIFICAR
        if(e.getSource()== Reiniciar){
         x1 = 1;
         x2 =1;
         Jugador1.setEnabled(true);
         Jugador2.setEnabled(false);
         cadena1 = "---COLOCA UN NUMERO---  \n";
         cadena2 = "---COLOCA UN NUMERO---  \n";
         Jugador1.setEnabled(true);
         numero = Numero.nextInt(100)+1;
         NumeroUser.setText("");
         PrintIntentos1.setText(cadena1);
         PrintIntentos2.setText(cadena2);
         getContentPane().setBackground(new Color(255,255,255));
        } // IF REINICIAR
    }
        public static void main(String args[]){
        Formulario interfaz = new Formulario();
        interfaz.setVisible(true);
        interfaz.setBounds(0, 0, 900, 545);
        interfaz.setLocationRelativeTo(null);
        interfaz.setResizable(false);
    }
} 
