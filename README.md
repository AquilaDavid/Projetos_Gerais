classDiagram
    %% Classes principais
    class Cliente {
        +int idCliente
        +String nome
        +String telefone
        +String email
    }

    class Veiculo {
        +int idVeiculo
        +String modelo
        +String placa
        +int ano
    }

    class OrdemServico {
        +int idOrdem
        +Date data
        +String status
    }

    class Servico {
        +int idServico
        +String descricao
        +float preco
    }

    class Mecanico {
        +int idMecanico
        +String nome
        +String especialidade
    }

    %% Relacionamentos com agregação e cardinalidades
    Cliente "1" o-- "0..*" Veiculo : possui
    Veiculo "1" o-- "0..*" OrdemServico : gera
    OrdemServico "1" o-- "1..*" Servico : contem
    OrdemServico "1" -- "1" Mecanico : atribuido_a
