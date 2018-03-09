
public class FilaLE implements Fila {
	private int i;
	private int viajante;
	private int f;
	private int fc;
	public Object fila[];
	public Object gotenks[];
	
	//CONSTRUTOR DO OBJETO
	public FilaLE(int tamanho, int fc, int i, int f) {
		fila = new Object[tamanho];
		this.i = i;
		this.f = f;
		this.fc =fc;
		//this.viajante = i;
	}
	
	//CRESCIMENTO DA FILA CHEIA
	public Object[] crescimento(int fc) {
		for (int i = 0; i < tamanho(); i++) {
			
			if(fc == 0) {
			gotenks = new Object[tamanho()*2];
			gotenks[i] = fila[i];
			}else {
				gotenks = new Object[tamanho() + fc];
				gotenks[i] = fila[i];
			}
		}
		return gotenks;
	}
	
	//VERIFICAR TAMANHO DA FILA
	public int tamanho() {
		return (fila.length - i + f)%fila.length;
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
			return fila[i];
		}
	}
	
	
	public void enfileirar(No no) {
		Object elemento = no.getElemento();
		if(tamanho() == fila.length -1) {
			fila = crescimento(fc);
		}
		f = (f +1)%fila.length;
		fila[++f] = elemento;
		if (viajante == 0) {
			no.setProximo(null);
			//viajante++;
		}else {
			no.setProximo(fila[f - 1]);
		}
	}

	
	public Object desenfileirar() throws EFilaVazia {
		Object o;
		
		if(EstaVazia()) {
			throw new EFilaVazia();
		}else {
			i = (i+1)%fila.length;
			o = fila[i];
		}
		return o;
	}
	
}
