
package classes;

public class Main {
    
    public Main() {
        
    }
    
    public static void main(String[] args) {
        
        Cromossomo c = new Cromossomo();
        c.preencher();
        c.mostrar();
        c.getPerfis();
        Funcao_avaliacao f = new Funcao_avaliacao(c);
        f.calculo_distribuicao_turma_A();
    }
    
}
