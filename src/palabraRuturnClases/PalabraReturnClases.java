package palabraRuturnClases;

public class PalabraReturnClases {

	public static void main(String[] args) {
		Suma s = creaObjetoSuma();
		int resultado = s.a + s.b;
		System.out.println("Resultado: " + resultado);

	}
	
	public static Suma creaObjetoSuma() {
		Suma s = new Suma(4,4);
		return s;
	}

}

class Suma{
	int a;
	int b;
	
	Suma (int a, int b){
		this.a = a;
		this.b = b;
	}
}
