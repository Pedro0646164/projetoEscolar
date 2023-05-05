import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner capture = new Scanner (System.in);
		ArrayList<Pessoa> pes = new ArrayList<Pessoa>();
		ArrayList<Receitas> listaReceitas = new ArrayList<Receitas>();
		
		int opcao;
	    do
	      {
		System.out.println ("============MENU===========\n");
		System.out.println (" 1 - Cadastrar-se \n");
		System.out.println (" 2 - Entrar \n");
		System.out.println (" 3 - Sair \n");
		System.out.println ("===========================\n");
		System.out.println ("digite a opção desejada:\n");
		opcao = capture.nextInt ();
		switch (opcao) {
		
		    case 1:
		    	System.out.println ("Digite o nome:\n");
			    String nome = capture.next();		    
			    
			    System.out.println ("Digite um email:\n");
			    String email = capture.next();		    
			    
			    System.out.println ("Digite uma senha:\n");
			    String senha = capture.next();
			        
			    Pessoa p = new Pessoa(nome, email, senha);
			    pes.add(p);
			    System.out.println ("USUARIO CADASTRADO!\n");
			    
		     break;
		     
		    case 2:		
		    	System.out.println ("Email: \n");///////Entrar com email
		    	String capEmail = capture.next();	
		    	
		    	for(Pessoa i : pes){            
			    	   if(capEmail.equals(i.getEmail())){
			    		   
			    		   System.out.println ("Senha: \n");///////////Entrar com senha
					    	String capSenha = capture.next();
			    	    		   
			    		   for(Pessoa j : pes){           
					    	   if(capSenha.equals(j.getSenha())){  
					    		   
/////////////////////////////////////////////////////////////Menu Principal//////////////////////////////////////////////////////////////////////					    		   
					    		   
					    		  int operar=0;	
					    		  System.out.println ("Bem Vindo " + j.getNome());
						    	  do {	 						    		  
					    		    System.out.println ("\n==========Receitas=========\n");	
					    		    System.out.println (" 1 - Cadastrar Receitas\n");
					    			System.out.println (" 2 - Acessar Receitas\n"); //procurar vai estar aq //favoritar também//organizar
					    			System.out.println (" 3 - Favoritos\n");
					    			System.out.println (" 4 - Sair\n");
					    			System.out.println ("===========================\n");  //System.out.println ("");
					    			System.out.println ("digite a opção desejada:\n");
					    			operar = capture.nextInt ();
					    			switch (operar) {
					    			
					    			case 1:
					    				System.out.println ("Digite o titulo:\n");
					    			    String titulo = capture.next();		    
					    			    
					    			    System.out.println ("Escreva a receita:\n");
					    			    String texto = capture.next();		    
					    			    
					    			    System.out.println ("Tipo da receita/Gênero:\n");
					    			    String genero = capture.next();
	                                    				    			        
					    			    Receitas r = new Receitas(titulo, texto, genero);
					    			    listaReceitas.add(r);
					    				break;
					    				
					    			case 2:	
					    				int procurar=0;
					    				do {
					    					System.out.println ("\n==========Receitas=========\n");	
							    		    System.out.println (" 1 - Procurar\n"); //ok
							    			System.out.println (" 2 - Procurar por gênero"); //ok
							    			System.out.println (" 3 - Organizar\n");
							    			System.out.println (" 4 - Listar todas\n"); //ok
							    			System.out.println (" 5 - Apagar\n"); //ok
							    			System.out.println (" 6 - Voltar\n"); //ok
							    			System.out.println ("===========================\n");
							    			System.out.println ("digite a opção desejada:\n");
							    			procurar = capture.nextInt ();
							    			switch (procurar) {
							    			
							    			case 1:
							    			System.out.print("Digite o titulo da receita: \n");
					    		            String pesquisaReceita = capture.next();
					    		        
					    		            for(Receitas k : listaReceitas){					    		           
					    		    	       if(pesquisaReceita.equals(k.getTitulo())){		    		   
					    		    		   System.out.print(k.getTexto()+"\nGenero:\n"+k.getGenero());		    		   
					    		    	       }		           
					    		            }
							    			break;
							    			////////
							    			case 2:
							    				System.out.print("Digite o Gênero da receita: \n");
						    		            String pesquisaGenero = capture.next();
						    		        
						    		            for(Receitas k : listaReceitas){					    		           
						    		    	       if(pesquisaGenero.equals(k.getGenero())){		    		   
						    		    		   System.out.print(k.getTitulo());		    		   
						    		    	       }		           
						    		            }
							    			break;
							    			//////
							    			case 3:
							    				//Collections.sort(getTitulo); 
							    			break;
							    			/////
							    			case 4:
							    				for(Receitas l : listaReceitas) {
							    			    System.out.print(l.getTitulo()+"\n");	
							    				}
							    			break;
							    			/////
							    			case 5:							    				
							    				System.out.print("Digite o titulo da receita a ser apagada: \n");
						    		            String excluir = capture.next();
						    		        
						    		            for(Receitas k : listaReceitas){					    		           
						    		    	       if(excluir.equals(k.getTitulo())){		
						    		    	    	   listaReceitas.remove(k);
						    		    		   System.out.print("\nReceita excluida com sucesso!\n");		    		   
						    		    	       }		           
						    		            }
						    		            
							    			break;
							    			case 6:
							    				procurar = 7;
							    			break;
							    			}
							    			
					    					
					    					
					    					
					    				}while(procurar >0 && procurar < 7);					    									    									    				
					    				break;
					    				
					    			case 3:
					    				break;
					    				
					    			case 4:
					    				operar = 6;
					    				break;

					    			}					    		  						    		  
						        }while(operar > 0 && operar < 6);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
					    	   }else {
					    		   System.out.println ("Senha invalida!!!");
					    	   }				    	   
					    	}
			    		   			    		    		   
			    	   }else {
			    		   System.out.println ("Email não encontrado!!!");
			    	   }
			       }		    	
		     break;
		     
		    case 3:
		    	opcao = 6;
		    break;
		     
		    default:System.out.println ("Opção invalida");
		    opcao = 0;
		    break;		    
		  }
	    } while (opcao > 0 & opcao < 6);
	    System.out.println ("PROGAMA FINALIZADO");    
	}
}