package logica.componentes.graficador.interfaceUsuairo

import com.intellij.openapi.project.Project
import logica.componentes.graficador.casosuso.GenerarNodoCasoUso
import logica.componentes.graficador.casosuso.IGenerarNodoCasoUso
import logica.modelos.graficador.Nodo

class Graficador constructor(val project : Project) {

    private val generarNodoCasoUso: IGenerarNodoCasoUso = GenerarNodoCasoUso()

    fun traerNodo() : Nodo = generarNodoCasoUso.invoke(project = project)
}