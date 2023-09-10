Algoritmo calcular_edad_promedio
	Leer cantidad_estudiantes
	//	Mientras conteo_estudiantes < cantidad_estudiantes Hacer
	//		Leer edad_estudiante
	//		conteo_estudiantes <- conteo_estudiantes + 1
	//		sumatoria_edades <- sumatoria_edades + edad_estudiante
	//	FinMientras
	Para conteo_estudiantes <- 0 Hasta cantidad_estudiantes
			Leer edad_estudiante
			sumatoria_edades <- sumatoria_edades + edad_estudiante
	FinPara
	edad_promedio <- sumatoria_edades / cantidad_estudiantes
	Mostrar edad_promedio
FinAlgoritmo
