import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Auto> autos = new ArrayList<>();
        autos.add( new Moto() );
        autos.add( new Nave() );

        System.out.println("°°°°°°°°°°°°°°°°° INFORMACION VEHICULOS °°°°°°°°°°°°°°°°°\n");

        for( Auto a : autos ){
            System.out.println( a.mostrar() );
            System.out.println("----------------------------");
        }

        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");

    }

}