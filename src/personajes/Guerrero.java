package personajes;
import interfaces.iFisico;
public class Guerrero extends Personaje implements iFisico{
    public Guerrero(String nombre, int salud, int armadura, int ataque) {
        super(nombre, salud, armadura, ataque);
    }

    @Override
    public void embestir() {

    }

    @Override
    public void atacar() {

    }

    @Override
    public Personaje obtenerEnemigo() {
        return null;
    }
}
