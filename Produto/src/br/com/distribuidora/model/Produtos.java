/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.distribuidora.model;

/**
 *
 * @author LUIZVINICIUSCASSABON
 */
public class Produtos {
    private int id;
    private String nome;
    public String setor;
    public double preco;
    
    public Produtos(){

}
    public Produtos( String nome, String setor, double preco){
    
       
        this.nome = nome;
        this.setor = setor;
        this.preco = preco;
        
    }
    
     public Produtos(int id, String nome, String setor, double preco){
        this.id = id;
        this.nome = nome;
        this.setor = setor;
        this.preco = preco;
        
    }
    
    public int getId(){
    return id;
    }
    
    public void setId(int id){
    this.id = id;
    }
    
    public void setNome(String nome){
   this.nome = nome;
    }
    
    public String getNome(){
    return nome;
    }
    public String getSetor(){
    return setor;
    }
    public void setSetor(String setor){
    this.setor = setor;
    }
    public double getPreco(){
    return preco;
    }
    public void setPreco(double preco){
    this.preco = preco;
    }
    
}
    


