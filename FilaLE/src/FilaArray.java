
public class FilaArray implements Fila {
	private int i;
	private int f;
	private int fc;
	public Object Fila[];
	public Object gotenks[];
	
	//CONSTRUTOR DO OBJETO
	public FilaArray(int tamanho, int fc) {
		Fila = new Object[tamanho];
		this.fc =fc;
	}
	
	//CRESCIMENTO DA FILA CHEIA
	public Object[] crescimento(int fc) {
		for (int i = 0; i < tamanho(); i++) {
			
			if(fc == 0) {
			gotenks = new Object[tamanho()*2];
			gotenks[i] = Fila[i];
			}else {
				gotenks = new Object[tamanho() + fc];
				gotenks[i] = Fila[i];
			}
		}
		return gotenks;
	}
	
	//VERIFICAR TAMANHO DA FILA
	public int tamanho() {
		return (Fila.length - i + f)%Fila.length;
	}
	
	//VERIFICAR SE A FILA ESTÁ VAZIA
	public boolean EstaVazia() {
		return (i == f);
	}

	//VERIFICAR O INICIO DA FILA
	public Object inicio() throws EFilaVazia {
		if(EstaVazia()) {
			throw new EFilaVazia();
		}else {
			return Fila[i];
		}
	}
	
	
	public void enfileirar(Object o) {
		if(tamanho() == Fila.length -1) {
			Fila = crescimento(fc);
		}
		Fila[f] = o;
		f = (f +1)%Fila.length;
	}

	
	public Object desenfileirar() throws EFilaVazia {
		Object o;
		
		if(EstaVazia()) {
			throw new EFilaVazia();
		}else {
			i = (i+1)%Fila.length;
			o = Fila[i];
		}
		return o;
	}
	
	
}
