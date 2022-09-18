fun main() {
	val weekDays = arrayOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")
    println(weekDays.get(0))
    println(weekDays.get(1))
    println(weekDays.get(2))
    println(weekDays.get(3))
    println(weekDays.get(4))
    println(weekDays.get(5))
    println(weekDays.get(6))
    if(weekDays.size >= 8){
        println(weekDays.get(7))
    }else{
        println("no tiene más parámetros la array")
    }
        
}

// arrays son los arreglos un ejemplo de como funciona ^^