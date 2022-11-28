
package Gastronomia;
import java.util.ArrayList;
public class Caixa {
    public int codigo;
    public String nome;
    public int telefone;
    public int adicionar;
    public float calcular;
    public int reduzir;
    
    Administrador Administrador;
    ArrayList <Cliente> Clientes;
    
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
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public int getAdicionar() {
        return adicionar;
    }
    public void setAdicionar(int adicionar) {
        this.adicionar = adicionar;
    }
    public float getCalcular() {
        return calcular;
    }
    public void setCalcular(float calcular) {
        this.calcular = calcular;
    }
    public int getReduzir() {
        return reduzir;
    }
    public void setReduzir(int reduzir) {
        this.reduzir = reduzir;
    }
    public ArrayList<Cliente> getClientes() {
        return Clientes;
    }
    public void setClientes(ArrayList<Cliente> Clientes) {
        this.Clientes = Clientes;
    }
    public void setCodigo() {
        this.codigo = codigo;
    }
    public void setelefone(int telefone) {
        this.telefone = telefone;
         }
    public void calcular (float produto) {
		calcular += produto;
    }

        
}
    
  
	

        

    




    

    
    

    

       
    
    
    
    

