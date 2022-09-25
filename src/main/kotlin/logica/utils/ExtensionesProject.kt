package logica.utils

import com.intellij.openapi.module.ModuleManager
import com.intellij.openapi.project.Project
import com.intellij.openapi.roots.ModuleRootManager
import com.intellij.openapi.vfs.VirtualFile

/**
 * Este metodo traer el virtual file que contiene la ruta de la carpeta src del projecto android
 */
fun Project.traerRutaSrcProjecto(): VirtualFile {
    return ModuleRootManager
        .getInstance(ModuleManager.getInstance(this).modules[0])
        .contentRoots[0]
        .children[0]
        .children[0]//src
        .children[0]//main
        .children[1]//java
        .children[0]//com
        .children[0]//company
        .children[0]//nameproject

}