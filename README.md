### `README.md`

```markdown
# Projeto PDF Merger

## Descrição

Este projeto é uma aplicação web para mesclar arquivos PDF. O sistema permite que os usuários façam login, carreguem arquivos PDF, mesclem os arquivos e visualizem um histórico das mesclagens realizadas.

## Funcionalidades Implementadas

1. **Autenticação e Autorização:**
   - Registro de novos usuários com validação de dados.
   - Login de usuários com geração de tokens JWT.
   - Middleware de autorização para proteger rotas.
   - Logout com invalidação de tokens JWT.

2. **Gerenciamento de Sessão:**
   - Armazenamento de tokens de sessão no Redis com tempo de expiração.

3. **Recuperação de Senha:**
   - Endpoint para solicitações de recuperação de senha.
   - Envio de e-mail com link de recuperação (e-mail pode ser simulado).
   - Endpoint para redefinição de senha.

4. **Armazenamento de PDFs Mesclados:**
   - Armazenamento dos PDFs mesclados no banco de dados PostgreSQL.

5. **Funcionalidades de Merging de PDFs:**
   - Identificação do usuário por e-mail.
   - Upload e mesclagem de múltiplos arquivos PDF.
   - Histórico das mesclagens associadas ao e-mail do usuário.
   - Paginação da lista de PDFs mesclados.

6. **Sistema de Mensageria:**
   - Utilização do Kafka para processos assíncronos de mesclagem.

## O Que Foi Feito

- Implementação do sistema de autenticação com JWT.
- Configuração do filtro JWT para autenticação de usuários.
- Implementação do serviço de mesclagem de PDFs.
- Armazenamento dos PDFs mesclados no PostgreSQL.
- Integração com Kafka para processamento assíncrono.
- Implementação de funcionalidades de recuperação de senha e gerenciamento de sessões com Redis.
- Desenvolvimento do histórico de PDFs mesclados com paginação.

## Próximos Passos

- Implementar e testar a funcionalidade de recuperação de senha com envio de e-mails.
- Melhorar a segurança com a criptografia das senhas antes do armazenamento.
- Adicionar documentação detalhada para as APIs e uso do sistema.
- Realizar testes de integração e correção de possíveis bugs.
- Preparar e realizar o deploy da aplicação.

## Instruções para Execução

1. **Clonar o Repositório**

   ```bash
   git clone https://github.com/seu_usuario/pdf-merger.git
   cd pdf-merger
   ```

2. **Instalar Dependências**

   - Para o backend (Java):
     ```bash
     ./mvnw clean install
     ```

   - Para o frontend (se aplicável):
     ```bash
     cd frontend
     npm install
     ```

3. **Configurar Banco de Dados e Redis**

   - Certifique-se de que o PostgreSQL e o Redis estão configurados e em execução.
   - Atualize as configurações de banco de dados e Redis no arquivo `application.properties`.

4. **Executar a Aplicação**

   - Para o backend:
     ```bash
     ./mvnw spring-boot:run
     ```

   - Para o frontend:
     ```bash
     npm start
     ```

## Contribuições

Se você deseja contribuir para o projeto, por favor, envie um pull request com suas alterações. Certifique-se de seguir as diretrizes de contribuição.

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.

```

### Comandos para Criar e Enviar o Repositório para o GitHub

1. **Inicialize um repositório Git (se ainda não estiver inicializado):**
   ```bash
   git init
   ```

2. **Adicione todos os arquivos ao repositório:**
   ```bash
   git add .
   ```

3. **Faça o commit dos arquivos:**
   ```bash
   git commit -m "Initial commit"
   ```

4. **Crie um repositório no GitHub:**
   - Vá para [GitHub](https://github.com/) e crie um novo repositório com o nome `pdf-merger`.

5. **Adicione o repositório remoto e envie o projeto para o GitHub:**
   ```bash
   git remote add origin https://github.com/seu_usuario/pdf-merger.git
   git branch -M main
   git push -u origin main
   ```
