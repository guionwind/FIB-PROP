/**
 * Classe EstadistiquesPartida que conté les estadístiques d'una partida.
 */
package domini.classes;

public class EstadistiquesPartida {
    // Atributs
    private Integer idJugador;
    private Integer idPartida;
    private Integer puntuacio;
    private Boolean guanyada;
    
    /**
     * Constructor de la classe EstadistiquesPartida.
     *
     * @param idJugador Jugador de la partida
     * @param idPartida Partida que ha jugat el jugador i de la qual es faran les estadístiques
     * @param puntuacio Puntuacio aconseguida pel jugador a la partida
     * @param guanyada Determina si la partida ha estat guanyada o no
     */

    public EstadistiquesPartida(Integer idJugador, Integer idPartida, int puntuacio, Boolean guanyada) {
        this.idJugador = idJugador;
        this.idPartida = idPartida;
        this.puntuacio = puntuacio;
        this.guanyada = guanyada;
    }

    // Mètodes

    /**
     * Mètode per obtenir el jugador de les estadístiques.
     * @return Retorna el jugador de les estadístiques.
     */
    public Integer getIdJugador(){
        return this.idJugador;
    }

    /**
     * Mètode per obtenir la partida de les estadístiques.
     * @return Retorna la partida de les estadístiques.
     */
    public Integer getIdPartida(){
        return this.idPartida;
    }

    /**
     * Mètode per obtenir la puntuació de les estadístiques.
     * @return Retorna la puntuació de les estadístiques.
     */
    public Integer getPuntuacio(){
        return this.puntuacio;
    }

    /**
     * Mètode per modificar la puntuació de les estadístiques.
     * 
     */
    public void setPuntuacio(int puntuacio){
        this.puntuacio = puntuacio;
    }

    public Boolean getGuanyada(){
        return this.guanyada;
    }

    /**
     * Mètode per modificar si la partida ha estat guanyada.
     *
     */
    public void setGuanyada(Boolean flag){
        this.guanyada = flag;
    }
}