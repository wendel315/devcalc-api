# DevCalc API ![CI](https://github.com/seu-usuario/devcalc-api/actions/workflows/ci.yml/badge.svg)

API REST simples de calculadora desenvolvida em Java com o framework Javalin.  
O objetivo é praticar conceitos de Integração Contínua (CI) e Entrega Contínua (CD) utilizando GitHub Actions.

---

## 🔧 Funcionalidades da API

A API realiza as operações matemáticas básicas:

- `GET /add?a=10&b=5` → Soma (10 + 5)
- `GET /subtract?a=10&b=5` → Subtração (10 - 5)
- `GET /multiply?a=10&b=5` → Multiplicação (10 * 5)
- `GET /divide?a=10&b=5` → Divisão (10 / 5)

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

O projeto possui um pipeline de CI/CD configurado com GitHub Actions que realiza:

| Job       | Descrição                                   |
|------------|---------------------------------------------|
| checkout   | Checkout do repositório                    |
| build      | Instala Java e executa `mvn clean install` |
| test       | Executa os testes automatizados            |
| package    | Gera o JAR com `mvn package`               |
| deploy     | Simula um deploy com uma mensagem no log   |

### 🔁 Gatilhos configurados:
- ✅ Push na branch `main` que altere arquivos dentro de `src/**`.
- ✅ Pull Request que altere arquivos em `src/**`.
- ✅ Execução manual usando o botão **“Run workflow”** no GitHub.

---

## 🐞 Correção de Erro no Pipeline

Um erro foi introduzido manualmente usando `exit 1` no job de **build**.  
Ao executar o pipeline, foi possível observar na aba **Actions** que o job falhou exatamente no step `"Simular erro proposital"`.

A correção foi feita removendo esse step, e após o push o pipeline voltou a funcionar normalmente.

---

## 🚦 Observações sobre execução manual x automática

- **Execução automática (push/pull request):** É acionada sempre que há alterações em arquivos na pasta `src/**` na branch `main`.
- **Execução manual:** Permite executar o pipeline na aba **Actions**, podendo escolher parâmetros (se configurados) como executar ou não os testes e o package.

Essa abordagem permite maior controle e flexibilidade sobre as execuções, simulando pipelines reais de projetos profissionais.

---