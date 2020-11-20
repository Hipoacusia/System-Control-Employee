import java.util.Scanner;

public class SystemControl{
	 public static void main(String arg[]){

		  Scanner output = new Scanner(System.in);
		  String name = "";
		  int key = 0, old = 0;
		  
		  System.out.println("********************************************************");
		  System.out.println("*Bienvenido al sistema vacacional de Hipoacusia-Company*");
		  System.out.println("********************************************************");
		  System.out.println("");
		  System.out.println("");

		  System.out.print("¿Cual es el nombre del trabajador? ");
		  name = output.nextLine();
		  System.out.println("");

		  System.out.print("¿Cuanto tiempo de servicio tiene el trabajador? ");
		  old = output.nextInt();
		  System.out.println("");

		  System.out.print("¿Cual es la clave del trabajador? ");
		  key = output.nextInt();
		  System.out.println("");


		  //clave 1 Empleado normal 
		  if(key == 1){
			 
			 if(old == 1){
				  System.out.println("El trabajador " + name + "tiene derecho a 6 dias de vacaciones ");
			 } else if (old >= 2 && old <= 6){
				  System.out.println("El trabajador " + name + "tiene derecho a 14 dias de vacaciones ");
			 }else if (old >= 7){
				  System.out.println("El trabajador " + name + "tiene derecho a 20 dias de vanaciones ");
			 }

			 //clave 2 Empleado administrativo 
		  } else if (key == 2){

			  if(old == 1){
				  System.out.println("El trabajador " + name + "tiene derecho a 7 dias de vacaciones ");
			 } else if (old >= 2 && old <= 6){
				  System.out.println("El trabajador " + name + "tiene derecho a 15 dias de vacaciones ");
			 }else if (old >= 7){
				  System.out.println("El trabajador " + name + "tiene derecho a 22 dias de vanaciones ");
			 }

			 //clave 3 Empleado Gerencia 
		  } else if (key == 3){

		     if(old == 1){
				  System.out.println("El trabajador " + name + "tiene derecho a 10 dias de vacaciones ");
			 } else if (old >= 2 && old <= 6){
				  System.out.println("El trabajador " + name + "tiene derecho a 20 dias de vacaciones ");
			 }else if (old >= 7){
				  System.out.println("El trabajador " + name + "tiene derecho a 30 dias de vanaciones ");
			 }

			 //Sale de las condicionales
		  } else{

			 System.out.println("La clave del apartamento es incorrecta ");
		  }

	 }
}
