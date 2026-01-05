public class RegrasDeDesconto {
	
	public static void main(String[] args) {
	
		Autor autor = new Autor();
		
		Livro livro = new Livro(autor);
		livro.setValor(49.90);
		
		boolean descontoAplicado = livro.aplicaDescontoDe(0.25);
		
		if(descontoAplicado) {
			System.out.println("Desconto aplicado!");
			System.out.println("Valor: " + livro.getValor());
		} else {
			System.out.println("O desconto não foi aplicado!");
		}
	}
}