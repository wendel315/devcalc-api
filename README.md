# DevCalc API ![CI](https://github.com/seu-usuario/devcalc-api/actions/workflows/ci.yml/badge.svg)

API REST simples de calculadora desenvolvida em Java com o framework Javalin.  
Este projeto foi desenvolvido para praticar conceitos de Integração Contínua (CI), Entrega Contínua (CD) e DevOps utilizando GitHub Actions.

---

## 🔧 Funcionalidades da API

A API realiza operações matemáticas básicas, além da nova funcionalidade de raiz quadrada adicionada na Etapa 6:

- `GET /add?a=10&b=5` → Soma (10 + 5)
- `GET /subtract?a=10&b=5` → Subtração (10 - 5)
- `GET /multiply?a=10&b=5` → Multiplicação (10 * 5)
- `GET /divide?a=10&b=5` → Divisão (10 / 5)
- `GET /sqrt?x=16` → Raiz quadrada (√16 = 4)

---

## 🚀 Tecnologias Utilizadas

- Java 17
- Javalin
- Maven
- JUnit
- GitHub Actions

---

## 💻 Como executar localmente

### ✅ Pré-requisitos
- Java 17
- Maven

### ✅ Passos

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/devcalc-api.git
cd devcalc-api
```

2. Compile o projeto:
```bash
mvn clean install
```

3. Execute a aplicação:
```bash
mvn exec:java -Dexec.mainClass="com.devcalc.App"
```

4. Acesse os endpoints:
```
http://localhost:7000/add?a=10&b=5
http://localhost:7000/sqrt?x=16
```

---

## 🧪 Rodando os testes

```bash
mvn test
```

---

## 📦 Gerando o `.jar`

```bash
mvn package
```
O arquivo será gerado em:
```
target/devcalc-api-1.0-SNAPSHOT.jar
```

---

## ⚙️ Workflows Automatizados

O projeto possui um pipeline CI/CD com GitHub Actions que cobre:

| Job        | Descrição                                     |
|------------|-----------------------------------------------|
| checkout   | Checkout do código                            |
| build      | Instala Java e executa `mvn clean install`     |
| test       | Executa os testes automatizados               |
| package    | Gera o JAR com `mvn package`                   |
| deploy     | Simula um deploy com mensagem no log          |

### 🔁 Gatilhos configurados:
- ✅ Pushs em `src/**` na branch `main` ou `dev`
- ✅ Pull Requests para a branch `main`
- ✅ Execução manual via **Run workflow** no GitHub

---

## 🖥️ Runner Auto-Hospedado

Na Etapa 1, foi configurado um runner auto-hospedado no Windows com:
- Execução de comandos básicos (`uname -a`, `java -version`)
- Instalação de software adicional (`cowsay`) via `choco`.

---

## 🔑 Uso de Variáveis e Secrets

Na Etapa 2, foram criadas variáveis:
- `APP_MODE=production`
- `SUPPORT_EMAIL=support@devcalc.com`

E um segredo:
- `PROD_TOKEN`

Utilizadas no pipeline com `vars` e `secrets`.

---

## 🗂️ Contextos e Variáveis de Ambiente

Na Etapa 3, foi demonstrado o uso de:
- `github.actor`
- `runner.os`
- Variáveis de ambiente definidas em workflow, job e step.

---

## 🛡️ Controle de Permissões e Uso do GITHUB_TOKEN

Na Etapa 4, o `GITHUB_TOKEN` foi configurado com permissão `issues: write` e usado para criar uma issue automaticamente com base em uma condição.

---

## 🌍 Ambientes de Deploy

Na Etapa 5, foram configurados os ambientes:
- **dev:** Deploy automático (branch `dev`)
- **prod:** Deploy manual com aprovação (branch `main`)

Variáveis e segredos foram usados para proteger e personalizar cada ambiente.

---

## 🐞 Correção de Erro no Pipeline

Um erro foi introduzido manualmente usando `exit 1` no job de **build**.  
O erro foi identificado e corrigido na aba **Actions** ao remover o step com erro.

---

## 🚦 Observações sobre execução manual x automática

- **Execução automática (push/pull request):** Sempre que há alterações na pasta `src/**`.
- **Execução manual:** Permite rodar o pipeline via **Run workflow** e escolher parâmetros (se configurados).

Essa abordagem permite maior controle e flexibilidade sobre as execuções, simulando pipelines reais de projetos profissionais.

---
