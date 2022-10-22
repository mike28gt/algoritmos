Funcion Suma
	
	Definir operandoUno, operandoDos, resultado Como Real
	
	Leer operandoUno
	Leer operandoDos
	
	resultado <- operandoUno + operandoDos
	
	Escribir resultado
FinFuncion


Funcion Resta
	
	Definir operandoUno, operandoDos, resultado Como Real
	
	Leer operandoUno
	Leer operandoDos
	
	resultado <- operandoUno - operandoDos
	
	Escribir resultado
FinFuncion


Algoritmo calculadora
	
	Definir operacion Como Entero
	
	Leer operacion
	
	Segun operacion Hacer
		1: Suma
		2: Resta
		3: resultado <- operandoUno * operandoDos
		4: resultado <- operandoUno / operandoDos
	FinSegun
	
FinAlgoritmo