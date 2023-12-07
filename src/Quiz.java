import java.util.*;

public class Quiz {

    public static void main(String[] args) {
        int numeroAcertos = 0;
        int numeroErros;
        System.out.println("Quiz sobre filmes e livros populares");
        System.out.println("Jogos Vorazes, Crônicas de Nárnia, Percy Jacksson, Pânico");

        // métodos das questões
        numeroAcertos += questao1();
        numeroAcertos += questao2();
        numeroAcertos += questao3();
        numeroAcertos += questao4();
        numeroAcertos += questao5();
        numeroAcertos += questao6();
        numeroAcertos += questao7();
        numeroAcertos += questao8();
        numeroAcertos += questao9();
        numeroAcertos += questao10();
        numeroAcertos += questao11();
        numeroAcertos += questao12();
        numeroAcertos += questao13();
        numeroAcertos += questao14();
        numeroAcertos += questao15();


    }
        static Scanner scanner = new Scanner(System.in);

    private static int questao1() {

        Collection<String> alternativas = new ArrayList<>();
        alternativas.add("Holly Jacksson");
        alternativas.add("Collen Hoover");
        alternativas.add("Suzanne Collins");
        alternativas.add("J.K Rowlings");

        String alternativaCorreta = "Suzanne Collins";

        boolean respostaCerta = false;

        do {
            System.out.println("Quem escreveu a franquia de Jogos Vorazes?");


            // cast
            Collections.shuffle((List<String>) alternativas);

            for (int i = 0; i < alternativas.size(); i++) {
                System.out.println("[" + i + "]" + ((List<String>) alternativas).get(i)
                );

            }

            System.out.println("Digite sua resposta: ");
            String resposta = scanner.nextLine();

            switch (resposta) {
                case "0":
                case "1":
                case "2":
                case "3":
                    int respostaInt = Integer.parseInt(resposta);

                    String valorDaResposta = ((List<String>) alternativas).get(respostaInt);

                    if (valorDaResposta.equals(alternativaCorreta)) {
                        System.out.println("Resposta correta!");
                        respostaCerta = true;
                    } else {
                        System.out.println("Resposta errada! Tente novamente!");
                    }
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente:");
                    break;
            }

        } while(!respostaCerta);
        return 0;
    }

    private static int questao2() {

        Collection<String> alternativas = new ArrayList<>();
        alternativas.add("gato");
        alternativas.add("tordo");
        alternativas.add("pavão");
        alternativas.add("cobras");

        String alternativaCorreta = "tordo";

        boolean respostaCerta = false;

        do {
            System.out.println("Qual animal é representado como simbolo de rebelião em jogos vorazes?");

            Collections.shuffle((List<String>) alternativas);

            for (int i = 0; i < alternativas.size(); i++) {
                System.out.println("[" + i + "]" + ((List<String>) alternativas).get(i)
                );

            }

            System.out.println("Digite sua resposta: ");
            String resposta = scanner.nextLine();

            switch (resposta) {
                case "0":
                case "1":
                case "2":
                case "3":
                    int respostaInt = Integer.parseInt(resposta);

                    String valorDaResposta = ((List<String>) alternativas).get(respostaInt);

                    if (valorDaResposta.equals(alternativaCorreta)) {
                        System.out.println("Resposta correta!");
                        respostaCerta = true;
                    } else {
                        System.out.println("Resposta errada! Tente novamente!");
                    }
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente:");
                    break;
            }


        } while(!respostaCerta);


        return 0;
    }

