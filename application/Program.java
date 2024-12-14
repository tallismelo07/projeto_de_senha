package Exercicio.Projetinho_Senha.application;

import Exercicio.Projetinho_Senha.exception.SenhaInvalidaException;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua senha: ");
        var usuarioSenha = sc.nextLine();

        try {
            validarSenha(usuarioSenha);
            System.out.println("Sua senha esta correta");
        } catch (SenhaInvalidaException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void validarSenha(String usuarioSenha){
        if (usuarioSenha.length() < 8){
            throw new SenhaInvalidaException("A senha esta invalida, pois ela tem menos de 8 caracteres");
        }
    }
}
