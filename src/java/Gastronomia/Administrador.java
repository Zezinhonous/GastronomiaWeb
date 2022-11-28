
package Gastronomia;
import java.util.ArrayList;
public class Administrador {
    
    public int codigo;
	private String nome;
	public String endereco;
	public String liberar;
	public int vender;
	public int cobrar;
	public String cadastrar;
	
	Caixa caixa;
	ArrayList <Cliente> clientes;
	
	public Administrador () {
	}
	public void adicionarCliente (Cliente cliente) {
		clientes.add(cliente);
	}
	public int quantidadeCliente () {
		return clientes.size();
	}
	public void excluirCliente (Cliente cliente) {
		 clientes.remove(cliente);
	}
	public Cliente getCliente (int posicao) {
		return clientes.get(posicao);
	}
	public void liberar (String sistema){
		liberar = sistema;
	}
	public void vender (int produto) {
		vender += produto;
	}
	public void cobrar (int produto) {
		cobrar -= produto;
	}
	public void cadastrar (String cliente) {
		cadastrar = cliente;
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
	public String getLiberar() {
		return liberar;
	}
	public void setLiberar(String liberar) {
		this.liberar = liberar;
	}
	public int getVender() {
		return vender;
	}
	public void setVender(int vender) {
		this.vender = vender;
	}
	public int getCobrar() {
		return cobrar;
	}
	public void setCobrar(int cobrar) {
		this.cobrar = cobrar;
	}
	public String getCadastrar() {
		return cadastrar;
	}
	public void setFinalizar(String cadastrar) {
		this.cadastrar = cadastrar;
	}
	public void setCaixa(Caixa caixa) {
		
	}
	public Caixa getCaixa() {
		return caixa;
	}

}
