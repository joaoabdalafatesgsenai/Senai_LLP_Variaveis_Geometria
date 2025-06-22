import java.util.Scanner;

public class AreaTubo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o raio externo (R): ");

        double raioExterno = input.nextDouble();

        System.out.print("Digite o raio interno (r): ");

        double raioInterno = input.nextDouble();

        System.out.print("Digite a altura do tubo (h): ");

        double altura = input.nextDouble();


        double pi = Math.PI;

        double areaLateralExterna = 2 * pi * raioExterno * altura;

        double areaLateralInterna = 2 * pi * raioInterno * altura;

        double areaTopoBase = 2 * pi * (Math.pow(raioExterno, 2) - Math.pow(raioInterno, 2));

        double areaTotal = areaLateralExterna + areaLateralInterna + areaTopoBase;

        System.out.printf("A área total do tubo é: %.2f\n", areaTotal);

        input.close();
    }
}
