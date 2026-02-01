# Projeto de Distribuidora com DAO - Java + JDBC

Este projeto foi desenvolvido para demonstrar na prática como funciona a *arquitetura em camadas* utilizando **Java** e **MySQL**, aplicando o padrão **DAO( Data Access Object )**.

O sistema permite cadastrar até 18 produtos, cadastrando os seus **nomes, setores e seus preços unitários**, e listá-los em um banco de dados.

---
💻 Objetivos do projeto: 

 - Implementar diversas funcionalidades pela arquitetura do projeto.
 - Demonstrar a comunicação entre a linguagem *Java* com o banco de dados **MySQL**.
 - Aplicar boas práticas como:
 - DAO
 - Model
 - Factory de conexão
 - Evitar SQL Injector
 - Realizar manutenções preventivas de forma clara

   ---
   Estrutura do projeto:
   
   <img width="241" height="180" alt="Captura de tela 2026-01-30 171220" src="https://github.com/user-attachments/assets/e89b7a85-82f8-4515-bd80-f5bc30599887" />

   ---
# 📦 Product Manager - Java + SQL Integration (DAO)
   Sistema de gerenciamento de produtos desenvolvido em *Java*, focado na separação de *responsabilidades* e *segurança* no acesso aos dados.
   
   ---
## 🏗️ Arquitetura em Camadas
   O projeto utiliza uma estrutura modular para garantir que a *lógica de interface* seja independente da *lógica de armazenamento de dados*.

   ---
   Estrutura do Projeto:
   - **App** -> *Main* / Gerencia o fluxo de execução e a entrada/saída de dados via console.
   - **Model** -> *Produtos* / Classe que representa o objeto de negócio com atributos: id, nome, setor e preco.
   - **Config** -> *ConnectionFactory* / Gerencia o ciclo de vida da conexão com o banco de dados MySQL.
   - **DAO (Data Access Object)**-> *ProdutoDAO* / Gerencia a comunicação com o banco de dados e executa as funções de gravar e mostrar informações.

   ---
   # 🧠 Padrão de Projeto: DAO
   A implementação do padrão *Data Access Object (DAO)* foi escolhida para:
   - **Separação de Responsabilidades:** O código que lida com *SQL* não se mistura com a lógica de exibição do console.
   - **Independência de Dados:** Facilita a manutenção, permitindo alterar a estrutura da tabela ou o tipo de banco de dados sem afetar as outras classes.
   - **Centralização:** Todo o acesso à tabela Produtos é feito através de métodos específicos (cadastrar e listar).

     ---
   # 🛠️ Tecnologias e Implementação
   - **Linguagens:** Java e SQL.
   - **Conexão com Banco de Dados:** JDBC *(Java Database Connectivity).*
   - **Banco de Dados:** MySQL

   # Recursos de Segurança e Formatação
   - **PreparedStatement:** Utilizado para a construção de *queries SQL* de forma segura, protegendo a aplicação contra ataques de *SQL Injection*.
   - **Tratamento de Dados:** A formatação de valores monetários e máscaras de exibição é realizada apenas na camada de saída, mantendo a integridade do tipo **double** durante o processamento.

   ---
   # 🚀 Funcionamento do Fluxo:
   - A classe **Main** solicita os dados do produto ao usuário.
   - Um objeto da classe **Produto** é instanciado e preenchido.
   - O objeto é enviado para o método *cadastrar* da classe **ProdutoDAO**.
   - A **ConnectionFactory** fornece a conexão necessária para que o *DAO* execute o comando no *MySQL*.

     ---
     # Observações:
     - Projeto realizado para fins educativos.
     - Formatação de valores apenas para função de visual.
       


   

