package Exe1;

public class Main {

	public static void main(String[] args) {
		estoque estoque = new estoque("Rosca", 20,2);
		
        System.out.println(estoque.getQtdAtual());
        estoque.darBaixa(4);
        
        System.out.println(estoque.getQtdAtual());
        
        System.out.println(estoque.mostrar());
        
        System.out.println(estoque.precisaRepor());
        
    }
}


