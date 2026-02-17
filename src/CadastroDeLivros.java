public class CadastroDeLivros {
	
	public static void main(String[] args) {
	
		Autor autor = new Autor();
		autor.setNome("Gabriel Pereira da Silva");
		autor.setEmail("gabriel.script@gmail.com");
		autor.setCpf("000.000.000-00");
		
		Livro livro = new Livro(autor);
		livro.setNome("Programação Criativa com p5JS");
		livro.setDescricao("Programação criativa com JavaScript");
		livro.setValor(49.90);
		livro.setIsbn("111-11-11111-11-1");
		
		livro.mostrarDetalhes();
	}
}
