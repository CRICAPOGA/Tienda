package tienda.Controlador;

import javax.swing.JOptionPane;
import tienda.Modelo.Producto;

public class Valor {
    private String[] producto={"manzana","pera","banano"}; 
    Producto pr;

    public double calcularTotal(int can,int i) {
        switch (i){
            case 0:
                pr=new Producto(producto[i], 123, 1000);
                break;
            case 1:
                pr=new Producto(producto[i], 122, 1500);
                break;
            case 2:
                pr=new Producto(producto[i], 121, 1200);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Perro eres TONTO o te pegan en CASA","ERROR",JOptionPane.WARNING_MESSAGE);
                System.out.println();
        }
        return can*pr.getValor();
    }
}