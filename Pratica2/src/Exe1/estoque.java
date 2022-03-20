package Exe1;

public class estoque {
	
	private String nome;
	private int qtdAtual;
	private int qtdMinima;
	
	public estoque(String nome, int qtdAtual, int qtdMinima) {
		this.nome = nome;
		this.qtdAtual = qtdAtual;
		this.qtdMinima = qtdMinima;
	}

    public estoque(){
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    private void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    private void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }


    public void darBaixa(int qtde){
        qtde =  qtdAtual-qtde;
        if ( qtde >= 0){
            qtdAtual = qtde ;
        }else{
            System.out.println("ERRO DE ESTOQUE, VERIFIQUE A ENTRADA");
        }

    }

    public String mostrar(){
        String mensagem = "Nome do Produto: " +nome+ "\nQuantidade atual = " +qtdAtual+ "\nQuantidade m�nima = " +qtdMinima;
        return  mensagem;
    }

    public boolean precisaRepor(){
        boolean repor = false;
        if(qtdAtual<=qtdMinima) repor = true;
        return repor;
    }

}
