package tienda.Vista;

/*Autores
Liseth Johanna Gomez Ariza
Oscar Julian Montaño Alfonso
Cristian Camilo Posada García
*/

import java.util.ArrayList;
import java.util.Scanner;
import tienda.Controlador.Valor;
import javax.swing.JOptionPane;

public class Tienda {

    public static void main(String[] args) {
//        Variables
        int tp,can,canT=0;
        double tot,totTodo=0;
        char des='n';
        
//        Objetos
        String s="REPORTE DE LA SEMANA\n======================\n";
        Scanner sc=new Scanner(System.in);
        Valor v=new Valor();
        ArrayList<Double> arrayTotales=new ArrayList();
        ArrayList<Integer> arrayCantidades=new ArrayList();
        double total=0;
        int totalC=0;
        
//        Proceso
        try{
            for (int i = 0; i < 7; i++){
            do{                
                tp=Integer.parseInt(JOptionPane.showInputDialog("Elija un producto: \n1.Manzana\n2.Pera\n3.Banano"));
                tp--;
                can=Integer.parseInt(JOptionPane.showInputDialog("Cantidad:"));
                tot=v.calcularTotal(can, tp);
                totTodo+=tot;
                canT+=can;
                des=JOptionPane.showInputDialog("Desea agregar otro producto? (s/n)").charAt(0);
            } while (des=='s');
            arrayTotales.add(totTodo);//Añade total del dia al arrayList
            totTodo=0;
            arrayCantidades.add(canT);//Añade cantidad total del dia al arrayList
            canT=0;
        }
//        Reporte
            for (int i = 0; i < 7; i++){
                s+="Dia "+(i+1)+": $"+arrayTotales.get(i)+"  ||   "+arrayCantidades.get(i)+"\n";
            }
            s+="======================\n";
            for(double i: arrayTotales){
                total+=i;
            }

            for(double i: arrayCantidades){
                totalC+=i;
            }
            s+="TOTAL: "+total+"    ||  "+totalC;
            JOptionPane.showMessageDialog(null,s);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Dato invalido","ERROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"...Cerrando el Programa");
        }
        
    }

}
