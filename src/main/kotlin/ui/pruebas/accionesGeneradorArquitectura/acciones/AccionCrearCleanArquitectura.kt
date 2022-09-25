package ui.pruebas.accionesGeneradorArquitectura.acciones

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import logica.componentes.generadorArquitecturas.interfaceUsuario.GeneradorCleanArchitecture

class AccionCrearCleanArquitectura : AnAction() {

    //region variables
    private val generadorCleanArchitecture = GeneradorCleanArchitecture()
    //endregion

    override fun actionPerformed(e: AnActionEvent) {
        generadorCleanArchitecture.crearCleanArchitecturo(evento = e)
    }
}