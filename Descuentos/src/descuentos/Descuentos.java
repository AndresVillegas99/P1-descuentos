/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package descuentos;

import javax.swing.JOptionPane;

/**
 *
 * @author ville
 */
public class Descuentos {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        boolean fin = false;

        int CantLib = 0;
        JOptionPane.showMessageDialog(null, "Bienvenido a la tienda");

        String Nombre = JOptionPane.showInputDialog("Digite su nombre.");
        String tipo = (JOptionPane.showInputDialog("Digite su tipo (tipo1,tipo2 o ninguno)"));
        int PrecioFinal = 0;
        int precio = 0;
        int TotalLib = 0;
        int TotLib = 0;

        if (!tipo.equals("tipo1") && !tipo.equals("tipo2")) {
            JOptionPane.showMessageDialog(null, "No puede comprar aqui, gracias por venir");
        } else {
            do {
                int menu = Integer.parseInt(JOptionPane.showInputDialog("Cuales libros desea comprar? (Romance(1), Comedia (2), Accion (3)"));
                switch (menu) {
                    case 1:
                        precio = Integer.parseInt(JOptionPane.showInputDialog("Digite el precio del libro."));
                        TotalLib = precio + TotalLib;
                        TotLib = CantLib + 1;
                        String res = JOptionPane.showInputDialog("Desea comprar mas libros? (Si o No)");
                        if (!res.equals("si")) {
                            fin = !fin;
                        } else {
                            break;
                        }
                        break;
                    case 2:
                        precio = Integer.parseInt(JOptionPane.showInputDialog("Digite el precio del libro."));
                        TotalLib = precio + TotalLib;
                        TotLib = CantLib + 1;
                        res = JOptionPane.showInputDialog("Desea comprar mas libros? (Si o No)");
                        if (!res.equals("si")) {
                            fin = !fin;
                        } else {
                            break;
                        }
                        break;
                    case 3:
                        precio = Integer.parseInt(JOptionPane.showInputDialog("Digite el precio del libro."));
                        TotalLib = precio + TotalLib;
                        TotLib = CantLib + 1;
                        res = JOptionPane.showInputDialog("Desea comprar mas libros? (Si o No)");
                        if (!res.equals("si")) {
                            fin = !fin;
                        } else {
                            break;
                        }
                        break;
                }
                PrecioFinal = TotalLib;

            } while (fin == false);
                    
            PrecioFinal = TotalLib;
            double PrecioDesc = 0;
            
            if (tipo .equals("tipo1")) {
                PrecioDesc = PrecioFinal - (PrecioFinal * 0.35);
            } else {
            }
            
            if (tipo .equals("tipo2")) {
                PrecioDesc = PrecioFinal - (PrecioFinal * 0.25);
            } else {
            }
          
            System.out.println("Gracias por la compra " + Nombre);
            System.out.println("Su total seria " + PrecioFinal);
            if (tipo.equals("tipo1")) {
                System.out.println("Su descuento es del 35%");
            } else {
                if (tipo.equals("tipo2")) {
                    System.out.println("Su descuento es del 25%");
                }
            }
            System.out.println("Su total a pagar despues del descuento es " + PrecioDesc);
        }
    }
}
//Caja registradora