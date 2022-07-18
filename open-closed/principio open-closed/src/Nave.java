public class Nave extends Auto {

    private int cantUsosTurboDisponibles;

    public Nave(){
        this.combustible = 20;
        this.patente = "AAA-20";
        this.velocidad = 150; /* KM/H */
        this.cantUsosTurboDisponibles = 5;
    }

    public void recargarCantidadUsosTurbo() {
        this.cantUsosTurboDisponibles = 5;
    }

    @Override
    public void recargarCombustible() {
        this.combustible += ( 20 + cantUsosTurboDisponibles );
    }

    @Override
    public String mostrar() {
        return (
                "Soy una nave con la siguiente informacion: \n"
                + "\tCantidad de Combustible: " + this.combustible + " Galones" +
                "\n\tPatente: " + this.patente +
                "\n\tVelocidad: " + this.velocidad + "Km/h" +
                "\n\tcantidad de usos de turbo disponibles: " + this.cantUsosTurboDisponibles
        );
    }

}
