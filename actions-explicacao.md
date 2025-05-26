🔹 Diferença entre Workflow e Action

Workflow: Um arquivo YAML localizado em .github/workflows que define uma automação completa. Controla quando, como e em qual condição executar tarefas.

Action: Um bloco de código reutilizável dentro de um step de um workflow. Executa tarefas específicas como checkout, setup de ambiente, execução de testes, análise de código, etc.

🔹 Estrutura Interna de uma Action

As actions são definidas por um arquivo chamado action.yml, que contém:

name: Nome da action.

inputs: Parâmetros de entrada.

outputs: Saídas.

runs: Como será executada (docker, node, ou composite).

🔹 Exemplo Usado no Projeto

Action: github/codeql-action

No workflow:

- name: Inicializar CodeQL
  uses: github/codeql-action/init@v2
  with:
  languages: java

- name: Executar análise
  uses: github/codeql-action/analyze@v2

Essa action executa uma análise estática de segurança no código Java, e foi integrada após os testes no pipeline principal (ci.yml).
