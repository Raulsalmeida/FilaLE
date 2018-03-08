
public interface Fila {
	public int tamanho();
	public boolean EstaVazia();
	public Object inicio() throws EFilaVazia;
	public void enfileirar(No no);
	public Object desenfileirar() throws EFilaVazia;
}
