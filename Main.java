package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入体重(kg)：");
        double wight=scanner.nextDouble();
        System.out.print("请输入身高(m)：");
        double hight=scanner.nextDouble();
        double bmi=wight/(hight*hight);
        //判断
        if(bmi<18.5)
            System.out.println("过轻");
        else if(bmi<25)
            System.out.println("正常");
        else if(bmi<28)
            System.out.println("过重");
        else if(bmi<32)
            System.out.println("肥胖");
        else
            System.out.println("过度肥胖");

        }
    }

