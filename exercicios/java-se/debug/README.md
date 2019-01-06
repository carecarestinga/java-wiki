## Colocando em Prática

Comece baixando o código e importando ele para dentro do Eclipse. Depois do código já importado, comece a debugar a aplicação usando os breakpoints e os comando de andar pelo código, como o Step Over, Step into e Step return.
Quando você achar o bug, faça a correção dele.

01. O projeto debug01 está exibindo o resultado da contagem errada, imprimindo na tela 4950, quando deveria imprimir 99.

- [ ] Feito

---
02. Um palíndromo é uma palavra ou uma frase que é igual quando se lê da esquerda para a direita quanto da direita para a esquerda. Exemplos de palíndromos: "Socorram-me subi no onibus em Marrocos", "Anotaram a data da maratona".
O projeto debug02 diz se uma frase é palíndromo, porém ao executar apresenta um erro. Descubra qual é o erro debugando o código e corrija-os.
- [ ] Feito

---
03. Você foi contratado para trabalhar na DebugStore, falta pouco para a aplicação ir para a produção, porém foi constatado que está apresentando um problema no cálculo do valor da compra que não está coerente. Descubra o erro debugando a aplicação e o corrija.
- [ ] Feito

---
04. Houve uma primeira atualização no sistema da DebugStore, a partir de agora os produtos que tiverem um valor acima de R$700,00 irão receber um outro desconto de R$20,00 no valor final dele, para fomentar as vendas finais no e-commerce. Porém foi observado que um dos produtos não está tendo esse desconto de R$20,00 mesmo tendo seu valor acima de R$700,00. Depure a aplicação e descubra a causa.
- [ ] Feito

05. Um outro desenvolver da sua equipe commitou um bug por engano no código da DebugStore, agora ao rodar a aplicação é lançada um exceção. Descobra e corrija o erro debugando o código.
- [ ] Feito

---
06. Agora a DebugStore está oferecendo compras para pessoas jurídicas. Ao invés de comprar produtos de informática, o cliente está comprando produtos de perfumaria, um outro setor da loja. Porém, a empresa que está fazendo as compras informou que o valor está errado, cobrando a mais, reportando as seguintes informações:
Obs: O cálculo da promoção fará o desconto conforme os múltiplos de 3 da seguinte forma: Se são 3 produtos, retira 1, se são 6 produtos retira 2, caso 9 produtos retira 3 e assim por diante.

```java
// Dados reportados pelo cliente:

// Valor certo
Valor da compra: 3852.14

// Valor errado
Valor da compra: 4227,14

// Valor sem promoção
Valor da compra: 4782,13
```

- [ ] Feito