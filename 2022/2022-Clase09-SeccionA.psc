//Tercera versión de pseudocódigo

Algoritmo conversion_de_notas
	Definir N Como Real
	Definir U Como Caracter
	
	Leer N
	
	Si N <= 100 y N >= 90 Entonces
		U <- "A"
	SiNo Si N <= 89 y N >= 80 Entonces
			U <- "B"
		SiNo Si N <= 79 y N >= 70 Entonces
				U <- "C"
			SiNo Si N <= 69 y N >= 60 Entonces
					U <- "D"
				SiNo Si N < 60 Entonces
						U <- "F"
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
	
	Escribir U
	
FinAlgoritmo

//Segunda versión de pseudocódigo
//
//Algoritmo conversion_de_notas
//	Definir N Como Real
//	Definir U Como Caracter
//	
//	Leer N
//	
//	Si N <= 100 y N >= 90 Entonces
//		U <- "A"
//	SiNo
//		Si N <= 89 y N >= 80 Entonces
//			U <- "B"
//		SiNo	
//			Si N <= 79 y N >= 70 Entonces
//				U <- "C"
//			SiNo
//				Si N <= 69 y N >= 60 Entonces
//					U <- "D"
//				SiNo
//					Si N < 60 Entonces
//						U <- "F"
//					FinSi
//				FinSi
//			FinSi
//		FinSi
//	FinSi
//	
//	
//	Escribir U
//	
//FinAlgoritmo


//Primera versión de pseudocódigo
//
//Algoritmo conversion_de_notas
//	Definir N Como Real
//	Definir U Como Caracter
//	
//	Leer N
//	
//	Si N <= 100 y N >= 90 Entonces
//		U <- "A"
//	FinSi
//	
//	Si N <= 89 y N >= 80 Entonces
//		U <- "B"
//	FinSi
//	
//	Si N <= 79 y N >= 70 Entonces
//		U <- "C"
//	FinSi
//	
//	Si N <= 69 y N >= 60 Entonces
//		U <- "D"
//	FinSi
//	
//	Si N < 60 Entonces
//		U <- "F"
//	FinSi
//	
//	Escribir U
//	
//FinAlgoritmo
