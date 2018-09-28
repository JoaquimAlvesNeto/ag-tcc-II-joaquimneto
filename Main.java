public class Main {
	public static void main(String args[]) {
	   
            final int num_geracoes = 10;
            final int tam_populacao = 100;
            final double prob_mutacao = 0.01;
            
            GA meuGA=new GA(num_geracoes,tam_populacao,prob_mutacao);
            meuGA.executa();
	}
}
