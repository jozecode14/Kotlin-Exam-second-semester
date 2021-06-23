fun main(){
    do{
        print("Ingresa un mes: ")
        val mes = readLine()!!.toInt()
        if (mes in 1..12){
            calcularMes(mes)
        }
        else{
            println("Error. Ingresa un mes valido..")
        }
    }while (mes > 12 || mes < 1)

    println("Programa exitosamente finalizado..")
}


fun calcularMes (mes: Int){
    println("----------------------------")
    when (mes){
        1 -> println("Ingresaste el mes de Enero.\nLos meses que faltan para terminar el año son: ${12 - 1}")
        2 -> println("Ingresaste el mes de Febrero.\nLos meses que faltan para terminar el año son: ${12 - 2}")
        3 -> println("Ingresaste el mes de Marzo.\nLos meses que faltan para terminar el año son: ${12 - 3}")
        4 -> println("Ingersaste el mes de Abril.\nLos meses que faltan para terminar el año son: ${12 - 4}")
        5 -> println("Ingresaste el mes de Mayo.\nLos meses que faltan para terminar el año son: ${12 - 5}")
        6 -> println("Ingresaste el mes de Junio.\nLos meses que faltan para terminar el año son: ${12 - 6}")
        7 -> println("Ingresaste el mes de Julio.\nLos meses que faltan para terminar el año son: ${12 - 7}")
        8 -> println("Ingresaste el mes de Agosto.\nLos meses que faltan para terminar el año son: ${12 - 8}")
        9 -> println("Ingresaste el mes de Septiembre.\nLos meses que faltan para terminar el año son: ${12 - 9}")
        10 -> println("Ingresaste el mes de Octubre.\nLos meses que faltan para terminar el año son: ${12 - 10}")
        11 -> println("Ingresaste el mes de Noviembre.\nLos meses que faltan para terminar el año son: ${12 - 11}")
        12 -> println("Ingresaste el mes de Diciembre.\nNo faltan meses para terminar el año.")
    }
    println("----------------------------")
}