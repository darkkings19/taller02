import java.util.ArrayList;
import java.util.List;

public class Primerapersona {
    private List<Amigo> amigos;
    public Primerapersona(){
        this.amigos = new ArrayList<Amigo>();
    }
    public void añadirAmigos(){
        this.amigos.add(new Amigo("Jose","estimda",20));
        this.amigos.add(new Amigo());
        this.amigos.add(new Amigo());
        this.amigos.add(new Amigo());
        this.amigos.add(new Amigo());
    }


    public void probarSistema(){
        Primerapersona primerapersona= new Primerapersona();
        primerapersona.añadirAmigos();
        primerapersona.mostrarAmigo(automotora.buscarAutoNombre("Celerio"));
        primerapersona.eliminarAmigo("Celerio",2018);
    }

}
