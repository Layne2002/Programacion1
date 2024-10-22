package B5;

import java.time.LocalDate;

public class Alumno {
	private String dni;
	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;
	public int numAlumnos;
	private boolean tieneBeca;
	private double mediaModulosApro;
	private int numModulosMatriculados;
	private int numAlumnosTodoApro;

	public static final int LIMITE_MODULOS_MATRICULA = 6;
	public static final int LIMITE_ALUMNOS = 30;

	public Alumno(String dni, String nombre, String apellidos, LocalDate fechaNacimiento, int numAlumnos,
			boolean tieneBeca, double mediaModulosApro, int numModulosMatriculados, int numAlumnosTodoApro) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.numAlumnos = numAlumnos;
		this.tieneBeca = tieneBeca;
		this.mediaModulosApro = mediaModulosApro;
		this.numModulosMatriculados = numModulosMatriculados;
		this.numAlumnosTodoApro = numAlumnosTodoApro;
	}
	public Alumno(String dni, String nombre, String apellidos) {
		this(dni, nombre, apellidos, LocalDate.now(), 20,false, 0,6,10);
	}
	public Alumno() {
		this("12345678A", "nombre", "apellidos", LocalDate.now(), 20,false, 0,6,10);
	}
}
