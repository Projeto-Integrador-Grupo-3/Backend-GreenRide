# Backend-GreenRide
O Green Ride é um aplicativo inovador de caronas que promove a mobilidade sustentável, contribuindo para uma economia verde. A plataforma conecta motoristas e passageiros em busca de uma alternativa mais ecológica e econômica ao transporte individual.
No Green Ride, os motoristas são incentivados a utilizar veículos com baixo impacto ambiental, como carros elétricos ou híbridos com baixo consumo de combustível. O sistema de rastreamento e escolha de veículos ecológicos permite que os passageiros optem por caronas mais sustentáveis, contribuindo diretamente para a redução da emissão de gases poluentes.
O Green Ride é mais do que apenas um serviço de transporte; é uma plataforma que promove a mobilidade urbana responsável, oferecendo aos usuários uma maneira fácil de se deslocar sem prejudicar o meio ambiente. Ao combinar conveniência, economia e sustentabilidade, o Green Ride está ajudando a transformar o transporte urbano em uma prática mais verde e consciente.

---
### Funcionalidades Principais (CRUD)
Detalhe as funcionalidades principais do projeto, utilizando as operações de CRUD (Create, Read, Update, Delete). Por exemplo, no caso de uma entidade 'Passageiro': criar passageiro, listar passageiro, atualizar dados do passageiro e excluir passageiro.

Motorista:
* Buscar por  todos os motoristas
* Busca por ID
* Cadastrar motorista
* Atualizar motorista
* Deletar motorista

Corrida:
- Buscar todas as corridas por idUsuario
- Busca por todas as corridas por idMotorista
- Cadastrar corrida
- Atualizar dados corrida
- Deletar corrida

Usuário:
- Buscar por todos os usuários
- Buscar por ID
- Cadastrar usuário
- Atualizar usuário
- Deletar usuário

  ---


### Tecnologias Utilizadas

- Backend: O sistema é desenvolvido utilizando uma API RESTful.
- Banco de Dados: O armazenamento de dados pode ser feito utilizando um banco de dados relacional como MySQL
- Autenticação: Para garantir a segurança, o sistema pode utilizar métodos de autenticação como JWT (JSON Web Tokens).
- Framework: A API pode ser desenvolvida utilizando o framework Spring Boot.

  
---

### Como Usar

Configuração do ambiente:

Clone este repositório.  
Instale as dependências do projeto.  

  
Executando o servidor:

Após a instalação, inicie o servidor localmente para começar a usar o sistema.
Chamadas à API:

Utilize um cliente REST (como Postman ou Insomnia) para testar as rotas da API.  

Exemplos de Requisições:    

  
- Motoristas: 

GET /motoristas: Retorna todos os motoristas.  

GET /motoristas/{id}: Retorna um motorista específico pelo ID.  

POST /motoristas: Cria um novo motorista.  

PUT /motoristas/{id}: Atualiza os dados de um motorista específico.  

DELETE /motoristas/{id}: Deleta um motorista específico.  

- Corridas:
  
GET /corridas/usuario/{idUsuario}: Retorna todas as corridas de um usuário específico.  

GET /corridas/motorista/{idMotorista}: Retorna todas as corridas de um motorista específico.  

POST /corridas: Cria uma nova corrida.  

PUT /corridas/{id}: Atualiza os dados de uma corrida específica.  

DELETE /corridas/{id}: Deleta uma corrida específica.  

  
- Usuários:
  
GET /usuarios: Retorna todos os usuários.  

GET /usuarios/{id}: Retorna um usuário específico pelo ID.  

POST /usuarios: Cria um novo usuário.  

PUT /usuarios/{id}: Atualiza os dados de um usuário específico.  

DELETE /usuarios/{id}: Deleta um usuário específico.  

