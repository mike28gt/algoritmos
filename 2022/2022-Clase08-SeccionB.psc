Algoritmo calcular_costo_conducir_oficina_dia
	
	Definir total_km_conducidos, costo_litro_gasolina, promedio_km_litro, cuotas_estacionamiento_dia, peaje_dia Como Real
	
	Leer total_km_conducidos
	Leer costo_litro_gasolina
	Leer promedio_km_litro
	Leer cuotas_estacionamiento_dia
	Leer peaje_dia
	
	costo_gasolina_dia <- (total_km_conducidos * costo_litro_gasolina) / promedio_km_litro
	costo_conducir_oficina_dia <- costo_gasolina_dia + cuotas_estacionamiento_dia + peaje_dia
	
	Escribir costo_conducir_oficina_dia
	
FinAlgoritmo
