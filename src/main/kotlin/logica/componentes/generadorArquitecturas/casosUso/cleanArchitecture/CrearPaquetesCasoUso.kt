package logica.componentes.generadorArquitecturas.casosUso.cleanArchitecture

import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile

import logica.excepciones.generadorArquitectura.ExcepcionProyectoNull
import logica.utils.enumeradores.Directorios
import logica.utils.traerRutaSrcProjecto
import java.nio.file.Files
import java.nio.file.Paths

interface ICrearPaquetesCasoUso {
    fun Invoke(evento : AnActionEvent)
}

class CrearPaquetesCasoUso : ICrearPaquetesCasoUso {

    override fun Invoke(evento: AnActionEvent) {
        if (evento.project == null) throw ExcepcionProyectoNull()
        val project : Project = evento.project!!
        
        Directorios.values().forEach {
            directorioActual ->
            crearDirectorio(project = project, ruta = directorioActual.traerRuta())
        }
    }

    //region metodos privados

    private fun crearDirectorio(project: Project, ruta: String) {
        val contentSRC: VirtualFile = project.traerRutaSrcProjecto()
        val path = Paths.get(contentSRC.path + ruta)
        if (Files.exists(path)) return
        Files.createDirectory(path)
    }

    //endregion
}