    private static int questao3() {

        Collection<String> alternativas = new ArrayList<>();
        alternativas.add("Elizabeth Banks");
        alternativas.add("Sadie Sink");
        alternativas.add("Fernanda Montenegro");
        alternativas.add("Jennifer Lawrence");

        String alternativaCorreta = "Jennifer Lawrence";

        boolean respostaCerta = false;

        do {
            System.out.println("Quem foi a atriz escolhida para viver Katniss em jogos Vorazes?");

            Collections.shuffle((List<String>) alternativas);

            for (int i = 0; i < alternativas.size(); i++) {
                System.out.println("[" + i + "]" + ((List<String>) alternativas).get(i)
                );

            }

            System.out.println("Digite sua resposta: ");
            String resposta = scanner.nextLine();

            switch (resposta) {
                case "0":
                case "1":
                case "2":
                case "3":
                    int respostaInt = Integer.parseInt(resposta);

                    String valorDaResposta = ((List<String>) alternativas).get(respostaInt);

                    if (valorDaResposta.equals(alternativaCorreta)) {
                        System.out.println("Resposta correta!");
                        respostaCerta = true;
                    } else {
                        System.out.println("Resposta errada! Tente novamente!");
                    }
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente:");
                    break;
            }

        } while(!respostaCerta);


        return 0;
    }

    private static int questao4() {

        Collection<String> alternativas = new ArrayList<>();
        alternativas.add("Peeta");
        alternativas.add("Snow");
        alternativas.add("Finnick");
        alternativas.add("Gale");

        String alternativaCorreta = "Snow";

        boolean respostaCerta = false;

        do {
            System.out.println("Quem é o presidente e comandante da capital em jogos vorazes?");

            Collections.shuffle((List<String>) alternativas);

            for (int i = 0; i < alternativas.size(); i++) {
                System.out.println("[" + i + "]" + ((List<String>) alternativas).get(i)
                );

            }

            System.out.println("Digite sua resposta: ");
            String resposta = scanner.nextLine();

            switch (resposta) {
                case "0":
                case "1":
                case "2":
                case "3":
                    int respostaInt = Integer.parseInt(resposta);

                    String valorDaResposta = ((List<String>) alternativas).get(respostaInt);

                    if (valorDaResposta.equals(alternativaCorreta)) {
                        System.out.println("Resposta correta!");
                        respostaCerta = true;
                    } else {
                        System.out.println("Resposta errada! Tente novamente!");
                    }
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente:");
                    break;
            }

        } while(!respostaCerta);


        return 0;
    }

    private static int questao5() {

        Collection<String> alternativas = new ArrayList<>();
        alternativas.add("Lucy Gray");
        alternativas.add("Katniss Everdeen");
        alternativas.add("Clove");
        alternativas.add("Johana Mason");

        String alternativaCorreta = "Lucy Gray";

        boolean respostaCerta = false;

        do {
            System.out.println("Quem foi a ganhadora do décimo jogo?");

            Collections.shuffle((List<String>) alternativas);

            for (int i = 0; i < alternativas.size(); i++) {
                System.out.println("[" + i + "]" + ((List<String>) alternativas).get(i)
                );

            }

            System.out.println("Digite sua resposta: ");
            String resposta = scanner.nextLine();

            switch (resposta) {
                case "0":
                case "1":
                case "2":
                case "3":
                    int respostaInt = Integer.parseInt(resposta);

                    String valorDaResposta = ((List<String>) alternativas).get(respostaInt);

                    if (valorDaResposta.equals(alternativaCorreta)) {
                        System.out.println("Resposta correta!");
                        respostaCerta = true;
                    } else {
                        System.out.println("Resposta errada! Tente novamente!");
                    }
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente:");
                    break;
            }

        } while(!respostaCerta);


        return 0;
    }

