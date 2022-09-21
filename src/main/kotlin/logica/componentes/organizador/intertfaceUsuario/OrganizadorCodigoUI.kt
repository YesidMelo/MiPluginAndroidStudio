package logica.componentes.organizador.intertfaceUsuario

import com.intellij.openapi.actionSystem.AnActionEvent
import logica.componentes.organizador.casosUso.organizarCodigo.IOrganizarCodigoCasoUso
import logica.componentes.organizador.casosUso.organizarCodigo.OrganizarCodigoCasoUso

class OrganizadorCodigoUI {

    //region variables
    //region casos uso
    private val organizadorCodigoCasoUso: IOrganizarCodigoCasoUso = OrganizarCodigoCasoUso()
    //endregion
    //endregion

    //region metodos publicos
    fun OrganizarCodigoKotlin(e: AnActionEvent) = organizadorCodigoCasoUso.Invoke(e= e)
    //endregion

    //region metodos privados
    //endregion
}