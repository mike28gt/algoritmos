Funcion resultado <- Suma(operandoUno, operandoDos)
	
	Definir resultado Como Real
	
	resultado <- operandoUno + operandoDos
	
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
	Definir numeroUno, numeroDos Como Real
	
	Leer operacion
	Leer numeroUno
	Leer numeroDos
	
	Segun operacion Hacer
		1: Suma(numeroUno, numeroDos)
		2: Resta
		3: resultado <- operandoUno * operandoDos
		4: resultado <- operandoUno / operandoDos
	FinSegun
	
FinAlgoritmo