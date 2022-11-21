# WomanBank - Gama Academy

<p align="center">
      <a href="https://github.com/ViFLara/cravoecanela_backend/commits/dev">
        <img alt="GitHub last commit" src="https://img.shields.io/badge/last%20commit-%20September%202022-yellow">
      </a>
      </a>
      <a href="https://github.com/ViFLara">
      <img alt="Feito por Viviane Ferreira Lara" src="https://img.shields.io/badge/feito%20por-ViFLara-yellow">
      </a>
      <img src="https://img.shields.io/badge/Status-Em%20Desenvolvimento-yellowgreen"/>
      <a href="https://github.com/PriscilaTuppy">
        <img alt="Feito por Priscila Tuppy" src="https://img.shields.io/badge/feito%20por-PriscilaTuppy-yellow">   
      <img alt="GitHub last commit" src="https://img.shields.io/badge/release%20date-%20September%202022-yellowgreen">
      <img alt="GitHub last commit" src="https://img.shields.io/badge/project%20-%20backend-yellowgreen">
</p>

# <h1 align="center">Cravo&Canela Backend - Gama Academy![logo](https://user-images.githubusercontent.com/82177551/193073860-e17fb5d0-5804-4134-ae93-dc18e95ea7f6.jpg)</h1>



  ## 💻 Sobre o projeto
  
  <p align="justify"> A Consultoria Fictícia Cravo&Canela, está construindo uma nova plataforma e precisa de uma API para gerenciar as transações. Utilizamos nossas habilidades em backend com Java, Banco de dados, AWS e em Frontend com Html, Css e Javascript para a construção da plataforma. O sistema permite realizar cadastro, edição e exclusão de novos clientes, visto que cada cliente está atrelado a uma conta única (com todos os dados inclusos) que registra o histórico de sua movimentação.
      
 <p align="justify"> Metodologias Ágeis foram empregadas para a definição dos entregaveís através do Trello como ferramenta para criação do backlog, detalhamento das tarefas, no formato Kanban padrão "to do, doing, done" e definição de responsável e de data de entrega das tarefas nos cards.
  
   Projeto desenvolvido durante o treinamento **Mulheres em Cloud** oferecida pela [Gama Academy em parceria com a McKinsey & Company](https://mulheresemcloud.corporate.gama.academy/).</p>
  
  ---

  
  ## ⚙️ Funcionalidades
    
:heavy_check_mark: Login de usuários

:heavy_check_mark: Cadastro de clientes

:heavy_check_mark: Listagem de clientes

:heavy_check_mark: Atualização de clientes

:heavy_check_mark: Deletar clientes

:heavy_check_mark: Listar Histórico de transações por cliente
  
  ---  
  ## 🎨 Layout
  
  O layout da aplicação está disponível no Figma: 
  <br>
  <a href="https://www.figma.com/file/vmf2kgtoL704A2wbphT5mb/PerformAcao?node-id=0%3A1">
    <img alt="Made by PerformAção" src="https://img.shields.io/badge/Acessar%20Layout-Figma-yellow">
  </a>
  
  
  ---
  
  ## 📝 Projeto
  
  Este projeto é divido em dois repositórios:
 1. Frontend - <a href="https://github.com/ViFLara/cravoecanela_backend">cravoecanela_frontend</a>       
 2.  Backend - <a href="https://github.com/ViFLara/cravoecanela_backend">cravoecanela_backend</a>
 
 Os endpoints do Backend podem ser vistos pelo Swagger:
  
  link : http://ec2-174-129-49-15.compute-1.amazonaws.com:8081/swagger-ui.html 
  
  ## Endpoints:
  ### Clientes:
  
  :heavy_check_mark: GET - https://fiq9i0dhe2.execute-api.us-east-1.amazonaws.com/clientes/{id} (obter cliente específico)
  
  :heavy_check_mark: GET - https://fiq9i0dhe2.execute-api.us-east-1.amazonaws.com/clientes (listar clientes)
  
  :heavy_check_mark: POST - https://fiq9i0dhe2.execute-api.us-east-1.amazonaws.com/clientes (cadastrar)
  
  :heavy_check_mark: PUT - https://fiq9i0dhe2.execute-api.us-east-1.amazonaws.com/clientes (atualizar)

  :heavy_check_mark: DELETE - https://fiq9i0dhe2.execute-api.us-east-1.amazonaws.com/clientes/{id} (deletar)
  
  ### Serviços:
  
  :heavy_check_mark: GET - https://fiq9i0dhe2.execute-api.us-east-1.amazonaws.com/servicos (listar serviços)
  
  ### Transações:
   
  :heavy_check_mark: POST - https://fiq9i0dhe2.execute-api.us-east-1.amazonaws.com/transacoes (criar transação)
  
  :heavy_check_mark: PATCH - https://fiq9i0dhe2.execute-api.us-east-1.amazonaws.com/transacoes?id={id}&status={status} (mudar status da transação)
  
  :heavy_check_mark: GET - https://fiq9i0dhe2.execute-api.us-east-1.amazonaws.com/transacoes?clienteId={id} (listar transações de cliente)


 ### Modelagem para criação do banco de dados

# <h1 align="center"> ![tabela1](https://user-images.githubusercontent.com/82177551/193124764-73615a41-88a0-4eea-bd9a-69d762643c1b.png)</h1>
# <h1 align="center">![tabela](https://user-images.githubusercontent.com/82177551/193124771-8fc3009d-b000-492d-8fb8-39291b150e53.png)</h1>

 ### Pré-requisitos para o Backend
  Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:
  [Git](https://git-scm.com) e um ter um editor para trabalhar com o código como [IntelliJ](https://www.jetbrains.com/idea/download/#section=windows) 
 ---
 
## 🛠 Tecnologias
  
  As seguintes ferramentas foram usadas na construção do projeto:
  #### **Backend**
  
<img src="https://img.shields.io/badge/Java 11-cd0000?style=for-the-badge&logo=java&logoColor=white"/>
<img src="https://img.shields.io/badge/Spring Boot-97d96b?style=for-the-badge&logo=Spring Boot&logoColor=white"/>
<img src="https://img.shields.io/badge/apache_maven-AC2246?style=for-the-badge&logo=apachemaven&logoColor=white"/>
<img src="https://img.shields.io/badge/Junit5-25A162?style=for-the-badge&logo=junit5&logoColor=white"/>
<img src="https://img.shields.io/badge/AWS-ed7f40?style=for-the-badge&logo=amazon&logoColor=white"/>
<img src="https://img.shields.io/badge/Jenkins-fbca75?style=for-the-badge&logo=jenkins&logoColor=white"/>
<img src="https://img.shields.io/badge/Trello-0052CC?style=for-the-badge&logo=trello&logoColor=white"/>
    
---  
## 👨‍💻 Contribuidores 

Backend

| [<img src="https://avatars.githubusercontent.com/u/46038257?v=4" width=115><br><sub>Viviane Ferreira Lara</sub>](https://github.com/ViFLara)| [<img src="https://avatars.githubusercontent.com/u/89219239?v=4" width=115><br><sub>Priscila Tuppy</sub>](https://github.com/PriscilaTuppy) |  
| :---: | :---: |
  
Frontend

| [<img src="https://avatars.githubusercontent.com/u/82177551?s=96&v=4" width=115><br><sub>Lais Manieri</sub>](https://github.com/laismanieri) |  [<img src="https://avatars.githubusercontent.com/u/60903424?v=4" width=115><br><sub>Nara Gumarães</sub>](https://github.com/NaraGuimma)|
| :---: | :---: |


