1.-(5 puntos) A Nicolás le gusta mucho las matemáticas y la programación, en su colegio recién
avanzaron lo que es el numero primo, quedo fascinado y se dio la difícil tarea de resolver dado
un rango a,b. Determinar cuántos números primos hay en ese rango. Nicolas pensó toda la
noche en este problema y aun así no pudo resolverlo, es por eso que tu como un gran
programador decidiste ayudar a Nicolas a resolver esta difícil tarea.
Tu programa recibirá los números a y b que corresponden a los límites del rango que debes
revisar y debes determinar cuántos números primos existen en ese rango inclusive (Debes
revisar el número y el número b también). Tu solución debe ser recursiva, implementa los
métodos necesarios para resolver el problema. La función principal deberá tener la siguiente
firma: cantPrimos(int a, int b) : int
Ej: En el rango 2 a 10 la solución es 4 ya que los números 2, 3, 5 ,7 están dentro del rango y son
primos.

2.- (3 puntos) Soto es un maestro de la calistenia. Cuando inicio no podía realizar ni una sola
flexión y desde entonces no ha parado de progresar, la cantidad de flexiones que puede realizar
incrementa cada día con la siguiente secuencia: 0,2,6,14,30,62,126…
Es decir, en el día 1 lograba 0 flexiones, en el día 2 logró 2 flexiones, en el día 3 logró 6 y así
sucesivamente.
Se te pide calcular cuantas flexiones podrá hacer Soto en el día n. Implementa los métodos
recursivos necesarios para resolver este problema. La función principal deberá tener la siguiente
firma: cantFlexiones (int dia): int

4.- En el curso de Alex hay gente de diversa estatura, como en cualquier colegio se desea formar
a su curso de la persona más bajo a la más alto, se desea automatizar la búsqueda de la persona
mas baja de cada curso, entonces te dan la tarea de realizar un programa de tal forma que, dada
la lista de estaturas en cm de todos los integrantes del curso respectivo, encuentres la estatura
menor. Implementa los métodos recursivos necesarios para resolver este problema.
a) Encontrar la estatura mas baja del conjunto de estaturas dados. La función principal deberá
tener la siguiente firma: menorEstatura (int[]): int (3 puntos)
Ej: {175, 172, 172, 168, 181, 168, 168, 182, 168} La respuesta sería 168.
b) Contar la cantidad de apariciones de la estatura más baja. La función principal deberá tener
la siguiente firma: cantMenor(int[]): int (3 puntos)
Ej: {175, 172, 172, 168, 181, 168, 168, 182, 168} La respuesta sería 4
