package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int hora;

	System.out.println("Quantas horas? \n");
    hora = sc.nextInt();

    if (hora <= 12){
       System.out.println("Bom dia, Alexandra! \n");
    }

    else  if (hora > 12 && hora <= 18) {
        System.out.println("Boa tarde, Alexandra! \n");
    }
    else {
        System.out.println("Boa noite, Alexandra! \n");
    }


        sc.close();
    }


    }

