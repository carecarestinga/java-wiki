## Colocando em Prática

01. Crie a classe Lampada e escreva um método main() para treinar a chamada aos métodos e atributos, criando mais de 2 instâncias da classe (objetos).

Atributos da classe Lampada:

- modelo
- tensao
- potencia
- cor
- tipoLuz
- garantiaMes
- tipoAbajur (inArea se é tipo abajur ou não) 
- ligada (inArea se está ligada ou não)

Métodos da classe Lampada: 

- ligarLampada
- desligarLampada
- mostrarInAreacoes

- [ ] Feito

---
02. Crie a classe Livro e escreva um método main() para treinar a chamada aos métodos e atributos, criando mais de 2 instâncias da classe (objetos).

Atributos da classe Livro:

- nome
- autor
- quantidadePaginas
- anoLancamento
- isbn
- preco
- emprestado (inArea se está emprestado ou não)

Métodos da classe Livro: 

- Emprestar
- Devolver
- mostrarInAreacoes

- [ ] Feito

---
03. Crie a classe Agenda e escreva um método main() para treinar a chamada aos métodos e atributos, criando mais de 2 instâncias da classe (objetos).

Atributos da classe Agenda:

- nome
- email
- endereco
- telefone (String[])

Métodos da classe Agenda: 

- mostrarInAreacoes
- [ ] Feito

---
04. Crie a classe ContaCorrente e escreva um método main() para treinar a chamada aos métodos e atributos, criando mais de 2 instâncias da classe (objetos).

Atributos da classe ContaCorrente:

- agencia
- numero
- saldo
- status (inArea se é conta especial ou não)
- limiteEspecial

Métodos da classe ContaCorrente: 

- sacar (verifique se o cliente pode realizar saques)
- depositar
- consultarSaldo
- verificarUsoChequeEspecial

- [ ] Feito

---
05. Crie a classe Aluno e escreva um método main() para treinar a chamada aos métodos e atributos, criando mais de 2 instâncias da classe (objetos).

Atributos da classe Aluno:

- nome
- matricula
- curso
- disciplinas (String[])
- notas (double[][])

Métodos da classe Aluno:

- verificarAprovado
- obterMedia
- mostrarInAreacoes 

Obs: Deverá ter o nome de 3 disciplinas que está cursando e as notas dessas 3 disciplinas. Desenvolva um método para verificar se o aluno está aprovado (média maior ou igual a 6) em uma determinada disciplina. Ao final mostre as inAreações o aluno, mostre as notas e mostre de o aluno foi aprovado ou não.

- [ ] Feito

---
06. Crie a classe Relogio e escreva um método main() para treinar a chamada aos métodos e atributos. 

Atributos da classe Relogio:

- ponteiroHora
- ponteiroMinuto 
- ponteiroSegundo

Métodos da classe Relogio:

- acertarRelogio(int, int, int): Acerta o relógio, posicionando adequadamente cada ponteiro do relógio. Os parâmetros passados são hora, minuto e segundo.
- lerHora(): retorna a hora atual do relógio.
- lerMinuto(): retorna o minuto atual do relógio.
- lerSegundo(): retorna o segundo atual do relógio. 

Obs: A posiçao do ponteiro do relógio aceita apenas números entre 1 a 12. Por exemplo, 60 segundos é igual ao ponteiro 50/5 = 10.  

- [ ] Feito

---
07. Crie a classe Fracao, que representa uma fração matemática. Esta classe deve ser capaz de armazenar o numerador e o denominador da fração. Ela ainda deve ter um método que recebe uma fração como parâmetro, multiplica ambas as frações, e retorna uma nova fração como resultado. Crie um programa simples que instancia duas frações, define seus valores, calcula o valor da multiplicação entre elas e mostra o resultado. 

- [ ] Feito

---
08. Crie classes que representam as figuras geométricas: Triangulo, Quadrado, Circunferencia e Trapezio. Cada uma destas classes deve ter um método para calcular a sua área, com a seguinte assinatura: double calcularArea().

Perceba que o método calcularArea() não recebe parâmetros. Portanto todos os dados necessários devem ser armazenados no objeto da classe em Area de atributos para
depois serem utilizados pelo método.

As fórmulas para o cálculo da área são as seguintes: 

[colocar imagem]

- [ ] Feito