    private static int questao6() {

        Collection<String> alternativas = new ArrayList<>();
        alternativas.add("tamborim");
        alternativas.add("gaita");
        alternativas.add("flauta");
        alternativas.add("violino");

        String alternativaCorreta = "flauta";

        boolean respostaCerta = false;

        do {
            System.out.println("Qual instrumento o fauno tocou para Lúcia em Crônicas de Nárnia?");

            Collections.shuffle((List<String>) alternativas);

            for (int i = 0; i < alternativas.size(); i++) {
                System.out.println("[" + i + "]" + ((List<String>) alternativas).get(i)
                );

            }

            System.out.println("Digite sua resposta: ");
            String resposta = scanner.nextLine();

            switch (resposta) {
                case "0":
                case "1":
                case "2":
                case "3":
                    int respostaInt = Integer.parseInt(resposta);

                    String valorDaResposta = ((List<String>) alternativas).get(respostaInt);

                    if (valorDaResposta.equals(alternativaCorreta)) {
                        System.out.println("Resposta correta!");
                        respostaCerta = true;
                    } else {
                        System.out.println("Resposta errada! Tente novamente!");
                    }
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente:");
                    break;
            }

        } while(!respostaCerta);


        return 0;
    }

    private static int questao7() {

        Collection<String> alternativas = new ArrayList<>();
        alternativas.add("Lúcia");
        alternativas.add("Edmundo");
        alternativas.add("Aslam");
        alternativas.add("Pedro");

        String alternativaCorreta = "Edmundo";

        boolean respostaCerta = false;

        do {
            System.out.println("Qual dos quatros irmãos foi o traidor que ajudou a rainha branca em Crônicas de Nárnia?");

            Collections.shuffle((List<String>) alternativas);

            for (int i = 0; i < alternativas.size(); i++) {
                System.out.println("[" + i + "]" + ((List<String>) alternativas).get(i)
                );

            }

            System.out.println("Digite sua resposta: ");
            String resposta = scanner.nextLine();

            switch (resposta) {
                case "0":
                case "1":
                case "2":
                case "3":
                    int respostaInt = Integer.parseInt(resposta);

                    String valorDaResposta = ((List<String>) alternativas).get(respostaInt);

                    if (valorDaResposta.equals(alternativaCorreta)) {
                        System.out.println("Resposta correta!");
                        respostaCerta = true;
                    } else {
                        System.out.println("Resposta errada! Tente novamente!");
                    }
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente:");
                    break;
            }

        } while(!respostaCerta);


        return 0;
    }

    private static int questao8() {

        Collection<String> alternativas = new ArrayList<>();
        alternativas.add("Adam Silvera");
        alternativas.add("C.S Lewis");
        alternativas.add("George Martin");
        alternativas.add("R.L. Stine");

        String alternativaCorreta = "C.S Lewis";

        boolean respostaCerta = false;

        do {
            System.out.println("Quem escreveu Crônicas de Nárnia?");

            Collections.shuffle((List<String>) alternativas);

            for (int i = 0; i < alternativas.size(); i++) {
                System.out.println("[" + i + "]" + ((List<String>) alternativas).get(i)
                );

            }

            System.out.println("Digite sua resposta: ");
            String resposta = scanner.nextLine();

            switch (resposta) {
                case "0":
                case "1":
                case "2":
                case "3":
                    int respostaInt = Integer.parseInt(resposta);

                    String valorDaResposta = ((List<String>) alternativas).get(respostaInt);

                    if (valorDaResposta.equals(alternativaCorreta)) {
                        System.out.println("Resposta correta!");
                        respostaCerta = true;
                    } else {
                        System.out.println("Resposta errada! Tente novamente!");
                    }
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente:");
                    break;
            }

        } while(!respostaCerta);


        return 0;
    }

    private static int questao9() {

        Collection<String> alternativas = new ArrayList<>();
        alternativas.add("Annabeth");
        alternativas.add("Hades");
        alternativas.add("Ares");
        alternativas.add("Luke");

        String alternativaCorreta = "Luke";

        boolean respostaCerta = false;

        do {
            System.out.println("Quem roubou o raio de Zeus no filme do Percy Jacksson?");

            Collections.shuffle((List<String>) alternativas);

            for (int i = 0; i < alternativas.size(); i++) {
                System.out.println("[" + i + "]" + ((List<String>) alternativas).get(i)
                );

            }

            System.out.println("Digite sua resposta: ");
            String resposta = scanner.nextLine();

            switch (resposta) {
                case "0":
                case "1":
                case "2":
                case "3":
                    int respostaInt = Integer.parseInt(resposta);

                    String valorDaResposta = ((List<String>) alternativas).get(respostaInt);

                    if (valorDaResposta.equals(alternativaCorreta)) {
                        System.out.println("Resposta correta!");
                        respostaCerta = true;
                    } else {
                        System.out.println("Resposta errada! Tente novamente!");
                    }
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente:");
                    break;
            }

        } while(!respostaCerta);


        return 0;
    }

