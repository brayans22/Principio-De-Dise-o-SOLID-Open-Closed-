public class Moto extends Auto {
    private int cantRuedasDeRepuestoDisponibles;
    private int cantRuedasEnUsos;

    public Moto(){
        this.combustible = 35;
        this.patente = "ABC-111";
        this.velocidad = 85; /* KM/H */
        this.cantRuedasDeRepuestoDisponibles = 2;
        this.cantRuedasEnUsos = 2;
    }

    public void cambiarRuedas(){
        if( this.cantRuedasEnUsos <= 0 && hayCambioDeRuedas() ){
            this.cantRuedasDeRepuestoDisponibles--;
            this.cantRuedasEnUsos++;
        }
    }
    private boolean hayCambioDeRuedas() {
        return ( this.cantRuedasDeRepuestoDisponibles - 1 >= 0 );
    }

    public void romperRueda() {
        if( (!hayCambioDeRuedas() && this.cantRuedasEnUsos - 1 <= 0) ){
            throw new ErrorSinRepuestoDeRuedasMoto();
        }
        this.cantRuedasEnUsos--;
        this.cambiarRuedas();
    }

    @Override
    public void recargarCombustible() {
        this.combustible += ( 20 + cantRuedasDeRepuestoDisponibles );
    }

    @Override
    public String mostrar() {
        return (
                "Soy una moto con la siguiente informacion: \n"
                + "\tCantidad de Combustible: " + this.combustible + " Galones" +
                "\n\tPatente: " + this.patente +
                "\n\tVelocidad: " + this.velocidad + "Km/h" +
                "\n\tcantidad de ruedas en uso: " + this.cantRuedasEnUsos +
                "\n\tcantidad de ruedas de repuesto: " + this.cantRuedasDeRepuestoDisponibles
        );
    }
}
