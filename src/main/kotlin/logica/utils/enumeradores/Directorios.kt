package logica.utils.enumeradores

enum class Directorios(private val ruta: String) {
    //region nivel 1
    FUENTE_DATOS("/fuenteDatos"),
    LOGICA("/logica"),
    UI("/ui"),
    //endregion

    //region nivel 2

    //region fuenteDatos
    APIS(FUENTE_DATOS.ruta+"/apis"),
    BASE_DATOS(FUENTE_DATOS.ruta+"/baseDatos"),
    CACHE(FUENTE_DATOS.ruta+"/cache"),
    SHARED_PREFERENCES(FUENTE_DATOS.ruta+"/sharedPreferences"),
    //endregion

    //region logica
    COMPONENTES_LOGICA(LOGICA.ruta+"/componentes"),
    MODELOS_LOGICA(LOGICA.ruta+"/modelos"),
    EXCEPCIONES_LOGICA(LOGICA.ruta+"/excepciones"),
    //endregion

    //region ui
    BASE_UI(UI.ruta+"/base"),
    COMPONENTES_UI(UI.ruta+"/componentes"),
    DIALOGOS_UI(UI.ruta+"/dialogos"),
    NAVEGACION_UI(UI.ruta+"/navegacion"),
    //endregion
    //endregion

    //region nivel 3

    //region apis
    API_DTOS(APIS.ruta+"/dtos"),
    API_SERVICIOS(APIS.ruta+"/servicios"),
    //endregion

    //region bases datos
    BD_CONVERTERS(BASE_DATOS.ruta+"/Converters"),
    BD_ENTIDADES(BASE_DATOS.ruta+"/Entidades"),
    //endregion

    //endregion
    ;

    fun traerRuta() = ruta
}