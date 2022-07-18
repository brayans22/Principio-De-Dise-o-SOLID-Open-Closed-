import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VehiculoTest {

    @Test
    public void test01SeMuestraUnaMotoCorrectamente(){
        Moto m = new Moto();

        assertEquals( "Soy una moto con la siguiente informacion: \n"
                + "\tCantidad de Combustible: 35 Galones" +
                "\n\tPatente: ABC-111" +
                "\n\tVelocidad: 85Km/h" +
                "\n\tcantidad de ruedas en uso: 2" +
                "\n\tcantidad de ruedas de repuesto: 2", m.mostrar()
        );
    }

    @Test
    public void test02SePinchanVariasRuedaCorrectamenteYAunHayRepuestosEnLaMoto() {
        Moto m = new Moto();
        boolean noHayRuedasRepuesto = true;
        m.romperRueda();
        try {
            m.romperRueda();
        } catch (ErrorSinRepuestoDeRuedasMoto e) {
            noHayRuedasRepuesto = false;
        }
        assertTrue(noHayRuedasRepuesto);
    }

    @Test
    public void test03SePinchanVariasRuedasALaMotoYLaMismaSeQuedaConUnaRuedaEnUsoYSinRepuestos(){
        Moto m = new Moto();
        m.romperRueda();
        m.romperRueda();
        m.romperRueda();
        assertThrows(ErrorSinRepuestoDeRuedasMoto.class, () -> { m.romperRueda(); } );
    }

    @Test
    public void test04SeCreaUnaNaveCorrectamente(){
        Nave n = new Nave();
        assertEquals( "Soy una nave con la siguiente informacion: \n"
                + "\tCantidad de Combustible: 20 Galones" +
                "\n\tPatente: AAA-20" +
                "\n\tVelocidad: 150Km/h" +
                "\n\tcantidad de usos de turbo disponibles: 5", n.mostrar()
        );
    }

    @Test
    public void test05SeRecargaElCombustibleDeUnaNaveCorrectamente(){
        Nave n = new Nave();
        n.recargarCombustible();
        assertEquals( "Soy una nave con la siguiente informacion: \n"
                + "\tCantidad de Combustible: 45 Galones" +
                "\n\tPatente: AAA-20" +
                "\n\tVelocidad: 150Km/h" +
                "\n\tcantidad de usos de turbo disponibles: 5", n.mostrar()
        );
    }

    @Test
    public void test06SeRecargaElCombustibleDeUnaNaveCorrectamente(){
        Moto m = new Moto();
        m.recargarCombustible();
        assertEquals( "Soy una moto con la siguiente informacion: \n"
                + "\tCantidad de Combustible: 57 Galones" +
                "\n\tPatente: ABC-111" +
                "\n\tVelocidad: 85Km/h" +
                "\n\tcantidad de ruedas en uso: 2" +
                "\n\tcantidad de ruedas de repuesto: 2", m.mostrar()
        );
    }

}
