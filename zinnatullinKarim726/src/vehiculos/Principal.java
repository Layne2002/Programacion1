package vehiculos;

public class Principal {

	public static void main(String[] args) {
		new Coche("1234ABC", "Toyota Supra", 4, true);
		new Moto("1234ABD","Yamaha",2,"Rojo");
		new Barco("ABC","La Perla Negra",50,false);
		new Submarino("ABCD","USSR",70,1000);
		new Avion("ABCD123456","Boeing777",60,30);
		new Helicoptero("ABCE123456","Apache",8,4);
		
		new Terrestre("1234ABE","Quadbike",4);
		new Acuatico("ABCDE","Catamaran",3);
		new Aereo("ABCF123456","Ala Delta",1);
		
		System.out.println("Mostrando informacion de todos los Vehiculos: ");
		System.out.printf("%s",Vehiculo.mostrarVehiculos());

	}

}
