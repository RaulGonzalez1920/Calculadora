Algoritmo sin_titulo
	definir operador Como Caracter
	definir operando1 , operando2 Como Real 
	
	
	Repetir
		Escribir "que opcion deseas realizar"
		Escribir "A) Suma de dos números"
		Escribir "B) Resta de dos números"
		Escribir "C) Multiplicación de dos números"
		Escribir "D) División de dos números"
		Escribir "E) Módulo de dos números"
		Escribir "F) Suma de matrices"
		Escribir "G) Resta de matrices"
		Escribir "H) Salir"
		leer operador
		
		Segun operador Hacer
			"A":
				Escribir "proporciona el primer valor"
				leer operando1
				Escribir "proporciona el segundo valor"
				leer operando2
				Escribir operando1 + operando2
				Escribir ""
			"B":
				Escribir "proporciona el primer valor"
				leer operando1
				Escribir "proporciona el segundo valor"
				leer operando2
				Escribir operando1 - operando2
				Escribir ""
			"C":
				Escribir "proporciona el primer valor"
				leer operando1
				Escribir "proporciona el segundo valor"
				leer operando2
				Escribir operando1 * operando2
				Escribir ""
			"D":
				Escribir "proporciona el primer valor"
				leer operando1
				Escribir "proporciona el segundo valor"
				leer operando2
				Escribir operando1 / operando2
				Escribir ""
			"E":
				Escribir "proporciona el primer valor"
				leer operando1
				Escribir "proporciona el segundo valor"
				leer operando2
				Escribir operando1 MOD operando2
				Escribir ""
			"F":
				Escribir "Cuantas filas tendran las matrices?"
				Leer filas
				
				Escribir "Cuantas columnas tendran las matrices?"
				Leer columnas
				
				Dimension matrizA[filas,columnas]
				Dimension matrizB[filas,columnas]
				Dimension matrizC[filas,columnas]
				
				Escribir "Ingresa los valores de la primera matriz"
				
				Para i = 1 Hasta filas Hacer
					
					Para j = 1 Hasta columnas Hacer
						
						Leer matrizA[i,j]
						
					FinPara
					
				FinPara
				
				Escribir "Ingresa los valores de la segunda matriz"
				
				Para i = 1 Hasta filas Hacer
					
					Para j = 1 Hasta columnas Hacer
						
						Leer matrizB[i,j]
						
					FinPara
					
				FinPara
				
				Para i = 1 Hasta filas Hacer
					
					Para j = 1 Hasta columnas Hacer
						
						matrizC[i,j] = matrizA[i,j] + matrizB[i,j]
						
					FinPara
					
				FinPara
				
				Escribir "Resultado de la suma:"
				
				Para i = 1 Hasta filas Hacer
					
					Para j = 1 Hasta columnas Hacer
						
						Escribir Sin Saltar matrizC[i,j], " "
						
					FinPara
					
					Escribir ""
					
				FinPara
				Escribir ""
			"G":
				Escribir "Cuantas filas tendran las matrices?"
				Leer filas
				
				Escribir "Cuantas columnas tendran las matrices?"
				Leer columnas
				
				Dimension matrizA[filas,columnas]
				Dimension matrizB[filas,columnas]
				Dimension matrizC[filas,columnas]
				
				Escribir "Ingresa los valores de la primera matriz"
				
				Para i = 1 Hasta filas Hacer
					
					Para j = 1 Hasta columnas Hacer
						
						Leer matrizA[i,j]
						
					FinPara
					
				FinPara
				
				Escribir "Ingresa los valores de la segunda matriz"
				
				Para i = 1 Hasta filas Hacer
					
					Para j = 1 Hasta columnas Hacer
						
						Leer matrizB[i,j]
						
					FinPara
					
				FinPara
				
				Para i = 1 Hasta filas Hacer
					
					Para j = 1 Hasta columnas Hacer
						
						matrizC[i,j] = matrizA[i,j] - matrizB[i,j]
						
					FinPara
					
				FinPara
				
				Escribir "Resultado de la resta:"
				
				Para i = 1 Hasta filas Hacer
					
					Para j = 1 Hasta columnas Hacer
						
						Escribir Sin Saltar matrizC[i,j], " "
						
					FinPara
					
					Escribir ""
					
				FinPara
				Escribir ""
			"H":
				operador="H"
			De Otro Modo:
				Escribir "opcion no valida"
				operador="H"
				Escribir ""
		FinSegun
		
	Hasta Que operador=="H";
	
	
	
	
	
FinAlgoritmo
