package Ejercicio2.Entidades;

public class RevolverDeAgua {

    private Integer posActual;
    private Integer posAgua;

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(Integer posActual, Integer posAgua) {
        this.posActual = posActual;
        this.posAgua = posAgua;
    }

    public Integer getPosActual() {
        return posActual;
    }

    public void setPosActual(Integer posActual) {
        this.posActual = posActual;
    }

    public Integer getPosAgua() {
        return posAgua;
    }

    public void setPosAgua(Integer posAgua) {
        this.posAgua = posAgua;
    }

    @Override
    public String toString() {
        return "RevolverDeAgua{" + "posActual=" + posActual + ", posAgua=" + posAgua + '}';
    }
    
}
