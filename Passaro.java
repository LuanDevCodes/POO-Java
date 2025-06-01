public class Passaro extends AnimalBase //Extends se refere a herança de uma classe
{
    public Passaro(String nome, int idade){
        super(nome, idade);
    }
    
    public void emitirSom(){
        System.out.println("---------------------------");
        System.out.println("Passaro: Bem-te-vi 🎵");
    }
    
    public void mover(){
        System.out.println("Ação: O pássaro saiu voando");
    }
}
