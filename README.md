# Sistema de Reporte de Incidentes

Este repositorio contiene un sistema de gestión de incidentes que permite el seguimiento y la resolución de problemas reportados por los clientes. A continuación, se detalla la estructura del sistema:

# Información del grupo
**Grupo 2**
**Comisión 05**

**Alumnos**
- **Federico Lazarte**
- **Emilio Saliba
- ** Agustin Salas


# Diagrama de Entidad-Relación (DER)

![Diagrama en blanco](https://github.com/FedericoLazarte/EmpresaIncidentes/assets/97749958/6cd637fe-a520-4177-83ce-6c52f517705a)


## Entidades Principales

1. **Cliente**: Almacena datos del cliente, como Razón Social, CUIT, etc. 
2. **Incidente**: Contiene información sobre los incidentes reportados por los clientes.
3. **Operador**: Guarda los datos del personal de mesa de ayuda.
4. **Servicio**: Detalla los servicios contratados por los clientes.
5. **Técnico**: Almacena datos de los técnicos y sus especialidades.
6. **TipoProblema**: Clasifica los problemas reportados por los clientes.
7. **Especialidad**: Representa las distintas especialidades que pueden tener los técnicos.

# Estructura de las clases de Java


![DiagramaArgPrograma](https://github.com/FedericoLazarte/EmpresaIncidentes/assets/97749958/26fe5663-9b4d-49f7-b0d0-d7779cd8a027)

## Clases Principales:
1. **Cliente**: Representa los datos de los clientes y métodos para gestionar incidentes.
2. **Especialidad**: Contiene información sobre las especialidades y métodos asociados.
3. **Incidente**: Almacena detalles de los incidentes y métodos para cambiar su estado.
4. **Operador**: Clase que representa el personal de mesa de ayuda y su interacción con los incidentes.
5. **Servicio**: Describe los servicios contratados por los clientes.
6. **Técnico**: Guarda información sobre los técnicos, incluyendo sus especialidades y preferencias.
7. **TipoProblema**: Clasifica los problemas reportados por los clientes.

## Clases para Manejar Estados:
El código sigue una estructura orientada a objetos y utiliza el patrón de diseño State para gestionar los diferentes estados de los incidentes. Cada clase representa una entidad del sistema y se organiza para facilitar la comprensión y el mantenimiento del código.

1. **Estado**: Clase abstracta base para los estados de un incidente.
2. **EstadoAbierto, EstadoEnProgreso, EstadoResuelto**: Clases concretas que representan los estados de un incidente y sus transiciones.
