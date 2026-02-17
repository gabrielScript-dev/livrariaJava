
public class RegistroDeVendas {

	public static void main(String[] args) {
	
		Autor autor = new Autor();
		autor.setNome("Gabriel Pereira");
		
		LivroFisico livroFisico = new LivroFisico(autor);
		livroFisico.setNome("Livro Java");
		livroFisico.setValor(9.90);
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("Livro Java");
		ebook.setValor(10.50);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adicionar(livroFisico);
		carrinho.adicionar(ebook);
		
		double totalCarrinho = carrinho.getTotal();
		
		System.out.println("Valor total do carrinho: " + totalCarrinho);
	}

}
