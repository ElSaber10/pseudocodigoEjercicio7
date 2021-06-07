Algoritmo sin_titulo
	Definir  contador, pares, impares, ceros Como Entero
	Mientras contador < 15 Hacer
		aleato <- azar(36)+1;
		si (aleato mod 2) == 0 Entonces
			pares <- pares +1;
		FinSi
		si (aleato mod 2) <> 0
			impares <- impares + 1;	
		FinSi
		si aleato == 0 Entonces
			ceros <-  ceros + 1;
		FinSi
		contador <- contador +1;
	FinMientras
	Escribir "El porcentaje de los numeros pares es: " pares*(100/15) "%" 
	Escribir "El porcentaje de los impares pares es: " impares*(100/15) "%" 
	Escribir "El porcentaje de los ceros pares es: " ceros*(100/15) "%" 
FinAlgoritmo
