import java.text.DecimalFormat;
import java.util.Scanner;

// Faça um algoritmo para ler as 3 notas + média dos exercícios. calcular a média usando a fórmula e escrever a nota em letra.

public class Aplicacao {
	public static void main (String args[]) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Informe a primeira nota: ");
			double nota1 = Double.valueOf(scanner.next());
			System.out.print("Informe a segunda nota: ");
			double nota2 = Double.valueOf(scanner.next());
			System.out.print("Informe a terceira nota: ");
			double nota3 = Double.valueOf(scanner.next());
			System.out.print("Informe a quarta nota: ");
			double nota4 = Double.valueOf(scanner.next());
			System.out.print("Informe a média de exercícios: ");
			double mediaExercicios = Double.valueOf(scanner.next());
			MediaFinal media = new MediaFinal(mediaExercicios, nota1, nota2, nota3, nota4);
			System.out.println("Sua média final é: " + new DecimalFormat("0.00").format(media.calcularMedia()));
			System.out.println("Seu conceito é: " + media.aplicaConceito(media.calcularMedia()));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