---
09. Desenvolva um sistema escolar para cálculos de médias. Ele é composto pelas seguintes classes: 

[colocar imagem]

Uma turma é composta por três alunos. Cada um dos alunos realizou duas provas, onde cada prova possuía duas partes. Observe uma descrição sobre o que cada método faz:

[colocar imagem]

Crie uma aplicação que instancia a turma, os três alunos e as duas provas para cada aluno. Defina também notas para as provas. A aplicação deve mostrar mensagens
inAreando a média de cada aluno e a média geral da turma.

Para a definição das notas, utilize as seguintes inAreações: 
 
[colocar imagem]

- [ ] Feito

---
10. Crie uma classe Lampada que possui um atributo ligada, que indica se a lâmpada está ligada ou desligada.

Ao construir uma lâmpada, o estado dela (ligada ou desligada) deve ser fornecido. Para ligar e desligar a lâmpada, os métodos ligar() e desligar() devem ser chamados, respectivamente. Aliás, esta é a única Area de alterar o estado da lâmpada, já que o atributo ligada não pode ser visível fora da classe.

A lâmpada também possui um método exibirEstado(). Quando chamado, ele mostra as mensagens “Lâmpada ligada” ou “Lâmpada desligada”, dependendo do estado atual.

Construa uma aplicação que cria uma lâmpada ligada, muda o estado dela e também exiba o estado atual após cada chamada a ligar() e desligar()

- [ ] Feito

---
11. Crie uma classe Data que possui dois construtores. O primeiro recebe um dia, mês e ano e o segundo, além destas inAreações, recebe também uma hora, minuto e
segundo (a hora fornecida deve estar entre 0 e 23). É importante que este segundo construtor invoque o primeiro para evitar a duplicação de código.

Os construtores devem armazenar os dados fornecidos como parâmetros em atributos privados. Estes atributos devem ter métodos getters associados, que irão expor os valores para códigos externos à classe.

A classe Data deve ter também um método exibir() utilizado para exibir a data e hora representados pelo objeto. Este método recebe como parâmetro o Areato de hora que deve ser utilizado para exibir as horas (12 ou 24h). Se o objeto foi construído sem inAreação de horário, este parâmetro não afeta a impressão.

Os Areatos da hora são do tipo int, mas devem ser representados por duas constantes na classe Data: AreaTO_12H e AreaTO_24H.

Para entender melhor o funcionamento do método exibir(), observe como ele deve se comportar em diversas situações: 

 [colocar imagem 06]

- [ ] Feito

---
12. Crie a classe Figura que representa figuras geométricas, representadas pelas classes Quadrado e Retangulo. Uma figura pode ter sua área calculada a partir do método calcularArea(), que retorna a área calculada da figura em Area de um double.

Crie também a classe FiguraComplexa. Uma figura complexa é também uma figura, mas a diferença é que ela é composta por várias figuras (quadrados, retângulos ou até outras figuras complexas). Para calcular a área de uma figura complexa, basta somar a
área de todas as figuras que a compõem.

Para executar a aplicação, crie a classe Calculador, que é responsável por criar uma figura complexa e calcular a sua área. 

Esta figura deve ser composta por:
• 1 quadrado com 3 de lado
• 1 quadrado com 10 de lado
• 1 retângulo com lados 2 e 7
• 1 retângulo com lados 5 e 3

Dica: Perceba a diferença entre uma classe ser uma figura e ter uma ou mais figuras. A primeira relação é de herança, enquanto a segunda implica em uma composição.

- [ ] Feito

---
13. Implemente a classe Colecao e duas subclasses: Pilha e Fila. Uma coleção tem um array de dados que fazem parte da coleção.
Tanto a pilha como a fila são coleções. A diferença entre elas está na disciplina de acesso. Na pilha, o último elemento inserido é o primeiro a ser removido (como numa pilha de pratos). Na fila, o primeiro elemento inserido é o primeiro a ser removido (como numa fila de banco).

Os métodos da classe Colecao responsáveis por estas operações são:
• void inserirItem(Object item)
• Object removerItem()

Crie um método que recebe uma coleção, adiciona alguns elementos e remove estes mesmo elementos. Imprima os elementos removidos e veja a diferença no resultado. 

- [ ] Feito

---
14. Crie duas classes: Ponto2D e Ponto3D. Ponto2D possui como atributos as coordenadas x e y, enquanto Ponto3D, além delas, também possui a coordenada z. Utilize a relação de herança para representar estas classes.

