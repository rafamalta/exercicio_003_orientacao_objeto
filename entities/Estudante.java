package entities;

public class Estudante {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;

	public double notaFinal() {
		return (nota1 + nota2 + nota3);
	}
	
	public double pontosFaltando() {
		if (notaFinal() < 60.00) {
		return (60.00 - notaFinal());
		}
		else {		
			return 0.00;
			}	
	}
	
	public String toString() {
		return "Nota final = " + String.format("%.2f", notaFinal());
	}			
	
}
