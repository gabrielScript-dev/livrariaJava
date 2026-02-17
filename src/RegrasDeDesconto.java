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
		
		Ebook ebook = new Ebook(autor);
		ebook.setValor(29.90);
		
		descontoAplicado = ebook.aplicaDescontoDe(0.10);
		
		if(!descontoAplicado) {
			System.out.println("Desconto no ebook não pode ser aplicado!");
		} else {
			System.out.println("Desconto aplicado!");
			System.out.println("Valor: " + ebook.getValor());
		}
		
	}
}