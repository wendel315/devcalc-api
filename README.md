# DevCalc API

API REST simples de calculadora desenvolvida em Java com o framework Javalin. Este projeto foi criado com o objetivo de demonstrar a aplicação prática de Integração Contínua (CI) e Simulação de Entrega Contínua (CD) com GitHub Actions.

---

## 📌 Funcionalidades da API

A API possui os seguintes endpoints de operações matemáticas:

- `GET /add?a=10&b=5` → Soma (10 + 5)
- `GET /subtract?a=10&b=5` → Subtração (10 - 5)
- `GET /multiply?a=10&b=5` → Multiplicação (10 * 5)
- `GET /divide?a=10&b=5` → Divisão (10 / 5)

---

## 🚀 Tecnologias Utilizadas

- Java 17
- [Javalin](https://javalin.io/)
- Maven
- JUnit 5
- GitHub Actions

---

## 🛠️ Como executar localmente

### Pré-requisitos
- Java 17 instalado
- Maven instalado

### Passos para rodar a aplicação

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

4. Acesse os endpoints via navegador ou Postman:
```
http://localhost:7000/add?a=10&b=5
```

---

## ✅ Como rodar os testes

```bash
mvn test
```

---

## 📦 Como gerar o `.jar`

```bash
mvn package
```

O arquivo será gerado em:  
```
target/devcalc-api-1.0-SNAPSHOT.jar
```

---

## ⚙️ Workflows Automatizados

### Arquivo: `.github/workflows/ci.yml`

O projeto possui um workflow CI/CD que realiza:

| Job       | Descrição                                   |
|-----------|---------------------------------------------|
| checkout  | Clona o repositório                         |
| build     | Instala o Java 17 e roda `mvn clean install`|
| test      | Executa os testes automatizados             |
| package   | Gera o JAR com `mvn package`                |
| deploy    | Simula um deploy com a mensagem no console  |

### 🔁 Gatilhos configurados:

- Pushs na branch `main` que alterem arquivos em `src/**`
- Pull Requests que alterem arquivos em `src/**`
- Execução manual via GitHub Actions (workflow_dispatch)

---

## 🧪 Execução manual

Você pode executar manualmente o pipeline:

1. Vá até a aba **Actions** no GitHub
2. Selecione o workflow `CI DevCalc`
3. Clique em **Run workflow** para executá-lo manualmente
