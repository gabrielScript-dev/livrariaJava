public class CarrinhoDeCompras {

	private double total;
	
	public void adicionar(Livro livro) {
	
		System.out.println("Livro " + livro.getNome() + " adicionado!");
		this.total += livro.getValor();
	}

	public double getTotal() {
		return total;
	}
}
