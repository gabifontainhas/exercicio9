import java.util.ArrayList;

public class MediaFinal {
	ArrayList<Double> notas = new ArrayList<Double>();
	double mediaExercicios;
	
	public MediaFinal(double mediaExercicios, double... notas) {
		for (double nota : notas) 
			this.notas.add(nota);
		this.mediaExercicios = mediaExercicios;
	}
	
	public double calcularMedia() {
		double mediaFinal = this.mediaExercicios;
		int quantidadeNotas = 1;
		int pesoNota = 1;
		for (double nota : notas) {
			mediaFinal += pesoNota*nota;
			quantidadeNotas += pesoNota;
			pesoNota++;
		}
		mediaFinal /= quantidadeNotas;
		return mediaFinal;
	}
	
	public Conceitos aplicaConceito(double media) {
		if (media >= 9)
			return Conceitos.A;
		else if (media >= 7.5 && media < 9)
			return Conceitos.B;
		else if (media >= 6 && media < 7.5)
			return Conceitos.C;
		else
			return Conceitos.D;		
	}
}
