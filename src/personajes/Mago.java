package personajes;
import interfaces.iMagico;

public class Mago extends Personaje implements iMagico {
    public Mago(String nombre, int salud, int armadura, int ataque) {
        super(nombre, salud, armadura, ataque);
    }

    @Override
    public void atacar() {
        Personaje enemigo = obtenerEnemigo();
        ataqueBasico(enemigo);

    }

    @Override
    public Personaje obtenerEnemigo() {
        return null;
    }

    @Override
    public void bolaDeFuego(Personaje Enemigo) {

    }
}
