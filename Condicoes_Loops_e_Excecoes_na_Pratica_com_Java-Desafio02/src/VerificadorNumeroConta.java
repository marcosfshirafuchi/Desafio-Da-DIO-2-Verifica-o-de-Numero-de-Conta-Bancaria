import java.util.Scanner;

public class VerificadorNumeroConta {
    /**
     * <h1>Condições, Loops e Exceções na Prática com Java</h1>
     * Desafio de código 2 / 5  da DIO - Verificação de Número de Conta Bancária
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   01/05/2024
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    // TODO: Inicialize um bloco try-catch para capturar exceções:
        try {

    // TODO: Leia a entrada do usuário como uma string representando o número da conta:
            String numero = scanner.next();

    // TODO: Chame o método verificarNumeroConta, passando o número da conta como argumento:
            verificarNumeroConta(numero);

    // Imprime que o número de conta é válido:
            System.out.println("Numero de conta valido.");

    // TODO: Capture a exceção do tipo IllegalArgumentException, que pode ser lançada pelo método verificarNumeroConta:
        } catch (IllegalArgumentException e) {
    // Aqui é impresso uma mensagem de erro, mostrando a mensagem associada à exceção:
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Declaração do método verificarNumeroConta, que verifica se o número de conta tem exatamente 8 dígitos:
    private static void verificarNumeroConta(String numeroConta) {

    // TODO: Verifique se o número da conta tem exatamente 8 dígitos:
        int contadorDeNumero = numeroConta.length();
        int numeroDigitado = 0;
        for (int i = 0; i < contadorDeNumero; i++) {
            numeroDigitado++;
        }
    // TODO: Implemente uma exceção do tipo IllegalArgumentException, caso o número de conta não tenha 8 dígitos:
        if (numeroDigitado != 8) {
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }

    }

}