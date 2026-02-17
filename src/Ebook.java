public class Ebook extends Livro {

	private String waterMask;
	
	public Ebook(Autor autor) {
		super(autor);
	}
	
	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		if(porcentagem > 0.15) {
			return false;
		}
		
		double desconto = this.getValor() * porcentagem;
		this.setValor(this.getValor() - desconto);
		
		return true;
	}

	public String getWaterMask() {
		return waterMask;
	}

	public void setWaterMask(String waterMask) {
		this.waterMask = waterMask;
	}
}
