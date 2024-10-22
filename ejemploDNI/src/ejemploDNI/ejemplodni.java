package ejemploDNI;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejemplodni {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Dime tu DNI:");
		String DNI = input.nextLine();
		if (formatoDNI(DNI) == true) {
			System.out.println("esta bien");
		} else {
			System.out.println("Esta mal");
		}
		System.out.println("Dime tu fecha de nacimiento (formato xx/xx/xxxx):");
		String fechaNaci = input.nextLine();

		if (formatoFecha(fechaNaci) == true)
			System.out.println("Esta bien");
		else
			System.out.println("Esta mal");

	}

	public static boolean formatoDNI(String DNI) {

		Pattern p = Pattern.compile("[0-9]{8}[a-zA-Z]");
		Matcher m = p.matcher(DNI);
		if (m.matches())
			return true;
		else
			return false;

	}

	public static boolean formatoFecha(String fecha) {
		Pattern p = Pattern.compile("[0-9]{2}/[0-9]{2}/[0-9]{4}");
		Matcher m = p.matcher(fecha);
		if (m.matches())
			return true;
		else
			return false;

	}

}
