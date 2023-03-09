### `Reto De Automatización de pruebas Web`

#### Descripción

Proyecto de Automatización de la plataforma Libreria Nacional JAVA y Serenity BDD

#### Feature: Validate that through a created account the purchase of books is made on the National Library platform

> **As** a user of the platform

> **I** want to register on the platform of the national bookstore

> **To** be able to shop online

#
#### Feature: Validate the content of multiple windows
> **As** an automator

> **I** want to open multiple windows

> **To** verify their content

#### Características del Proyecto

En la construcción del proyecto de automatizacion web en la plataforma Herokuapp se implementa:

- Patrón de diseño de Screemplay.
- Framework SerenityBDD.
- Gestor de paquetes Gradle.
- Desarrollado en java en su versión 11

#### Versionado

| Repository       | Version |
|------------------|---------|
| Serenity         | 3.3.4   |
| SerenityCucumber | 3.3.4   |
| SerenityEnsure   | 3.2.5   |
| Slf4jSimple      | 1.7.36  |
| Junit            | 4.13.2  |

#### Precondiciones

- [x] 1: Instar Java en su versión 11.
- [x] 1.1: Configurar variable de entorno JAVA_HOME
- [x] 2: Instar Gradle en su versión 7.2
- [x] 2.1: Configurar variable de entorno GRADLE_HOME
- [x] 3: Se debe cambiar la data en especialmente el campo del correo electronico
         ya que este campo no se puede repetir en cada flujo


#### Ejecución del proyecto

Para la ejecución del proyecto se debe implementar el siguiente comando en el terminal en el directorio raíz del proyecto:
- si tienes gradle instalado y configurado puedes ejecutar el siguiente comando:
```sh
gradle clean test '-Dwebdriver.driver=chrome'
```
- si no tienes gradle o la version correspondiente ejecuta el siguiente comando:
```sh
./gradlew clean test '-Dwebdriver.driver=chrome'
```
- Si deseas usar edge cambie el valor del siguiente parametro:
```sh
'-Dwebdriver.driver=edge'
```

