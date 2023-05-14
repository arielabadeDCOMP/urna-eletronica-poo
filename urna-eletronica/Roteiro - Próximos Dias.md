

POO + ESTRUTURA DE DADOS

# SEXTA

# SÁBADO

- [x] Orientação a objetos (slide 03), Classes e Objetos 01 + 01.1 + Slide 2, Slide 4 + + Lista 01 (definição de setters e getters, inicialização de construtores, etc), Abstração e polimorfismo
- [x] Perguntas base de Kalil

Tudo em java é feito através de apontadores para a memória.

==//this é usado como um acesso a referência guardada de determinado objeto==

1) natural
2) confiável
3) extensível
4) manutível
5) reutilizável

![[Pasted image 20230217133112.png]]

![[Pasted image 20230217133624.png]]

Objetos sempre interagem entre si através da troca de mensagens


- Classe: agrupamento de objetos com características e propriedades em comum, a classe no geral, representação uma abstração==. Classe nada mais é que uma abstração de objetos que tem atributos, comportamentos e relacionamentos semelhantes.==  Por exemplo: ao criar a classe carro, podemos criar a abstração de um carro, ou seja, a  classe possui ==atributos== de um carro, como cor, portas, ano, modelo, e colocar todas essas características dentro de uma classe, define a abstração de um carro.
- Objeto: e==stado (atributos) + comportamento (métodos) + identidade (nome e espaço reservado na memória para aquele objeto)==. Estado é o valor do atributo ao objeto pelos atributos que ele porta, de acordo com as variáveis internas alocadas nele, logo, o estado é mutável. O comportamento são o conjunto de ações que aquele objetivo pode performar, através de seus métodos. E a identidade é o conjunto de características que permite identificar um objeto de forma única, como por exemplo: o nome do objeto e o espaço que ele ocupa na memória.
- Instância: uma instância é a criação de um objeto, a partir de determinada classe, que contém seus próprios atributos, e consequentemente, sua própria identidiade.  ==O que varia em um objeto é o estado da instância. Todo novo objeto as características de uma classe é denominado de instância daquela classe.== (nessa resposta, seria importante definir objeto, classe, atributo e identidade. Tudo o que é citado e não é óbio)
- Abstração: habilidade de ==se concentrar nos aspectos essenciais que definem um objeto, de forma lógica==, em um contexto qualquer, ignorando características menos importantes ou acidentais.
- Métodos: representa uma atividade que um objeto possa executar. É um conjunto de instruções que são executaddas pelos objetos. ==Eles podem receber parâmetros de entrada e retornar valores, mas não é obrigatório.==

![[Pasted image 20230312165404.png]]

