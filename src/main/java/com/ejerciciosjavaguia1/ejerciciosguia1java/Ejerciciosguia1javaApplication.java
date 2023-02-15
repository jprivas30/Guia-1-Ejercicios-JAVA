package com.ejerciciosjavaguia1.ejerciciosguia1java;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.JsonSerializable.Base;

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


	public static void main(String[] args){


//----------------------------Ejercicio 1 -------------------------------------
//Escriba un programa que solicite a un usuario dos números por teclado y calcule su suma, resta, producto y división

Scanner dato1 = new Scanner(System.in);
System.out.println("Ingrese primer numero en la consola");
int primerNumero= dato1.nextInt();

Scanner dato2= new Scanner(System.in);
System.out.println("Ingrese segundo numero en la consola");
int  segundoNumero= dato2.nextInt();

dato1.close();
dato2.close();

operaciones(primerNumero, segundoNumero);

//----------------------------Ejercicio 2 -------------------------------------
//Escriba un programa que permita calcular el área de un rectángulo. ¿Cómo modificaría su programa para que ahora calcule el área de un cuadrado de igual medida al ancho del rectángulo anterior?

Scanner base = new Scanner(System.in);
System.out.println("Ingrese el valor de la base del rectangulo");
int base1= base.nextInt();

Scanner altura= new Scanner(System.in);
System.out.println("Ingrese el valor de la altura del rectangulo");
int  altura1 = altura.nextInt();

areaFiguras(base1, altura1);

Scanner lado = new Scanner(System.in);
System.out.println("Ingrese el valor del lado del cuadrado");
int lado3= lado.nextInt();

base.close();
altura.close();
lado.close();

areaFiguras(lado3, lado3);

//----------------------------Ejercicio 3 -------------------------------------
//Escriba un programa que, dada una cantidad de dinero en pesos chilenos ingresada por teclado, calcule la cantidad de dólares que se pueden comprar

Scanner pesos = new Scanner(System.in);
System.out.println("Ingrese cuantos pesos posee: ");
int pesosChilenos= pesos.nextInt();

Scanner cambio = new Scanner(System.in);
System.out.println("Ingrese el valor dolar");
int valorCambio= cambio.nextInt();

pesos.close();
cambio.close();

cambioPesos(pesosChilenos,valorCambio);

//----------------------------Ejercicio 4 -------------------------------------
//Escriba un algoritmo que permita calcular la edad de una persona según su año de nacimiento

Scanner aNacimiento = new Scanner(System.in);
System.out.println("Ingrese su año de nacimiento: ");
int anioNacimiento= aNacimiento.nextInt();

Scanner aActual = new Scanner(System.in);
System.out.println("Ingrese el año actual");
int anioActual= aActual.nextInt();

aNacimiento.close();
aActual.close();


edad(anioActual,anioNacimiento);

//----------------------------Ejercicio 5 -------------------------------------
//Escriba un programa que solicite al usuario 4 notas y calcule su promedio.

Scanner primeraNota = new Scanner(System.in);
System.out.println("Ingrese nota 1: ");
float not1= primeraNota.nextFloat();

Scanner segundaNota = new Scanner(System.in);
System.out.println("Ingrese nota 2: ");
float not2= segundaNota.nextFloat();

Scanner terceraNota = new Scanner(System.in);
System.out.println("Ingrese nota 3: ");
float not3= terceraNota.nextFloat();

Scanner cuartaNota = new Scanner(System.in);
System.out.println("Ingrese nota 4: ");
float not4= cuartaNota.nextFloat();

primeraNota.close();
segundaNota.close();
terceraNota.close();
cuartaNota.close();

promedioNotas(not1,not2,not3,not4);


//----------------------------Ejercicio 6 -------------------------------------
//Escriba un programa que permita conocer el sueldo semanal de un trabajador en base a las horas que trabaja y el valor por hora ($H/H) que recibe.








}}

