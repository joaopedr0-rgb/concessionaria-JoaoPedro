
package packCarros;
import java.util.ArrayList;
import java.util.Scanner;

//Classe criada para carros
public class Carros {

    //Scanner criado apenas para ser usado no submenu gerencia de carros
    static Scanner escanor = new Scanner(System.in);
    static  ArrayList<Carros> ListaCarros = new ArrayList<>();

    
    //Criando o OBJETO "carro"
    public String modelo;
    public int ano;
    public String placa;
    public String cor;
    public int KM;
    public double preco;



    public Carros(String modelo, int ano, String cor, int KM, double preco) {
        this.modelo = modelo;
        this.ano = ano;
        this.placa= placa;
        this.cor = cor;
        this.KM = KM;
        this.preco = preco;
    }



    public String toString() {
    return "Modelo: " + modelo +
           ", Ano: " + ano +
           ", Cor: " + cor +
           ", KM: " + KM +
           ", Preço: " + preco;
    }



     // função feita para o sub-menu gerenciamento de carros
    public static void GerenciaCarros(){


        
        
        //criando os objetos
        Carros carro1 = new Carros("Civic", 2020, "vermelho", 45000, 95000.00);
        Carros carro2 = new Carros("Gol", 2015, "azul", 120000, 35000.00);
        Carros carro3 = new Carros("Corolla", 2022, "verde", 20000, 130000.00);
        


        
        //criando uma lista para que possa ser criado novos objetos a partir do menu
       



        
        // front do sub-menu "gerenciamenro de veiculos"
        System.out.println(" \n                GERENCIAMENTO DE VEICULOS:");
        System.out.println("1. Cadastro veículo novo.");
        System.out.println("2. Ver veiculos.");
        System.out.println("3. Editar veiculo.");
        System.out.println("4. Exluir cadastro de veiculos.");
        System.out.println("0. Voltar para o menu principal."); 




        //variavel usada para controlar o submenu
        int CarsControler = escanor.nextInt();



        //switch usado para dar funcionalidade ao menu
        switch(CarsControler){

           
            case 0:
            {
                menu.Menu();
                break;
            }
            
           
            case 1:
            {
                System.out.println("\n    Cadastro de veiculos");

                //Criação de um novo objeto "carro"
                 System.out.println("Digite o modelo do veiculo"  );
                    String modelo = escanor.next();

                    System.out.println("Digite o ano do veiculo" );
                    int ano =escanor.nextInt();

                    System.out.println("Digite o cor do veiculo" );
                    String cor = escanor.next();

                    System.out.println("Digite a kilometragem do veiculo");
                    int KM = escanor.nextInt();

                    System.out.println("Digite o preço do veiculo");
                    double preco = escanor.nextDouble();

                    Carros NovoCarro = new Carros(modelo, ano, cor,  KM , preco);

                    
                    
                    //arrayList usado para receber novos objetos
                    ListaCarros.add(NovoCarro);
                    
                     

                    // Mostra todos os carros cadastrados ao final
                    System.out.println("\nNovo veículo adicionado !!!");
                    
                        
                    
                
                System.out.println("Digite 0 para voltar ao Menu principal");
                CarsControler = escanor.nextInt();
                if(CarsControler == 0){
                    menu.Menu();
                }
                
                
                
                

            }
            case 2:
            {

                System.out.println("LISTA DE VEICULOS ");

                System.out.println(carro1.toString());
                System.out.println();
                System.out.println(carro2.toString());
                System.out.println();
                System.out.println(carro3.toString());
                System.out.println();
                for (Carros c : ListaCarros) {
            System.out.println(c);
        }

                System.out.println("Digite 0 para voltar ao Menu principal");
                CarsControler = escanor.nextInt();
                if(CarsControler == 0){
                    System.out.println();
                    menu.Menu();
                }


                break;
            }
            
        }
    }    
    
}

    