- Funções: A função, normalmente, recebe um parâmetro e retorna valores (essa última parte não é obrigatória), tal qual o método. Em POO, especificamente, a diferença de um método e uma função é que um método está intimamente ligado a uma classe ou objeto, enquanto uma função, pode ser chamada em qualquer lugar do programa e ==não precisa estar associado a um objeto específico.==
- Herança: ==É um mecanismo que permite definir relacionamentos entre classes e subclasses, tal que a subclasse (classe herdeira) herde atributos e métodos da superclasse (classe mãe). Dessa forma, podemos basear uma nova classe baseada em uma classe previamente existente.== Dentre, as vantagens de usar herança, estão o reaproveitamento de código, facilidade em manutenção futura e a capacidade da especialização de uma classe baseada em outras classes. OBS: java não suporta herança multipla
- Polimorfism==o: É a redeclaração de métodos previamente herdados por uma classe.== Existem 4 tipos de polimorfismo: inclusão, paramétrico, sobrecarga e sobreposição. Definir cada um deles postumamente. Overloading = muda o parametro de retorno. Overriding = muda de acordo com o tipo de chamada do método
- Encapsulamento: É a técnica de esconder a implementação interna de um objeto e expor apenas uma interface pública (que exibe uma lista de funcionalidades que podem ser implementadas por aquele método, de forma bem definida) que possa ser utilizada na comunicação entre outros objetos. Um dos principais objetivos do encapsulamento é proteger os dados de um objeto, de forma que seu estado interno não seja alterado de forma maliciosa, e também prevenir que os objetos não sofram efeitos colaterais provenientes de alto acoplamento, que é a dependência de métodos entre si. Por fim, o objetivo do encapsulamento é  obter mais controle sobre o código e o escopo do projeto, e, além disso, ele é um dos principais princípios quando se trata de reusabilidade de código. ==Uma observação importante sobre encapsulamento é: para que você quer um método que você não vai usar? Se você não vai usar, não defina==
- Atributos: representam características de uma classe, que são peculiaridades que variam de um objeto para outro. ==As classes contém os atributos que definem os objetos, mas o valores alocados nos atributos são alocados quando se cria uma instância dos objetos, portanto, os objetos contém os valores dos atributos relativos as classes as quais eles pertencem. Classes costumam definir os atributos, mas não é a classe que contém os atributos. São as instâncias que contém os atributos, e seus respectivos valores alocados.== O que varia em um objeto são é a mudança de valores alocadas em  um atributo a cada nova instância definida.
- Visibilidade: privada = apenas objetos da classe detentora. publica = qualquer objeto no arquivo. protegida = apenas objetos da classe detentora ou subclasses (geralmente usada para herança). Pacote = qualquer objeto dentro do pacote.
  - Definição de atributos: pode ser feita com private ou public
  ```java
  public class Produto {
/* Atributos da Classe */

	private int codigo;
	private String nome;
	private int quantidade;
	private float preco;
  
```

- Construtores: inicializam os atributos da classe para que seja possível alocar valores e números neles. O objetivo deles é referenciar os construtores.
```java
public Produto (int codigo, String nome, int quantidade, float preco) {
this.codigo = codigo;
this.nome = nome;
this.quantidade = (quantidade > 0)? quantidade:0;
this.preco = preco;
}
```

![[Pasted image 20230312165740.png]]

- This: referência a um objeto para si próprio, com o intuito de armazenar os valores alocados nos atributos. O objetivo dele é conseguir obter diferenciação entre parâmetros de métodos e atributos de instância com o mesmo nome. A==lém disso, com o this, é possível retornar uma referência para o próprio objeto em um dos seus métodos, como ocorrer com os setters, que são modificadores.==
- Getters (métodos de acesso): o método de acesso é a única forma de ter acesso a dados internos, para representar os dados que foram alocados
```java
/* métodos de acesso */
public int getCodigo() {b //obrigatório ter o tipo de dado de retorno
return this.codigo;
}
public String getNome() {
return this.nome; //pode retornar só o nome também, a depender da necessiddade
}
public int getQuantidade() {
return this.quantidade;
}
public float getPreco() {
return this.preco;
}
```
- Setters(modificadores): permitem alterar o estado de um objeto interno, dessa forma, é possível definir novos valores alocados aos atributos
```java
/* métodos modificadores ou mutantes */
public void setCodigo(int codigo) {
this.codigo = codigo;

}
public void setNome(String nome) { //o retorno nesse caso, é sempre vazio

this.nome = nome;

}
public void setQuantidade(int quantidade){

this.quantidade = (quantidade > 0)? quantidade:0;

}
public void setPreco(float preco) {

this.preco = preco;

}
```

#### Sobre modificadores

```java

  
1) setter sempre são: public void setVariable (<type> variable) {
  this.variable = variable; =  makes a object reference


2) getters sempre public type getVariable() {
  this.variable = variable; // modificador de acesso


// a função pode puxar o objeto em si, ou puxar uma referencia ao objeto, vai depender do que você quer fazer, com relação aos modificadores.

//a implementação dos setters e getters depende do que você quer ou não mostrar ao usuário
```

#### Sobre scanners, inputs e construtores
```java

Scanner input = new Scanner(System.in); //declaração da variável e do espaço de memória alocado

//o input é uma função composta dentro do modificador. A gente também pode fazer isso com um construtor com as referências definidas manualmente.

    paciente.setNome(input.nextLine()); //o tipo do input depende do tipo de dado alocado
    

```

