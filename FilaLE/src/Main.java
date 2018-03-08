import java.util.Scanner;

public class Main {

	public static void menuUI(){
        System.out.println("FILA EM ARRAY\n====================="
                + "\nEscolha uma opção:\n----------------------\n"
                + "1 - Adicionar elemento\n"
                + "2 - Remover elemento\n"
                + "3 - Ver o início\n"
                + "4 - Ver o tamanho da fila\n"
                + "5 - Ver se a fila está vazia\n"
                + "0 - SAIR\n\n>>> ");
        
    }
	
	public static void main (String[] args) {
		
		int tamanho;
		int fc;
		int i;
		int f;
		Object elemento = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da fila:");
		tamanho = sc.nextInt();
		System.out.println("Digite a taxa de crescimento:");
		fc = sc.nextInt();
		System.out.println("Digite o inicio da fila");
		i = sc.nextInt();
		System.out.println("Digite o final da fila");
		f = sc.nextInt();
		
		FilaArray fila = new FilaArray(tamanho, fc);
		
		int resposta = -1;
		while(resposta != 0) {
			menuUI();
			Scanner op = new Scanner(System.in);
			resposta = op.nextInt();
			switch(resposta) {
				case 1:
					System.out.print("ADICIONAR: ");
                    elemento = sc.next();
                    fila.enfileirar(elemento);
                    
                    break;
                
                case 2:
                	try {
                    fila.desenfileirar();
                    System.out.println("Elemento Removido com sucesso!!");
                    Object topo = fila.inicio();
                    System.out.println("\n--->Seu elemento do topo agora ï¿½ "+topo+"!<---");
                	}catch(EFilaVazia e1){
                		System.out.println("Sua fila estï¿½ vazia, nï¿½o tem o que remover");
                	}
                    break;
                
                case 3:
                	try {
                    Object topo2 = fila.inicio();
                    System.out.println("\n--->Seu elemento do topo ï¿½ "+topo2+"!<---");
                	}catch(EFilaVazia e1){
                		System.out.println("Sua pilha estï¿½ vazia, nï¿½o tem o que ver no topo dela");
                	}
                    break;
                
                case 4:
                    int qtdElementos = fila.tamanho();
                    System.out.println("Vocï¿½ tem "+qtdElementos+" na pilha!");
                    break;
                
                case 5:
                    boolean situacao = fila.EstaVazia();
                    int qtd = fila.tamanho();
                    if (situacao==true){
                        System.out.println("Sim! Pilha Vazia!");
                    }else{
                        System.out.println("Nï¿½o! a pilha nï¿½o estï¿½ vazia. Contï¿½m "+ qtd +" elementos!");
                    }
                    break;
                
                case 0:
                    System.out.println("FIM DA PILHA\n=======================================");
                    break;
                default:
                    System.out.println("Escolha uma opï¿½ï¿½o vï¿½lida!");
            }
				
			}
		}
		
		
	}

	

