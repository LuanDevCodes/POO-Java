public class Gato extends AnimalBase //Extends se refere a herança de uma classe
{
    public Gato(String nome, int idade){
        super(nome, idade);
    }
    
    public void emitirSom(){
        System.out.println("---------------------------");
        System.out.println("Gato: Miauuuu");
    }
    
    public void mover(){
        System.out.println("Ação: O gato pulou na árvore");
    }
}
