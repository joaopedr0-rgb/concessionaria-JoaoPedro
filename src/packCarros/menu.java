package packCarros;
import java.util.Scanner;

public class menu {

    //importações 
    static Scanner escaneador = new Scanner(System.in);
    
    //


    public static void main(String[] args) {
        




        // Variaveis usadas para guardar informações do usuario
        // Tambem usadas de parametro nas funções login
        String User = null;
        String senha= null;


         //prints usados para fazer area inicial do sistema
        System.out.println("Faça login ou cadastro ");
        System.out.println("1. Login:");
        System.out.println("2. Cadastro:");


        //Variavel usada para controle no switch
        int opcao = escaneador.nextInt();



        switch(opcao){
            case 1:
            {
                //Função será inicializada para efetuar o Login
                Login(User, senha);
                Menu();
                break;


            }
            case 2:
                //Função sera inicializada para efetuar o cadastro
                Cadastro(User, senha);
                Menu();
                break;


        }


    }


    //Função Login para executar o login emoutro bloco de codigo
    public static void Login ( String LogUser,String Logsenha) {


         System.out.println("Digite seu nome de Usuario:");
         LogUser = escaneador.next();
         System.out.println("Digite a sua senha:");
         Logsenha = escaneador.next();

        //Apos o login ser efetuado irá para o menu principal
         
         return;
         


    }






    //
    public static void Cadastro(String CadUser, String CadSenha){
        //Variavel "verefique" usada para verificar se a senha está correta
        String Verefique = null;


        //variaveis "contador" e "i"usadas para controlar o While
        int contador = 10;
        int i = 0;


        //While seraa usado para reiniciar a area de cadastro caso o usuario falhe na verificaçao de senha
        while (i < contador ){
            System.out.println("Digite seu nome de usuario:");
            CadUser = escaneador.next();
            System.out.println("Digite sua senha:");
            CadSenha = escaneador.next();
            System.out.println("Digite sua senha novamente:");
            Verefique = escaneador.next();

            //if usado para verificar se senha esta correta
            if (Verefique.equals(CadSenha)) {

                
                
                break;
            } else {
                System.out.println("Tente novamente");
            }

            
        }


    }



    //Função usada para fazero o "menu"
    public static void Menu( ){
        //"front" do menu
        System.out.println( "                                MENU PRINCIPAL");

        System.out.println("\n Escolha alguma das opções abaixo:");
        System.out.println("1. Gerenciar veiculos.");
        System.out.println("2. Gerenciamento de clientes.");
        System.out.println("3. Controle de vendas.");

        //variavel usada para controle do menu
        int opcaoMenu = escaneador.nextInt();
        
        //switch usado para dar funcionalidade ao menu
        switch(opcaoMenu){

            case 1:
            {
                //chamando função do sub-menu "geriamendo de carros"
                Carros.GerenciaCarros();
                break;
            }
            
        }
    }
    


}


   