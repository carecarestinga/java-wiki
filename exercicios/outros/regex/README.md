## Colocando em Prática

Uma tarefa muito comum no dia a dia do desenvolvedor é parsear um arquivo linha a linha, onde cada linha representa um dado ou registro. Há vários tipos de arquivos, vamos usar um arquivo txt com as seguintes linhas:

**arquivo.txt**
```java
João Fulano,123.456.789-00,21 de Maio de 1993,(21) 3079-9987,Rua do Ouvidor,50,20040-030,Rio de Janeiro
Maria Fulana, 98765432100,11 de Abril de 1995,(11) 933339871,Rua Vergueiro,3185,04101-300,São Paulo
denise teste, 987.654.321.00,28 de Dezembro de 1991,(31)45562712,SCS Qd. 8 Bl. B-50,11,70333-900,Rio Grande
Info Ltda, 15.123.321/8883-22,28 de Fevereiro de 1990,(21) 278774422,Rua do Ouvidor,55,20040-035,Rio de Janeiro
WJ Corretores Ltda, 15.123.321/8883-22,28 de Março de 1991,(31)45562712,Rua do Ouvidor,58,20040-038,Rio de Janeiro
```

Então, em cada linha temos vários valores separados pela vírgula, por exemplo:

```java
João Fulano,123.456.789-00,21 de Maio de 1993,(21) 3079-9987,Rua do Ouvidor,50,20040-030,Rio de Janeiro
```

---
01. Extraia os CPFs do **arquivo.txt** e imprima uma lista de CPFs. 

- [ ] Feito

---
02. Extraia os CNPJs do **arquivo.txt** e imprima uma lista de CNPJs.

```java
// Exemplo de um CNPJ
15.123.321/8883-22
```

- [ ] Feito

---
03. Extraia os CEPs do **arquivo.txt** e imprima uma lista de CEPs.

```java
// Exemplo de um CEP
// 20040-030
```

- [ ] Feito

---
04 - Extraia os números de Telefone do **arquivo.txt** e imprima uma lista de Telefones.

```java
// Exemplo de um Telefone
// (21) 3216-2345
```
- [ ] Feito

---
05 - Extraia a data do **arquivo.txt** e imprima uma lista de Datas.

```java
// Exemplo de uma data
// 11 de Abril de 1995
```
- [ ] Feito

---
06. O número do IP de um computador é gerado ao conectá-lo à internet, esse número permite que o dispositivo seja identificado e capaz de enviar/receber informações. Abaixo há alguns exemplos de IPs válidos e inválidos para teste:

```java
// IPs válidos
// 126.1.112.34
// 128.126.12.244
// 192.168.0.34
// 5.79.113.223
```

Crie uma classe com o método validaIp e depois crie uma classe de testes para testar os vários cenários.
- [ ] Feito

---
07. Houve uma mudança na estrutura das páginas de um site, antes era utilizado as tags HTML no texto para a formatação, porém agora vamos utilizar Markdown. Portanto, a sua tarefa agora é criar uma regex que procurará a tag \<code> dentro do alvo abaixo e substituir por: `

```java
No <code>for</code>, o valor de <code>i</code> começa de zero e é incrementado a cada volta enquanto <code>i < 10</code>, portando o bloco de código do for é executado 10 vezes.
```
- [ ] Feito

---
08. Fomos contratados para desenvolver um sistema para cadastros de veículos em um estacionamento. Para isso, precisaremos cadastrar as placas dos veículos no sistema e para fazer a validação usaremos expressão regular. Crie um classe de testes para testar os diversos cenários.

```java
// Exemplo de placa:
// KMG-8089
```

---
09. Leandro é professor de matemática em um colégio cuja média para passar é 8. Aliás, uma média bem alta. Contudo, este professor é amigo dos alunos, e costuma aprovar aqueles que conseguem notas de 7.2 a 7.9.

Ajude Leandro e, claro, seus alunos, separando do arquivo TXT os nomes e as notas dos alunos que tiraram de 7.2 a 7.9 para que o professor "camarada" possa aprová-los!

```
9.8 - Robson, 7.1 - Teresa, 4.5 - Armênio, 6.5 - Zulu, 7.7 - Stefania, 7.8 - João, 5.0 - Romeu, 7.2 - Pompilho, 3.1 - Reinaldo, 7.3 - Bernadete, 4.7 - Cinério 
```

---
10. Pâmela, é professora de Inglês, amiga de Leandro, professor de matemática. Ambos dão uma "colher de chá" para seus alunos. No caso da Pâmela, ela dá até meio ponto para que seus alunos atinjam a média 8 para serem aprovados. Depois de calcular as médias das provas dos alunos, Laudi, muito cansada, lançou todas as médias em um arquivo texto:

```
10 - Bruce, 9.5 - Miranda, 7.9    - Bob, 10 - Zimbabue, 7.5 - Bety
```

Para extrairmos a nota e o nome de alunos elegíveis para receberem até meio ponto podemos usar a expressão.

```
[7]\.[5-9] - \w+
```

Contudo, se copiarmos e colocarmos a linha com as médias do aluno e usarmos a expressão acima, recebemos como "match" apenas:

```
7.5 - Bety
```

Coitado de Bob! Ele tem direito também! Proponha um solução alterando a expressão regular utilizada.


---
11. Temos a seguinte linha:

```
BALEIRO GARROTE SERROTE GOLEIRO ROTEIRO
```

Escreva uma expressão regular que faça match apenas com as palavras GARROTE, SERROTE e ROTEIRO. Depois crie um sistema em Java para testar o Regex.

---
12. Você precisa validar o username abaixo e criar uma classe de teste para testar os vários cenários:

* O limite é de 10 caracteres;
* O primeiro caractere deve ser uma letra do alfabeto, não pode ser um número;
* A partir do segundo caractere podemos ter letras maiúsculas, minúsculas e números;

---
13. Precisamos ajudar os correios a entregar corretamente suas correspondências. Para tal, disponibilizaram-nos um arquivo com diversas linhas, nas quais são necessárias as informações: Nome, Rua, Número e CEP.

As outras informações também devem ser separadas para futuros serviços dos correios, porém não precisamos capturá-las neste momento.

```
Nico Steppat|14/05/1977|Rua Buarque de Macedo|50|22222-222|Rio de Janeiro
Romulo Henrique|14/06/1993|Rua do Lins|120|12345-322|Rio de Janeiro
Leonardo Cordeiro|01/01/1995|Rua de Campo Grande|01|00001-234|Rio de Janeiro
```

Tente montar uma regex que realize esse trabalho e depois crie um sistema implementando essa expressão regular.

---
14. Como podemos, através de regex alterar o formato de uma data 2007-12-31 para 31-12-2007?

Dica: use os grupos para formar uma nova String com a data correta.

---
15. Um agente secreto conseguiu capturar a seguinte mensagem criptografada:

```
Z171PZ7AZ23PZ7819AZ78GZ1AZ99IZ34O
```

Depois de algum tempo, ele descobriu a seguinte lei de formação: cada letra da palavra recebe o prefixo Z, mas não apenas isso. A letra Z é seguida de um número com um ou mais dígitos.

Com base nessa informação ultra secreta, crie uma expressão regular que consiga evidenciar a palavra secreta. ATENÇÃO: para resolver este problema você precisará trabalhar com grupos.



