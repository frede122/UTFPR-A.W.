/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leituraeescritaemobjetos.Model;

/**
 *
 * @author Frede
 */


public class Produto extends Model implements java.io.Serializable{
    private static final long serialVersionUID = 1L;
    private String nome = "";
    private String categoria = "";
    private String unidadeMedida = "";

    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the unidadeMedida
     */
    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    /**
     * @param unidadeMedida the unidadeMedida to set
     */
    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }
    
    
    
    public Produto(){
        
    }
    public Produto(int id, String nome, String categoria, String unidadeMedida){
        this.id = this.id;
        this.nome = nome;
        this.categoria = categoria;
        this.unidadeMedida = this.unidadeMedida;
    }
}
