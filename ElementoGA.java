package classes;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class ElementoGA implements Comparable {
	
        protected String valor;
	protected double avaliacao;
     
        // Essas variáveis serão utilizadas para guardar os valores
        // resultantes da contagem de caracteres da String VALOR
        // necessário para o cálculo da função de avaliação
        protected int[] perf_turm_a = new int[5];
        protected int[] perf_turm_b = new int[5];;
        protected int[] perf_turm_c = new int[5];;
        protected int[] perf_turm_d = new int[5];;
        
        
        public boolean equals(ElementoGA outro) {
            //Usada para testar se dois indiv�duos s�o iguais - importante
            //quando formos ver os m�dulos de popula��o mais avan�ados
            return(valor.equals(outro.getValor()));
        }
        
        public int compareTo(Object outro) {
            //Ser� usada na hora de inserir os elementos em ordem em uma popula��o
            //para o GA com steady state (cap�tulo 7)
            int retorno=-1;
            ElementoGA aux=(ElementoGA) outro;
            if (avaliacao>aux.getAvaliacao()) {retorno=1;}
            if (avaliacao==aux.getAvaliacao()) {retorno=0;}
            return(retorno);
        }
	
        // Método que percorre a String VALOR
        // realizar a contagem de caracteres (representa traço de personalidade)
        // por turma (ou seja, n=25 posições)
        public void contagemCaracteres(){
            
            int cont_a = 0;
            int cont_b = 0;
            int cont_c = 0;
            int cont_d = 0;
            int cont_e = 0;
            
            // CONTAGEM NA TURMA A (POSIÇÕES 0 À 24 DO VETOR)
        
            for(int i=0;i<25;i++){

                if(valor.charAt(i)=='A'){
                    cont_a++;
                }
                else if(valor.charAt(i)=='B'){
                    cont_b++;
                }
                else if(valor.charAt(i)=='C'){
                    cont_c++;
                }
                else if(valor.charAt(i)=='D'){
                    cont_d++;
                }
                else if(valor.charAt(i)=='E'){
                    cont_e++;
                }
            }
            
            this.perf_turm_a[0] = cont_a;
            this.perf_turm_a[1] = cont_b;
            this.perf_turm_a[2] = cont_c;
            this.perf_turm_a[3] = cont_d;
            this.perf_turm_a[4] = cont_e;
           
            cont_a = 0;
            cont_b = 0;
            cont_c = 0;
            cont_d = 0;
            cont_e = 0;
            
            // CONTAGEM NA TURMA B (POSIÇÕES 25 À 49 DO VETOR)
        
            for(int i=25;i<50;i++){

                if(valor.charAt(i)=='A'){
                    cont_a++;
                }
                else if(valor.charAt(i)=='B'){
                    cont_b++;
                }
                else if(valor.charAt(i)=='C'){
                    cont_c++;
                }
                else if(valor.charAt(i)=='D'){
                    cont_d++;
                }
                else if(valor.charAt(i)=='E'){
                    cont_e++;
                }
            }
            
            this.perf_turm_b[0] = cont_a;
            this.perf_turm_b[1] = cont_b;
            this.perf_turm_b[2] = cont_c;
            this.perf_turm_b[3] = cont_d;
            this.perf_turm_b[4] = cont_e;
           
            cont_a = 0;
            cont_b = 0;
            cont_c = 0;
            cont_d = 0;
            cont_e = 0;
            
            // CONTAGEM NA TURMA C (POSIÇÕES 50 À 75 DO VETOR)
        
            for(int i=50;i<75;i++){

                if(valor.charAt(i)=='A'){
                    cont_a++;
                }
                else if(valor.charAt(i)=='B'){
                    cont_b++;
                }
                else if(valor.charAt(i)=='C'){
                    cont_c++;
                }
                else if(valor.charAt(i)=='D'){
                    cont_d++;
                }
                else if(valor.charAt(i)=='E'){
                    cont_e++;
                }
            }
            
            this.perf_turm_c[0] = cont_a;
            this.perf_turm_c[1] = cont_b;
            this.perf_turm_c[2] = cont_c;
            this.perf_turm_c[3] = cont_d;
            this.perf_turm_c[4] = cont_e;
           
            cont_a = 0;
            cont_b = 0;
            cont_c = 0;
            cont_d = 0;
            cont_e = 0;
            
            // CONTAGEM NA TURMA D (POSIÇÕES 75 À 99 DO VETOR)
        
            for(int i=75;i<100;i++){

                if(valor.charAt(i)=='A'){
                    cont_a++;
                }
                else if(valor.charAt(i)=='B'){
                    cont_b++;
                }
                else if(valor.charAt(i)=='C'){
                    cont_c++;
                }
                else if(valor.charAt(i)=='D'){
                    cont_d++;
                }
                else if(valor.charAt(i)=='E'){
                    cont_e++;
                }
            }
            
            this.perf_turm_d[0] = cont_a;
            this.perf_turm_d[1] = cont_b;
            this.perf_turm_d[2] = cont_c;
            this.perf_turm_d[3] = cont_d;
            this.perf_turm_d[4] = cont_e;
            
        }
        
        public int getPerfilA_turma_A(){
            return this.perf_turm_a[0];
        }
        public int getPerfilB_turma_A(){
            return this.perf_turm_a[1];
        }
        public int getPerfilC_turma_A(){
            return this.perf_turm_a[2];
        }
        public int getPerfilD_turma_A(){
            return this.perf_turm_a[3];
        }
        public int getPerfilE_turma_A(){
            return this.perf_turm_a[4];
        }
        
        public int getPerfilA_turma_B(){
            return this.perf_turm_b[0];
        }
        public int getPerfilB_turma_B(){
            return this.perf_turm_b[1];
        }
        public int getPerfilC_turma_B(){
            return this.perf_turm_b[2];
        }
        public int getPerfilD_turma_B(){
            return this.perf_turm_b[3];
        }
        public int getPerfilE_turma_B(){
            return this.perf_turm_b[4];
        }
        
        public int getPerfilA_turma_C(){
            return this.perf_turm_c[0];
        }
        public int getPerfilB_turma_C(){
            return this.perf_turm_c[1];
        }
        public int getPerfilC_turma_C(){
            return this.perf_turm_c[2];
        }
        public int getPerfilD_turma_C(){
            return this.perf_turm_c[3];
        }
        public int getPerfilE_turma_C(){
            return this.perf_turm_c[4];
        }
        
        public int getPerfilA_turma_D(){
            return this.perf_turm_d[0];
        }
        public int getPerfilB_turma_D(){
            return this.perf_turm_d[1];
        }
        public int getPerfilC_turma_D(){
            return this.perf_turm_d[2];
        }
        public int getPerfilD_turma_D(){
            return this.perf_turm_d[3];
        }
        public int getPerfilE_turma_D(){
            return this.perf_turm_d[4];
        }
        
        // MÉTODO PARA ARREDONDAR PARA 2 CASAS DECIMAIS
        public float arredondar(float valor){
            BigDecimal valorExato = new BigDecimal(valor).setScale(2,RoundingMode.HALF_UP);
            return valorExato.floatValue();
        }
        
        // Calcular distância da turma A
    public double calculo_distribuicao_turma_A() {
        
        final float PI_a = (float) 0.5; // Perfil Ideal de A
        final float PI_b = (float) 0.2; // Perfil Ideal de B
        final float PI_c = (float) 0.15; // Perfil Ideal de C
        final float PI_d = (float) 0.05; // Perfil Ideal de D
        final float PI_e = (float) 0.1; // Perfil Ideal de E
        
        /*
            Nas variáveis pa,...pe, eu tenho o percentual de alunos com cada perfil na turma.
         */
        
        System.out.println("DISTRIBUIÇÃO DE PERGIS NA TURMA A\n");

        float pa = (float) getPerfilA_turma_A() / 20; // Perfil de A na turma A
        float pb = (float) getPerfilB_turma_A() / 20; // Perfil de B na turma A
        float pc = (float) getPerfilC_turma_A() / 20; // Perfil de C na turma A
        float pd = (float) getPerfilD_turma_A() / 20; // Perfil de D na turma A
        float pe = (float) getPerfilE_turma_A() / 20; // Perfil de E na turma A

        //System.out.println("Percentual de PERFIL A = " + pa);
        //System.out.println("Percentual de PERFIL B = " + pb);
        //System.out.println("Percentual de PERFIL C = " + pc);
        //System.out.println("Percentual de PERFIL D = " + pd);
        //System.out.println("Percentual de PERFIL E = " + pe + "\n");

        /*
            Nas instruções seguintes é realizado a diferença da distribuição da turma
            com a distribuição Ideal encontrada na pesquisa, o resultado que se aproxima
            dessa, é a melhor solução. Quando menor a distância, maior a avaliação
            (FITNESS)
        
            QUANTO MAIS PRÓXIMO DE ZERO, É MELHOR A SOLUÇÃO/DISTRIBUIÇÃO.
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
        float ma = pa * pa;
        float mb = pb * pb;
        float mc = pc * pc;
        float md = pd * pd;
        float me = pe * pe;
            
        float quad = ma + mb + mc + md + me;
        
        double dist = Math.sqrt(quad);
        
        return 1/(dist+1);
    }
        
        // Calcular distância da turma B
    public double calculo_distribuicao_turma_B() {
        
        final float PI_a = (float) 0.5; // Perfil Ideal de A
        final float PI_b = (float) 0.2; // Perfil Ideal de B
        final float PI_c = (float) 0.15; // Perfil Ideal de C
        final float PI_d = (float) 0.05; // Perfil Ideal de D
        final float PI_e = (float) 0.1; // Perfil Ideal de E
        
        /*
            Nas variáveis pa,...pe, eu tenho o percentual de alunos com cada perfil na turma.
         */
        
        //System.out.println("DISTRIBUIÇÃO DE PERGIS NA TURMA B\n");

        float pa = (float) getPerfilA_turma_B() / 20; // Perfil de A na turma A
        float pb = (float) getPerfilB_turma_B() / 20; // Perfil de B na turma A
        float pc = (float) getPerfilC_turma_B() / 20; // Perfil de C na turma A
        float pd = (float) getPerfilD_turma_B() / 20; // Perfil de D na turma A
        float pe = (float) getPerfilE_turma_B() / 20; // Perfil de E na turma A

        //System.out.println("Percentual de PERFIL A = " + pa);
        //System.out.println("Percentual de PERFIL B = " + pb);
        //System.out.println("Percentual de PERFIL C = " + pc);
        //System.out.println("Percentual de PERFIL D = " + pd);
        //System.out.println("Percentual de PERFIL E = " + pe + "\n");

        /*
            Nas instruções seguintes é realizado a diferença da distribuição da turma
            com a distribuição Ideal encontrada na pesquisa, o resultado que se aproxima
            dessa, é a melhor solução. Quando menor a distância, maior a avaliação
            (FITNESS)
        
            QUANTO MAIS PRÓXIMO DE ZERO, É MELHOR A SOLUÇÃO/DISTRIBUIÇÃO.
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
        float ma = pa * pa;
        float mb = pb * pb;
        float mc = pc * pc;
        float md = pd * pd;
        float me = pe * pe;

        float quad = ma + mb + mc + md + me;

        double dist = Math.sqrt(quad);
        //System.out.println("DISTÂNCIA EUCLIDIANA = " + dist);

        return 1/(dist+1);
    }
    
    // Calcular distância da turma A
    public double calculo_distribuicao_turma_C() {
        
        final float PI_a = (float) 0.5; // Perfil Ideal de A
        final float PI_b = (float) 0.2; // Perfil Ideal de B
        final float PI_c = (float) 0.15; // Perfil Ideal de C
        final float PI_d = (float) 0.05; // Perfil Ideal de D
        final float PI_e = (float) 0.1; // Perfil Ideal de E
        
        /*
            Nas variáveis pa,...pe, eu tenho o percentual de alunos com cada perfil na turma.
         */
        
        //System.out.println("DISTRIBUIÇÃO DE PERGIS NA TURMA C\n");

        float pa = (float) getPerfilA_turma_C() / 20; // Perfil de A na turma A
        float pb = (float) getPerfilB_turma_C() / 20; // Perfil de B na turma A
        float pc = (float) getPerfilC_turma_C() / 20; // Perfil de C na turma A
        float pd = (float) getPerfilD_turma_C() / 20; // Perfil de D na turma A
        float pe = (float) getPerfilE_turma_C() / 20; // Perfil de E na turma A

        //System.out.println("Percentual de PERFIL A = " + pa);
        //System.out.println("Percentual de PERFIL B = " + pb);
        //System.out.println("Percentual de PERFIL C = " + pc);
        //System.out.println("Percentual de PERFIL D = " + pd);
        //System.out.println("Percentual de PERFIL E = " + pe + "\n");

        /*
            Nas instruções seguintes é realizado a diferença da distribuição da turma
            com a distribuição Ideal encontrada na pesquisa, o resultado que se aproxima
            dessa, é a melhor solução. Quando menor a distância, maior a avaliação
            (FITNESS)
        
            QUANTO MAIS PRÓXIMO DE ZERO, É MELHOR A SOLUÇÃO/DISTRIBUIÇÃO.
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
        float ma = pa * pa;
        float mb = pb * pb;
        float mc = pc * pc;
        float md = pd * pd;
        float me = pe * pe;

        float quad = ma + mb + mc + md + me;

        double dist = Math.sqrt(quad);
        //System.out.println("DISTÂNCIA EUCLIDIANA = " + dist);

        return 1/(dist+1);
    }
    
    // Calcular distância da turma A
    public double calculo_distribuicao_turma_D() {
        
        final float PI_a = (float) 0.5; // Perfil Ideal de A
        final float PI_b = (float) 0.2; // Perfil Ideal de B
        final float PI_c = (float) 0.15; // Perfil Ideal de C
        final float PI_d = (float) 0.05; // Perfil Ideal de D
        final float PI_e = (float) 0.1; // Perfil Ideal de E
        
        /*
            Nas variáveis pa,...pe, eu tenho o percentual de alunos com cada perfil na turma.
         */
        
        System.out.println("DISTRIBUIÇÃO DE PERGIS NA TURMA D\n");

        float pa = (float) getPerfilA_turma_D() / 20; // Perfil de A na turma A
        float pb = (float) getPerfilB_turma_D() / 20; // Perfil de B na turma A
        float pc = (float) getPerfilC_turma_D() / 20; // Perfil de C na turma A
        float pd = (float) getPerfilD_turma_D() / 20; // Perfil de D na turma A
        float pe = (float) getPerfilE_turma_D() / 20; // Perfil de E na turma A

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
        
            QUANTO MAIS PRÓXIMO DE ZERO, É MELHOR A SOLUÇÃO/DISTRIBUIÇÃO.
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
        float ma = pa * pa;
        float mb = pb * pb;
        float mc = pc * pc;
        float md = pd * pd;
        float me = pe * pe;

        float quad = ma + mb + mc + md + me;

        double dist = Math.sqrt(quad);
        //System.out.println("DISTÂNCIA EUCLIDIANA = " + dist);

        return 1/(dist+1);
    }
        
    
        public double calculaAvaliacao() {

            contagemCaracteres();

            double distTurma_A = calculo_distribuicao_turma_A();
            double distTurma_B = calculo_distribuicao_turma_B();
            double distTurma_C = calculo_distribuicao_turma_C();
            double distTurma_D = calculo_distribuicao_turma_D();

            this.avaliacao = distTurma_A + distTurma_B + distTurma_C + distTurma_D;

            return(this.avaliacao);
        }

	public double getAvaliacao() {
	   return(this.avaliacao);
	}

	public String getValor() {
 	   return(this.valor);
	}

	public void setValor(String aux) {
 	   this.valor=aux;
	}
        
	protected void inicializaElemento(int tamanho) {
	    
            this.valor = "";
            
            Random sortear = new Random();
            int numero_sorteado = -1;
            for(int i = 0; i < tamanho; i++){
                numero_sorteado = sortear.nextInt(5)+1;
                
                if(numero_sorteado == 1){ this.valor = this.valor + "A"; }
                if(numero_sorteado == 2){ this.valor = this.valor + "B"; }
                if(numero_sorteado == 3){ this.valor = this.valor + "C"; }
                if(numero_sorteado == 4){ this.valor = this.valor + "D"; }
                if(numero_sorteado == 5){ this.valor = this.valor + "E"; }

            }
	}

	/****************/
	/* Construtores */
	/****************/
	
	public ElementoGA(String novoValor) {
	   this.valor="";
	}	

	public ElementoGA(int tamanho) {
	   inicializaElemento(tamanho);
	}

	public ElementoGA() {
  	   this(100);
	}
        
	public void trocar(int ind1, int ind2){

            char vetor[] = new char[this.valor.length()];
            char aux;

            for(int i=0; i<this.valor.length();i++){
                vetor[i] = valor.charAt(i);
            }
            
            this.valor="";
 
            aux = vetor[ind2];
            vetor[ind2] = vetor[ind1];
            vetor[ind1] = aux;
            
            for(int i=0; i<vetor.length; i++){
                this.valor += vetor[i];
            }

        }

	/************************/
	/* Operadores Geneticos */
	/************************/
        
        public void permutacaoSimples(double chance){
            
            Random sortear = new Random();
            
            int i;
            int tamanho = this.valor.length();
            int ind1 = -1;
            int ind2 = -1;
            
            for(i=0;i<tamanho;i++){
                
                if(java.lang.Math.random()<chance){
                    ind1 = sortear.nextInt(10);
                    ind2 = sortear.nextInt(10);
                    trocar(ind1,ind2);
                }
            }
        }
        
	/*public void mutacao(double chance) {
	   int i;
	   int tamanho=this.valor.length();
	   String aux,inicio,fim;
	   for(i=0;i<tamanho;i++) {		
		if (java.lang.Math.random()<chance) {		   
		   aux=this.valor.substring(i,i+1);
  	         if (aux.equals("1")) {
			aux="0";
		   } else {
			aux="1";
		   }		   
		   inicio=this.valor.substring(0,i);
		   fim=this.valor.substring(i+1,tamanho);		   
		   this.valor=inicio+aux+fim;
		}
	   }
	}*/

	/*public void mutacao() {
		this.mutacao(0.005);
	}*/

	public ElementoGA crossoverUmPonto(ElementoGA outroPai)  {
	   String aux1;	   
	   ElementoGA retorno=null;
	   int pontoCorte=(new Double(java.lang.Math.random()*this.valor.length())).intValue();;	   
	   if (java.lang.Math.random()<0.5) {		
	   	aux1=this.valor.substring(0,pontoCorte)+outroPai.getValor().substring(pontoCorte,outroPai.getValor().length());
	   } else {		
		aux1=outroPai.getValor().substring(0,pontoCorte)+this.valor.substring(pontoCorte,this.valor.length());
	   }
	   try {
	      retorno=(ElementoGA) outroPai.getClass().newInstance();
	      retorno.setValor(aux1);
	   } catch (Exception e) {
	   }	   	   
	   return(retorno);
	} 

	/********************************/
	/* Metodos Basicos de Classe    */
	/********************************/

	public String toString() {
		return("String:"+this.valor+"\nAvaliacao:"+this.avaliacao);
	}

	
}