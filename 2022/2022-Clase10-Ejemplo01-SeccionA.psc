Algoritmo total_ventas
	
	Definir codigo_producto, cantidad_producto Como Entero
	Definir precio_producto, total_venta Como Real
	
	Leer codigo_producto
	Leer cantidad_producto
	
	Segun codigo_producto Hacer
		1:
			precio_producto <- 2.98
		2:
			precio_producto <- 4.50
		3:
			precio_producto <- 9.98
		4:
			precio_producto <- 4.49
		5:
			precio_producto <- 6.87
		De Otro Modo:
			precio_producto <- 0.00
	FinSegun
	
	total_venta <- cantidad_producto * precio_producto
	
	Escribir total_venta
FinAlgoritmo
