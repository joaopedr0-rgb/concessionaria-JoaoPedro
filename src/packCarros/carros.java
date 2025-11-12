
package packCarros;

import java.util.ArrayList;
import java.util.Scanner;

//Classe criada para carros
public class Carros {

    // Scanner criado apenas para ser usado no submenu gerencia de carros
    static Scanner escanor = new Scanner(System.in);
    static ArrayList<Carros> ListaCarros = new ArrayList<>();

    // Criando o OBJETO "carro"
    public String modelo;
    public int ano;

    public String cor;
    public int KM;
    public double preco;

    public Carros(String modelo, int ano, String cor, int KM, double preco) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.KM = KM;
        this.preco = preco;
    }

    public void setAtributo(String modelo, int ano, String cor, int KM, double preco) {
        this.modelo = modelo;
        this.ano = ano;
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
    public static void GerenciaCarros() {

        // criando os objetos
        Carros carro1 = new Carros("Civic", 2020, "vermelho", 45000, 95000.00);
        Carros carro2 = new Carros("Gol", 2015, "azul", 120000, 35000.00);
        Carros carro3 = new Carros("Corolla", 2022, "verde", 20000, 130000.00);

        ListaCarros.add(carro1);
        ListaCarros.add(carro2);
        ListaCarros.add(carro3);

        // criando uma lista para que possa ser criado novos objetos a partir do menu

        // front do sub-menu "gerenciamenro de veiculos"
        System.out.println(" \n                GERENCIAMENTO DE VEICULOS:");
        System.out.println("1. Cadastro veículo novo.");
        System.out.println("2. Ver veiculos.");
        System.out.println("3. Editar veiculo.");
        System.out.println("0. Voltar para o menu principal.");

        // variavel usada para controlar o submenu
        int CarsControler = escanor.nextInt();

        // switch usado para dar funcionalidade ao menu
        switch (CarsControler) {

            case 0: {
                menu.Menu();
                break;
            }

            case 1: {
                System.out.println("\n    Cadastro de veiculos");

                // Criação de um novo objeto "carro"
                System.out.println("Digite o modelo do veiculo");
                String modelo = escanor.next();

                System.out.println("Digite o ano do veiculo");
                int ano = escanor.nextInt();

                System.out.println("Digite a cor do veiculo");
                String cor = escanor.next();

                System.out.println("Digite a kilometragem do veiculo");
                int KM = escanor.nextInt();

                System.out.println("Digite o preço do veiculo");
                double preco = escanor.nextDouble();

                Carros NovoCarro = new Carros(modelo, ano, cor, KM, preco);

                // arrayList usado para receber novos objetos
                ListaCarros.add(NovoCarro);

                // Mostra todos os carros cadastrados ao final
                System.out.println("\nNovo veículo adicionado !!!");

                System.out.println("Digite 0 para voltar ao Menu principal");
                CarsControler = escanor.nextInt();
                if (CarsControler == 0) {
                    menu.Menu();
                }

            }
            case 2: {

                System.out.println("LISTA DE VEICULOS ");

                System.out.println(ListaCarros.get(0));
                System.out.println("");
                System.out.println(ListaCarros.get(1));
                System.out.println("");
                System.out.println(ListaCarros.get(2));
                System.out.println("");

                if (ListaCarros.size() == 4) {

                    System.out.println(ListaCarros.get(0));
                    System.out.println("");
                    System.out.println(ListaCarros.get(1));
                    System.out.println("");
                    System.out.println(ListaCarros.get(2));
                    System.out.println("");
                    System.out.println(ListaCarros.get(3));

                }

                System.out.println("Digite 0 para voltar ao Menu principal");
                CarsControler = escanor.nextInt();

                if (CarsControler == 0) {

                    System.out.println();
                    GerenciaCarros();
                    break;

                }

                break;
            }
            case 3: {
                System.out.println("\nEditar veiculos");
                System.out.println("");
                System.out.println("1. Editar veiculos.");
                System.out.println("2. Excluir veiculos.");

                CarsControler = escanor.nextInt();

                if (CarsControler == 1 && CarsControler != 2) {
                    System.out.println("Escolha um veiculo para editar:");

                    System.out.println("Carro 1.");
                    System.out.println("Carro 2.");
                    System.out.println("Carro 3.");

                    CarsControler = escanor.nextInt();

                    switch (CarsControler) {

                        case 1: {
                            String modelo_novo = null;
                            int novo_ano = 0;
                            String nova_cor = null;
                            int novo_KM = 0;
                            double novo_preco = 0;

                            System.out.println("\nEscolha uma informação para editar");
                            System.out.println("1. Modelo");
                            System.out.println("2. Ano");
                            System.out.println("3. Cor");
                            System.out.println("4. KM");
                            System.out.println("5. Preço");
                            CarsControler = escanor.nextInt();

                            if (CarsControler == 1) {

                                System.out.println("modelo:");
                                modelo_novo = escanor.next();

                                carro1.modelo = modelo_novo;

                                ListaCarros.get(0).setAtributo(modelo_novo, novo_ano, nova_cor, novo_KM, novo_preco);

                            }

                            if (CarsControler == 2) {

                                System.out.println("Ano:");
                                novo_ano = escanor.nextInt();

                                carro1.ano = novo_ano;

                                ListaCarros.get(0).setAtributo(modelo_novo, novo_ano, nova_cor, novo_KM, novo_preco);
                            }

                            if (CarsControler == 3) {
                                System.out.println("Cor do veiculo");
                                nova_cor = escanor.next();

                                carro1.cor = nova_cor;

                                ListaCarros.get(0).setAtributo(modelo_novo, novo_ano, nova_cor, novo_KM, novo_preco);

                            }

                            if (CarsControler == 4) {
                                System.out.println("Kilometragem do veiculo");
                                novo_KM = escanor.nextInt();

                                carro1.KM = novo_KM;

                                ListaCarros.get(0).setAtributo(modelo_novo, novo_ano, nova_cor, novo_KM, novo_preco);

                            }

                            if (CarsControler == 5) {
                                System.out.println("Preço do veiculo");
                                novo_preco = escanor.nextDouble();

                                carro1.preco = novo_preco;

                                ListaCarros.get(0).setAtributo(modelo_novo, novo_ano, nova_cor, novo_KM, novo_preco);

                            }

                            menu.Menu();

                            System.out.println("");

                        }
                        case 2: {
                            String modelo_novo = null;
                            int novo_ano = 0;
                            String nova_cor = null;
                            int novo_KM = 0;
                            double novo_preco = 0;

                            System.out.println("\nEscolha uma informação para editar");
                            System.out.println("1. Modelo");
                            System.out.println("2. Ano");
                            System.out.println("3. Cor");
                            System.out.println("4. KM");
                            System.out.println("5. Preço");
                            CarsControler = escanor.nextInt();

                            if (CarsControler == 1) {

                                System.out.println("modelo:");
                                modelo_novo = escanor.next();

                                carro2.modelo = modelo_novo;

                                ListaCarros.get(1).setAtributo(modelo_novo, novo_ano, nova_cor, novo_KM, novo_preco);

                            }

                            if (CarsControler == 2) {

                                System.out.println("Ano:");
                                novo_ano = escanor.nextInt();

                                carro2.ano = novo_ano;

                                ListaCarros.get(1).setAtributo(modelo_novo, novo_ano, nova_cor, novo_KM, novo_preco);
                            }

                            if (CarsControler == 3) {
                                System.out.println("Cor do veiculo");
                                nova_cor = escanor.next();

                                carro2.cor = nova_cor;

                                ListaCarros.get(1).setAtributo(modelo_novo, novo_ano, nova_cor, novo_KM, novo_preco);

                            }

                            if (CarsControler == 4) {
                                System.out.println("Kilometragem do veiculo");
                                novo_KM = escanor.nextInt();

                                carro2.KM = novo_KM;

                                ListaCarros.get(1).setAtributo(modelo_novo, novo_ano, nova_cor, novo_KM, novo_preco);

                            }

                            if (CarsControler == 5) {
                                System.out.println("Preço do veiculo");
                                novo_preco = escanor.nextDouble();

                                carro2.preco = novo_preco;

                                ListaCarros.get(1).setAtributo(modelo_novo, novo_ano, nova_cor, novo_KM, novo_preco);

                            }
                            System.out.println("Carro editado !!!");
                            menu.Menu();

                        }
                        case 3: {
                            String modelo_novo = null;
                            int novo_ano = 0;
                            String nova_cor = null;
                            int novo_KM = 0;
                            double novo_preco = 0;

                            System.out.println("\nEscolha uma informação para editar");
                            System.out.println("1. Modelo");
                            System.out.println("2. Ano");
                            System.out.println("3. Cor");
                            System.out.println("4. KM");
                            System.out.println("5. Preço");
                            CarsControler = escanor.nextInt();

                            if (CarsControler == 1) {

                                System.out.println("modelo:");
                                modelo_novo = escanor.next();

                                carro3.modelo = modelo_novo;

                                ListaCarros.get(2).setAtributo(modelo_novo, novo_ano, nova_cor, novo_KM, novo_preco);

                            }

                            if (CarsControler == 2) {

                                System.out.println("Ano:");
                                novo_ano = escanor.nextInt();

                                carro3.ano = novo_ano;

                                ListaCarros.get(2).setAtributo(modelo_novo, novo_ano, nova_cor, novo_KM, novo_preco);
                            }

                            if (CarsControler == 3) {
                                System.out.println("Cor do veiculo");
                                nova_cor = escanor.next();

                                carro3.cor = nova_cor;

                                ListaCarros.get(2).setAtributo(modelo_novo, novo_ano, nova_cor, novo_KM, novo_preco);

                            }

                            if (CarsControler == 4) {
                                System.out.println("Kilometragem do veiculo");
                                novo_KM = escanor.nextInt();

                                carro3.KM = novo_KM;

                                ListaCarros.get(2).setAtributo(modelo_novo, novo_ano, nova_cor, novo_KM, novo_preco);

                            }

                            if (CarsControler == 5) {
                                System.out.println("Preço do veiculo");
                                novo_preco = escanor.nextDouble();

                                carro3.preco = novo_preco;

                                ListaCarros.get(2).setAtributo(modelo_novo, novo_ano, nova_cor, novo_KM, novo_preco);

                            }

                            System.out.println("Carro editado !!!");
                            menu.Menu();

                        }

                        default: {
                            System.out.println("Escolha uma opção valida");
                            break;
                        }
                    }

                }
                if (CarsControler == 2) {
                    System.out.println("\nExcluir Veiculos");
                    System.out.println("");
                    System.out.println("\nEscolha o veiculo a ser deletado");
                    System.out.println("Carro 1");
                    System.out.println("Carro 2");
                    System.out.println("Carro 3");

                    int Controler = escanor.nextInt();
                    switch (Controler) {
                        case 1: {
                            ListaCarros.remove(0);

                            break;

                        }
                        case 2: {
                            ListaCarros.remove(1);
                            break;
                        }
                        case 3:
                        {
                            ListaCarros.remove(2);
                        }
                    }
                    menu.Menu();

                }

                break;
            }
            default: {
                System.out.println("Escolha uma opção valida");
            }

        }
    }

}