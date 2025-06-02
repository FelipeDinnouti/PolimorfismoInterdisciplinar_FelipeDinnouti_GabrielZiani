# Sistema Educacional Zinnouti

## Visão Geral

O **Sistema Educacional Zinnouti** consiste em um sistema que permite que alunos estudem as disciplinas de ensino médio de forma lúdica e divertida. O projeto foi desenvolvido integralmente com a linguagem **Java**, utilizando conceitos de Orientação a Objetos, principalmente o **polimorfismo**.

As disciplinas escolhidas para compor o sistema foram **Biologia**, **Matemática** e **Física**. Os assuntos abordados dentro dessas disciplinas são:
1. Biologia - Organelas Celulares;
2. Matemática - Progressões;
3. Física - Dilatação Térmica.

Além da opção de estudar o conteúdo pela teoria, a partir da criação de um menu de cada disciplina, o usuário consegue estudar com **exercícios lúdicos**. Em Biologia, por exemplo, no exercício **Mistério da Organela**, o usuário deverá descobrir qual organela celular está sendo descrita com base em pistas fornecidas. Outro exemplo é o exercício **Trilha Progressiva do Everest** de matemática, em que o usuário deve calcular os problemas de PA e PG para conseguir alcançar o topo do Monte Everest.

## Modelagem

O sistema foi modelado se baseando nos princípios da **Programação Orientada a Objetos**. A estrutura foi dividida em classes com responsabilidades definidas, permitindo a reutilização e uma melhor organização do código. 
O sistema possui um Menu principal para o usuário decidir qual disciplina ele deseja estudar, que redireciona para os Menus específicos de cada disciplina. Foram criadas também listas ArrayList para armazenar múltiplas progressões.

### Classe Abstrata `Progressoes`
A classe abstrata Progressoes define um modelo geral para as principais progressões matemáticas (Aritmética, Geométrica e Harmônica), contendo os atributos: 
- razao
- primeiroTermo

Possui métodos abstratos como:
- `mostrarDefinicao`
- `calcularTermoGeral`
- `calcularSomaDosTermos`
- `mostrarDados`

Ela é estendida pelas subclasses:
- `ProgressaoAritmetica`
- `ProgressaoGeometrica`
- `ProgressaoHarmonica`

Cada subclasse implementa as fórmulas específicas com base em sua lógica matemática.

### Classe Abstrata `DilatacaoTermica`
A classe abstrata DilatacaoTermica define a estrutura para as diferentes dilatações térmicas, contendo os atributos:
- variacaoTemperatura
- coeficienteDeDilatacao

Possui métodos abstratos como:
- `mostrarDefinicao`
- `calcularDilatacao`

Ela é estendida pelas subclasses:
- `DilatacaoLinear`
- `DilatacaoSuperficial`
- `DilatacaoVolumetrica`

Cada subclasse implementa as fórmulas específicas com base em sua lógica matemática.

### Classe Abstrata `OrganelasCelulares`
A classe abstrata OrganelasCelulares define a estrutura para as diferentes organelas celulares, contendo os atributos:
- nome
- funcao

Possui métodos abstratos como:
- `mostrarLocalizacao`
- `mostrarfuncao`

Ela é estendida pelas subclasses:
- `ComplexoDeGolgi`
- `Lisossomo`
- `MembranaPlasmatica`
- `Mitocondria`
- `Nucleo`
- `REL`
- `RER`
- `Ribossomo`

## Executando o Programa

### Como baixar ou clonar o repositório?

Se você preferir por **clonar** o projeto, pode inserir esse comando no terminal do seu Git instalado:
```bash
git clone https://github.com/FelipeDinnouti/PolimorfismoInterdisciplinar_FelipeDinnouti_GabrielZiani
```

Agora, se preferir **baixar** o projeto em arquivo ZIP, siga as seguintes instruções:

1. Vá até a página principal do repositório no GitHub;
2. Clique no botão Code;
3. Selecione a opção Download ZIP;
4. Após o download, extraia o arquivo em um diretório de sua escolha.

Para executar o programa, basta clicar com o botão direito em Main.java e escolher "Run Main" ou "Executar Main".

### Pré-requisitos

- Java instalado (versão 8 ou superior)
- Um terminal (cmd, PowerShell, bash, etc.)
- Um editor de código ou IDE (como VS Code, IntelliJ ou Eclipse)
