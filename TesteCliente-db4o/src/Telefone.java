

/**********************************
 * IFPB - Curso Superior de Tec. em Sist. para Internet
 * POB - Persistencia de Objetos
 * Prof. Fausto Ayres
 *
 */
public class Telefone {
	String numero; 
	Pessoa pessoa;
	
	public Telefone(String n){
		this.numero = n;
	}

	public void setPessoa(Pessoa p){
		this.pessoa = p;
	}
	

	@Override
	public String toString() {
		return "Telefone [" 
				+ (numero != null ? "numero=" + numero + ", " : "")
				+ (pessoa != null ? "pessoa=" + pessoa.getNome() : "") + "]";
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}
	
	
}
