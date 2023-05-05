public class Receitas{
	
	private String titulo;
	private String texto;
	private String genero;
	
	public Receitas(String titulo, String texto, String genero) {
		this.titulo = titulo;
		this.texto = texto;
		this.genero = genero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
}
