package trycatch;
public class principal {
	
		static int numerador = 10;
		static Integer denominador = null;
		static float divicion;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		System.out.println("Antes de la divicion");
		try {
			divicion = numerador / denominador;
		} catch(ArithmeticException error) {
			divicion = 0;
			System.out.println("Error: " + error.getMessage());
		} catch(NullPointerException ex) {
			divicion = 0;
			System.out.println("Error: " + ex.getMessage());
			System.out.println("Segundo catch");
		} finally {
			System.out.println("Despues de la divicion");
		}
		*/
		String frutas[] = {"Mango", "Pera", "Manzana", "Uva"};
		
		// foreach en java
		for(String fruta: frutas ) {
			System.out.println(fruta);
		}
		
		System.out.println(frutas[0]);
	
	}

}
