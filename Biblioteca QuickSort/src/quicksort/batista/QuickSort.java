package quicksort.batista;

public class QuickSort
{
 public QuickSort()
 {
 super();
 }
 
 public int[] quick(int[] vetor, int inicio, int fim) {
	  if (inicio < fim) {
	   int posicaoPivo = separar(vetor, inicio, fim);
	   quick(vetor, inicio, posicaoPivo - 1);
	   quick(vetor, posicaoPivo + 1, fim);

	  }
	  return vetor;
	 }

	 public int separar(int[] vetor, int inicio, int fim) {
	  int pivo = vetor[inicio];
	  int i = inicio + 1;
	  while (i <= fim) {
	   if (vetor[i] <= pivo)
	    i++;
	   else if (pivo < vetor[fim])
	    fim--;
	   else {
	    int troca = vetor[i];
	    vetor[i] = vetor[fim];
	    vetor[fim] = troca;
	    i++;
	    fim--;
	   }
	  }
	  vetor[inicio] = vetor[fim];
	  vetor[fim] = pivo;
	  return fim;
	 }
}