```java
//É possível definir métodos construtores, e setters e getters, sem impactar na usabilidade geral do código. Isso torna o código mais flexível e é uma boa prática quando se trata de escopo de projeto.

public Salario25(double salario, double aumentoSalario) {
  this.salario = salario;
  this.aumentoSalario = aumentoSalario;
  
}

  public void setSalario(double novoSalario){
    salario = novoSalario;
}
  public double getSalario(){
    return salario;
  }

  public void setAumentoSalario(double novoAumentoSalario){
    aumentoSalario = novoAumentoSalario;
}
  public double getaumentoSalario(){
    return aumentoSalario;
  }
//chamada com o método main

Salario25 funcionario = new Salario25(100,0.25);
    funcionario.setSalario(100);
    funcionario.setAumentoSalario(0.25);



```

Não crie métodos que não serão usados, e sempre pense se aquela operação ou atributo precisa ser utilizado em algum outro lugar do código. Caso não seja necessário, define a variável e realize a operação dentro do escopo da função, para retornar depois.



- Métodos de negócio: usaddos para implementar as funcionaliddades requeridas na aplicação. Existem diversas formas de executar a transcrição desses métodos. No caso abaixo, é interessante por que ele usa o this.preco e this.quantidade para passar uma referência ao próprio objeto.
```java
/* método do negócio */
public float obterValorEstoque() {
return this.preco * this.quantidade;
}

```
- Declaração de variável: Produto p1 = declara o novo objeto p1, que é uma variável, com seus atributos. New Produto = reserva o espaço de memória necessário para que as instâncias, e os valores dos atributos de p1 sejam definidos. Por isso que se você p1 = p2 em java, pode dar erro, por que o que está sendo comparado não são os valores dos atributos, mas sim os espaços de memórias nos quais eles estão alocados.
![[Pasted image 20230312170837.png]]

Para mitigar esse problema, poemos fazer uso do método (equals):

```java
public class Pessoa {
    private String nome;
    private int idade;

    // Construtor, getters e setters omitidos

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Verifica se é a mesma referência
        if (obj == null) return false; // Verifica se o objeto é nulo
        if (getClass() != obj.getClass()) return false; // Verifica se são da mesma classe
        Pessoa outraPessoa = (Pessoa) obj;
        return idade == outraPessoa.idade && Objects.equals(nome, outraPessoa.nome);
    }
}

```
- Variável Primitiva x Variável de Referência

Variável primtiiva = um valor;
Variável de referência = como chegar em um objeto através da instância; não armazena um valor, armazena uma referência \ cópia do objeto

Dessa forma, podemos dizer que...
![[Pasted image 20230312171126.png]]




  - Qual a diferença entre programação imperativa e programação orientada a objetos?
      R = A principal diferença entre a programação imperativa e a programação orientada a objetos é a forma como os programas são organizados. Na programação imperativa, os programas são organizados em termos de instruções que descrevem o que o programa faz. Na programação orientada a objetos, os programas são organizados em termos de objetos que representam entidades do mundo real ou abstrações lógicas e interagem entre si para executar tarefas. Ou seja, a capacidade de criar objetos e de abstração são os principais diferenciais.
----

- Qual a diferença entre programação procedural (funcional) e programação orientada a objetos?
    R = A principal diferença entre a programação procedural e a programação orientada a objetos é a forma como os programas são organizados e estruturados. Na programação procedural, os programas são organizados em termos de funções e procedimentos que manipulam dados, e obrigatoriamente, possuem paramêtros e argumentos que retornam alguma coisa. Na programação orientada a objetos, os programas são organizados em termos de objetos que representam entidades do mundo real ou abstrações lógicas e interagem entre si para executar tarefas.

  -----------
- Defina a diferença entre objeto e classe.
    R: Uma classe é uma definição abstrata de um objeto, com suas respectivas características identitárias abstraídas. Enquanto um objeto é uma instância concreta da definição de classe, que manifesta característica próprias, como cor: vermelho, modelo: fiesta, placa: HZZ9189, ano: 2002.
    
    ----------
