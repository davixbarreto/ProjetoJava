package projeto;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import projeto.painelSistema;

public class sistema {
    public static void main(String[] args) throws InterruptedException, IOException {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        
        List<painelSistema> dataList = new ArrayList<>();
        String senha;

        do{

            System.out.print("Para continuar com o acesso ao sistema, informe o login abaixo: \n");
            System.out.print("USUARIO : ");
            String usuario = scan.nextLine();
            System.out.print("SENHA : ");
            senha = scan.nextLine();
            System.out.print("\nEstamos validando seu login, só um momento");
            Thread.sleep(3000);
            System.out.print("...");
            Thread.sleep(3000);
            System.out.print("\n");
            
            if(senha.equals("9090admin")){

                if (System.getProperty("os.name").contains("Windows")) new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                
                else
                Runtime.getRuntime().exec("clear");

                System.out.print("\nAcesso Liberado!!");
                System.out.print("\n");
                System.out.print("\n");
                System.out.print("================================================\n");
                System.out.print("              MENU ADMINISTRATIVO              \n");
                System.out.printf("     Bem vindo ao menu do sistema, %s\n", usuario);
                System.out.print("================================================\n");
                System.out.print("\n -> Você sera direcionado para o painel de cadastro!\n");

                System.out.print("\nCARREGANDO O PAINEL");
                Thread.sleep(3000);
                System.out.print("...");
                Thread.sleep(3000);

                if (System.getProperty("os.name").contains("Windows")) new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                
                else
                    Runtime.getRuntime().exec("clear");

                int escolha = 0;
                System.out.print("\n");
                System.out.print("================================================\n");
                System.out.print("    PAINEL DE CADASTRO DOS FUNCIONARIOS          \n");
                System.out.print("================================================ \n");
                System.out.print("\n");
                System.out.print("INFORME A QUANTIDADE DE CADASTRO QUE DESEJA EFETUAR : ");
                int cadastrarFuncionario = scan.nextInt();
                for(int i=0; i<cadastrarFuncionario; i++){
                    System.out.print("\n");
                    System.out.print("\nProcessando");
                    Thread.sleep(3000);
                    System.out.print("...");
                    System.out.print("\n\n");
                    System.out.print("================================================\n");
                    System.out.printf("-- %d PAINEL DE REGISTRO -- \n", i+1);
                    System.out.print("===============================================\n");
                    System.out.print("\n");
                    System.out.print("\n1 - INSIRA O CÓDIGO DO FUNCIONARIO : ");
                    int funcionarioCodigo = scan.nextInt();
                    while(validarCodigo(dataList, funcionarioCodigo)){
                            System.out.print("\n\nO CÓDIGO QUE VOCÊ INSERIU JÁ EXISTE, POR FAVOR TENTE OUTRO! ");
                            System.out.print("\nINSIRA O NOVO CODIGO: ");
                            funcionarioCodigo = scan.nextInt();
                        }

                    System.out.print("\n2 - INSIRA O NOME DO FUNCIONARIO: ");
                    scan.nextLine();
                    String funcionarioNome = scan.nextLine();

                    System.out.print("\n3 - INSIRA O SALARIO INICIAL DO FUNCIONARIO : ");
                    double funcionarioSalario = scan.nextDouble();
                    painelSistema funcionario = new painelSistema(funcionarioNome, funcionarioCodigo, funcionarioSalario);
                    dataList.add(funcionario);
                }

                if (System.getProperty("os.name").contains("Windows")) new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                
                else
                    Runtime.getRuntime().exec("clear");

                System.out.print("OS DADOS DO CADASTRO ESTÃO SENDO ARMAZENADOS, AGURDE");
                Thread.sleep(3000);
                System.out.print("...");
                Thread.sleep(3000);
                System.out.print("\n");

                if (System.getProperty("os.name").contains("Windows")) new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                
                else
                    Runtime.getRuntime().exec("clear");

                do{
                    System.out.print("============================================== \n");
                    System.out.print("1 - MOSTRAR LISTA DE CADASTRO\n");
                    System.out.print("2 - REMOVER CADASTRO\n");
                    System.out.print("3 - ALTERAR NOME DO FUNCIONARIO\n");
                    System.out.print("4 - BUSCAR CADASTRO\n");
                    System.out.print("5 - SAIR \n");
                    System.out.print("==============================================\n");
                    System.out.print("ESCOLHA UMAS DAS OPÇÕES PARA PROSSEGUIR  \n ");
                    escolha = scan.nextInt();
                    switch(escolha){

                        case 1: {
                            if (System.getProperty("os.name").contains("Windows")) new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                
                            else
                                Runtime.getRuntime().exec("clear");

                            System.out.print("OPÇÃO SELECIONADA: VER CADASTRO \n");
                            System.out.print("\n");
                            System.out.print("\n");
                            System.out.print ("A LISTA JUNTO COM OS DADOS DOS FUNCIONARIOS CADASTRADOS VÃO APARECER NA TELA \n ");
                            Thread.sleep(3000);

                            System.out.print("\n");
                            System.out.print("================================\n");
                            System.out.print("       VER CADASTRO           \n");
                            System.out.print("================================\n");
                            System.out.print("CONFIRA A LISTA ABAIXO:  \n");
                            System.out.print("\n");
                            System.out.print(dataList);
                            System.out.print("\n");
                            System.out.print("\n\nLISTA DE CADASTRO EXIBIDA!! \n");
                            Thread.sleep(3000);

                            if (System.getProperty("os.name").contains("Windows")) new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                
                            else
                             Runtime.getRuntime().exec("clear");
                            break;
                        } 
                        
                        case 2: {                           
                            if (System.getProperty("os.name").contains("Windows")) new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                
                            else
                                Runtime.getRuntime().exec("clear");

                            System.out.print("OPÇÃO SELECIONADA: REMOVER CADASTRO \n");
                            System.out.print("================================\n");
                            System.out.print("     REMOVER CADASTRO       \n");
                            System.out.print("================================\n");
                            System.out.print("\n");
                            System.out.print("INFORME A POSIÇÃO DE CADASTRO DO FUNCIONARIO : ");
                            int registrarPosicao = scan.nextInt();
                            int novaPosicao = (registrarPosicao-1);
                            dataList.remove(novaPosicao);
                            System.out.print("\n");
                            System.out.print("DADOS REMOVIDOS COM SUCESSO!!\n");
                            Thread.sleep(3000);

                            if (System.getProperty("os.name").contains("Windows")) new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                
                            else
                             Runtime.getRuntime().exec("clear");
                            break;
                        }

                        case 3: {
                            if (System.getProperty("os.name").contains("Windows")) new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                
                            else
                                Runtime.getRuntime().exec("clear");

                            System.out.print("OPÇÃO SELECIONADA: ALTERAR NOME DO FUNCIONARIO\n");
                            System.out.print("================================\n");
                            System.out.print("         ALTERAR NOME         \n");
                            System.out.print("================================ \n");
                            System.out.print("INFORME O CÓDIGO DO FUNCIONARIO QUE DESEJA: ");
                            int funcionarioIDalterarNome = scan.nextInt();
                            painelSistema funcionarioAlterarNome = dataList.stream().filter(x -> x.funcionarioCodigo() == funcionarioIDalterarNome).findFirst().orElse(null);

                            if(funcionarioAlterarNome== null){
                                System.out.print("\n");
                                System.out.print("O código do funcionario que vc digitou está incorreto ou não existe!! \n");
                            }
                            else{
                                System.out.print("\n");
                                System.out.print("INFORME O NOVO NOME  : ");
                                scan.nextLine();
                                String novoNome = scan.nextLine();
                                funcionarioAlterarNome.setFuncionarioNome(novoNome);
                                System.out.print("\nNOME ALTERADO COM SUCESSO!!");
                            }                            
                            Thread.sleep(3000);

                            if (System.getProperty("os.name").contains("Windows")) new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                
                            else
                             Runtime.getRuntime().exec("clear");
                            break;
                        }

                        case 4: {
                            if (System.getProperty("os.name").contains("Windows")) new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                
                            else
                                Runtime.getRuntime().exec("clear");

                            System.out.print("OPÇÃO SELECIONADA: BUSCAR FUNCIONARIO\n");
                            System.out.print("================================\n");
                            System.out.print("      BUSCAR FUNCIONARIO          \n");
                            System.out.print("================================ \n");
                            System.out.print("NOS INFORME O NOME DO FUNCIONARIO QUE DESEJA BUSCAR : ");
                            scan.nextLine();
                            String FuncionarioNome = scan.nextLine();
                            painelSistema funcionarioNome = dataList.stream().filter(x -> x.getFuncionarioNome() == FuncionarioNome).findFirst().orElse(null);
                            if(FuncionarioNome== null){
                            System.out.print("USUARIO INFORMADO NÃO EXISTE, TENTE NOVAMENTE! \n");
                            }
                            else{
                            System.out.print("\n");
                            System.out.printf("%s, Funcionario encontrado com sucesso!\n", FuncionarioNome);
                            System.out.print("\n\n");
                            }
                            Thread.sleep(3000);

                            if (System.getProperty("os.name").contains("Windows")) new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                
                            else
                             Runtime.getRuntime().exec("clear");
                            break;                       
                        }

                        case 5:{                          
                            if (System.getProperty("os.name").contains("Windows")) new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                
                            else
                                Runtime.getRuntime().exec("clear");

                            System.out.print("================================================\n");
                            System.out.print("              MENU ADMINISTRATIVO              \n");
                            System.out.print("================================================\n");						
                            System.out.print("\n\nFECHANDO O SISTEMA");
                            Thread.sleep(3000);
                            break;
                        }
                    }
            }while(escolha != 5);  
        } else {
            
            if (System.getProperty("os.name").contains("Windows")) new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                
            else
                Runtime.getRuntime().exec("clear");

            System.out.print("Usuario ou senha incorreto, por favor verifique suas credencias de acesso e tente novamente");
            System.out.print("\n\n");
            Thread.sleep(3000);

            if (System.getProperty("os.name").contains("Windows")) new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                
            else
                Runtime.getRuntime().exec("clear"); //return;
            }

        }while(!senha.equals("9090admin"));    
        scan.close();
    }
    
    private static boolean validarCodigo(List<painelSistema> dataList, int funcionarioCodigo) {
        painelSistema funcionarioValidarCPF = dataList.stream().filter(x -> x.funcionarioCodigo() == funcionarioCodigo).findFirst().orElse(null);
        return funcionarioValidarCPF != null;
    }   
}