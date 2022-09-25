package logica.excepciones.generadorArquitectura

open class ExcepcionGeneradorCodigo(val mensaje: String = "Ha surguido un problema. Revisa el proyecto") : Exception(mensaje)

class ExcepcionProyectoNull(mensaje: String = "El proyecto esta en null"): ExcepcionGeneradorCodigo(mensaje = mensaje)