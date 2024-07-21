package org.example;

import org.example.Enums.ClosingType;
import org.example.Enums.PenType;
import org.example.pen.Pen;
import org.example.pen.penFactory.PenFactory;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        while(true){

            System.out.println("Enter choice of pen you want\n1.Ball Pen\n2.Gel Pen\n3.Fountain");
            Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    Pen pen= PenFactory.createPen(PenType.BALL);
                    System.out.println("Ball pen created");
                    System.out.println(pen);
                    break;

                case 2:
                    Pen pen2= PenFactory.createPen(PenType.GEL);
                    System.out.println("Gel pen created");
                    System.out.println(pen2);
                    break;

                case 3:
                    Pen pen3= PenFactory.createPen(PenType.FOUNTAIN);
                    System.out.println("Fountain pen created");
                    System.out.println(pen3);
                    break;
                default:
                    System.exit(0);



            }

        }
    }
}