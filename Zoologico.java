import java.util.ArrayList;
import java.util.List;

public class Zoologico
{
    public void mostrarAnimais(List <AnimalBase> lista){
        for(AnimalBase a:lista){
            a.emitirSom();
            a.mover();
            a.exibirInformacoes();
        }
    }
}
