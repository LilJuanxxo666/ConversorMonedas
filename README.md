﻿# ConversorMonedas

Este proyecto es una aplicación en Java que permite realizar conversiones entre distintas divisas del mundo. Utiliza una API de exchange para obtener los valores actuales de las tasas de cambio y ofrece una interfaz interactiva para los usuarios a través de un menú. Además, la aplicación guarda un historial de consultas con la fecha y hora de cada conversión realizada.

## Características

- **Conversiones entre divisas**: Convierte entre monedas como dólar, peso argentino, real brasileño, peso colombiano, peso mexicano, euro y yen japonés.
- **Historial de consultas**: Guarda un registro detallado de las conversiones realizadas, incluyendo la fecha y hora exacta.
- **Interfaz de usuario interactiva**: Un menú intuitivo permite al usuario seleccionar la conversión deseada y visualizar el resultado.

## Tecnologías utilizadas

- **Java**: Lenguaje principal para el desarrollo de la aplicación.
- **API de exchange**: https://www.exchangerate-api.com/docs/java-currency-api (Fuente de datos para las tasas de cambio actuales).
- **Gson**: Biblioteca para manejar la conversión de datos JSON a objetos Java.

## Estructura del proyecto

El proyecto está dividido en los siguientes módulos:

1. **Base**: Contiene setters y getters comunes, con el nombre de la divisa y el valor actual en el mercado.
2. **Divisa**: Maneja la lista de las bases a converitr, por ejemplo USD a COP, junto con el nombre base de la divisa en específica consultada en la API, también se encarga con una funcionalidad de convertir la divisa base a la divisa que se quiere calcular.
3. **Historial**: Se encarga de almacenar y gestionar el registro de consultas realizadas, con fecha y hora del momento exacto.
4. **Request**: Implementa el cliente para interactuar con la API de exchange, incluyendo el manejo de solicitudes y la deserialización de respuestas con Gson para instanciar en la clase Divisa.

## Menú de la aplicación

El menú interactivo ofrece las siguientes opciones:

```text
1) Dólar =>> Peso Argentino
2) Peso argentino =>> Dólar
3) Dólar =>> Real brasileño
4) Real brasileño =>> Dólar
5) Dólar =>> Peso colombiano
6) Peso colombiano =>> Dólar
7) Dólar =>> Peso mexicano
8) Peso mexicano =>> Dólar
9) Dólar =>> Euro
10) Euro =>> Dólar
11) Dólar =>> Japanese Yen
12) Japanese Yen =>> Dólar
13) Historial de consultas
14) Salir
```

## Ejemplo de uso

1. El usuario inicia la aplicación y selecciona una opción del menú.
2. La aplicación solicita los datos de la API de exchange para obtener la tasa de cambio actual.
3. Realiza la conversión y muestra el resultado al usuario.
4. La conversión se guarda en el historial con la fecha y hora exacta.

## Requisitos

- Java 8 o superior.
- Conexión a Internet para interactuar con la API de exchange.

## Configuración

1. Clona este repositorio:

   ```bash
   git clone https://github.com/tu-usuario/currency-converter.git
   ```

2. Importa el proyecto en tu IDE favorito.
3. Configura las dependencias necesarias, como Gson, en tu archivo `pom.xml` (si usas Maven), `build.gradle` (si usas Gradle) o de manera manual en la estructura del proyecto.
4. Asegurar de tener acceso a la API de exchange, confirmando el correo y configura la URL en el módulo de **Request**.

## Autor

Desarrollado por Juan Fernando Guzmán (LilJuanxxo666).

## Licenciado

Idea principal de Alura Latam en el desarrollo de un challenge

