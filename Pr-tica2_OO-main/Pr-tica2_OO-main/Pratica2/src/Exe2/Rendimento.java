package Exe2;


public class Rendimento {
	
	private double investimentoInicial;
	private double taxaRendimento;
	private int numeroMeses;
	private double rendimentoFinal;
	
	
	public Rendimento(double investimentoInicial, double taxaRendimento, int numeroMeses) {
		this.investimentoInicial = investimentoInicial;
		this.taxaRendimento = taxaRendimento;
		this.numeroMeses = numeroMeses;
	}
	
	public void Montante(){
		taxaRendimento = taxaRendimento/100;
		for(double i = 1; i <= numeroMeses; i++){
			rendimentoFinal = investimentoInicial * Math.pow(1 + taxaRendimento,i);
			System.out.println(rendimentoFinal);
		
		}
	}
}