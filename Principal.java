package controller;

import java.util.ArrayList;
import java.util.Scanner;
import model.Automovel;
import model.Caminhao;
import model.Moto;
import model.Motorista;
import model.Multa;
import model.Veiculo;

public class Principal {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("* Sistema gerenciador locadora de Carros *");
        System.out.println("          * Seja bem-vindo *");
        
        int controle = 0;
        
        ArrayList<Veiculo> listaDeVeiculos = new ArrayList<Veiculo>();
        ArrayList<Motorista> listaDeMotorista = new ArrayList<Motorista>();
        ArrayList<Multa> listaDeMulta = new ArrayList<Multa>();
        
        String rel[][] = new String[10][10];
        
        do {
            System.out.println("\n[1] Para realizar o cadastro ou visualizar os Veículos.");
            System.out.println("[2] Para realizar o cadastro ou visualizar os Motoristas.");
            System.out.println("[3] Para realizar o cadastro ou visualizar as multas.");
            System.out.println("[4] Para visualizar Multas, Motoristas e Veículos.");
            System.out.println("[0] Para sair.");

            controle = leitor.nextInt();

            if(controle == 1) {
                int auxiliar = 1;
                do {
                    System.out.println("\n[2] Para realizar o cadastro de um Automóvel.");
                    System.out.println("[3] Para realizar o cadastro de um Caminhão.");
                    System.out.println("[4] Para realizar o cadastro de uma Moto.");
                    System.out.println("[5] Para visualizar os Veiculos cadastrados.");
                    System.out.println("[0] Para voltar ao menu Principal.");
                    
                    controle = leitor.nextInt();
                    
                    if(controle == 2) {
                        System.out.println("\nDigite a placa do Automóvel: ");
                        String placa = leitor.next();

                        System.out.println("Digite a cor do Automóvel: ");
                        String cor = leitor.next();

                        System.out.println("Digite a marca do Automóvel: ");
                        String marca = leitor.next();

                        System.out.println("Digite o modelo do Automóvel: ");
                        String modelo = leitor.next();
                
                        System.out.println("Quantidade de cv: ");
                        int cv = leitor.nextInt();
  
                        Automovel automovel = new Automovel(placa,cor,marca,modelo,cv);
                        listaDeVeiculos.add(automovel);
                        
                        rel[0][auxiliar] = automovel.getPlaca();
                        auxiliar++;
                    }
                    else if(controle == 3) {
                        System.out.println("\nDigite a placa do Caminhão: ");
                        String placa = leitor.next();

                        System.out.println("Digite a cor do Caminhão: ");
                        String cor = leitor.next();

                        System.out.println("Digite a marca do Caminhão: ");
                        String marca = leitor.next();

                        System.out.println("Digite o modelo do Caminhão: ");
                        String modelo = leitor.next();
                
                        System.out.println("Digite a capacidade de carga: ");
                        int capCarga = leitor.nextInt();
                        
                        Caminhao caminhao = new Caminhao(placa,cor,marca,modelo,capCarga);
                        listaDeVeiculos.add(caminhao);
                        
                        rel[0][auxiliar] = caminhao.getPlaca();
                        auxiliar++;
                    }
                    else if(controle == 4) {
                        System.out.println("\nDigite a placa da Moto: ");
                        String placa = leitor.next();

                        System.out.println("Digite a cor da Moto: ");
                        String cor = leitor.next();

                        System.out.println("Digite a marca da Moto: ");
                        String marca = leitor.next();

                        System.out.println("Digite o modelo da Moto: ");
                        String modelo = leitor.next();
                
                        System.out.println("Quantidade de potencia em Cilindradas: ");
                        int cc = leitor.nextInt();
                        
                        Moto moto = new Moto(placa,cor,marca,modelo,cc);
                        listaDeVeiculos.add(moto);
                        
                        rel[0][auxiliar] = moto.getPlaca();
                        auxiliar++;
                    }
                    else if(controle == 5) {
                        System.out.println("\n");
                        for(Veiculo i : listaDeVeiculos) {
                            System.out.println(i+"\n------------");
                        }
                    }
                    else if(controle == 0) {
                        controle = -5;
                    }
                    else {
                        System.out.println("\nOpção inválida");
                        System.out.println("\n");
                    }
                }while(controle != -5);  
            }
            else if(controle == 2) {
                int auxiliar = 1;
                do {    
                    System.out.println("\n[3] Para realizar o cadastro de um Motorista.");
                    System.out.println("[4] Para visualizar Motoristas cadastrados.");
                    System.out.println("[0] Para voltar ao menu Principal.");
                    
                    controle = leitor.nextInt();
                    
                    if(controle == 3) {
                        System.out.println("\nDigite o nome do Motorista: ");
                        String nome = leitor.next();
                    
                        System.out.println("Digite o tipo da CNH: ");
                        String tpCnh = leitor.next();
                    
                        System.out.println("Digite o número da CNH: ");
                        String numeroCnh = leitor.next();
                        
                        Motorista motorista = new Motorista(nome,tpCnh,numeroCnh);
                        listaDeMotorista.add(motorista);
                        
                        rel[auxiliar][0] = motorista.getNome();
                        auxiliar++;
                    }
                    else if(controle == 4) {
                        System.out.println("\n");
                        for (Motorista i : listaDeMotorista){
                            System.out.println(i+"\n---------------");
                        }
                    }
                    else if(controle == 0) {
                        controle = -5;
                    }
                    else {
                        System.out.println("\nOpção inválida");
                        System.out.println("\n");
                    }
                }while(controle != -5);
            }
            else if(controle == 3) {
                do {
                    System.out.println("\n[4] Para realizar o cadastro de uma Multa.");
                    System.out.println("[5] Para visualizar as Multas cadastradas.");
                    System.out.println("[0] Para voltar ao menu Principal.");
                    
                    controle = leitor.nextInt();
                    
                    if(controle == 4) {
                        System.out.println("\nDigite o código da multa: ");
                        String codigoMulta = leitor.next();
                    
                        System.out.println("Digite o valor da multa: ");
                        double valorMulta = leitor.nextDouble();
                        
                        System.out.println("Informe o nome do Motorista que tomou a multa: ");
                        String nomeMotorista = leitor.next();
                        
                        System.out.println("Informe a placa do Veiculo que o Motorista tomou a Multa: ");
                        String placaVeiculo = leitor.next();
                            
                        Multa multa = new Multa(codigoMulta,valorMulta);
                        listaDeMulta.add(multa);
                        
                        for(int i = 0; i < rel.length; i++) {
                            if(nomeMotorista.equals(rel[i][0])) {
                                for(int j = 0; j <rel[0].length; j++) {
                                    if(placaVeiculo.equals(rel[0][j])) { 
                                        rel[i][j] = multa.getCodigoMulta()+" ";
                                    }
                                }
                            }    
                        }
                    }
                    else if(controle == 5) {
                        System.out.println("\n");
                        for(Multa i : listaDeMulta) {
                            System.out.println(i+"\n------------");
                        }
                    }
                    else if(controle == 0) {
                        controle = -5;
                    }
                    else {
                        System.out.println("\nOpção inválida");
                        System.out.println("\n");
                    }
                }while(controle != -5);
            }
            else if(controle == 4) {
                for(int i = 0; i < rel.length;i++) {
                    for(int j = 0; j < rel[0].length; j++) {
                        if(rel[i][j] == null) {
                            rel[i][j] = "  |  ";
                        }   
                    }
                }
                System.out.println("\n");
                for(int i = 0; i < rel.length;i++) {
                    for(int j = 0; j < rel[0].length; j++) {
                        System.out.print(rel[i][j]+" ");
                    }
                    System.out.println(" ");
                }        
            }
            else if(controle == 0) {
                System.out.println("\nAté mais, te vejo na próxima");
                break;
            }  
            else {
                System.out.println("\nOpção inválida");
                System.out.println("\n");
            }  
        }while (controle != -7);   
    }
}
