# Map
Map é uma estrutura de dados que (armazena pares chave-valor).
podemos acessar cada valor por meio de sua (chave)

- Chave-Valor, sem valores duplicados.
- Implementações: HashMap, LinkedHashMap, TreeMap

## Principais implementações são:
 - HashMap (mais usada, sem ordem garantida é o mais rapido)

 - LinkedHashMap (mantém a ordem de inserção)

 - TreeMap (ordena pelas chaves)

### Principais métodos do Map:
Método	Descrição
 - put(chave, valor)	Adiciona ou substitui um par chave-valor
 - get(chave)	Retorna o valor associado à chave
 - remove(chave)	Remove o par com essa chave
 - containsKey(chave)	Verifica se a chave existe
 - containsValue(valor)	Verifica se o valor existe
 - keySet()	Retorna todas as chaves
 - values()	Retorna todos os valores
 - entrySet()	Retorna todos os pares chave-valor
  