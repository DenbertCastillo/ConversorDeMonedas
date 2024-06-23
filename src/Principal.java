import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();
        Moneda moneda = null;
        int opcion = 0;
        double monto = 0;

        while (opcion != 9) {

            System.out.println("********************************************");
            System.out.println("* Bienvenidos al Conversor de monedas !!!! *");
            System.out.println("*                                          *");
            System.out.println("* 1. Dolares a Soles.                      *");
            System.out.println("* 2. Soles a Dolares.                      *");
            System.out.println("* 3. Dolares a Pesos Mexicanos  .          *");
            System.out.println("* 4. Pesos Mexicanos a Dolares.            *");
            System.out.println("* 5. Dolares a Real Brasileño.             *");
            System.out.println("* 6. Real Brasileño a Dolares              *");
            System.out.println("* 7. Dolares a Pesos Argentinos.           *");
            System.out.println("* 8. Pesos Argentinos a Dolares            *");
            System.out.println("* 9. SALIR.                                *");
            System.out.println("********************************************");
            System.out.println("Elija su opción deseada:");


            try {
                opcion = lectura.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el monto a convertir ");
                        monto = lectura.nextDouble();
                        moneda = consulta.buscaMoneda("USD", "PEN", monto);
                        System.out.println("El monto es: " + moneda.conversion_result());
                        break;
                    case 2:
                        System.out.println("Ingrese el monto a convertir ");
                        monto = lectura.nextDouble();
                        moneda = consulta.buscaMoneda("PEN", "USD", monto);
                        System.out.println("El monto es: " + moneda.conversion_result());
                        break;
                    case 3:
                        System.out.println("Ingrese el monto a convertir ");
                        monto = lectura.nextDouble();
                        moneda = consulta.buscaMoneda("USD", "MXN", monto);
                        System.out.println("El monto es: " + moneda.conversion_result());
                        break;
                    case 4:
                        System.out.println("Ingrese el monto a convertir ");
                        monto = lectura.nextDouble();
                        moneda = consulta.buscaMoneda("MXM", "USD", monto);
                        System.out.println("El monto es: " + moneda.conversion_result());
                        break;
                    case 5:
                        System.out.println("Ingrese el monto a convertir ");
                        monto = lectura.nextDouble();
                        moneda = consulta.buscaMoneda("USD", "BRL", monto);
                        System.out.println("El monto es: " + moneda.conversion_result());
                        break;
                    case 6:
                        System.out.println("Ingrese el monto a convertir ");
                        monto = lectura.nextDouble();
                        moneda = consulta.buscaMoneda("BRL", "USD", monto);
                        System.out.println("El monto es: " + moneda.conversion_result());
                        break;
                    case 7:
                        System.out.println("Ingrese el monto a convertir ");
                        monto = lectura.nextDouble();
                        moneda = consulta.buscaMoneda("USD", "ARS", monto);
                        System.out.println("El monto es: " + moneda.conversion_result());
                        break;
                    case 8:
                        System.out.println("Ingrese el monto a convertir ");
                        monto = lectura.nextDouble();
                        moneda = consulta.buscaMoneda("ARS", "USD", monto);
                        System.out.println("El monto es: " + moneda.conversion_result());
                        break;
                    case 9:
                        break;
                    default:
                        System.out.println("Ingrese un numero valido");
                }

            } catch (NumberFormatException e) {
                System.out.println("ERROR INGRESA OPCION VALIDA " + e.getMessage());
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                System.out.println("Finalizando la aplicación");

            }
        }
    }
}
