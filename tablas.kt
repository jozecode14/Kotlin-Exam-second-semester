fun main (){
    do {
        print("Ingresa la tabla que quieres generar: ")
        val tabla = readLine()!!.toInt()
        if (tabla > 0) {
            do{
                println("¿Cuantos multiplos deceas generar?")
                val multiplos = readLine()!!.toInt()
                if (multiplos > 0){
                    do{
                        println("¿Hasta que tabla deceas generar?")
                        val tablas = readLine()!!.toInt()
                        if (tablas > tabla){
                            obtenerTabla(tabla, tablas, multiplos)
                        }
                        else{
                            println("Debes de ingresar un numero mayor al de la tabla inicial.")
                        }
                    }while (tablas <= tabla)
                }
                else{
                    println("Ingresa los multiplos mayor a 0")
                }
            }while (multiplos < 1)
        } else {
            println("La tabla de inicio debe ser mayor a 0")
        }
    }while (tabla < 1)

}

fun obtenerTabla (tabla: Int, tablas: Int, multiplos:Int) {
    var inicio = tabla
    println("--------------------------")
    for (i in inicio.. tablas){
        for (x in 1.. multiplos){
            println("$inicio X $x = ${x * inicio}")

        }
        println("")
        inicio += 1
    }
    println("--------------------------")
    println("Programa exitosamente finalizado..")
}