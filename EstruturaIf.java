package _30_logica_5_2;

public class EstruturaIf {
    public static void main(String[] args) {
        Double emprestimo = 4000.0;
        Double movimentacaoMedia = 2000.0;
        //Boolean movimentaPeloMenosMetadeDoValor = (movimentacaoMedia *  2) >= emprestimo;
        boolean aContaTemTempoSuficienteDeAbertura = true;
        boolean temNomeLimpo = true;
        //Boolean liberarEmprestimo = movimentaPeloMenosMetadeDoValor
        //&& aContaTemTempoSuficienteDeAbertura && temNomeLimpo;
        if (((movimentacaoMedia * 2) >= emprestimo)
                && aContaTemTempoSuficienteDeAbertura
                && temNomeLimpo) {
            System.out.println("Sim! Pode liberar empréstimo. ");
        } else {
            System.out.println("Não pode liberar o empréstimo. ");


        }
    }
}
