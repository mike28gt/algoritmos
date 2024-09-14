Algoritmo calcular_promedio
	
	Definir nota, notas_acumuladas, promedio Como Real
	Definir cantidad_estudiantes Como Entero
	
	nota <- 1
	
	Mientras nota > 0 Hacer
		Leer nota
		Si nota > 0 Entonces
			cantidad_estudiantes <- cantidad_estudiantes + 1
			notas_acumuladas <- notas_acumuladas + nota
		FinSi
	FinMientras
	promedio <- notas_acumuladas / cantidad_estudiantes
	Escribir promedio
FinAlgoritmo
