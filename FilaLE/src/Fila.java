
public interface Fila {
	public int tamanho();
	public boolean EstaVazia();
	public Object inicio() throws EFilaVazia;
	public void enfileirar(Object elemento);
	public Object desenfileirar() throws EFilaVazia;
}
