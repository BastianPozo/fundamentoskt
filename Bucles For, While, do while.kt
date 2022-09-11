fun main(){
    for(num in 1..3) {
    println("numero: $num")
}
    
// Esto es lo que mostrara por pantalla
 
/* Resultado:
numero: 1
numero: 2
numero: 3

*/
// For seria como un contador se le da la partida y un final y lo que este en el medio lo autocompletara
// Como en el ejemplo de arriba ^
// 
// For(num in X..Y){
// println("$num")
// }
//
//
//         ("$num") es llamar a la funcion por asi decirlo
//
//
//
//
//.

var dia= 1
println("Empiza la semana")
while(dia < 6) {
    if  (dia == 1) {
        println("$dia dia trabajando")
    } else {
        println("$dia dias por trabajar")
    }

    dia++ // Actualizamos la condicion
}
println("A descansar")

/* Resultado:
Empiza la semana
1 dia trabajando
2 dias por trabajando
3 dias por trabajando
4 dias por trabajando
5 dias por trabajando
A descansar
*/

// while (Mientras) es una condicion de bucle para usar en agendas entre otras cosas
// While (Condicion)
// 		if(condicion por verdadero)
// 		
// 		else(Condicion por falso)
// 		
// 		mientras no se cumpla la condicion de while no pasara al if dependiendo la condicion por ejemplo
// 		si la condicion es (1==2) la condicion no se cumple y no pasara a el if pero si la condicion es
// 		(1==1) pasara al if pero esto solo es hasta que se cumpla la condicion en cambio la condicion "do while"
// 		es hasta que se cumpla si o si la condicion si no se repetira en un blucle infinito ejemplo:
// 		
var numero:Int
do {
    println("Introduce un numero entre 1 y 100")
    numero = readLine()!!.toInt()
} while(numero !in 1..100) // numero < 1 || numero > 100
println("Gracias")

/* Resultado:
Introduce un numero entre 1 y 100
423
Introduce un numero entre 1 y 100
-71
Introduce un numero entre 1 y 100
7
Gracias
*/
}















//