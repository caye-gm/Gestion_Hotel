# Proyecto Fin de 1ºDAM
Proyecto final 1ºDAM

Realizado por Cayetano García

Este proyecto realizado en Spring Boot 

El administrador por su parte se encargará de la gestión de usuarios,reservas,habitaciones y actividades
Los usuarios podran realizar reservas y apuntarse a actividades


## **Estado del proyecto**
---------------------------
El proyecto aún esta en fase de desarrollo , el diseño esta completo las funcionalidades al 80%

### **Tareas pendiente:**
-crear la linea de reserva la cual asocia con la reserva una habitacion y precio final

### **Fallos a arreglar:**
-Asociacion muchos a muchos entre usuario y actividades , al guardar la actividad con el usuario lo  hace correctamente , 
pero cuando el usuario quiere quitar la actividad , en su lista se borra y en la de actividad pero en la base de datos sigue
quedando reflejado .


### **Cosas a mejorar del proyecto:**

-Por tema de tiempo y desconocimiento al desarrollar la plantilla , pudiera ver usado listas las cuales serian mucho mas 
practicas , evitaria tantos formularios realizandolo de manera mas estetica y sobre una misma lista realizar los nuevos 
objetos(usuarios,habitaciones,actividaades...).


## **Datos**

 
### **Usuario**
---------------------------
    user: usuario
    password: 1234
  

### **Administrador**
---------------------------
    user: admin
    password: admin

Recomendaciones de ejecucion entrar con administrador testear todo el administrador añadiendo actividades de la plantilla a actividades para los usuarios
, para que el usuario cuando entre tenga disponible una lista de actividades la cual apuntarse.


