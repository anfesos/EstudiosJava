package SentenciasControl;

public class SentenciaControlIF_Else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ejemplo If
        int x = 15;

        if (x < 20) {
            System.out.print("X menos que 20\n");
        }
        
        
        //Manejo IF-ELSE
        int mes = 3; // Mes del ano
        String estacion;
        
        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Invierno";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "Primavera";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Verano";
        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "Otono";
        } else {
            estacion = "Mes incorrecto";
        }
        System.out.println("La estacion para el mes " + mes + " es: " + estacion);
	}

}
