package model;

public class algoritmosJava {

	public algoritmosJava() {
		// TODO Auto-generated constructor stub
	}

	public void contagem(String nEntradas, String vt) {
		String n = nEntradas;
		String[] verif = vt.replaceAll("\\[", "").replaceAll("]", "").split(",");

		int cont = 0;

		if (isInteger(n)) {
			cont++;
			for (int i = 0; i < verif.length; i++) {

				cont = (isInteger(verif[i]))? cont + 1 : cont;

			}

		} else {
			
		}

	}

	public static boolean isInteger(String str) {
		return str != null && str.matches("[0-9]*");
	}

	public double[] ConvertStringToIntArray(String vt) {

		String testString = vt;

		String[] separatedStrings = testString.replaceAll("\\[", "").replaceAll("]", "").split(",");

		double[] doubleArray = new double[separatedStrings.length];

		for (int i = 0; i < separatedStrings.length; i++) {

			doubleArray[i] = Double.parseDouble(separatedStrings[i]);

		}

		return doubleArray;

	}

}
