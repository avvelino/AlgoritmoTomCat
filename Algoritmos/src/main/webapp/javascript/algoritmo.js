/**
 * @author Avelino
 */
 
function numberPrimo() {
	let sign = prompt("Qual numero vc quer saber sé e primo")
	var num = parseInt(sign)

	function primeNumber(num) {
		for (var divisor = 2; divisor < num; divisor++)
			if (num % divisor == 0) return false;
		return true;
	}

	if (primeNumber(sign)) {
		confirm("Numero Primo!!!")
	} else {
		confirm("Numero não Primo!!!")
	}
}

function somatorio() {
	let sing = prompt("Quantas Sequencias quer somar ?")
	let sq = parseInt(sing)
	let num;
	let soma = 0

	for (var i = 0; i < sq; i++) {
		num = prompt("Digite o " + (i + 1) + "º numero!")
		num = parseInt(num)
		soma = soma + num
	}

	confirm("Sua soma total deu: " + soma)
}

function fibo() {
	let num = prompt("Qual fibo vc quer saber?")
	num = parseInt(num)
	function GenerateFibonacci(number) {
		var fibonacci = [];
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		for (var i = 2; i < number; i++) {
			fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
		}
		return fibonacci;
	}

	if (num > 1) {
		var fi = GenerateFibonacci(num)
		confirm("Sua fibo: " + fi)
	} else if (num < 1) confirm("Numero deve ser maior do que 1!!!")

}

function mdc() {
	let prim = prompt("Informe o primeiro valor")
	let sec = prompt("Informe o segundo valor")
	prim = parseInt(prim)
	sec = parseInt(sec)
	var resto

	do {
		resto = prim % sec
		prim = sec
		sec = resto
	} while (resto != 0)

	confirm("Mdc: " + prim)
}

function qs() {
	var items = [5, 3, 7, 6, 2, 9];
	function swap(items, leftIndex, rightIndex) {
		var temp = items[leftIndex];
		items[leftIndex] = items[rightIndex];
		items[rightIndex] = temp;
	}
	function partition(items, left, right) {
		var pivot = items[Math.floor((right + left) / 2)],   //middle element
			i = left,                                    //left pointer
			j = right;                                   //right pointer
		while (i <= j) {
			while (items[i] < pivot) {
				i++;
			}
			while (items[j] > pivot) {
				j--;
			}
			if (i <= j) {
				swap(items, i, j); //sawpping two elements
				i++;
				j--;
			}
		}
		return i;
	}

	function quickSort(items, left, right) {
		var index;
		if (items.length > 1) {
			index = partition(items, left, right);  //index returned from partition
			if (left < index - 1) { //more elements on the left side of the pivot
				quickSort(items, left, index - 1);
			}
			if (index < right) { //more elements on the right side of the pivot
				quickSort(items, index, right);
			}
		}
		return items;
	}
	function getRandom(length) {
		let array = []
		for (let i = 0; i < length; i++) {
			array.push(Math.floor(Math.random() * (99 - 1 + 1)) + 1);
		}

		return array
	}

	let lg = prompt("Qual tamanho do array para ordenar (Array gerado com numeros aleatorios)")
	lg = parseInt(lg)
	var vetor = getRandom(lg)
	confirm("Vetor gerado aleatorio: " + vetor)
	var sortedArray = quickSort(vetor, 0, items.length - 1);
	confirm("Vetor ordenado QuickSort: " + sortedArray)
}