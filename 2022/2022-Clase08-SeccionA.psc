Algoritmo costo_conducir_al_trabajo_por_dia
	
	Definir total_km_conducidos_dia, costo_gasolina, total_km_litro, costo_estacionamiento_dia, costo_peaje_dia Como Real
	
	Leer total_km_conducidos_dia
	Leer costo_gasolina
	Leer total_km_litro
	Leer costo_estacionamiento_dia
	Leer costo_peaje_dia
	
	costo_gasolina_dia <- (total_km_conducidos_dia * costo_gasolina) / total_km_litro
	costo_conducir_trabajo_dia <- costo_gasolina_dia + costo_estacionamiento_dia + costo_peaje_dia
	
	Escribir costo_conducir_trabajo_dia
FinAlgoritmo