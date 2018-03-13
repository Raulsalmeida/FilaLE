
public class FilaLE implements Fila {
	
	private int tamanho;
	private No inicio;
	private No fim;

	//CONSTRUTOR
	public FilaLE() {
		inicio = null;
		fim = null;
		tamanho = 0;
	}
	
	//RETORNA O TAMANHO
	public int tamanho() {
		return tamanho;
	}

	//INDICA SE ESTÁ VAZIA
	public boolean EstaVazia() {
		return inicio == null;
	}

	//RETORNA O INICIO
	public Object inicio() throws EFilaVazia {
		if(inicio == null) {
			throw new EFilaVazia();
		}else {
			return inicio.getElemento();
		}
	}

	//ADD UM ELEMENTO
	public void enfileirar(Object elemento) {
		if(inicio == null) {
			inicio = new No(elemento, null);
			fim = inicio;
			tamanho++;
		}else {
			No no = new No(elemento, null);
			fim.setProximo(no);
			fim = no;
			tamanho++;
		}
	}

	//REMOVE UM ELEMENTO
	public Object desenfileirar() throws EFilaVazia {
		No começo = inicio;
		if(começo == null) {
			throw new EFilaVazia();
		}else {
			inicio = inicio.getProximo();
			tamanho--;
			return começo.getElemento();
		}
	}
}
