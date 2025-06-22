import java.util.Scanner;

public class AreaPiramide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o lado da base da pirâmide (L): ");
        double lado = input.nextDouble();

        System.out.print("Digite a altura lateral (h): ");

        double alturaLateral = input.nextDouble();

        double areaBase = lado * lado;

        double areaLateral = 2 * lado * alturaLateral;

        double areaTotal = areaBase + areaLateral;

        System.out.println("A área total da pirâmide é: " + areaTotal);

        input.close();
    }
}