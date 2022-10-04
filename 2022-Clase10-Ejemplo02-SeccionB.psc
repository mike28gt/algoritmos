Algoritmo calcular_promedio
	
	Definir nota, acumulado_notas, promedio Como Real
	Definir cantidad_estudiantes Como Entero
	
	nota <- 1
	
	Mientras  nota > 0 Hacer
		Leer nota
		Si nota > 0 Entonces
			cantidad_estudiantes <- cantidad_estudiantes + 1
			acumulado_notas <- acumulado_notas + nota
		FinSi
	FinMientras
	promedio <- acumulado_notas / cantidad_estudiantes
	Escribir promedio
FinAlgoritmo
