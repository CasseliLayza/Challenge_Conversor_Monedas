![logo](src/main/resources/asset/img/logoConversor2.webp)

# Challenge Conversor de Monedas

Este es un proyecto de consola en Java que permite convertir entre diferentes monedas utilizando una API externa para obtener las tasas de cambio. El sistema también mantiene un historial de las conversiones realizadas.

### Desafío de Especialización de Java en Backend Developer

Este proyecto forma parte del desafío de especialización en Java Backend Developer, que tiene como objetivo desarrollar habilidades en la construcción de aplicaciones backend utilizando Java y APIs externas, además de trabajar con variables de entorno para mantener la seguridad en el acceso a datos sensibles como las claves de API.

## Descripción

El programa ofrece un menú interactivo donde el usuario puede seleccionar entre varias opciones para convertir entre monedas. Además, el sistema **_Guarda/Exporta_** el historial de conversiones por _fecha_ y permite al usuario consultarlo.

### Funcionalidades Principales;

- El usuario puede elegir entre varias conversiones de monedas.
- El historial de conversiones se guarda y puede ser consultado desde el menú.
- Se utiliza una API externa para obtener las tasas de cambio en tiempo real.
- Gestión de configuraciones mediante un archivo `application.properties`.
- Registro histórico de conversiones en un archivo `JSON`.

### Monedas disponibles para conversión:

- Dólar (USD)
- Peso Argentino (ARS)
- Real Brasileño (BRL)
- Peso Colombiano (COP)
- Nuevo Sol Peruano (PEN)

### Requisitos

- Java 11 o superior.
- Conexión a internet para consumir el API ExchangeRate-API.
- Una variable de entorno `API_KEY` configurada para acceder a la API de tasas de cambio.

## Instalación

1. Clona este repositorio a tu máquina local.

```bash
git clone https://github.com/CasseliLayza/Challenge_Conversor_Monedas.git
```

## Configuración

1. **Consumo API**: Configura tu 'apiKey' directamente en el archivo `application.properties` o agregala como variable de entornno en tu IDE.

   ```properties
   java.security.apikey=${API_KEY}
   ```

## Uso

- Para ejecutar la aplicación, simplemente ejecuta el archivo ChallengeConversorMonedasApplication.java desde tu IDE o línea de comandos.

```bash
javac main/java/com/backend/challengeconversormonedas/application/ChallengeConversorMonedasApplication.java
java main.java.com.backend.challengeconversormonedas.application.ChallengeConversorMonedasApplication
```

### Menú de opciones:

```css
*****************************************************
Sea bienbenido/a al Conversor de Monedas =]

1) Dolar =>> Peso Argentino
2) Peso Argentino =>> Dolar
3) Dolar =>> Real Brasileño
4) Real Brasileño =>> Dolar
5) Dolar =>> Peso Colombiano
6) Peso Colombiano =>> Dolar
7) Dolar =>> NuevoSol Peruano
8) NuevoSol Peruano =>> Dolar

9) Mostrar historico de conversiones
0) salir
=>> Elija una opcion valida

*****************************************************
```

## Estructura del Proyecto

```javascript
├── src
│   └── main
│       ├── java
│       │   └── com
│       │       └── backend
│       │           └── challengeconversormonedas
│       │               ├── application
│       │               │   ├── **ChallengeConversorMonedasApplication.java**
│       │               ├── config
│       │               │   └── ConfigLoader.java
│       │               ├── entity
│       │               │   ├── ExchangeRate.java
│       │               │   └── ExchangeRateEX.java
│       │               ├── exception
│       │               │   ├── FailLoadConfigurationException.java
│       │               │   ├── FailRequestException.java
│       │               │   └── FileSaveException.java
│       │               ├── external
│       │               │   └── RequestCurrencyConverter.java
│       │               ├── service
│       │               │   ├── GeneratorHistoryFile.java
│       │               │   └── GeneratorConversionHistory.java
│       │               └── storage
│       │                   └── ConversionsHistory.json
│       └── resources
│           ├── application.properties
│           └── assets
│               └── img
├── README.md

```

### Descripción de carpetas y archivos

1.  _application_: Contiene la clase principal que inicia la aplicación.

        ChallengeConversorMonedasApplication.java: Clase principal que ejecuta el menú interactivo.

2.  _config_: Carga las configuraciones del archivo application.properties.

             ConfigLoader.java: Carga las propiedades y variables de entorno.

3.  _entity_: Define las clases para modelar las entidades relacionadas con las conversiones.

        ExchangeRate.java: Modelo de tasa de cambio.
        ExchangeRateEX.java: Modelo extendido con resultados de conversión.

4.  _exception_: Maneja excepciones personalizadas.

            FailLoadConfigurationException.java: Error al cargar configuraciones.
            FailRequestException.java: Error en la solicitud externa.
            FileSaveException.java: Error al guardar el archivo de historial.

5.  _external_: Lógica para consumir el API externo.

            RequestCurrencyConverter.java: Realiza solicitudes al API de ExchangeRate.

6.  _service_: Servicios para manejar lógica de negocio y archivos.

        GeneratorConversionHistory.java: Gestiona el historial de conversiones en memoria.
        GeneratorHistoryFile.java: Guarda el historial en un archivo JSON.

7.  _storage_: Almacena archivos persistentes.

        ConversionsHistory.json: Archivo con el historial de conversiones.

8.  _resources_: Almacena configuraciones y recursos estáticos.

        application.properties: Configuración de la aplicación.

9.  _assets/img_: Almacena imágenes para la documentación y branding.

## Contribuir

- Realiza un fork de este repositorio.
- Crea tu nueva rama (git checkout -b feature/nueva-caracteristica).
- Realiza tus cambios y haz commit (git commit -am 'Añadir nueva característica').
- Haz push a tu rama (git push origin feature/nueva-caracteristica).
- Abre un pull request.

## Licencia

- Licencia MIT

  ```markdown
  Este proyecto está licenciado bajo la Licencia MIT.  
  Consulta el archivo LICENSE para más detalles.
  ```

- Licencia [LICENSE](LICENSE)

## Créditos

- Desarrollado como parte del desafío de especialización **Java Backend Developer** by [**Caseli Layza**](mailto:casseli.layza@gmail.com).
  Inspirado en la necesidad de manejar conversiones de monedas y registrar un historial de las mismas.

- 📧 **Correo:** [Caseli Layza](mailto:casseli.layza@gmail.com)

  ```go
    Este archivo `README.md` contiene toda la información necesaria sobre el proyecto, desde la descripción hasta los pasos para instalar, ejecutar y contribuir.
  ```

  _**¡Gracias por revisar este proyecto!... Powered by Casse 💖💚🔥💪😊...!!**_

### Derechos Reservados

- Sobre los derechos reservados si es aplicable.

  ```markdown
  © 2024 Casseli L CodeCloudNet. Todos los derechos reservados.  
  Este proyecto está protegido por las leyes de derechos de autor y no puede ser reproducido, distribuido ni utilizado sin autorización previa.
  ```

<div style="text-align: rigt;">
    <img src="src/main/resources/asset/img/logoConversor.webp" width="300" height="300">
</div>
