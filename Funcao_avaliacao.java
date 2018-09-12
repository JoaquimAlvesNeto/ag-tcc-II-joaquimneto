package classes;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Funcao_avaliacao {
    
    /*
        Para este exemplo estou considerando a seguinte distribuição:
        Total de Alunos = 100;
        Alunos com Perfil A = 50;
        Alunos com Perfil B = 20;
        Alunos com Perfil C = 15;
        Alunos com Perfil D = 5;
        Alunos com Perfil E = 10;
    
        Realizndo os Cálculos temos o Perfil Ideal de ...:
        A = 50/100 = 0.5;
        B = 20/100 = 0.2;
        C = 15/100 = 0.15
        D = 5/100 = 0.05;
        E = 10/100 = 0.1;
    
        Logo, a melhor distribuição é aquela que esteja próxima dessa em cada turma.
    */
    
    final float PI_a = (float) 0.5; // Perfil Ideal de A
    final float PI_b = (float) 0.2; // Perfil Ideal de B
    final float PI_c = (float) 0.15; // Perfil Ideal de C
    final float PI_d = (float) 0.05; // Perfil Ideal de D
    final float PI_e = (float) 0.1; // Perfil Ideal de E
    
    
    Cromossomo crms;
    
    public Funcao_avaliacao(Cromossomo c){
        crms = c;
    }
    
    // Calcular distância da turma A
    public double calculo_distribuicao_turma_A(){
        
        /*
            Nas variáveis pa,...pe, eu tenho o percentual de alunos com cada perfil na turma.
        */
        
        System.out.println("DISTRIBUIÇÃO DE PERGIS NA TURMA A\n");
        
        float pa = (float) crms.perf_turm_a[0]/25; // Perfil de A na turma A
        float pb = (float) crms.perf_turm_a[1]/25; // Perfil de B na turma A
        float pc = (float) crms.perf_turm_a[2]/25; // Perfil de C na turma A
        float pd = (float) crms.perf_turm_a[3]/25; // Perfil de D na turma A
        float pe = (float) crms.perf_turm_a[4]/25; // Perfil de E na turma A
        
        System.out.println("Percentual de PERFIL A = " + pa);
        System.out.println("Percentual de PERFIL B = " + pb);
        System.out.println("Percentual de PERFIL C = " + pc);
        System.out.println("Percentual de PERFIL D = " + pd);
        System.out.println("Percentual de PERFIL E = " + pe + "\n");
        
        /*
            Nas instruções seguintes é realizado a diferença da distribuição da turma
            com a distribuição Ideal encontrada na pesquisa, o resultado que se aproxima
            dessa, é a melhor solução. Quando menor a distância, maior a avaliação
            (FITNESS)
        */
        
        System.out.println("MÓDULO DA DIFERENÇA DO PERFIL K - PERFIL IDEAL DE K ARREDONDADO\n");
        
        pa = Math.abs(pa - PI_a); // |Perfil de A na turma - Perfil Ideal de A|
        pb = Math.abs(pb - PI_b); // |Perfil de B na turma - Perfil Ideal de B|
        pc = Math.abs(pc - PI_c);
        pd = Math.abs(pd - PI_d);
        pe = Math.abs(pe - PI_e);
        
        // Arredondando valores para 4 casas decimais para poder trabalhar com mais precisão
        
        pa = arredondar(pa);
        pb = arredondar(pb);
        pc = arredondar(pc);
        pd = arredondar(pd);
        pe = arredondar(pe);
        
        //System.out.println("Após calculo de módulo ...\n\n");
        
        System.out.println("RESULTADO DA DIFERENÇA DE A = " + pa);
        System.out.println("RESULTADO DA DIFERENÇA DE B = " + pb);
        System.out.println("RESULTADO DA DIFERENÇA DE C = " + pc);
        System.out.println("RESULTADO DA DIFERENÇA DE D = " + pd);
        System.out.println("RESULTADO DA DIFERENÇA DE E = " + pe + "\n");
        
        //System.out.println("REALIZANDO OPERAÇÃO DE POTÊNCIA\n");
        
        float ma = pa*pa;
        float mb = pb*pb;
        float mc = pc*pc;
        float md = pd*pd;
        float me = pe*pe;
        
        float quad = ma + mb + mc + md + me;
        
        double dist = Math.sqrt(quad);
        System.out.println("DISTÂNCIA EUCLIDIANA = " + dist);
        
        return dist;
    }
    
    // MÉTODO PARA ARREDONDAR PARA 2 CASAS DECIMAIS
    public float arredondar(float valor){
        BigDecimal valorExato = new BigDecimal(valor).setScale(2,RoundingMode.HALF_UP);
        return valorExato.floatValue();
    }
    
}
