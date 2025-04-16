package br.com.func_modular;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        try (var funcMode = new Scanner(System.in)) {
            var formatDoubleWithInteger = new DecimalFormat("");

            title("A");
            double a = funcMode.nextInt();

            title("B");
            double b = funcMode.nextInt();

            if (a == (int) a) {
                throw new Exception("Os valores digitados são inteiros.");
            }

            double valueA = calcularModulo(a);
            double valueB = calcularModulo(b);

            System.out.println(formatDoubleWithInteger.format(valueA));
            System.out.println(formatDoubleWithInteger.format(valueB));
        }
    }

    private static double calcularModulo(double valor) {
        return Math.abs(valor);
    }

    private static void title(String title) {
        System.out.println("Digite o valor de " + title + ": ");
    }
}