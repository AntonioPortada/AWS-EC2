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