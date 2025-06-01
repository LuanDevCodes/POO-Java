public abstract class AnimalBase implements Animal //Implements serve apenas para se referir as interfaces
{
    private String nome;
    private int idade;
    
    public AnimalBase(String nome, int idade){ //Constructor, ele não retorna nada
        this.nome = nome;
        this.idade= idade;
    }
    
    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("---------------------------\n\n");
    }
}
