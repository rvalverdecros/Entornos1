
fun main() {
    println("Inserte los numeros")
    val listaNumerosTexto= readLine()!!.split(" ").map { it.toInt() }
    val cantidad=listaNumerosTexto.size
    val listaNumeros=IntArray(cantidad)
    for (i in (0 until cantidad)){
        listaNumeros[i]=listaNumerosTexto[i].toInt()
    }
    var tem=0
    for(i in (0 until cantidad-1)){
        for(j in (0 until cantidad-1)){
            if(listaNumeros[j]>listaNumeros[j+1]){
                tem=listaNumeros[j]
                listaNumeros[j]=listaNumeros[j+1]
                listaNumeros[j+1]=tem
            }
        }
    }
    println("Aqui estan ordenados de mayor a menor")
    for (i in (cantidad-1 downTo 0)){
        println(listaNumeros[i])
    }

    println("Aqui estan ordenador de menor a mayor")
    for (i in (0 until cantidad)) {
        println(listaNumeros[i])
    }
}