    private static int questao10() {

        Collection<String> alternativas = new ArrayList<>();
        alternativas.add("Poseidon");
        alternativas.add("Hades");
        alternativas.add("Zeus");
        alternativas.add("Apolo");

        String alternativaCorreta = "Poseidon";

        boolean respostaCerta = false;

        do {
            System.out.println("Percy Jacksson é filho  de qual deus grego?");

            Collections.shuffle((List<String>) alternativas);

            for (int i = 0; i < alternativas.size(); i++) {
                System.out.println("[" + i + "]" + ((List<String>) alternativas).get(i)
                );

            }

            System.out.println("Digite sua resposta: ");
            String resposta = scanner.nextLine();

            switch (resposta) {
                case "0":
                case "1":
                case "2":
                case "3":
                    int respostaInt = Integer.parseInt(resposta);

                    String valorDaResposta = ((List<String>) alternativas).get(respostaInt);

                    if (valorDaResposta.equals(alternativaCorreta)) {
                        System.out.println("Resposta correta!");
                        respostaCerta = true;
                    } else {
                        System.out.println("Resposta errada! Tente novamente!");
                    }
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente:");
                    break;
            }

        } while(!respostaCerta);


        return 0;
    }

    private static int questao11() {

        Collection<String> alternativas = new ArrayList<>();
        alternativas.add("Emila");
        alternativas.add("Medusa");
        alternativas.add("Afrodite");
        alternativas.add("Annabeth");

        String alternativaCorreta = "Annabeth";

        boolean respostaCerta = false;

        do {
            System.out.println("Com quem Percy Jacksson se casa?");

            Collections.shuffle((List<String>) alternativas);

            for (int i = 0; i < alternativas.size(); i++) {
                System.out.println("[" + i + "]" + ((List<String>) alternativas).get(i)
                );

            }

            System.out.println("Digite sua resposta: ");
            String resposta = scanner.nextLine();

            switch (resposta) {
                case "0":
                case "1":
                case "2":
                case "3":
                    int respostaInt = Integer.parseInt(resposta);

                    String valorDaResposta = ((List<String>) alternativas).get(respostaInt);

                    if (valorDaResposta.equals(alternativaCorreta)) {
                        System.out.println("Resposta correta!");
                        respostaCerta = true;
                    } else {
                        System.out.println("Resposta errada! Tente novamente!");
                    }
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente:");
                    break;
            }

        } while(!respostaCerta);


        return 0;
    }

    private static int questao12() {

        Collection<String> alternativas = new ArrayList<>();
        alternativas.add("Stu e Billy");
        alternativas.add("Tara e Sam");
        alternativas.add("Amber e Richie");
        alternativas.add("Jennifer e Gale");

        String alternativaCorreta = "Amber e Richie";

        boolean respostaCerta = false;

        do {
            System.out.println("Quem è o ghostface do quinto filme da franquia Pânico?");

            Collections.shuffle((List<String>) alternativas);

            for (int i = 0; i < alternativas.size(); i++) {
                System.out.println("[" + i + "]" + ((List<String>) alternativas).get(i)
            );

            }

            System.out.println("Digite sua resposta: ");
            String resposta = scanner.nextLine();

            switch (resposta) {
                case "0":
                case "1":
                case "2":
                case "3":
                    int respostaInt = Integer.parseInt(resposta);

                    String valorDaResposta = ((List<String>) alternativas).get(respostaInt);

                    if (valorDaResposta.equals(alternativaCorreta)) {
                        System.out.println("Resposta correta!");
                        respostaCerta = true;
                    } else {
                        System.out.println("Resposta errada! Tente novamente!");
                    }
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente:");
                    break;
            }

        } while(!respostaCerta);


        return 0;
    }