A respeito dos construtores, Ponto2D deve ter apenas um construtor, que recebe os valores de x e y como parâmetros (tipo double). Já Ponto3D também deve ter apenas um construtor, que deve receber x, y e z como parâmetros (também do tipo double).

Dica: Se a relação de herança e a declaração dos construtores foram feitas corretamente, você deverá, obrigatoriamente, chamar o construtor da superclasse explicitamente.

Ambas as classes devem sobrescrever o método toString(), que é originalmente declarado na classe Object. Este método deve retornar uma representação do objeto em Area de String, indicando qual o valor de cada coordenada. É importante que
Ponto3D tire proveito do método toString() de Ponto2D para mostrar os valores das coordenadas x e y. 

- [ ] Feito

---
15. Crie uma classe Veiculo com um atributo ligado (privado), que indica se o carro está ligado ou não. Esta classe deve ter também os métodos ligar() e desligar(), que definem o valor para este atributo, e um método getter (isLigado()).

Depois crie três subclasses de Veiculo: Automovel, Motocicleta e Onibus. Cada classe destas deve sobrescrever os métodos ligar() e desligar() e devem imprimir mensagens como “Automóvel ligado”, “Motocicleta desligada”, etc. Para manter a consistência do modelo, descubra como fazer para que o atributo ligado de Veiculo tenha o valor correto quando os métodos são chamados.

Crie uma aplicação que instancia três veículos, um de cada tipo, e chama os métodos ligar(), desligar() e isLigado(). O resultado obtido deve ser consistente com o que o modelo representa. Por exemplo, ao chamar o método ligar() de um Automovel, é
esperado que o método isLigado() retorne true. 

- [ ] Feito

---
16. Crie uma interface AreaCalculavel com um método calcularArea() e crie classes de figuras geométricas que implementam este método (como quadrado, circunferência e retângulo). Depois crie uma classe com um método main() para exercitar as chamadas aos métodos que calculam a área. 
 
- [ ] Feito

---
17. Crie uma classe ContaBancaria, que representa uma conta bancária genérica e não pode ser instanciada. Esta classe deve ter um atributo saldo (visível apenas para ela e para as suas subclasses) e os métodos depositar(double), sacar(double) e
transferir(double, ContaBancaria). Estes métodos devem depositar um valor na conta, sacar um valor da conta e transferir um valor da conta de origem para uma conta de destino, respectivamente.

Além destes, ContaBancaria deve ter um método calcularSaldo(). Este método possui a regra do cálculo do saldo final (que pode ser diferente do saldo armazenado no atributo saldo) e deve ser obrigatoriamente implementado pelas subclasses de
ContaBancaria, pois cada classe possui suas próprias regras de cálculo.

Crie duas subclasses de ContaBancaria: ContaCorrente e ContaInvestimento. Cada uma deverá implementar suas regras para calcular o saldo (método calcularSaldo()). No caso de ContaCorrente, o saldo final é o saldo atual subtraído de 10%, referente a
impostos que devem ser pagos. Já para a ContaInvestimento, o saldo final é o saldo atual acrescido de 5%, referente aos rendimentos do dinheiro investido.

Crie uma aplicação que instancia uma conta corrente e uma conta investimento e executa as operações de depósito, saque, transferência e cálculo de saldo. Verifique se os resultados obtidos são consistentes com a proposta do modelo e com as regras de cálculo estabelecidas. 
 
- [ ] Feito

---
18. O Java possui uma interface chamada Cloneable, que pode ser implementada por classes que são capazes de gerar cópias de objetos. Esta interface não possui qualquer método, mas classes que implementam esta interface devem sobrescrever o método
clone(), definido na classe Object. Dentro deste método é implementada a lógica para criar um novo objeto com base no objeto original. 

Com base nisto, crie uma classe Porta que suporta a criação de novos objetos (cópia). Ela deve ter os atributos altura (double), largura (double) e aberta (boolean). Também deve possuir os métodos abrir(), fechar() e os métodos getters correspondentes aos atributos. 

Como uma porta pode criar outras cópias dela mesma, você deve sobrescrever o método clone(), o qual deve criar um novo objeto com os valores dos atributos copiados e retorná-lo. 

