package ui.pruebas.acciones

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import logica.componentes.graficador.interfaceUsuairo.Graficador

class AccionRevision : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        if(e.project == null) return
        println("proyecto: "+ e.project?.name)
        println("ubicacion en pc: "+ e.project?.basePath)
        val graficador = Graficador(project = e.project!!)
        graficador.traerNodo()

    }

}