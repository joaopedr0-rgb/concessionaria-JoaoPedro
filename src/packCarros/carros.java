
package packCarros;

//Classe criada para carros
public class carros {

    public String modelo;
    public int ano;
    public String placa;
    public String cor;
    public int KM;
    public double preco;

    public carros(String modelo, int ano, String cor, int KM, double preco) {
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
    
}