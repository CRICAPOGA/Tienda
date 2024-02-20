package tienda.Vista;

/*Autores
Liseth Johanna Gomez Ariza
Oscar Julian Montaño Alfonso
Cristian Camilo Posada García
*/

import java.util.Scanner;
import tienda.Controlador.Valor;

public class Tienda {

    public static void main(String[] args) {
        int tp,can,canT=0;
        double tot,totTodo=0;
        char des='n';
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 7; i++){
            System.out.println("////////////////////////////////////////////// Dia "+(i+1)+" /////////////////////////////////////////////////////////7");
            do{                
                System.out.println("Elija un producto: \n1.Manzana\n2.Pera\n3.Banano");
                tp=sc.nextInt();
                tp--;
                System.out.println("Cantidad:");
                can=sc.nextInt();
                Valor v=new Valor();
                tot=v.calcularTotal(can, tp);
                System.out.println("Total: "+tot);
                totTodo+=tot;
                canT+=can;
                System.out.println("otro?? (s/n)");
                des=sc.next().charAt(0);
            } while (des=='s');
            System.out.println("TOTAL DEL DIA $ "+totTodo);
            totTodo=0;
            System.out.println("CANTIDAD TOTAL DE PRODUCTOS VENDIDOS: "+canT);
            canT=0;
        }
    }

}
