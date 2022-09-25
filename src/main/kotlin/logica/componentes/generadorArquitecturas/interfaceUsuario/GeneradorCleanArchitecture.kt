package logica.componentes.generadorArquitecturas.interfaceUsuario

import com.intellij.openapi.actionSystem.AnActionEvent
import logica.componentes.generadorArquitecturas.casosUso.cleanArchitecture.CrearPaquetesCasoUso
import logica.componentes.generadorArquitecturas.casosUso.cleanArchitecture.ICrearPaquetesCasoUso

class GeneradorCleanArchitecture {

    //region variables
    //region casos usos
    private val crearPaquetesCasoUso : ICrearPaquetesCasoUso = CrearPaquetesCasoUso()
    //endregion
    //endregion

    //region metodos publicos
    fun crearCleanArchitecturo(evento : AnActionEvent) {
        crearPaquetesCasoUso.Invoke(evento = evento)
    }
    //endregion

}