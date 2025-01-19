![logo](src/main/resources/asset/img/logoConversor2.webp)

# Challenge Conversor de Monedas

Este es un proyecto de consola en Java que permite convertir entre diferentes monedas utilizando una API externa para obtener las tasas de cambio. El sistema también mantiene un historial de las conversiones realizadas.

### Desafío de Especialización de Java en Backend Developer

Este proyecto forma parte del desafío de especialización en Java Backend Developer, que tiene como objetivo desarrollar habilidades en la construcción de aplicaciones backend utilizando Java y APIs externas, además de trabajar con variables de entorno para mantener la seguridad en el acceso a datos sensibles como las claves de API.

## Descripción

El programa ofrece un menú interactivo donde el usuario puede seleccionar entre varias opciones para convertir entre monedas. Además, el sistema guarda el historial de conversiones y permite al usuario consultarlo.

### Monedas disponibles para conversión:

- Dólar (USD)
- Peso Argentino (ARS)
- Real Brasileño (BRL)
- Peso Colombiano (COP)
- Nuevo Sol Peruano (PEN)

## Requisitos

- Java 11 o superior.
- Una variable de entorno `API_KEY` configurada para acceder a la API de tasas de cambio.

## Instalación

1. Clona este repositorio a tu máquina local.

```bash
git clone https://github.com/CasseliLayza/Challenge_Conversor_Monedas.git
```

## Configuración

1. **Consumo API**: Configura tu apiKey directamente en el archivo `application.properties` o agregala como variable de entornno en tu IDE.

   ```properties
   java.security.apikey=${API_KEY}
   ```

### Uso

- Para ejecutar la aplicación, simplemente ejecuta el archivo ChallengeConversorMonedasApplication.java desde tu IDE o línea de comandos.

```bash
javac main/java/com/backend/challengeconversormonedas/application/ChallengeConversorMonedasApplication.java
java main.java.com.backend.challengeconversormonedas.application.ChallengeConversorMonedasApplication
```

### Menú de opciones:

1. Dólar => Peso Argentino (USD => ARS)
2. Peso Argentino => Dólar (ARS => USD)
3. Dólar => Real Brasileño (USD => BRL)
4. Real Brasileño => Dólar (BRL => USD)
5. Dólar => Peso Colombiano (USD => COP)
6. Peso Colombiano => Dólar (COP => USD)
7. Dólar => Nuevo Sol Peruano (USD => PEN)
8. Nuevo Sol Peruano => Dólar (PEN => USD)
9. Mostrar histórico de conversiones
0. Salir

### Funcionalidades

- El usuario puede elegir entre varias conversiones de monedas.
- El historial de conversiones se guarda y puede ser consultado desde el menú.
- Se utiliza una API externa para obtener las tasas de cambio en tiempo real.

### Estructura del Proyecto

```css
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

### Contribuir

- Realiza un fork de este repositorio.
- Crea tu nueva rama (git checkout -b feature/nueva-caracteristica).
- Realiza tus cambios y haz commit (git commit -am 'Añadir nueva característica').
- Haz push a tu rama (git push origin feature/nueva-caracteristica).
- Abre un pull request.

### Licencia

- Este proyecto está bajo la Licencia MIT - consulta el archivo [LICENSE](LICENSE) para más detalles.

```go

Este archivo `README.md` contiene toda la información necesaria sobre el proyecto, desde la descripción hasta los pasos para instalar, ejecutar y contribuir.

```

<div style="text-align: rigt;">
    <img src="src/main/resources/asset/img/logoConversor.webp" width="300" height="300">
</div>
