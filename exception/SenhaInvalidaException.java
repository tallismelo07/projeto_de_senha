package Exercicio.Projetinho_Senha.exception;

public class SenhaInvalidaException extends RuntimeException {
    private String mensagem;
    public SenhaInvalidaException(String message) {
        super(message);
    }
}
