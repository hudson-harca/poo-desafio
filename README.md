# poo-desafio
Modelagem e Diagramação de um Componente iPhone

### Exemplo de Diagrama UML (Mermaid)
```mermaid
classDiagram

    class ReprodutorMusical{
        <<interface>>
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        <<interface>>
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        <<interface>>
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
    }

    ReprodutorMusical <|-- iPhone : implements 
    AparelhoTelefonico <|-- iPhone : implements 
    NavegadorInternet <|-- iPhone : implements 

```
