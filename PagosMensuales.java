/*Una persona adquirió un producto para pagar en 20 meses. El primer mes pagó $10, el segundo $20,
el tercero $40 y así sucesivamente. Realizar un programa en Java, diagrama de flujo utilizando el ciclo
apropiado para determinar cuánto debe pagar mensualmente y el total de lo que pagó después de
los 20 meses.  */
public class PagosMensuales {
    public static void main(String[] args) {
        double pagoMensual = 10;
        double totalPagado = 0;

 
        for (int mes = 1; mes <= 20; mes++) {
            totalPagado += pagoMensual;
            System.out.println("Mes " + mes + ": Pago mensual = $" + pagoMensual + " | Total abonado hasta ahora = $" + totalPagado);
            pagoMensual *= 2;
        }

   
        System.out.println("Total pagado luego de 20 meses: $" + totalPagado);
    }
}
