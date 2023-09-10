Algoritmo precio_traje
	Leer precio_inicial_traje
	Si precio_inicial_traje > 2500 Entonces
		descuento <- precio_inicial_traje * 0.15
		precio_con_descuento <- precio_inicial_traje - descuento
	FinSi
	Si precio_inicial_traje = 1000 Entonces
		descuento <- precio_inicial_traje * 0.10
		precio_con_descuento <- precio_inicial_traje 
	SiNo
		descuento <- precio_inicial_traje * 0.05
		precio_con_descuento <- precio_inicial_traje - descuento
	FinSi
	Escribir descuento
	Escribir precio_con_descuento
FinAlgoritmo


