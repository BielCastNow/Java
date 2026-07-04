import java.util.Scanner;
import java.util.Random;

public class cadastro {
    static Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    static int protocolo = new Random().nextInt(1000);

    public static void main(String[] args) {
        System.out.print("Bem vindo ao tec.sistem");
        System.out.println("Para começarmos, digite o seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Olá, " + nome + "! Agora digite a sua idade:");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Agora digite o seu cpf para continuarmor.");
            long cpf = scanner.nextLong();
            System.out
                    .println("Confirma os seus dados: Nome: " + nome + System.lineSeparator() + "Idade:" + idade
                            + System.lineSeparator() + "CPF: " + cpf + "");
            System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
            int confirmacao = scanner.nextInt();
            switch (confirmacao) {
                case 1:
                    System.out.println("Seja bem vindo, " + nome + "!");

                    System.out.println("==Tabela de Atendimentos==" + System.lineSeparator() + "1. Abrir chamado");
                    System.out.println("2. Consultar chamado");
                    System.out.println("3. Falar com atendente");
                    System.out.println("4. encerrar atendimento");

                    System.out.println("Digite o número da opção desejada: ");
                    int opcao = scanner.nextInt();
                    switch (opcao) {
                        case 1:
                            System.out.println("Chamado aberto");
                            scanner.nextLine();

                            System.out.println(" Numero de protocolo: " + protocolo);
                            System.out.println(
                                    "==Selecione o motivo do chamado==" + System.lineSeparator() + "1. Computador");
                            System.out.println("2. internet");
                            System.out.println("3. impressora");
                            System.out.println("4. outros");

                            System.out.println("Digite o número da opção desejada: ");
                            int opcao1 = scanner.nextInt();
                            switch (opcao1) {
                                case 1:
                                    System.out.println(
                                            "Descreva em poucas palavras o problema do seus computador para passarmos para o setor de TI: ");
                                    String problemaComputador = scanner.nextLine();
                                    System.out.println("Problema registrado: " + problemaComputador);
                                    System.out.println("Aguarde o retorno do setor de TI.");
                                    break;
                                case 2:
                                    System.out.println(
                                            "Descreva em poucas palavras o problema do sua internet para passarmos para o setor de TI: ");
                                    String problemainternet = scanner.nextLine();
                                    System.out.println("Problema registrado: " + problemainternet);
                                    System.out.println("Aguarde o retorno do setor de TI.");
                                    break;
                                case 3:
                                    System.out.println(
                                            "Descreva em poucas palavras o problema da sua impressora para passarmos para o setor de TI: ");
                                    String problemaImpressora = scanner.nextLine();
                                    System.out.println("Problema registrado: " + problemaImpressora);
                                    System.out.println("Aguarde o retorno do setor de TI.");
                                    break;
                                case 4:
                                    System.out.println(
                                            "Descreva em poucas palavras o problema para passarmos para o setor de TI: ");
                                    String outros = scanner.nextLine();
                                    System.out.println("Problema registrado: " + outros);
                                    System.out.println("Aguarde o retorno do setor de TI.");
                                    break;
                                default:
                                    System.out.println("Opção inválida.");
                                    break;

                            }

                        case 2:
                            System.out.println("Digite o número do protocolo do chamado: ");
                            int protocoloDigitado = scanner.nextInt();
                            if (protocoloDigitado == protocolo) {
                                System.out.println("Protocolo válido.");
                                System.out.println("Seu chamdo já esta em analise, aguarde o retorno do setor de TI.");
                            } else {
                                System.out.println("Protocolo inválido.");
                            }

                        case 3:
                            System.out.println("Você será transferido para um atendente.");
                            System.out.println(
                                    "Mas antes selecione o moitovo do seu chamado para agilizar o atendimento."
                                            + System.lineSeparator() + "1. Problemas gerais"
                                            + System.lineSeparator() + "2. Financeiro"
                                            + System.lineSeparator() + "3. Outros");
                            System.out.println("Digite o número da opção desejada: ");
                            int opcao2 = scanner.nextInt();

                            switch (opcao2) {
                                case 1:
                                    System.out.println("Você será transferido para o setor de problemas gerais.");
                                    break;
                                case 2:
                                    System.out.println("Você será transferido para o setor financeiro.");
                                    break;
                                case 3:
                                    System.out.println(
                                            "Descreva em poucas palavras o motivo do seu chamado para passarmos para o setor de TI: ");
                                    String outros2 = scanner.nextLine();
                                    System.out.println("Problema registrado: " + outros2);
                                    break;
                                default:
                                    System.out.println("Opção inválida.");
                                    break;
                            }
                            break;
                        case 4:
                            System.out.println("Atendimento encerrado");
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Cadastro cancelado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } else {
            System.out.println("Desculpe, você precisa ter 18 anos ou mais para se cadastrar.");

        }
    }
}
