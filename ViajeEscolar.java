/*El director de una escuela está organizando un viaje de estudios, y requiere determinar cuánto debe
cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de cobrar
es la siguiente: si son 100 alumnos o más, el costo por cada alumno es de $6,500.00; de 50 a 99
alumnos, el costo es de $7,000.00, de 30 a 49, de $9,500.00, y si son menos de 30, el costo de la renta
del autobús es de $40,000.00, sin importar el número de alumnos. Realizar un programa en Java y el
diagrama de flujo que permita determinar el pago a la compañía de autobuses y lo que debe pagar
cada alumno por el viaje */


import java.util.Scanner;

public class ViajeEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_alumnos;
        double costo_por_alumno, pago_total_compania, pago_por_alumno;

       
        System.out.println("Ingrese el número de alumnos: ");
        num_alumnos = scanner.nextInt();

        
        if (num_alumnos >= 100) {
            costo_por_alumno = 6500;
            pago_total_compania = num_alumnos * costo_por_alumno;
            pago_por_alumno = costo_por_alumno;
        } else if (num_alumnos >= 50) {
            costo_por_alumno = 7000;
            pago_total_compania = num_alumnos * costo_por_alumno;
            pago_por_alumno = costo_por_alumno;
        } else if (num_alumnos >= 30) {
            costo_por_alumno = 9500;
            pago_total_compania = num_alumnos * costo_por_alumno;
            pago_por_alumno = costo_por_alumno;
        } else {
            pago_total_compania = 40000;
            pago_por_alumno = pago_total_compania / num_alumnos;
        }

       
        System.out.println("El pago total a la compañía de autobuses es: $" + pago_total_compania);
        System.out.println("El pago por alumno es: $" + pago_por_alumno);

        scanner.close();
    }

   
    }

