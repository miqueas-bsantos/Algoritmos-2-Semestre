package algoritimos;


class PilhaDin {

	// cria o vetor que ira implementar a pilha
	private Object[] vetorPilha;

	// construtor da pilha
	public PilhaDin() {

		// instancia o vetor com o tamanho informado
		vetorPilha = new Object[0];
	}

	// funcao que insere um objeto no topo da pilha
	public void push(Object obj) {

		// cria um vetor auxiliar de tamanho maior
		Object auxiliar[] = new Object[vetorPilha.length + 1];

		// copia os objetos do vetor antigo para o vetor auxiliar
		for (int i = 0; i < vetorPilha.length; i++) {
			auxiliar[i] = vetorPilha[i];
		}

		// insere o objeto no topo da pilha
		auxiliar[vetorPilha.length] = obj;

		// muda o apontador do antigo vetor para o vetor auxiliar
		vetorPilha = auxiliar;
	}

	// funcao que remove um objeto do topo da pilha
	public Object pop() {

		// verifica se a pilha esta vazia
		if (vetorPilha.length <= 0)
			return null;

		// do contrario, cria um vetor auxiliar de tamanho menor e copia os
		// elementos
		// do vetor antigo para o novo vetor
		Object auxiliar[] = new Object[vetorPilha.length - 1];

		// copia os elementos do antigo vetor, menos o topo, que sera removido
		for (int i = 0; i < vetorPilha.length - 1; i++) {
			auxiliar[i] = vetorPilha[i];
		}

		// obtem o elemento do topo da pilha (ultima posicao do vetor)
		Object obj = vetorPilha[vetorPilha.length - 1];
		// muda o apontador do antigo vetor para o vetor auxiliar
		vetorPilha = auxiliar;

		// devolve o elemento removido
		return obj;
	}

	// funcao que verifica quem esta no topo da pilha
	public Object top() {

		// verifica se a pilha esta vazia
		if (vetorPilha.length == 0)
			return null;
		else

			return vetorPilha[vetorPilha.length - 1];
	}

	// verifica se a pilha esta vazia
	public boolean isEmpty() {
		return (vetorPilha.length == 0);
	}

	// verifica se a pilha esta cheia
	public boolean isFull() {

		// nossa pilha cresce dinamicamente, portanto sempre eh possivel inserir

		return false;
	}
}



                    /* O que acontece quando fazemos um comando “push(pop())” em uma estrutura de dados
                    Pilha? E o que acontece quando fazemos “push(top())”? */
                        
                    /*push(pop()) Desempilha e empilha novamente o objeto.
                      push(top()) Empilha novamente o mesmo objeto que esta no top da pilha.
                     */


class TerceiraListaSubinoonibus {

    public static void main(String[] args){
        
  
        String palavra = "miqueas";
        String comparador = "";
        
        PilhaDin p = new PilhaDin();
        
        for (int i = 0; i < palavra.length(); i++) {
            p.push(palavra.charAt(i));
        }
        
        while (!p.isEmpty()) {
            comparador += p.pop();
        }
        
        if (palavra.equals(comparador)) {
            System.out.println("é um palíndromo");
        }else{
            System.err.println("não é um palíndromo");

        }
    }
}


class TerceiraListaParênteses {

    public static void main(String[] args){
       
        String formula = "((a+b))";
        String abrir = "([{";
        String fechar = "}])";
        int contador = 0;
        PilhaDin p = new PilhaDin();
        for (int i = 0; i < formula.length(); i++) {
            if (abrir.contains(formula.charAt(i)+"")) {
                p.push(formula.charAt(i));
                contador++;
            }else if(fechar.contains(formula.charAt(i)+"")){
                p.pop();
                contador++;
            }
        }
        
        if (p.isEmpty() & contador % 2 == 0) {
            System.out.println("Bem formulada");
        }else{
            System.err.println("Mal formulada");
        }
    }
}