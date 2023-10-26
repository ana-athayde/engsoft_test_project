# Empréstimo de Objetos - Descrição do Problema

Existem situações diversas no dia-a-dia nas quais precisamos de algum objeto ou ferramenta que será pouco utilizado, como uma ferramenta para algo que quebrou ou uma fantasia para uma ocasião especial. Por isso, nossa empresa foi contratada para modelar um software de empréstimos de objetos entre os usuários, visando suprir a necessidade de compra de artigos que raramente serão utilizados. Durante a reunião com a equipe, foram levantadas as seguintes funcionalidades do software.

## Funcionalidades Principais

1. **Tela Inicial com Mapa:** A tela inicial exibe um mapa com os pedidos publicados recentemente.

2. **Criação de Pedidos:** Os usuários podem criar novos pedidos, incluindo informações obrigatórias como item, distância máxima em km, datas de retirada e devolução sugeridas e uma descrição opcional. Os itens podem ser classificados por categorias disponíveis no aplicativo.

3. **Alertas para Usuários Próximos:** Usuários dentro do raio determinado de cada pedido recebem um alerta. Eles podem responder caso tenham interesse em emprestar o item.

4. **Chat para Combinar Detalhes:** Ao responder um alerta, inicia-se um chat para combinar o local de encontro, data e hora da entrega e devolução.

5. **Medidas de Segurança:** O aplicativo fornece medidas de segurança, auxiliando os usuários a escolher locais seguros para as transações.

6. **Confirmação de Entrega:** Para garantir que o item foi devolvido, será feita uma confirmação de entrega por ambas as partes, usando um código de confirmação.

7. **Avaliações e Perfil do Usuário:** O empréstimo é contabilizado nos perfis dos usuários, que podem avaliar a experiência. O perfil do usuário contém informações como nome, foto, distância, estatísticas, uma pequena biografia e avaliações.

8. **Restrições de Itens:** Alguns itens, como alimentos e remédios, são proibidos para empréstimo. Haverá também um limite máximo de km para empréstimos no aplicativo.

9. **Exibição de Anúncios:** Anúncios serão exibidos ao usuário a fim de arcar com a manutenção do aplicativo.

## Stakeholders

Os stakeholders do projeto podem ser divididos em internos e externos:

**Stakeholders Internos:**
- Gestor do Projeto
- Equipe de Desenvolvimento
- Empresa Contratante

**Stakeholders Externos:**
- Usuários do Software

---

# Testes de Classes e Métodos

Nossa aplicação requer uma série de testes para garantir que as funcionalidades e classes principais estejam funcionando corretamente. Aqui estão os testes que foram definidos:

## Classe: Empréstimo

### Método: `getSituacao()`

- **Descrição do Teste:** Verifica se a situação do empréstimo é igual a 1 (empréstimo requisitado).

- **Justificativa:** Ao instanciar um objeto da classe Empréstimo, sua situação é atribuída como 1.

### Método: `cancelarEmprestimo()`

- **Descrição do Teste:** Verifica se a situação do empréstimo é igual a 4 (empréstimo cancelado).

- **Justificativa:** No método `cancelarEmprestimo()`, o atributo situação é definido como 4.

### Método: `cancelarEmprestimo()`

- **Descrição do Teste:** Verifica se é possível cancelar um empréstimo que já foi cancelado anteriormente.

- **Justificativa:** No método `cancelarEmprestimo()`, o atributo situação é definido como 4, desde que seja diferente de 3 ou 4. Caso contrário, cai em uma exceção que avisa que o empréstimo já foi concluído ou cancelado.

### Método: `iniciarEmprestimo()`

- **Descrição do Teste:** Verifica se é possível iniciar um empréstimo que já foi cancelado anteriormente.

- **Parâmetros:** String endereco, Usuario concedente

- **Justificativa:** No método `iniciarEmprestimo()`, o atributo situação precisa ser igual a 1 (empréstimo solicitado) para ser marcado como 2 (empréstimo em andamento). Caso contrário, cai em uma exceção informando que o empréstimo não está marcado como solicitado.

### Método: `iniciarEmprestimo()`

- **Descrição do Teste:** Verifica se é possível iniciar um empréstimo sem um usuário concedente.

- **Parâmetros:** String endereco, Usuario concedente

- **Justificativa:** No método `iniciarEmprestimo()`, o atributo concedente precisa ser diferente de null. Caso contrário, cai em uma exceção informando que o concedente não existe.

### Método: `confirmarEntrega()`

- **Descrição do Teste:** Verifica se é possível confirmar uma entrega com o código de confirmação incorreto.

- **Parâmetros:** int codigo

- **Justificativa:** No método `confirmarEntrega()`, se o atributo código for diferente do código de confirmação, cai em uma exceção informando que o código está incorreto.

### Método: `confirmarEntrega()`

- **Descrição do Teste:** Verifica se é possível confirmar a entrega de um

 empréstimo que não está em andamento.

- **Parâmetros:** int codigo

- **Justificativa:** No método `confirmarEntrega()`, se o atributo situação for diferente de 2, cai em uma exceção informando que o empréstimo não está em andamento.

## Classe: Usuario

### Método: `iniciarLogin()`

- **Descrição do Teste:** Verifica se é possível fazer login com o idUsuario incorreto.

- **Parâmetros:** int idUsuario, String senha

- **Justificativa:** No método `iniciarLogin()`, se o atributo idUsuario estiver incorreto, cai em uma exceção informando que o id está incorreto.

<!--
Este README faz parte de um projeto para a disciplina "SOFT003 - Engenharia de Software," com ênfase em testes de software. O objetivo principal deste projeto é demonstrar a compreensão dos conceitos de Engenharia de Software relacionados a testes e documentação de software.
-->
