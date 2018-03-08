import java.util.Scanner;

public class Main {

	public static void menuUI(){
        System.out.println("FILA EM ARRAY\n====================="
                + "\nEscolha uma op��o:\n----------------------\n"
                + "1 - Adicionar elemento\n"
                + "2 - Remover elemento\n"
                + "3 - Ver o in�cio\n"
                + "4 - Ver o tamanho da fila\n"
                + "5 - Ver se a fila est� vazia\n"
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
                    System.out.println("\n--->Seu elemento do topo agora � "+topo+"!<---");
                	}catch(EFilaVazia e1){
                		System.out.println("Sua fila est� vazia, n�o tem o que remover");
                	}
                    break;
                
                case 3:
                	try {
                    Object topo2 = fila.inicio();
                    System.out.println("\n--->Seu elemento do topo � "+topo2+"!<---");
                	}catch(EFilaVazia e1){
                		System.out.println("Sua pilha est� vazia, n�o tem o que ver no topo dela");
                	}
                    break;
                
                case 4:
                    int qtdElementos = fila.tamanho();
                    System.out.println("Voc� tem "+qtdElementos+" na pilha!");
                    break;
                
                case 5:
                    boolean situacao = fila.EstaVazia();
                    int qtd = fila.tamanho();
                    if (situacao==true){
                        System.out.println("Sim! Pilha Vazia!");
                    }else{
                        System.out.println("N�o! a pilha n�o est� vazia. Cont�m "+ qtd +" elementos!");
                    }
                    break;
                
                case 0:
                    System.out.println("FIM DA PILHA\n=======================================");
                    break;
                default:
                    System.out.println("Escolha uma op��o v�lida!");
            }
				
			}
		}
		
		
	}

	

