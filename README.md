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

## Próximos Passos

- Adicionar testes automatizados para as funcionalidades principais.
- Implementar a recuperação de senha com envio de e-mails reais.
- Melhorar a interface do usuário para uma experiência mais intuitiva.
- Configurar um pipeline de CI/CD para automação de builds e deploys.

