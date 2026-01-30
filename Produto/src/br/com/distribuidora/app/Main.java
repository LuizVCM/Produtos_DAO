/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.distribuidora.app;
import br.com.distribuidora.dao.ProdutoDAO;
import br.com.distribuidora.model.Produtos;

import java.util.Scanner;
/**
 *
 * @author LUIZVINICIUSCASSABON
 */
public class Main {
    public static void main(String[]args){
     //  Scanner = entrada de dados (Nosso prompt por java)
    Scanner entrada = new Scanner(System.in);
    
    // DAO = quem conversa com o banco
    ProdutoDAO dao = new ProdutoDAO();
    
    System.out.println("Quantos produtos deseja cadastrar? (Máx. 18) ");
    int quantidade = entrada.nextInt();
    entrada.nextLine();
    
    if(quantidade > 18){
      quantidade = 18;
    }
    // Loop para cadastrar alunos
    for(int i = 1; i <= quantidade; i++){
        System.out.println("Digite o nome do produto "+ i + ": ");
        String nome = entrada.nextLine();
        System.out.println("\nDigite o setor do produto "+ i+ ": ");
        String setor = entrada.nextLine();
        System.out.println("\nDigite o preco do produto "+i+": ");
        double preco = entrada.nextDouble();
        entrada.nextLine();
        
        Produtos produto = new Produtos(nome, setor, preco);
        
      
        dao.cadastrar(produto);
      }
    

    System.out.println("\n=== produtos Cadastrados ===");
    dao.Listar().forEach(produto -> {
        System.out.println(produto.getId()+ " - "+ produto.getNome());
    });
    entrada.close();
    }
    
}
