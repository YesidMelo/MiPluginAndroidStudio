package logica.modelos.graficador

class Nodo {
    var Nombre: String? = null
    var NodosOrigen : MutableList<Nodo> = emptyList<Nodo>().toMutableList()
    var NodosDestino : MutableList<Nodo> = emptyList<Nodo>().toMutableList()
}