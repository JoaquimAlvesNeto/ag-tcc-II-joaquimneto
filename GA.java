package classes;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class GA {
   protected Vector populacao;
   protected double somaAvaliacoes;
   protected double chance_mutacao;
   protected Vector nova_populacao;
   protected int numero_geracoes,tamanho_populacao;


   private double calculaSomaAvaliacoes() {
	int i;
	this.somaAvaliacoes=0;
	for(i=0;i<populacao.size();++i) {
		this.somaAvaliacoes+=((ElementoGA) populacao.get(i)).getAvaliacao();
	}
	return(this.somaAvaliacoes);
   }
   
   public int roleta() {
	int i;
	double aux=0;
	calculaSomaAvaliacoes();
	double limite=Math.random()*this.somaAvaliacoes;
       
	for(i=0;( (i<this.populacao.size())&&(aux<limite) );++i) {
	   aux+=((ElementoGA) populacao.get(i)).getAvaliacao();
	}
	/*Como somamos antes de testar, ent�o tiramos 1 de i pois
	  o anterior ao valor final consiste no elemento escolhido*/
	i--;	
	//System.out.println("Escolhi o elemento de indice "+i);
	return(i);
   }

   public void inicializaPopulacao() {
   /*Esta funcao tem que ser substituida por uma que inicialize a populacao
     com a subclasse apropriada de elementoGA*/
	int i;
	this.populacao=new Vector();	
	for(i=0;i<this.tamanho_populacao;++i) {
	   this.populacao.add(new ElementoGA()); 
	}
   }
   public void geracao() {
	nova_populacao=new Vector();
        ElementoGA pai1,pai2, filho;
	int i;
	System.out.println("* CALCULANDO NOVA GERAÇÃO\n");
	for(i=0;i<this.populacao.size();++i) {
		pai1 = (ElementoGA)populacao.get(selecionarMelhor());
		pai2 = (ElementoGA) populacao.get(this.roleta());;
	        filho= pai1.crossoverUmPonto(pai2);
		filho.permutacaoSimples(chance_mutacao);
		//System.out.println("Vou adicionar...");
		nova_populacao.add(filho);
	}
   }

   public void moduloPopulacao() {
        populacao.removeAllElements();
        populacao.addAll(nova_populacao);	
   }
   
   private int selecionarMelhor(){
        int i,ind_melhor=0;
        ElementoGA aux;
        //this.avaliaTodos();
        double aval_melhor=((ElementoGA)this.populacao.get(0)).getAvaliacao();
        for(i=1;i<this.populacao.size();++i) {
                aux=(ElementoGA)this.populacao.get(i);		
                if (aux.getAvaliacao()>aval_melhor) {
                   aval_melhor=aux.getAvaliacao();
                   ind_melhor=i;
                }
        }
        return(ind_melhor);
   }
   
   private int determinaMelhor() {
	int i,ind_melhor=0;
	ElementoGA aux;
	this.avaliaTodos();
	double aval_melhor=((ElementoGA)this.populacao.get(0)).getAvaliacao();
	for(i=1;i<this.populacao.size();++i) {
		aux=(ElementoGA)this.populacao.get(i);		
		if (aux.getAvaliacao()>aval_melhor) {
		   aval_melhor=aux.getAvaliacao();
		   ind_melhor=i;
		}
	}
	return(ind_melhor);
   }

   private void avaliaTodos() {
	int i;
	ElementoGA aux;
        
	System.out.println("* AVALIANDO TODOS OS INDIVÍDUOS DA POPULAÇÃO\n");
	for(i=0;i<this.populacao.size();++i) {
		aux=(ElementoGA)this.populacao.get(i);   
		aux.calculaAvaliacao();

	}

	this.somaAvaliacoes=calculaSomaAvaliacoes();
	System.out.println("- RESULTADO DA SOMA DAS AVALIAÇÕES É "+this.somaAvaliacoes + "\n");
   }
   
   public ElementoGA executa(){

       int i;	
	this.inicializaPopulacao();
	for (i=0;i<this.numero_geracoes;++i) {
		System.out.println("GERAÇÃO ["+i+"]\n");
		this.avaliaTodos();
		this.geracao();
                
		this.moduloPopulacao();
	}

        i=this.determinaMelhor();
	System.out.println((ElementoGA) this.populacao.get(i));
        return (ElementoGA) this.populacao.get(i);
   }

   /****************/
   /* Construtores */
   /****************/

   public GA(int num_geracoes,int tam_populacao, double prob_mut) {
   	this.chance_mutacao=prob_mut;
   	this.numero_geracoes=num_geracoes;
   	this.tamanho_populacao=tam_populacao;
   }

   public GA(int tam_populacao, double prob_mut) {
   	this(60,tam_populacao,prob_mut);
   }
   
   public GA(double prob_mut) {
   	this(60,100,prob_mut);
   }
   
   public GA() {
   	this(60,100,0.001);
   }
  
}