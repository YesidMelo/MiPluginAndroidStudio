package logica.componentes.organizador.casosUso.organizarCodigo.helpers

import com.intellij.openapi.editor.Document
import com.intellij.openapi.project.Project

class HelperOrganizarCodigo {


    //region variables
    private var documentoActual : Document? = null
    private var proyectoActual: Project? = null
    //endregion

    //region metodos publicos
    fun ingresarDocumentoActual(documentoActual : Document?): HelperOrganizarCodigo {
        this.documentoActual = documentoActual
        return this
    }

    fun ingresarProjectoActual(project: Project?) : HelperOrganizarCodigo {
        proyectoActual = project
        return this
    }

    fun aplicarConvenciones() {
        if(documentoActual == null) return
        if(proyectoActual == null) return
        println("Numero Lineas en documento: "+documentoActual?.lineCount)
        buscarLineaPackage()
        /*
        val textoClase = comprimirCodigo()
        println("codigo a organizar"+ textoClase)
        //documentoActual?.setText(textoClase)
        */

    }

    //endregion

    //region metodos privados
    private fun buscarLineaPackage() {
        for (contador in 0 .. documentoActual!!.lineCount) {

        }
    }
    private fun comprimirCodigo(): String {
        val textoClase = (documentoActual?.text?: "Sin contenido")
        return textoClase
    }
    //endregion
}