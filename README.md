# AWS-EC2
Repo para documentar prácticas en EC2

Pasos para crear un servidor con el servicio EC2 de AWS, desde crearlo en la plataforma hasta tenerlo corriendo y permitiendo conexiones. Conocimientos básicos de AWS.

## Pasos:

### 1.- Crear el servidor
- Una vez en la consola de AWS buscamos el servicio EC2 y creamos la instancia básica para la práctica.

### 2.- Conectarnos por ssh
- En el proceso de creación de la instancia nos muestra la opción para crear el .pem y poder conectarnos desde ssh, `el mismo AWS recomienda cambiarle los permisos para evitar problemas futuros`.

```bash
chmod 400 archivo.pem 
```

- Necesitas un cliente para conectarte por ssh (en Windows si tienes git bash ya la hiciste).
    - En los detalles de la instacia busca la "Public address".

```
ssh -i archivo.pem ubuntu@PUBLIC_ADDRESS
```

- Instalamos git y el jdk de java (de preferencia la última versión)
    - No olvides actualizar los paquetes de tu servidor antes de instalar.

```bash
apt-get update
```

```bash
apt install git openjdk-21-jdk -y
```

- Ya que solo será prueba, subiré un proyecto ejecutando el jar sin instalar tomcat para ahorrar tiempo.

Y servidor listo para trabajar.


### 3.- Desplegar Back
- Crear un proyecto java desde la [url](https://start.spring.io) dependiendo a la versión que instalaste.

- Agrega ese proyecto al repositorio y clonalo en el servidor.

- Ejecutalo para validar que si funciona y realiza peticiones.

```bash
java -jar nombre.jar
```

### 4.- Agregar un balanceador de carga
- Antes de crear el balanceador es necesario crear un "Target Groups", dónde se agregan las instancias (en el caso de EC2) que se quieren balancear. Agregando los puertos necesarios a los servicios.

- Una vez creado el grupo, se crea el balanceador, asignando puertos de entrada a él para repartir el flujo, con las configuraciones de puertos realizadas en el grupo, solo se asigna ese grupo y listo.


# Extra/Tips

- Ya que son prácticas y ejercicios, para evitar cargos por las instancias, crea una IMA (AMI en inglés), para tener una copia muy muy barata del software y configuraciones realizadas al servidor, después creas una instancia nueva con la IMA y a seguir jugando y practicando.

- También se pueden crear snapshots para tener un respaldo y recurrir a ellos para rollback.

- Parece los mismo una IMA que un Snapshot, qué tienen de diferente?
    - La IMA es una copia de la instancia completa, lista para ser usada en una nueva instancia.
    - Mientras que un Snapshot es un back del disco, quieres restaurar archivos, usa el snapshot de ayer u hoy en la mañana.
    - IMA sería o es más usado para respaldar cambios grandes en el servidor, actualización de kernel, nuevos programas, configuraciones. Y un Snapshot para respaldar la información de ciertas carpetas importantes, archivos, etc...
    - Otra cosa importante, los snapshot necesitan una instancia (servidor) existente, mientras que IMA puede crear una instancia.