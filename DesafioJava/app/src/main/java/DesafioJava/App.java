package DesafioJava;

import java.util.Scanner;

public class App {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        double salario, beneficio, imposto, resultado;
        
        System.out.println("Digite o valor do salário: ");
        salario = leitor.nextDouble();

        System.out.println("Digite o valor do benefício: ");
        beneficio = leitor.nextDouble();
        
        
        if (salario >= 0 && salario <= 1100) {
            imposto = 0.05 * salario;
        } else if (salario >= 1100.01 && salario <= 2500.00) {
            imposto = 0.1 * salario;
        } else {
            imposto = 0.15 * salario;
        }
        
        resultado = (salario - imposto) + beneficio;
        System.out.println(String.format("%.2f", resultado));
    }
}