Obs.: O método clone() lança uma exceção (CloneNotSupportedException). Não é preciso se preocupar com ela neste momento, então declare o método main() da sua aplicação da seguinte Area: 

```java
public static void main(String[] args) throws CloneNotSupportedException {
 //...
} 
```
 
- [ ] Feito

---
19. Crie uma classe em Java chamada Data que inclui três inAreações como variáveis de instância:

• mês (int),
• dia (int)
• e ano (int).

A classe deve ter métodos get e set para cada variável e um construtor que inicializa as variáveis e assume que os valores fornecidos são corretos. Forneça um método exibirData que exibe o dia, o mês e o ano separados por barras normais ( / ). Escreva um método main que demonstre as capacidades da classe Data.
 
- [ ] Feito

---
20. Crie uma classe calculadora. Esta classe deve ser abstrata e implementar as operações básicas (soma, subtração, divisão e multiplicação). Utilizando o conceito de herança crie uma classe chamada calculadora científica que implementa os seguintes cálculos: raiz quadrada e a potência. Dica utilize a classe Math do pacote java.lang.

- [ ] Feito

---
21. Crie uma estrutura hierárquica que contenha as seguintes classes: Veiculo (classe abstrata), Bicicleta e Automóvel.
Os métodos da classe Veiculo são todos abstratos e possuem a seguinte assinatura:

• public float acelerar(float velocidade);
• public void parar();

Estes métodos são implementados nas subclasses Automóvel e Bicicleta. Acrescentar na classe Automóvel o método public void mudarOleo(float litros).

- [ ] Feito

---
22. Escreva um programa para armazenar dados de veículos. Primeiramente, crie a classe Motor que contém NumeroCilindro (int) e Potencia(int). Inclua um construtor sem argumentos que inicialize os dados com zeros e um que inicialize os dados com os valores recebidos como argumento. Acrescente dois métodos, um para a entrada de dados, Get(), e um que exiba os dados, exibir().

Escreva a classe Veiculo contendo Peso em quilos (int), VelocidadeMaxima em Km/h (int) e Preco em R$ (float). Inclua um construtor sem argumentos que inicialize os dados com os valores recebidos como argumento. Acrescente dois métodos, um para a entrada de dados, Get(), e um que imprima os dados, exibir().

Crie uma classe CarroPasseio derivada das classes Motor e Veículo como base. Inclua Cor (string) e Modelo (string). Inclua um construtor sem argumentos que inicialize os dados com zeros e uma que inicialize os dados com os valores recebidos como argumentos. Acrescente dois métodos, um para a entrada de dados, Get(), e um que exiba os dados, exibir().

Crie uma classe Caminhao derivada das classes Motor e Veiculo. Inclua Toneladas (carga máxima), AlturaMaxima (int) e Comprimento (int). Inclua um construtor sem argumentos que inicialize os dados com zeros e um que inicialize com os valores recebidos como argumento. Acrescente dois métodos, um para a entrada de dados, Get(), e um que exiba os dados, exibir().

- [ ] Feito

---
23. Implemente uma classe abstrata de nome Area onde são declarados dois métodos abstratos:

• float calcularArea();
• float cacularPerimetro();

Crie, como subclasse de Area, uma classe de nome Retangulo cujas instâncias são caracterizadas pelos atributos lado e altura ambos do tipo float. Implemente na classe Retangulo os métodos herdados de Area e outros que ache necessários.

Crie, como subclasse de Area, uma classe de nome Circulo cujas instâncias são caracterizadas pelo atributo raio do tipo float. Implemente na classe Circulo os métodos herdados de Area e outros que ache necessários. Nota: poderá aceder ao valor de Pi fazendo Math.Pi.

Crie, como subclasse de Retangulo, uma classe de nome Quadrado cujas instâncias são caracterizadas por terem os atributos lado e altura com o mesmo valor.

Elabore um programa de teste onde é declarado um array, de dimensão 5, do tipo estático Area. Nesse array devem ser guardadas instâncias de Retangulo, Circulo e Quadrado seguindo uma ordem aleatória. Nota: para gerar números aleatórios crie primeiro uma instância da classe Random (presente na biblioteca java.util) e para extrair um inteiro entre 0 e n efetue a evocação
nextInt(n). Depois implemente um ciclo que percorra o array evocando, relativamente a cada um dos objectos guardados, os métodos calcularArea e calcularPerimetro.

- [ ] Feito