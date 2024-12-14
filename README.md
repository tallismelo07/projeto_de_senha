# Projetinho Senha

Este projeto é um programa simples em Java que valida a força de uma senha fornecida pelo usuário. Ele garante que a senha tenha pelo menos 8 caracteres e exibe mensagens apropriadas dependendo da validade da senha.

## Estrutura do Projeto

O código está organizado da seguinte forma:

- **Pacote:** `Exercicio.Projetinho_Senha.application`
  - Contém a classe principal `Program`, que é responsável pela execução do programa.
- **Exceção Personalizada:** `SenhaInvalidaException`
  - Deve ser implementada para tratar erros relacionados à senha inválida.

## Funcionalidades

1. O programa solicita que o usuário insira uma senha.
2. A senha é validada por meio do método `validarSenha`, que verifica se ela possui pelo menos 8 caracteres.
3. Se a senha for válida, uma mensagem de sucesso será exibida.
4. Se a senha for inválida, uma exceção do tipo `SenhaInvalidaException` será lançada e tratada, exibindo uma mensagem de erro.

## Requisitos

- **Java:** Versão 8 ou superior

## Como Executar

1. Certifique-se de que o Java está instalado no seu sistema.
2. Clone ou baixe o repositório.
3. Compile o programa:
   ```bash
   javac Exercicio/Projetinho_Senha/application/Program.java
   ```
4. Execute o programa:
   ```bash
   java Exercicio.Projetinho_Senha.application.Program
   ```
5. Insira uma senha quando solicitado e veja o resultado.

## Exemplo de Uso

### Entrada:
```
Digite a sua senha: 1234567
```

### Saída:
```
Error: A senha esta invalida, pois ela tem menos de 8 caracteres
```

### Entrada:
```
Digite a sua senha: senhaSegura123
```

### Saída:
```
Sua senha esta correta
```

## Personalização

Você pode adicionar mais regras de validação de senha, como:
- Incluir exigências de caracteres especiais.
- Exigir números ou letras maiúsculas.
- Verificar se a senha está em uma lista de senhas comuns.

Para adicionar essas funcionalidades, basta modificar o método `validarSenha`.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir *issues* ou enviar *pull requests* com melhorias ou novas funcionalidades.

## Licença

Este projeto é distribuído sob a [MIT License](LICENSE).
