package logica.componentes.graficador.casosuso

import com.intellij.openapi.module.ModuleManager
import com.intellij.openapi.project.Project
import com.intellij.openapi.roots.ModuleRootManager
import logica.modelos.graficador.Nodo

interface IGenerarNodoCasoUso {
    fun invoke(project : Project) : Nodo
}

class GenerarNodoCasoUso : IGenerarNodoCasoUso{

    //region metodos publicos
    override fun invoke(project: Project): Nodo {
        //imprimirModulo(project = project)
        imprimirDetalleModuloPrincipal(project = project)
        return Nodo()
    }
    //endregion

    //region metodos privados
    private fun imprimirModulo(project: Project) {
        println("Nombre: "+project.name)
        val modulosProj = ModuleManager.getInstance(project)
        modulosProj
            .modules
            .forEach {
                modulo ->
                println("modulo: "+modulo.name)
            }
    }

    private fun imprimirDetalleModuloPrincipal(project : Project) {
        ModuleRootManager
            .getInstance(ModuleManager.getInstance(project).modules[0])
            .sourceRoots
            .last()
            .children
            .last()
            .children
            .last()
            .children
            .last()
            .children
            .forEach {
                virtualFile ->
                println("documento: "+virtualFile.name)
            }
    }
    //endregion
}