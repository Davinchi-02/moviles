fun main() {
    var monthsoftheyear = arrayOf("enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre")
    for ((posicion, mes) in monthsoftheyear.withIndex()){
        println("la posición $posicion contiene el mes de $mes ")
    }
    
}
