# Practico1: Métodos

Realice un proyecto llamado **Practico1_Metodos**, con cuatro paquetes, *ejer1*, *ejer2*, *ejer3* y *ejer4*.

## Ejercicio 1 (La Calculadora): En el paquete **ejer1** crear:

 - Una clase llamada *Calculadora*, donde realice un programa que utilice métodos para realizar las cuatro operaciones básicas: *sumar*, *restar*, *multiplicar*, *dividir* y *modulo*. Dejo su código para completar   [aquí](src/ejer1/Calculadora.java)
 
 - Una clase llamada *Principal* . Dejo su código  [aquí](src/ejer1/Principal.java) desde donde podra descargar y ejecutar el Programa   

## Ejercicio 2 (Calculadora v2):  En el paquete **ejer2** copiar  las clases Principal y Calculadora del punto anterior.
- En la clase *Principal*, usando los métodos de la clase *Calculadora*, probarlos nuevamente pero ahora pidiéndole al usuario que ingrese los valores, mostrar el resultado en pantalla de todas las funciones. Dejo su código hecho para la suma, completar para el resto de las operaciones.  [aquí](src/ejer2/Principal.java)
 	
## Ejercicio 3 (Procesos):  En el paquete **ejer3** crear:
#### - Una clase llamada *Procesos*, con los siguiente métodos:

• Función **parImpar**: recibe un entero  y determine si es par o impar devolviendo un boolean

• Función  **mayorDeTres**: recibe tres enteros y devuelva el mayor de ellos

• Procedimiento  **esMayorEdad**: recibe una edad, si es mayor de 18 dirá "mayor de edad" sino dirá "menor de edad"

 Deberá investigar en la API de Java u otro sitio web acerca de los métodos de la clase String.


#### - Una clase llamada *Principal*:
Para probar los tres métodos realizados, en todos los casos debe pedir al usuario que ingrese los parámetros necesarios.


## Ejercicio 4 (Contador por edad):   En el paquete **ejer4** crear:
#### - Una clase llamada *Programa*, donde realice tres métodos:
•	El metodo *ingresarEdades*:  ingresoEdades(a) recibe la cantidad total de edades que serán leídas, luego dentro del método deberá  leer y guardar en el array edades [] las mismas. Observar que edades es una array que está declarado en la clase Programa, pero se crea o define en éste método (o sea es accesible a todos los métodos de dicha clase).

•	El metodo  *contar*: determine cuántas personas son menores, cuántas son mayores de edad y cuántas son adultos mayores. Tener en cuenta que: Mayor de edad tiene 18 años o más y un adulto mayor tiene más de 60  años de edad.
Observar que éste método va a tener que recorrer el array e ir contando cuántos son menores, mayores o adultosMayores, dichos datos quedarán en las variables globales creadas para tal fin.
•	El metodo  mostrar: mostrará los valores calculados por el método contar o sea mostrará el valor de las *variables globales* menores, mayores y adultosMayores


  Dejo su código para completar   [aquí](src/ejer4/Programa.java)
  #### - Una clase llamada *Principal*. 
  En la clase Principal debes solicitar al usuario cuántas edades se van a ingresar. Este dato es el parámetro que recibirá el método *ingresoEdades*.
  Dejo su código  [aquí](src/ejer4/Principal.java) desde donde podra descargar y ejecutar el Programa 