- Qual a diferença entre um método e uma função?
	R = A principal diferença entre um método e uma função é a terminologia. O termo "método" é geralmente usado em Java para descrever uma função que pertence a uma classe ou objeto específico. Um método pode acessar e modificar dados da classe ou objeto ao qual pertence, e pode ser chamado usando a notação ponto (".") seguida do nome do método e dos parâmetros, como em "objeto.metodo(parametros)".
	
	Por outro lado, o termo "função" é geralmente usado em outras linguagens de programação para descrever um bloco de código que pode ser chamado de qualquer lugar do programa e pode ou não estar associado a uma classe ou objeto específico.
 -----------
- Quais são as boas práticas definindo classes, métodos, funções e objetos?
    R = Classe sempre começa com letra maíscula, métodos e funções precisam estar sempre no infinitivo. Ter uma nomenclatura semântica e intuitiva é essencial. Inicializar o método construtor manualmente é uma boa prática para obter controle, e também quando se trata de testes. Cada método deve ser responsável por apenas uma ação dentro do código.
    
  --------
- Qual a diferença entre métodos entre static e outras palavras reservadas?
    R = Quando um membro é declarado como "static", significa que ele é compartilhado por todas as instâncias da classe e pode ser acessado diretamente pela classe, sem a necessidade de criar uma instância dessa classe. Métodos estáticos só podem acessar atributos estáticos da mesma classe pertencente que a deles. Além disso, eles não precisam da chamada de um objeto para serem executado, tendo em vista que eles são inicializados no momento de execução do programa, e geralmente são utilizados para realizar ações que precisam ser executadas toda vez que um programa é executado, como por exemplo, criar uma nova matricula. O método static é usado para definir valores padrão que devem ser usados em diversos objetos.
---------

- Qual a diferença entre private, public e outras palavras reservadas?
    R = private: acessível apenas para as entidades da classe pertencente. public: acessível para todo mundo. protected =  acessível para a classe e para as subclasses. package=acessível para todas as classes do pacote.

-----

- "Code once, run everywhere" Explique essa frase do java
     R = Em resumo, o lema "code once, run everywhere" do Java é possível graças aos princípios da JVM, que permitem que o código Java seja compilado uma vez e executado em qualquer plataforma que suporte a JVM. Tradução do código em bytecode quando é compilado.
---------

- O que é alta coesão e baixo acoplamento?
    R =  relação de funcionalidade e interdependência entre as métodos e mensagens passadas ao longo de todo o programa, que favprece o reuso.
    
    Coesão: cada método da classe tem apenas uma responsabilidade
    Baixo acoplamento: os metódos da classe devem possuir baixar interdependência entre si.
    
    Encapsulamento é princípio que torna isso possível.

- A abstração é um dos pilares da POO? Se sim, por que?
    R = A abstração permite que os programadores possam criar modelos mais simples e compreensíveis de objetos do mundo real, facilitando a reutilização de código e a construção de sistemas mais complexos. Por isso, é considerada um pilar fundamental da programação orientada a objetos.
------

- Uma constante define e pode alterar um objeto?
 R = ela pode definir um objeto, mas não pode ter seu valor alterado ao longo da execução do programa.
	- O que é a assinatura de um método?
	  R = a assinatura de um método ou função é a sua declaração, que inclui o nome do método ou função, os tipos e ordem dos parâmetros, e o tipo de retorno (se houver).
	  A assinatura de um método ou função é usada para identificar e diferenciar um método ou função de outro com o mesmo nome, mas com uma assinatura diferente. Isso é conhecido como sobrecarga de método ou função, que é a capacidade de ter várias definições do mesmo método ou função com diferentes assinaturas.

-----------

 
# DOMINGO

- [x] Dicionário do Java - Cheatseet (Slide03)+ Estrutura de Controle Java (Slide 06)+ Estruturas de Repetição (Slide 7) + Lista 01 + Lista 02 + Lista 02 + Lista 03 + A linguagem JAVA
- [x] Buscar 2 artigos de método

