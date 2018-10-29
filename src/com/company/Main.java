package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //fórmula ax2+bx+c = 0

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor de A");
        int a= sc.nextInt();

        System.out.println("Introduce el valor de B");
        int b = sc.nextInt();

        System.out.println("Introduce el valor de C");
        int c = sc.nextInt();


        double det, x1, x2;
                det = ((b*b)-4*a*c);
        System.out.println("El determinante es" + det);
        if (det <0){
            System.out.println("No tiene solución");
        }
        else {

            x1 =((-b -Math.sqrt(det))/(2*a));

            x2 = ((-b+Math.sqrt(det))/(2*a));
            System.out.println("El resultado es" + x1);
            System.out.println("El resultado es" + x2);


        }

        sc.close();




    }
}
