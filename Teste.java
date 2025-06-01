import java.util.ArrayList;
import java.util.List;

public class Teste
{
    public static void main(String[] args){
    
        Cachorro Primeiro = new Cachorro("Rex", 10);
        Gato Segundo = new Gato("Mina", 2);
        Passaro Terceiro = new Passaro("Zeca", 5);
        
        List<AnimalBase> lista = new ArrayList<AnimalBase>();
        lista.add(Primeiro);
        lista.add(Segundo);
        lista.add(Terceiro);
        
        Zoologico z = new Zoologico();
        
        z.mostrarAnimais(lista);
    }
}
