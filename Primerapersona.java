import java.util.ArrayList;
import java.util.List;

public class Primerapersona {
    private List<Amigo> amigos;
    public Primerapersona(){
        this.amigos = new ArrayList<Amigo>();
    }
    public void añadirAmigos(){
        this.amigos.add(new Amigo("Jose","Estimda",21));
        this.amigos.add(new Amigo("Guillermo","Estimada",21));
        this.amigos.add(new Amigo("Cristian","Esimada",21));
        this.amigos.add(new Amigo("Juan","No estimado", 22));
        this.amigos.add(new Amigo("Daniel","Estimada",28));
        this.amigos.add(new Amigo("Alberto","No estimada",25));
        this.amigos.add(new Amigo("carlangas","Estimada",21));
    }
    public void eliminarAmigo(String nombre, int edad){
        for(Amigo amigo: this.amigos){
            if(amigo.getNombre().equals(nombre) && amigo.getEdad()==edad){
                this.amigos.remove(amigo);
                break;
            }
        }
    }
    public List<Amigo> buscarAmigoNombre(String nombre){
        List<Amigo> amigos= new ArrayList<Amigo>();
        for(Amigo amigo : this.amigos){
            if(amigo.getNombre().equals(nombre)){
                amigos.add(amigo);
            }
        }
        return amigos;
    }
    public void mostrarAmigo(List<Amigo> amigos){
        for(Amigo amigo : amigos){
            String datos="nombre: "+ amigo.getNombre() +", tipoamistad: "+ amigo.getTipoamistad() +", edad: "+ amigo.getEdad();
            System.out.println(datos);
        }
    }


    public void probarSistema(){
        Primerapersona primerapersona= new Primerapersona();
        primerapersona.añadirAmigos();
        primerapersona.mostrarAmigo(primerapersona.buscarAmigoNombre("Jose"));
        primerapersona.eliminarAmigo("Alberto",25);
    }

}
