package br.com.func_modular;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (var funcMode = new Scanner(System.in)) {
            var formatDoubleWithInteger = new DecimalFormat("#");

            System.out.println("Digite o valor de A: ");
            double a = funcMode.nextInt();

            System.out.println("Digite o valor de B: ");
            double b = funcMode.nextInt();

            double valueA = Math.abs(a);
            double valueB = Math.abs(b);

            System.out.println(formatDoubleWithInteger.format(valueA));
            System.out.println(formatDoubleWithInteger.format(valueB));
        }
    }

    public class CalculadoraModular {
        public static double calcularModulo(double valor) {
            return Math.abs(valor);
        }
    }
}