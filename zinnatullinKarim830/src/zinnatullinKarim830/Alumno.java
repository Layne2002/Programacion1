package zinnatullinKarim830;

public class Alumno {
	private String grupo, nombre;
	private int mat, leng, fis, quim, ing;

	public Alumno(String grupo, String nombre, int mat, int leng, int fis, int quim, int ing) {
		this.grupo = grupo;
		this.nombre = nombre;
		this.mat = mat;
		this.leng = leng;
		this.fis = fis;
		this.quim = quim;
		this.ing = ing;
	}

	public String toString() {
		return grupo + ";" + nombre + ";" + mat + ";" + leng + ";" + fis + ";" + quim + ";" + ing + "\n";
	}
}
