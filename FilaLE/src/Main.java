import java.util.Scanner;

public class Main {

	public static void menuUI(){
        System.out.println("FILA com Lista Ligada\n====================="
                + "\nEscolha uma op��o:\n----------------------\n"
                + "1 - Efileirar\n"
                + "2 - Desenfileirar\n"
                + "3 - Ver o in�cio\n"
                + "4 - Ver o tamanho da fila\n"
                + "5 - Ver se a fila est� vazia\n"
                + "0 - SAIR\n\n>>> ");
        
    }
	
	public static void main (String[] args) {
		
		Object elemento = null;
		FilaLE fila = new FilaLE();
		Scanner sc = new Scanner(System.in);
		
			
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
                		System.out.println("Sua Fila est� vazia, n�o tem o que ver no topo dela");
                	}
                    break;
                
                case 4:
                    int qtdElementos = fila.tamanho();
                    System.out.println("Voc� tem "+qtdElementos+" na fila!");
                    break;
                
                case 5:
                    boolean situacao = fila.EstaVazia();
                    int qtd = fila.tamanho();
                    if (situacao==true){
                        System.out.println("Sim! Fila Vazia!");
                    }else{
                        System.out.println("N�o! a Fila n�o est� vazia. Cont�m "+ qtd +" elementos!");
                    }
                    break;
                
                case 0:
                    System.out.println("FIM DA FILA\n=======================================");
                    break;
                default:
                    System.out.println("Escolha uma op��o v�lida!");
            }
				
			}
		}
		
		
	}

	

