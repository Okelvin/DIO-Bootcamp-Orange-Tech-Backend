# DIO - Bootcamp Orange Tech + Backend 

# Sumário

## 1. 
## 2. 
## 3. 
## 4. 
## 5.  Collections


---

## 1. 

## 2. 

## 3. 

## 4.

## **5. Collections** 

---

### **NOTAS**



*  O Collections Framework facilita o trabalho de programação. Ex.: Limitações dos **Arrays** - trabalhar com um array pode ser custoso, pois apresenta pouca flexibilidade uma vez que somos obrigados a definir de antemão quantas posições o array terá (o que dificulta a manutenção do código), além de ser complicado saber quantas posições estão ocupadas, complicado excluir elementos, etc ...

* A implementação **Vector** da **interface List** é **thread safe**, ou seja, quando em situação de 'programação concorrente' é garantida a consistência da aplicação (quando dois processos concorrem por um recurso, é garantido a o término de um antes do outro iniciar, evitando o 'race condition' e as inconsistências decorrentes).

* Sobre o método **toString()** e a necessidade de sobre escrevê-lo (**@override**): https://www.devmedia.com.br/como-criar-sobreposicoes-usando-o-metodo-tostring-em-java/29042


### **INTERFACE LIST**

|**Classe**|**Métodos**|**Classe**|**Métodos**|
|:----:    |:----:     |:----:    | :----:    | 
|ArrayList |add()      |LinkedList|           |
|          |toString() |          |           | 
|          |indexOf()  |          |           |
|          |set()      |          |           |
|          |contains() |          |           |
|          |get()      |          |           |
|          |next()     |          |           |
|          |iterator() |          |           |
|          |hasNext()  |          |           |
|          |size()     |          |           |
|          |remove ()  |          |           |
|          |clear()    |          |           | 
|          |isEmpty()  |          |           |
|          |compareTo()|          |           |
|          |compare()  |          |           |

* Importar **java.util.List**

* Permite elementos duplicados e respeita a ordem de inserção.

* Classe ArrayList mais indicado para aplicações em que há necessidade de pesquisar os elementos, enquanto o LinkedList é mais utilizado para situações em que a adição e remoção de elementos é mais frequente.

* Sobre a ordenação de elementos numa coleção/lista, existem basicamente duas situações: a ordenação pela 'ordem natural' ou uma ordenação 'customizada'. No primiero caso, utiliza-se a interface **comparable**, no segundo a interface **comparator**.  
    * Mais infos a interface **comparable** e o método **compareTo()** vs. a interface **comparator** e o método **compare()**: 
        *  https://www.geeksforgeeks.org/how-to-override-compareto-method-in-java/

        * https://www.alura.com.br/artigos/ordenando-colecoes-com-comparable-e-comparator

        * https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html
        
### **INTERFACE SET**

* Importar java.util.Set

* Não permite elementos duplicados e não possui índice.

* Classe Hashset não matém a ordem de inserção dos elementos, já a LinkedHashSet mantém e a classe TreeSet ordena por default usando a ordem natural (se ON não for aplicável, deve-se implementar o comparator)

* Ao se trabalhar com classes que tem o 'hash', é necessário sobrescrever o 'equals' e o 'hashCode'.


### **INTERFACE MAP**

* Trabalha com pares de chave (únicas) e valores: (k,v)
* Comparação entre as classes HashMap, LinkedHashMAp e TreeMap:  
    * https://stackoverflow.com/questions/2889777/difference-between-hashmap-linkedhashmap-and-treemap
* Lista de métodos da classe HashMAp:
    * https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html
    * Atenção especial ao método **entryset**, que permite relacionar as keys e os values separadamente. O método retorna um Set, que permite o uso dos métodos **getKey()**, **getValue()** e **setValue(V var1)**.

### **Stream**

* **Classe Anônima:** é uma classe não recebeu um nome e é tanto declarado e instanciado em uma única instrução. Você deve considerar o uso de uma classe anônima sempre que você precisa para criar uma classe que será instanciado apenas uma vez. Ex.: Implementar uma interface comparator para ser usada uma única vez.

* **Functional Interface:** Qualquer interface com um SAM (Single Abstract Method) é uma interface funcional e sua implementação pode ser tratada como expressões lambda. Ex.: Métodos **Comparator**, **Consumer**, **Function**, **Predicate**.

``` 

@FunctionalInterface
public interface Comparator<T> {
    @Contract(pure = true) int compare (T var1, T var2);
}

``` 

* **Função Lambda:** é uma função sem declaração, isto é, não é necessário colocar um nome, um tipo de retorno e o modificador de acesso. A ideia é que o método seja declarado no mesmo lugar em que será usado. As funções lambda em Java tem a sintaxe
definida como (argumento) -> (corpo). 

* **Reference Method:** é um novo recurso do Java 8 que permite fazer referência a um método ou construtor de uma classe (de forma funcional) e assim indicar que ele deve ser utilizado num ponto específico do código, deixando-o mais simples e legível . Para utilizá-lo, basta informar uma classe ou referência seguida do símbolo “::” e o nome do método sem os parênteses no final. Ex.:

```
numeros.Aleatorios.stream().forEach(System.out::println);

```


* **Streams API:** A Streams API traz uma nova opção para a manipulação de coleções em Java seguindo os princípios da programação funcional. Combinada com as expressões lambda, ela proporciona uma forma diferente de lidar com conjuntos de elementos, oferecendo ao desenvolvedor uma maneira simples e concisa de escrever código que resulta em facilidade de manutenção e paralelização sem efeitos indesejados em tempo de execução: Source -> Pipeline -> Operação Terminal.

 * Operações possíveis: **.collect()** (interfaces Collector e Supplier), **.forEach()**, **.limit()**, **.map()** (interface function), **.filter()**,
     * 











      

<p style="text-align: center;">Centered text</p>
