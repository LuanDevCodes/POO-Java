public class Cachorro extends AnimalBase //Extends se refere a herança de uma classe
{   
    public Cachorro(String nome, int idade){
        super(nome, idade);
    }
    
    public void emitirSom(){
        System.out.println("---------------------------");
        System.out.println("Cachorro: Au Au");
    }
    
    public void mover(){
        System.out.println("Ação: O cachorro correu");
    }
}
