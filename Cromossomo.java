
package classes;

import java.util.Random;

public class Cromossomo {
    
    // crms = ABREVIAÇÃO DE CROMOSSOMO
    public char[] vetor;
    
    // Valores parciais de perfis no Cromossomo
    public int[] perf_turm_a;
    public int[] perf_turm_b;
    public int[] perf_turm_c;
    public int[] perf_turm_d;
    
    // Valores CONSTANTES
    final int QTD_ALUNOS = 100;
    
    // CONSTRUTOR
    public Cromossomo(){
        this.vetor = new char[QTD_ALUNOS];
        this.perf_turm_a = new int[5];
        this.perf_turm_b = new int[5];
        this.perf_turm_c = new int[5];
        this.perf_turm_d = new int[5];
    }
    
    public void mostrar(){
        int i;
        short cont = 0;
        for(i = 0; i < QTD_ALUNOS; i++){
            System.out.print(vetor[i] + " ");
            cont++;
            if(cont == 25){
                System.out.print("\n");
                cont = 0;
            }
        }
       
    }
    
    public void getPerfis(){
        
        int i;
        
        int cont_a = 0;
        int cont_b = 0;
        int cont_c = 0;
        int cont_d = 0;
        int cont_e = 0;
        
        for(i=0;i<25;i++){
            
            if(vetor[i]=='A'){
                cont_a++;
            }
            else if(vetor[i]=='B'){
                cont_b++;
            }
            else if(vetor[i]=='C'){
                cont_c++;
            }
            else if(vetor[i]=='D'){
                cont_d++;
            }
            else if(vetor[i]=='E'){
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

        ////////////////////////////
        for(i=25;i<50;i++){
            
            if(vetor[i]=='A'){
                cont_a++;
            }
            else if(vetor[i]=='B'){
                cont_b++;
            }
            else if(vetor[i]=='C'){
                cont_c++;
            }
            else if(vetor[i]=='D'){
                cont_d++;
            }
            else if(vetor[i]=='E'){
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
        
        /////////////////////////
        for(i=50;i<75;i++){
            
            if(vetor[i]=='A'){
                cont_a++;
            }
            else if(vetor[i]=='B'){
                cont_b++;
            }
            else if(vetor[i]=='C'){
                cont_c++;
            }
            else if(vetor[i]=='D'){
                cont_d++;
            }
            else if(vetor[i]=='E'){
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
        
        ///////////////////////
        for(i=75;i<100;i++){
            
            if(vetor[i]=='A'){
                cont_a++;
            }
            else if(vetor[i]=='B'){
                cont_b++;
            }
            else if(vetor[i]=='C'){
                cont_c++;
            }
            else if(vetor[i]=='D'){
                cont_d++;
            }
            else if(vetor[i]=='E'){
                cont_e++;
            }
        }
        
        this.perf_turm_d[0] = cont_a;
        this.perf_turm_d[1] = cont_b;
        this.perf_turm_d[2] = cont_c;
        this.perf_turm_d[3] = cont_d;
        this.perf_turm_d[4] = cont_e;

    }
    
    // INICIALIZAR vetor
    public void preencher(){
        
        int num = -1;
        Random random = new Random();
        
        for(int i = 0; i < QTD_ALUNOS; i++){
            
            num = random.nextInt(5)+1;
            
            if(num == 1){
                vetor[i] = 'A';
            }
            else if(num == 2){
                vetor[i] = 'B';
            }
            else if(num == 3){
                vetor[i] = 'C';
            }
            else if(num == 4){
                vetor[i] = 'D';
            }
            else if(num == 5){
                vetor[i] = 'E';
            }
        }
    }
    
    public void calc_turm_a(){
        
    }
}
