import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);
        System.out.println("Escribe la moneda que deseas consultar ");

        ConsultaMoneda consulta= new ConsultaMoneda();
        try {
            var nombreDeMoneda= lectura.nextLine();
            Moneda moneda  = consulta.buscaMoneda(nombreDeMoneda);
            System.out.println(moneda);
        }catch(NumberFormatException e){
            System.out.println("Numero no encontrado " + e.getMessage());
        } catch (RuntimeException e ){
            System.out.println(e.getMessage());
            System.out.println("Finalizando la aplicación");
        }

    }
}
