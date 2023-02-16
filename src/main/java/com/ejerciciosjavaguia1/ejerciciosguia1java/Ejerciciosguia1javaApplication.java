package com.ejerciciosjavaguia1.ejerciciosguia1java;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Ejerciciosguia1javaApplication {

//----------------------------Ejercicio 1 -------------------------------------
//---------------------------Funcion Ejercicio 1 ------------------------------

public static void operaciones(int num1 , int num2){
	int suma= num1+num2;
	int resta=num1-num2;
	int multiplicacion=num1*num2;
	int division= num1/num2;
	System.out.println("El resultado de la suma es: " + suma);
	System.out.println("El resultado de la resta es: " + resta);
	System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
	System.out.println("El resultado de la division es: " + division);
	
}

//----------------------------Ejercicio 2 -------------------------------------
//---------------------------Funcion Ejercicio 2 ------------------------------


public static void areaFiguras(int lado1, int lado2 ){
	int figura = lado1 * lado2;
	System.out.println("El valor del area es: " + figura + " m2");
}

//----------------------------Ejercicio 3 -------------------------------------
//---------------------------Funcion Ejercicio 3 ------------------------------

public static void cambioPesos(float montoPesos, float valorDolar){
	float dolares= montoPesos/ valorDolar;
	System.out.println("La cantidad de dolares que puedo comprar es de" + dolares + "$");
}

//----------------------------Ejercicio 4 -------------------------------------
//---------------------------Funcion Ejercicio 4 ------------------------------

public static void edad(int anioAc, int anioNac){
	int suEdad= anioAc-anioNac;
	System.out.println("Su edad es: " + suEdad + " años");
}

//----------------------------Ejercicio 5 -------------------------------------
//---------------------------Funcion Ejercicio 5 ------------------------------

public static void promedioNotas(float nota1, float nota2, float nota3, float nota4){
	float promedio= (nota1+nota2+nota3+nota4)/4;
	System.out.println("El promedio de notas es igual a : " + promedio);
}

//----------------------------Ejercicio 6 -------------------------------------
//---------------------------Funcion Ejercicio 6 ------------------------------

public static void sueldoSemanal(int valorHora, int cantidadHoras){
	int sueldo= valorHora * cantidadHoras;
	System.out.println("El valor a cobrar a la semana por trabajar "+ cantidadHoras + "horas es igual a : $" + sueldo);
}

//----------------------------Ejercicio 7 -------------------------------------
//---------------------------Funcion Ejercicio 7 ------------------------------

public static void valorPintor (int mts, int costo){
    int presupuesto = mts * costo;
    System.out.println("El valor por pintar "+ mts + " m2 es de $"+ presupuesto);
}

//----------------------------Ejercicio 8 -------------------------------------
//---------------------------Funcion Ejercicio 8 ------------------------------

public static void valorLLamada(float min, float seg, float valor){
	float minutos= min;
	float segundos= seg/60;
	float tiempo= (minutos+segundos);
	float costo=tiempo*valor; 
	System.out.print("La duracion de la llamada es: "+ minutos + " min " + seg + " seg ");
	System.out.print("El costo de la llamada es: $"+ costo);
	System.out.print("El valor del segundo es: $"+ valor/(tiempo*60));

}

//----------------------------Ejercicio 9 -------------------------------------
//---------------------------Funcion Ejercicio 9 ------------------------------

	public static void main(String[] args){



//----------------------------Ejercicio 1 -------------------------------------
//Escriba un programa que solicite a un usuario dos números por teclado y calcule su suma, resta, producto y división

/*Scanner datos = new Scanner(System.in);

System.out.println("Ingrese primer numero en la consola");
int primerNumero= datos.nextInt();
System.out.println("Ingrese segundo numero en la consola");
int  segundoNumero= datos.nextInt();

datos.close();

operaciones(primerNumero, segundoNumero);*/


//----------------------------Ejercicio 2 -------------------------------------
//Escriba un programa que permita calcular el área de un rectángulo. ¿Cómo modificaría su programa para que ahora calcule el área de un cuadrado de igual medida al ancho del rectángulo anterior?

/*Scanner medidas = new Scanner(System.in);
System.out.println("Ingrese el valor de la base del rectangulo");
int base1= medidas.nextInt();

System.out.println("Ingrese el valor de la altura del rectangulo");
int  altura1 = medidas.nextInt();

areaFiguras(base1, altura1);

System.out.println("Ingrese el valor del lado del cuadrado");
int lado3= medidas.nextInt();

medidas.close();

areaFiguras(lado3, lado3);*/


//----------------------------Ejercicio 3 -------------------------------------
//Escriba un programa que, dada una cantidad de dinero en pesos chilenos ingresada por teclado, calcule la cantidad de dólares que se pueden comprar

/*Scanner montos = new Scanner(System.in);

System.out.println("Ingrese cuantos pesos posee: ");
int pesosChilenos=montos.nextInt();

System.out.println("Ingrese el valor dolar");
int valorCambio= montos.nextInt();

montos.close();

cambioPesos(pesosChilenos,valorCambio);*/


//----------------------------Ejercicio 4 -------------------------------------
//Escriba un algoritmo que permita calcular la edad de una persona según su año de nacimiento

/*Scanner aNios = new Scanner(System.in);

System.out.println("Ingrese su año de nacimiento: ");
int anioNacimiento= aNios.nextInt();

System.out.println("Ingrese el año actual");
int anioActual= aNios.nextInt();

aNios.close();

edad(anioActual,anioNacimiento);*/


//----------------------------Ejercicio 5 -------------------------------------
//Escriba un programa que solicite al usuario 4 notas y calcule su promedio.

/*Scanner notas = new Scanner(System.in);

System.out.print("Ingrese nota 1: ");
float not1= notas.nextFloat();

System.out.print("Ingrese nota 2: ");
float not2= notas.nextFloat();

System.out.print("Ingrese nota 3: ");
float not3= notas.nextFloat();

System.out.print("Ingrese nota 4: ");
float not4= notas.nextFloat();

notas.close();

promedioNotas(not1,not2,not3,not4);*/


//----------------------------Ejercicio 6 -------------------------------------
//Escriba un programa que permita conocer el sueldo semanal de un trabajador en base a las horas que trabaja y el valor por hora ($H/H) que recibe.

/*Scanner datos = new Scanner(System.in);
System.out.print("Ingrese valor de Hora: ");
int horas= datos.nextInt();
System.out.print("Ingrese cantidad de horas: ");
int valor= datos.nextInt();

datos.close();

sueldoSemanal(horas, valor);*/

//----------------------------Ejercicio 7 -------------------------------------
//. Escriba un programa que permita determinar cuánto cobra un pintor por pintar una cantidad dada de metros cuadrados, a partir del costo ingresado por el usuario

/*Scanner datos = new Scanner(System.in);
System.out.print("Ingresa numero de m2: ");
int metrosPintura= datos.nextInt();
System.out.print("Ingresa el monto por m2: ");
int montoCobrado= datos.nextInt();

datos.close();
valorPintor(metrosPintura,montoCobrado);*/

//----------------------------Ejercicio 8 -------------------------------------
//Escriba un programa que permita determinar cuánto cobra un pintor por pintar una cantidad dada de metros cuadrados, a partir del costo ingresado por el usuario.

/*Scanner teclado = new Scanner(System.in);
System.out.print("Ingresa los minutos ultilizados: ");
float minutos= teclado.nextFloat();
System.out.print("Ingresa los segundos ultilizados: ");
float segundos= teclado.nextFloat();
System.out.print("Ingresa valor del minuto: ");
float valorMinuto= teclado.nextInt();

teclado.close();

valorLLamada( minutos, segundos, valorMinuto);*/


//----------------------------Ejercicio 9 -------------------------------------
//Escriba un algoritmo que permita para determinar cuánto pagará finalmente una persona por un artículo, considerando que tiene un descuento de 20%, y debe pagar 15% de IVA






}}

