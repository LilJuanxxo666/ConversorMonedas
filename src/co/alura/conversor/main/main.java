package co.alura.conversor.main;
import co.alura.conversor.modules.Base;
import co.alura.conversor.modules.Request;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        double valor;
        Request request = new Request();
        String separador = "********************************************";
        String menu = "1) Dólar =>> Peso Argentino \n" +
                "2) Peso argentino =>> Dólar \n" +
                "3) Dólar =>> Real brasileño \n" +
                "4) Real brasileño =>> Dólar \n" +
                "5) Dólar =>> Peso colombiano \n" +
                "6) Peso colombiano =>> Dólar \n" +
                "7) Dólar =>> Peso mexicano \n" +
                "8) Peso mexicano =>> Dólar \n" +
                "9) Salir \n" +
                "Seleccione una opción válida: \n" +
                separador + "\n";
        String mensajeValor = "Ingrese el valor a convertir: ";

        System.out.println(separador);
        System.out.println("Sea bienvenido/a al Conversor de divisas\n");
        while (opcion != 9) {
            System.out.println(menu);
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Dólar =>> Peso Argentino");
                    Base base = request.consultar("USD", "ARS");
                    System.out.print(mensajeValor);
                    valor = scanner.nextDouble();
                    base.calculoDivisa(valor);
                    break;
                case 2:
                    System.out.println("Peso Argentino =>> Dólar");
                    Base base1 = request.consultar("ARS", "USD");
                    System.out.print(mensajeValor);
                    valor = scanner.nextDouble();
                    base1.calculoDivisa(valor);
                    break;
                case 3:
                    System.out.println("Dólar =>> Real brasileño");
                    Base base2 = request.consultar("USD", "BRL");
                    System.out.print(mensajeValor);
                    valor = scanner.nextDouble();
                    base2.calculoDivisa(valor);
                    break;
                case 4:
                    System.out.println("Real brasileño =>> Dólar");
                    Base base3 = request.consultar("BRL", "USD");
                    System.out.print(mensajeValor);
                    valor = scanner.nextDouble();
                    base3.calculoDivisa(valor);
                    break;
                case 5:
                    System.out.println("Dólar =>> Peso colombiano");
                    Base base4 = request.consultar("USD", "COP");
                    System.out.print(mensajeValor);
                    valor = scanner.nextDouble();
                    base4.calculoDivisa(valor);
                    break;
                case 6:
                    System.out.println("Peso colombiano =>> Dólar");
                    Base base5 = request.consultar("COP", "USD");
                    System.out.print(mensajeValor);
                    valor = scanner.nextDouble();
                    base5.calculoDivisa(valor);
                    break;
                case 7:
                    System.out.println("Dólar =>> Peso mexicano");
                    Base base6 = request.consultar("USD", "MXN");
                    System.out.print(mensajeValor);
                    valor = scanner.nextDouble();
                    base6.calculoDivisa(valor);
                    break;
                case 8:
                    System.out.println("Peso mexicano =>> Dólar");
                    Base base7 = request.consultar("MXN", "USD");
                    System.out.print(mensajeValor);
                    valor = scanner.nextDouble();
                    base7.calculoDivisa(valor);
                    break;
                case 9:
                    System.out.println("Gracias por usar el conversor de divisas");
                    break;
                default:
                    System.out.println("Opción incorrecta\n");
            }
        }
    }
}