#### Estruturas de controle e laços de repetição:

- If
```java
if(exp) {
 comando;
}
```



- If / Else 
```java
if (exp) {
	comando;
} else {
	comando;
}
```


- Switch
```java
switch (exp) {
case valor1:
lista comandos1; break;
case valor2:
lista comandos2; break;
default:
lista comandos3;

}
 //cso os casos não sejam registrados, o valor default é retornado
 
```



- While: enquanto a condição estabelecida for verdaddeira, os comandos serão executados. ==Geralmente é usado quando o número de repetições não é fixo==, e o teste condicional ocorre justamente no escopo do começo do código.
```java

while (exp) {
	comando1;
	comando2;
	...
}

```

Link do replit 1:

- Do While: usado quando o número de repetições não é fixo. Ele também executa o código até a condição ser verdddeira, mas a checagem do condicional ocorre no fim do código. ==É usado quando algum bloco de comando precisa ser executado pelo menos uma vez.==
  
```java

do {
comandos;
} while (exp)

```

Link do replit 1:

- For
 Utilizado quanddo o número de vezes que o laço irá executar é conhecido. O teste do condicional ocorre logo no começo.

```java

for (inicialização; testeDeTérmino; incremento/decremento) {
comandos;
}

//os comandos da inicialização são executados apenas uma única vez
//o teste de término é executado antes de cada iteração, e ao retornar false, o laço encerra.
// o incremento ou decremento é executado após o fim de cada operação.



```



Uma coisa interessante do for é não ficar peso a sintaxe do i++, ou i--, tendo em vista que o laço for podde executar formas de incremento como i*=x, etc, então tem muitas possibilidades além do for comum.

- Return: provoca a saída de um método e retorna o estado atual do que você quer puxar dele. Possui duas formas: ==com valor de retorno e sem valor de retorno (void, no caso).==

```java
// Retornar o primeiro múltiplo de 3 maior que i

public static int retornaMultiplo(int i) {
while (true) {
if (i % 3 == 0)
return i; //retorna o múiltiplo e sai do método
i++;
}
}

```

- Break: serve para determinar a quebra dda intrução da estrutura, e pode ser usado com swithch, for, while e do while.  ==Provoca sempre a saída do laço ou switch mais interno.==

```java

for (int contador = 1; contador <= 1000; contador++) {
	System.out.println("Esta é a repetição nr: " + contador);
	if (contador == 10)
break;

}

```

- Continue
 Faz com que um laço continue na próxima iteração, ignorando o restante dos comandos. Ou seja, O continue executa algo ddiferente e se torna a prioridade dentro do laço.

```java
for (int i = 0; i < 100; i++) {
	if (i > 50 && i < 60) {
	continue;
}
	System.out.print(" " + i);
}
```


# SEGUNDA

- [x] Slide 8 + Arrays - Terminar Lista
- [x] Refazer questões que selecionei da lista de Kalil

https://replit.com/@arielabade/ProvaL13Inversos
https://replit.com/@arielabade/ProvaL2Weekdays
https://replit.com/@arielabade/ProvaL2Ternario
https://replit.com/@arielabade/ProvaL2MediaCondicionais
https://replit.com/@arielabade/ProvaL3NumerosParesWhile
https://replit.com/@arielabade/ProvaL3NumerosParesFor
https://replit.com/@arielabade/ProvaL3NumerosParesDoWhile
https://replit.com/@arielabade/ProvaL3NumerosParesDoExponential232
https://replit.com/@arielabade/ProvaL3NumerosParesDoPlayersName
https://replit.com/@arielabade/ProvaL4Produto
https://replit.com/@arielabade/ProvaL4Playersname
https://replit.com/@arielabade/ProvaQUESTAOSALA













Perguntas Kalil:

1) Como esponder uma questão de código na prova?
2) Precisa criar todos os setters e getters para todos os atributos, ou só os necessários? só os necessários. Construtor conta como modificador.