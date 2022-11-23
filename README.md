
<p align="center">
      <a href="https://github.com/ViFLara/banco/commits/main">
            <img alt="GitHub last commit" src="https://img.shields.io/badge/last%20commit-%20November%202022-blue">
      </a>
      </a>
      <img alt="GitHub last commit" src="https://img.shields.io/badge/project%20-%20backend-blue">
      <img alt="GitHub last commit" src="https://img.shields.io/badge/release%20date-%20November%202022-blue">
      <img src="https://img.shields.io/badge/Status-Em%20Desenvolvimento-blue">   
</p>

# <h1 align="center">WomanBank Backend - Gama Academy</h1>

<p align="center">
      <img src="https://user-images.githubusercontent.com/32341930/203182355-5325de51-eeeb-45ed-ac9e-667f1d391784.png">  
</p>

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
  
  :heavy_check_mark: POST - localhost:8080/clientes (cadastrar cliente)
  
  :heavy_check_mark: POST - localhost:8080/clientes/list (cadastrar lista de clientes)
  
  :heavy_check_mark: PUT - localhost:8080/clientes (atualizar cliente)

  :heavy_check_mark: DELETE - localhost:8080/{id} (deletar)
  
  ### Contas:
  
  :heavy_check_mark: GET - localhost:8080/contas/{id} (obter conta específica)
  
  :heavy_check_mark: GET - localhost:8080/contas (listar contas)
  
  :heavy_check_mark: POST - localhost:8080/contas (cadastrar conta)
  
  :heavy_check_mark: PUT - localhost:8080/contas (atualizar conta)
  
  ### Transações:
  
  :heavy_check_mark: GET - localhost:8080/transacoes (listar transações)
  
  :heavy_check_mark: POST - localhost:8080/transacoes/transfer/{id} (realiza transferência entre contas)
  
  :heavy_check_mark: POST - localhost:8080/transacoes/deposito (realiza depósito)
  
  


 ### Modelagem para criação do banco de dados
# <h1 align="center"> <img width="715" alt="DiagramaWorkbanch" src="https://user-images.githubusercontent.com/32341930/203400183-d94ae3e8-fabc-4a3a-96a3-be827913985b.png"></h1>

 ### Pré-requisitos para o Backend
  Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:
  [Git](https://git-scm.com) e um ter um editor para trabalhar com o código como [IntelliJ](https://www.jetbrains.com/idea/download/#section=windows) 
 ---
 
## 🛠 Tecnologias
  
  As seguintes ferramentas foram usadas na construção do projeto:
  #### **Backend**
  
<img src="https://img.shields.io/badge/Java 17-cd0000?style=for-the-badge&logo=java&logoColor=white"/>
<img src="https://img.shields.io/badge/Spring Boot-97d96b?style=for-the-badge&logo=Spring Boot&logoColor=white"/>
<img src="https://img.shields.io/badge/apache_maven-AC2246?style=for-the-badge&logo=apachemaven&logoColor=white"/>
<img src="https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white" />
<img src="https://img.shields.io/badge/Swagger-85EA2D?style=for-the-badge&logo=Swagger&logoColor=white"/>
<img src="https://img.shields.io/badge/Trello-0052CC?style=for-the-badge&logo=trello&logoColor=white"/>
    
---  
## 👨‍💻 Contribuidores 


| [<img src="https://avatars.githubusercontent.com/u/60799028?v=4" width=115><br><sub>Ana Lakitini</sub>](https://github.com/analakitini) | [<img src="https://avatars.githubusercontent.com/u/60753347?s=96&v=4" width=115><br><sub>Maiara Moreira</sub>](https://github.com/maiara27) | [<img src="https://avatars.githubusercontent.com/u/46038257?v=4" width=115><br><sub>Viviane Lara</sub>](https://github.com/ViFLara)| [<img src="https://avatars.githubusercontent.com/u/32341930?v=4" width=115><br><sub>Yesmin Lahoud</sub>](https://github.com/yesminmarie)|
| :---: | :---: | :---: |:---: |