    private static int questao13() {

        Collection<String> alternativas = new ArrayList<>();
        alternativas.add("5");
        alternativas.add("1");
        alternativas.add("2");
        alternativas.add("3");

        String alternativaCorreta = "3";

        boolean respostaCerta = false;

        do {
            System.out.println("Quantos atos tem no filme da franquia Pânico?");

            Collections.shuffle((List<String>) alternativas);

            for (int i = 0; i < alternativas.size(); i++) {
                System.out.println("[" + i + "]" + ((List<String>) alternativas).get(i)
                );

            }

            System.out.println("Digite sua resposta: ");
            String resposta = scanner.nextLine();

            switch (resposta) {
                case "0":
                case "1":
                case "2":
                case "3":
                    int respostaInt = Integer.parseInt(resposta);

                    String valorDaResposta = ((List<String>) alternativas).get(respostaInt);

                    if (valorDaResposta.equals(alternativaCorreta)) {
                        System.out.println("Resposta correta!");
                        respostaCerta = true;
                    } else {
                        System.out.println("Resposta errada! Tente novamente!");
                    }
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente:");
                    break;
            }

        } while(!respostaCerta);


        return 0;
    }

    private static int questao14() {

        Collection<String> alternativas = new ArrayList<>();
        alternativas.add("Sidney");
        alternativas.add("Tatum");
        alternativas.add("Sidney e Gale");
        alternativas.add("Jennifer");

        String alternativaCorreta = "Sidney";

        boolean respostaCerta = false;

        do {
            System.out.println("Quem è a final girl da franquia Pânico?");

            Collections.shuffle((List<String>) alternativas);

            for (int i = 0; i < alternativas.size(); i++) {
                System.out.println("[" + i + "]" + ((List<String>) alternativas).get(i)
                );

            }

            System.out.println("Digite sua resposta: ");
            String resposta = scanner.nextLine();

            switch (resposta) {
                case "0":
                case "1":
                case "2":
                case "3":
                    int respostaInt = Integer.parseInt(resposta);

                    String valorDaResposta = ((List<String>) alternativas).get(respostaInt);

                    if (valorDaResposta.equals(alternativaCorreta)) {
                        System.out.println("Resposta correta!");
                        respostaCerta = true;
                    } else {
                        System.out.println("Resposta errada! Tente novamente!");
                    }
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente:");
                    break;
            }

        } while(!respostaCerta);


        return 0;
    }

    private static int questao15() {

        Collection<String> alternativas = new ArrayList<>();
        alternativas.add("Tatum");
        alternativas.add("Anika");
        alternativas.add("Olivia");
        alternativas.add("Jude");

        String alternativaCorreta = "Tatum";

        boolean respostaCerta = false;

        do {
            System.out.println("Quem merecia ser a final girl da franquia Pânico?");

            Collections.shuffle((List<String>) alternativas);

            for (int i = 0; i < alternativas.size(); i++) {
                System.out.println("[" + i + "]" + ((List<String>) alternativas).get(i)
                );

            }

            System.out.println("Digite sua resposta: ");
            String resposta = scanner.nextLine();

            switch (resposta) {
                case "0":
                case "1":
                case "2":
                case "3":
                    int respostaInt = Integer.parseInt(resposta);

                    String valorDaResposta = ((List<String>) alternativas).get(respostaInt);

                    if (valorDaResposta.equals(alternativaCorreta)) {
                        System.out.println("Resposta correta!");
                        respostaCerta = true;
                    } else {
                        System.out.println("Resposta errada! Tente novamente!");
                    }
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente:");
                    break;
            }

        } while(!respostaCerta);


        return 0;
    }
}
