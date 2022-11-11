package unico;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		/*Escribe un programa que nos diga el 
		 * horóscopo a partir del día y el mes de nacimiento.*/

		Scanner leer = new Scanner (System.in);
		
		int mes;
		int dia;
		String horoscopo = null;
		
		System.out.println("A continuación introduzca su fecha de nacimiento");
		
		
		System.out.println("Mes");
		mes = leer.nextInt();
		
		System.out.println("Día");
		dia = leer.nextInt();
		
		switch(mes) {
	      case 1:
	        if (dia < 21) {
	          horoscopo = "capricornio";
	        } 
	        else {
	          horoscopo = "acuario";
	        }
	        break;
	      case 2:
	        if (dia < 20) {
	          horoscopo = "acuario";
	        } 
	        else {
	          horoscopo = "piscis";
	        }
	        break;
	      case 3:
	        if (dia < 21) {
	          horoscopo = "piscis";
	        } 
	        else {
	          horoscopo = "aries";
	        }
	        break;
	      case 4:
	        if (dia < 21) {
	          horoscopo = "aries";
	        } 
	        else {
	          horoscopo = "tauro";
	        }
	        break;
	      case 5:
	        if (dia < 20) {
	          horoscopo = "tauro";
	        } 
	        else {
	          horoscopo = "géminis";
	        }
	        break;
	      case 6:
	        if (dia < 22) {
	          horoscopo = "géminis";
	        } 
	        else {
	          horoscopo = "cáncer";
	        }
	        break;
	      case 7:
	        if (dia < 22) {
	          horoscopo = "cáncer";
	        } 
	        else {
	          horoscopo = "Leo";
	        }
	        break;
	      case 8:
	        if (dia < 24) {
	          horoscopo = "leo";
	        } 
	        else {
	          horoscopo = "virgo";
	        }
	        break;
	      case 9:
	        if (dia < 23) {
	          horoscopo = "virgo";
	        } 
	        else {
	          horoscopo = "libra";
	        }
	        break;
	      case 10:
	        if (dia < 23) {
	          horoscopo = "libra";
	        } 
	        else {
	          horoscopo = "escorpio";
	        }
	        break;
	      case 11:
	        if (dia < 23) {
	          horoscopo = "escorpio";
	        } 
	        else {
	          horoscopo = "sagitario";
	        }
	        break;
	      case 12:
	        if (dia < 21) {
	          horoscopo = "sagitario";
	        } 
	        else {
	          horoscopo = "capricornio";
	        }
	        break;
	    }
	        
	        System.out.println("Su horoscopo es " + horoscopo);
	  }
}

