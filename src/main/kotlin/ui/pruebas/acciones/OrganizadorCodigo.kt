package ui.pruebas.acciones

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

import logica.componentes.organizador.intertfaceUsuario.OrganizadorCodigoUI

class OrganizadorCodigo : AnAction() {
    //region variables
    private val organizador : OrganizadorCodigoUI = OrganizadorCodigoUI()
    //endregion

    override fun actionPerformed(e: AnActionEvent) = organizador.OrganizarCodigoKotlin(e = e)
}