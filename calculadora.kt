fun main(){
    do{
        print("MENU\n1.-Suma\n2.-Resta\n3.-Multiplicación\n4.-División\n5.-Cuadrado\n6.-Exponente\n0.-Salir\n")
        println("")
        print("Ingresa una opción: ")
        val opcion = readLine()!!.toInt()
        when (opcion) {
             1 -> {
                 println("SUMA")
                 println("Ingresa el primer numero:")
                print("->")
                val num1 = readLine()!!.toFloat()
                println("Ingresa el segundo numero:")
                print("->")
                val num2 = readLine()!!.toFloat()

                 suma(num1,num2)
            }
            2 -> {
                println("RESTA")
                println("Ingresa el primer numero:")
                print("->")
                val num1 = readLine()!!.toFloat()
                println("Ingresa el segundo numero:")
                print("->")
                val num2 = readLine()!!.toFloat()

                resta(num1,num2)
            }
            3 -> {
                println("MULTIPLICACIÓN")
                println("Ingresa el primer numero:")
                print("->")
                val num1 = readLine()!!.toFloat()
                println("Ingresa el segundo numero:")
                print("->")
                val num2 = readLine()!!.toFloat()

                multiplicacion(num1,num2)
            }
            4 -> {
                println("DIVISIÓN")
                println("Ingresa el primer numero:")
                print("->")
                val num1 = readLine()!!.toFloat()
                println("Ingresa el segundo numero:")
                print("->")
                val num2 = readLine()!!.toFloat()

                division(num1,num2)
            }
            5 -> {
                println("CUADRADO")
                println("Ingresa el numero:")
                print("->")
                val num1 = readLine()!!.toFloat()
                cuadrado(num1)
            }
            6 -> {
                println("EXPONENTE")
                println("Ingresa el primer numero:")
                print("->")
                val num1 = readLine()!!.toFloat()
                println("Ingresa el segundo numero:")
                print("->")
                val num2 = readLine()!!.toFloat()

                exponente(num1,num2)
            }
            0 -> {
                println("La salida del programa ah sido exitosa..\n")
            }
            else -> {
                println("Ingresa una opcion valida..\n")
            }
        }
    }while (opcion >= 1 || opcion < 0)
}

fun suma (num1:Float, num2:Float){
    println("La suma de los numeros es: ${num1 + num2}")
}
fun resta (num1:Float, num2:Float){
    println("La resta de los numeros es: ${num1 - num2}")
}
fun multiplicacion (num1:Float, num2:Float){
    println("La multiplicación de los numeros es: ${num1 * num2}")
}
fun division (num1:Float, num2:Float){
    println("La división de los numeros es: ${num1 / num2}")
}
fun cuadrado (num1:Float){
    println("El cuadrado del numeros es: \n${num1 * num1} ")
}fun exponente (num1:Float, num2:Float){
    val potencia = Math.pow(num1.toDouble(), num2.toDouble())
    println("La potencia de $num1 ^ $num2 =$potencia")
}