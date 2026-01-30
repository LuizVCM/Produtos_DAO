/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.distribuidora.dao;

import br.com.distribuidora.config.ConnectionFactory;
import br.com.distribuidora.model.Produtos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LUIZVINICIUSCASSABON
 */
public class ProdutoDAO {
    public void cadastrar(Produtos produto){
     String sql = "INSERT INTO Produtos (nome, setor, preco) VALUES (?, ?, ?)";
     
     try (Connection conn = ConnectionFactory.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)){
      stmt.setString(1, produto.getNome());
      stmt.setString(2, produto.getSetor());
      stmt.setDouble(3, produto.getPreco());
      
      stmt.executeUpdate();
      
      
     }  catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException ("Erro ao cadastrar aluno", ex);
        }
    } 
    public List<Produtos> Listar(){
     String sql = "SELECT nome, setor, preco FROM produtos";
     
     List<Produtos> produtos = new ArrayList<>();
     
 try(Connection conn = ConnectionFactory.getConnection(); 
         PreparedStatement stmt = conn.prepareStatement(sql); 
         ResultSet rs = stmt.executeQuery()){
     while(rs.next()){
         String nome = rs.getString("nome");
         String setor = rs.getString("setor");
         double preco = rs.getDouble("preco");
         
         Produtos produto = new Produtos(nome, setor, preco);
         
         produtos.add(produto);
     
    
     }
 }catch(Exception e){
              throw new RuntimeException("Erro | Listar Produtos", e);
             }
     return produtos;
    }
    
    
    
}
