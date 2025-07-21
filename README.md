# 📱 Proyecto de Automatización Móvil con Serenity BDD + Appium + Screenplay

Automatización funcional de una app Android (`MyDemoAppRN`) utilizando Serenity BDD con el patrón Screenplay, Appium, Cucumber y lectura de datos desde Excel.

---

## 🚀 Tecnologías Usadas

- [Serenity BDD](https://serenity-bdd.info/)
- [Screenplay Pattern](https://serenity-js.org/handbook/design/screenplay-pattern/)
- [Appium](https://appium.io/)
- [Cucumber](https://cucumber.io/)
- Java 11+
- Maven
- Android Studio (para emulador)
- Apache POI (para lectura de Excel)

---

## 🧾 Estructura del Proyecto

📦src
┣ 📂main
┃ ┣ 📂java
┃ ┃ ┣ 📂tasks
┃ ┃ ┣ 📂questions
┃ ┃ ┣ 📂interactions
┃ ┃ ┣ 📂models
┃ ┃ ┣ 📂userinterfaces
┃ ┃ ┣ 📂utils
┃ ┃ ┃ 
┣ 📂test
┃ ┣ 📂java
┃ ┃ ┣ 📂runners
┃ ┃ ┣ 📂stepdefinitions
┃ ┃ ┃ 
┃ ┣ 📂resources

## ⚙️ Requisitos Previos

- Java 11 o superior
- Node.js y Appium Server instalado (`npm install -g appium`)
- Android Studio + Emulador configurado
- Habilitar modo desarrollador en tu dispositivo físico o usar AVD
- Dependencias Maven instaladas