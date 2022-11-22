
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

# <h1 align="center">WomanBank Backend - Gama Academy![woman_bank](https://user-images.githubusercontent.com/32341930/203182355-5325de51-eeeb-45ed-ac9e-667f1d391784.png)</h1>



  ## 💻 Sobre o projeto
  
  <p align="justify"> Para o desafio final do programa #ElasTech, foi proposto criar um sistema para gerenciar clientes e transações. Nosso banco fictício se chama "WomanBank" e para construir essa API aplicamos nossas habilidades de Java e Banco de Dados. </p>
  <p align="justify"> Esse sistema permite o cadastro de novos clientes, incluindo dados pessoais e dados para contato. O cliente pode ser atrelado a uma conta bancária com um valor inicial de saldo. Também é possível fazer transferências de um cliente para outro e o histórico de transações entre as contas fica registrado na base e pode ser exibido pelo sistema. </p>
 <p align="justify"> Aplicamos Metodologias Ágeis e utilizamos a ferramenta Trello para a criação do backlog e detalhamento das tarefas no formato Kanban, seguindo o padrão "to do, doing, done" e definição dos responsáveis.
  
   Este projeto desenvolvido durante o treinamento **#ElasTech** oferecido pela [Gama Academy em parceria com a PagBank PagSeguro](https://www.youtube.com/watch?v=SozRQEsWDS4).</p>
  
  ---

  
  ## ⚙️ Funcionalidades
    
:heavy_check_mark: Cadastro de clientes

:heavy_check_mark: Listagem de clientes

:heavy_check_mark: Atualização de clientes

:heavy_check_mark: Deletar clientes

:heavy_check_mark: Cadastro de contas

:heavy_check_mark: Atualização de contas

:heavy_check_mark: Transferência de saldo entre as contas

:heavy_check_mark: Realização de depoósito

:heavy_check_mark: Listar Histórico de transações
  
  ---  
  
  ## 📝 Projeto
 
 Os endpoints do Backend podem ser vistos pelo Swagger:
  
  link : http://localhost:8080/swagger-ui.html
  
  ## Endpoints:
  ### Clientes:
  
  :heavy_check_mark: GET - localhost:8080/clientes/{id} (obter cliente específico)
  
  :heavy_check_mark: GET - localhost:8080/clientes (listar clientes)
  
  :heavy_check_mark: POST - localhost:8080/clientes (cadastrar)
  
  :heavy_check_mark: POST - localhost:8080/clientes/list (cadastrar lista de clientes)
  
  :heavy_check_mark: PUT - localhost:8080/clientes (atualizar)

  :heavy_check_mark: DELETE - localhost:8080/{id} (deletar)
  
  ### Contas:
  
  :heavy_check_mark: GET - localhost:8080/contas/{id} (obter conta específica)
  
  :heavy_check_mark: GET - localhost:8080/contas (listar contas)
  
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


