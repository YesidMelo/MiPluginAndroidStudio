package logica.componentes.organizador.casosUso.organizarCodigo.helpers

import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.editor.Document
import com.intellij.openapi.fileEditor.FileEditorManager
import logica.excepciones.organizarCodigo.SinEventoException
import logica.excepciones.organizarCodigo.SinProyectoException

class HelperTraerDocumentoActual {

    //region variables
    private var currentEvent : AnActionEvent? = null
    private var documentoActual : Document? = null
    //endregion

    //region metodos publicos
    fun cargarEvento(e: AnActionEvent) : HelperTraerDocumentoActual{
        currentEvent = e
        return this
    }

    fun buscarDocumentoSeleccionadoActualmente() : HelperTraerDocumentoActual {
        if(currentEvent == null) throw SinEventoException()
        if(currentEvent?.project == null) throw SinProyectoException()
        documentoActual = FileEditorManager
            .getInstance(currentEvent!!.project!!)
            .selectedTextEditor?.document
        return this

    }

    fun traerDocumentoActual() : Document? = documentoActual
    //endregion
}