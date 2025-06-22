import java.util.Scanner;

public class AreaCaixa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a largura da caixa: ");
        double largura = input.nextDouble();

        System.out.print("Digite a altura da caixa: ");
        double altura = input.nextDouble();

        System.out.print("Digite a profundidade da caixa: ");
        double profundidade = input.nextDouble();

        double area = 2 * (largura * altura + largura * profundidade + altura * profundidade);

        System.out.println("A área total da caixa é: " + area);

        input.close();
    }
}