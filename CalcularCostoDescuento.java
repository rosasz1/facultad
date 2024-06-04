/*Realice un programa en java para determinar cuánto pagará una persona que adquiere N artículos,
los cuales están de promoción. Considere que si su precio es mayor o igual a $2,000 se le aplica un
descuento de 15%, y si su precio es mayor a $1,000 pero menor a $2,000, el descuento es de 12%;
de lo contrario, sólo se le aplica 10%. Se debe saber cuál es el costo y el descuento que tendrá cada
uno de los artículos y finalmente cuánto se pagará por todos los artículos obtenidos. Represente
también la solución mediante el diagrama de flujo y pseudocódigo. */

import java.util.Scanner;

public class CalcularCostoDescuento {
    public static void main(String[] args) {
        Scanner jiji = new Scanner(System.in);
        int N;
        double precio, descuento, totalAPagar = 0;

        
        System.out.print("Ingrese la cantidad de artículos: ");
        N = jiji.nextInt();

       
        for (int i = 1; i <= N; i++) {
            System.out.print("Ingrese el precio del artículo " + i + ": $");
            precio = jiji.nextDouble();

            
            if (precio >= 2000) {
                descuento = precio * 0.15;
            } else if (precio > 1000 && precio < 2000) {
                descuento = precio * 0.12;
            } else {
                descuento = precio * 0.10;
            }

           
            totalAPagar += (precio - descuento);

            
            System.out.println("Costo del artículo " + i + ": $" + precio);
            System.out.println("Descuento del artículo " + i + ": $" + descuento);
        }

        
        System.out.println("Total a pagar por todos los artículos: $" + totalAPagar);

        jiji.close();
    }
}
