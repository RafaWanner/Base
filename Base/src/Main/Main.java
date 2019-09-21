package Main;

public class Main {

    public static void main(String[] args) {
        Entrada entrada = new Entrada();
        do {
            String a = entrada.lerString("Digite uma String");
            char c1 = entrada.lerChar("Digite um Char");
            char c2 = entrada.lerChar("Digite um Char");

            Processamento processamento = new Processamento();
            int rb = processamento.getBlanks(a);
            int ra = processamento.getNumChar(a, "a");
            int re = processamento.getNumChar(a, "e");
            int ri = processamento.getNumChar(a, "i");
            int ro = processamento.getNumChar(a, "o");
            int ru = processamento.getNumChar(a, "u");
            int rw = processamento.getWords(a);
            String rc = processamento.changeChar(a,c1,c2);
            

            Saida saida = new Saida();
            saida.printInt(rb, "Numero de Espaços");
            saida.printFiveInt(ra, re, ri, ro, ru, "Numero de Vogais (a, e, i, o, u)");
            saida.printInt(rw, "Numero de Palavras");
            saida.printString(rc);
        } while (entrada.continuar("Executar novamente?"));
    }
}
