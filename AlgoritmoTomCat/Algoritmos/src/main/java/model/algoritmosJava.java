package model;

import java.util.Arrays;
import java.util.regex.Pattern;

public class algoritmosJava {

	public algoritmosJava() {
		// TODO Auto-generated constructor stub
	}

	public String nPrimo(String n) {

		int numero = Integer.parseInt(n);
		if (ehPrimo(numero)) {
			System.out.println("True");
			return ("Numero " + numero + " e Primo");
		} else {
			System.out.println("False");
			return ("Numero " + numero + " não e Primo");

		}

	}

	public String somatorio(String n) {
		String string1 = n;
		String[] stringArray = string1.split(",");
		int soma = 0;

		for (int i = 0; i < stringArray.length; i++) {
			int aux = Integer.parseInt(stringArray[i]);
			soma = soma + aux;
		}
		return Integer.toString(soma);
	}

	public static String fibonacci(String n) {
		String string1 = n;
		int f = Integer.parseInt(string1);
		long fi[] = new long[f];
		for (int i = 0; i < f; i++) {
			fi[i] = fibo(i);
		}
		return Arrays.toString(fi);

	}

	public static long fibo(int n) {
		return (n < 2) ? n : fibo(n - 1) + fibo(n - 2);
	}

	private static boolean ehPrimo(int numero) {
		for (int j = 2; j < numero; j++) {
			if (numero % j == 0)
				return false;
		}
		return true;
	}

	public static String calculaMDC(String valor1, String valor2) {

		int v1 = Integer.parseInt(valor1);
		int v2 = Integer.parseInt(valor2);
		int resto;
		while (v2 != 0) {
			resto = v1 % v2;
			v1 = v2;
			v2 = resto;

		}
		return Integer.toString(v1);
	}

	public static String quickShort(String n) {
		String string1 = n;
		String[] stringArray = string1.split(",");
		int[] intArray = new int[stringArray.length];
		for (int i = 0; i < stringArray.length; i++) {

			try {
				intArray[i] = Integer.parseInt(stringArray[i]);
			} catch (Exception e) {
				System.out.println("Unable to parse string to int: " + e.getMessage());
			}
		}

		sort(intArray, 0, intArray.length - 1);
		return Arrays.toString(intArray);
	}

	public static String contagem(String n, String t) {
		String string1 = n;
		String string2 = t;
		String[] stringArray = string2.split(",");
		int cont= 0;
		if (isInteger(string1)) {
			cont++;
			for (int i = 0; i < stringArray.length; i++) {
				if(isInteger(stringArray[i])) {
					cont++;
				}
				
			}
		}

		return Integer.toString(cont);
	}

	public static int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = (low - 1);
		for (int j = low; j < high; j++) {

			if (arr[j] <= pivot) {
				i++;

				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	public static void sort(int arr[], int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);

			sort(arr, low, pi - 1);
			sort(arr, pi + 1, high);
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
