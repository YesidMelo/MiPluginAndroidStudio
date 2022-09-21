package logica.componentes.organizador.casosUso.organizarCodigo

import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.editor.Document
import com.intellij.openapi.project.Project
import logica.componentes.organizador.casosUso.organizarCodigo.helpers.HelperOrganizarCodigo
import logica.componentes.organizador.casosUso.organizarCodigo.helpers.HelperTraerDocumentoActual

interface IOrganizarCodigoCasoUso {
    fun Invoke(e : AnActionEvent)
}

class OrganizarCodigoCasoUso : IOrganizarCodigoCasoUso{

    //region variables
    private val helperTraerDocumentoActual : HelperTraerDocumentoActual = HelperTraerDocumentoActual()
    private val helperOrganizarCodigo : HelperOrganizarCodigo = HelperOrganizarCodigo()
    //endregion

    override fun Invoke(e: AnActionEvent) {
        organizarCodigo(
            documentoActual = traerDocumentActual(e = e),
            proyectoActual = e.project
        )
    }

    //region metodos privados

    private fun traerDocumentActual(e: AnActionEvent) = helperTraerDocumentoActual
        .cargarEvento(e = e)
        .buscarDocumentoSeleccionadoActualmente()
        .traerDocumentoActual()

    private fun organizarCodigo(
        documentoActual: Document?,
        proyectoActual : Project?
    ) =
        helperOrganizarCodigo
            .ingresarDocumentoActual(documentoActual = documentoActual)
            .ingresarProjectoActual(project = proyectoActual)
            .aplicarConvenciones()

    //endregion
}