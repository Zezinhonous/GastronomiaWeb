
package Gastronomia;
public class Cliente {

    public int codigo;
	private String nome;
	private String endereco;
	public String acessar;
	public String cadastrar;
	public String comprar;
	public String selecionar;
	public int pagar;
	public String navegar;
	public Caixa caixa;
	
	Administrador administrador;
	public Cliente () {
	}
	public void acessar (String sistema) {
		acessar = sistema;
	}
	public void cadastrar (String sistema) {
		cadastrar = sistema;
	}
	public void comprar (String produto) {
		comprar = produto;
	}
	public void selecionar (String produto) {
		selecionar = produto;
	}
	public void pagar (int preco) {
		pagar += preco;
	}
	public void navegar(String site) {
		navegar = site;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
    



    