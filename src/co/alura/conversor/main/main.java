package co.alura.conversor.main;
import co.alura.conversor.modules.Base;
import co.alura.conversor.modules.Historial;
import co.alura.conversor.modules.Request;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        double valor;
        String resultado;
        List<Historial> historial = new ArrayList<>();
        Request request = new Request();
        String separador = "********************************************";
        String separador2 = "------------------------------------------------------------------------------------";
        String menu = "1) Dólar =>> Peso Argentino \n" +
                "2) Peso argentino =>> Dólar \n" +
                "3) Dólar =>> Real brasileño \n" +
                "4) Real brasileño =>> Dólar \n" +
                "5) Dólar =>> Peso colombiano \n" +
                "6) Peso colombiano =>> Dólar \n" +
                "7) Dólar =>> Peso mexicano \n" +
                "8) Peso mexicano =>> Dólar \n" +
                "9) Dólar =>> Euro \n" +
                "10) Euro =>> Dólar \n" +
                "11) Dólar =>> Japanese Yen \n" +
                "12) Japanese Yen =>> Dólar \n" +
                "13) Historial de consultas \n" +
                "14) Salir \n" +
                "Seleccione una opción válida:";
        String mensajeValor = "Ingrese el valor a convertir: ";

        System.out.println(separador);
        System.out.println("Sea bienvenido/a al Conversor de divisas\n");
        while (opcion != 14) {
            System.out.print(menu);
            opcion = scanner.nextInt();
            System.out.println(separador);
            switch (opcion) {
                case 1:
                    System.out.println("Dólar =>> Peso Argentino");
                    Base base = request.consultar("USD", "ARS");
                    System.out.print(mensajeValor);
                    valor = scanner.nextDouble();
                    resultado = base.calculoDivisa(valor);
                    System.out.println(separador2+"\n"+resultado+"\n"+separador2);
                    historial.add(new Historial(resultado));
                    break;
                case 2:
                    System.out.println("Peso Argentino =>> Dólar");
                    Base base1 = request.consultar("ARS", "USD");
                    System.out.print(mensajeValor);
                    valor = scanner.nextDouble();
                    resultado = base1.calculoDivisa(valor);
                    System.out.println(separador2+"\n"+resultado+"\n"+separador2);
                    historial.add(new Historial(resultado));
                    break;
                case 3:
                    System.out.println("Dólar =>> Real brasileño");
                    Base base2 = request.consultar("USD", "BRL");
                    System.out.print(mensajeValor);
                    valor = scanner.nextDouble();
                    resultado = base2.calculoDivisa(valor);
                    System.out.println(separador2+"\n"+resultado+"\n"+separador2);
                    historial.add(new Historial(resultado));

                    break;
                case 4:
                    System.out.println("Real brasileño =>> Dólar");
                    Base base3 = request.consultar("BRL", "USD");
                    System.out.print(mensajeValor);
                    valor = scanner.nextDouble();
                    resultado = base3.calculoDivisa(valor);
                    System.out.println(separador2+"\n"+resultado+"\n"+separador2);
                    historial.add(new Historial(resultado));
                    break;
                case 5:
                    System.out.println("Dólar =>> Peso colombiano");
                    Base base4 = request.consultar("USD", "COP");
                    System.out.print(mensajeValor);
                    valor = scanner.nextDouble();
                    resultado = base4.calculoDivisa(valor);
                    System.out.println(separador2+"\n"+resultado+"\n"+separador2);
                    historial.add(new Historial(resultado));
                    break;
                case 6:
                    System.out.println("Peso colombiano =>> Dólar");
                    Base base5 = request.consultar("COP", "USD");
                    System.out.print(mensajeValor);
                    valor = scanner.nextDouble();
                    resultado = base5.calculoDivisa(valor);
                    System.out.println(separador2+"\n"+resultado+"\n"+separador2);
                    historial.add(new Historial(resultado));
                    break;
                case 7:
                    System.out.println("Dólar =>> Peso mexicano");
                    Base base6 = request.consultar("USD", "MXN");
                    System.out.print(mensajeValor);
                    valor = scanner.nextDouble();
                    resultado = base6.calculoDivisa(valor);
                    System.out.println(separador2+"\n"+resultado+"\n"+separador2);
                    historial.add(new Historial(resultado));
                    break;
                case 8:
                    System.out.println("Peso mexicano =>> Dólar");
                    Base base7 = request.consultar("MXN", "USD");
                    System.out.print(mensajeValor);
                    valor = scanner.nextDouble();
                    resultado = base7.calculoDivisa(valor);
                    System.out.println(separador2+"\n"+resultado+"\n"+separador2);
                    historial.add(new Historial(resultado));
                    break;
                case 9:
                    System.out.println("Dólar =>> Euro");
                    Base base8 = request.consultar("USD", "EUR");
                    System.out.print(mensajeValor);
                    valor = scanner.nextDouble();
                    resultado = base8.calculoDivisa(valor);
                    System.out.println(separador2+"\n"+resultado+"\n"+separador2);
                    historial.add(new Historial(resultado));
                    break;
                case 10:
                    System.out.println("Euro =>> Dólar");
                    Base base9 = request.consultar("EUR", "USD");
                    System.out.print(mensajeValor);
                    valor = scanner.nextDouble();
                    resultado = base9.calculoDivisa(valor);
                    System.out.println(separador2+"\n"+resultado+"\n"+separador2);
                    historial.add(new Historial(resultado));
                    break;
                case 11:
                    System.out.println("Dólar =>> Japanese Yen");
                    Base base10 = request.consultar("USD", "JPY");
                    System.out.print(mensajeValor);
                    valor = scanner.nextDouble();
                    resultado = base10.calculoDivisa(valor);
                    System.out.println(separador2+"\n"+resultado+"\n"+separador2);
                    historial.add(new Historial(resultado));
                    break;
                case 12:
                    System.out.println("Japanese Yen =>> Dólar");
                    Base base11 = request.consultar("JPY", "USD");
                    System.out.print(mensajeValor);
                    valor = scanner.nextDouble();
                    resultado = base11.calculoDivisa(valor);
                    System.out.println(separador2+"\n"+resultado+"\n"+separador2);
                    historial.add(new Historial(resultado));
                    break;
                case 13:
                    System.out.println("=>>Historial de consultas<<=");
                    int iterar = 0;
                    System.out.println(separador2);
                    for (Historial h : historial) {
                        iterar+=1;
                        System.out.println(iterar + ") " + h + "\n" + separador2 );
                    }
                    break;
                case 14:
                    System.out.println("Gracias por usar el conversor de divisas");
                    break;
                default:
                    System.out.println("Opción incorrecta\n");
            }
        }
    }
}
