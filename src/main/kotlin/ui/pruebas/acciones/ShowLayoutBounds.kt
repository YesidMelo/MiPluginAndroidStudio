package ui.pruebas.acciones

import com.intellij.notification.NotificationDisplayType
import com.intellij.notification.NotificationGroup
import com.intellij.notification.NotificationType
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.Project

class ShowLayoutBounds : AnAction() {
    override fun actionPerformed(event : AnActionEvent) {
        event.project?.showNotification("hola mundo")
    }

    private fun Project.showNotification(message : String) {
        NotificationGroup("someId", NotificationDisplayType.BALLOON)
            .createNotification(
                "title",
                message,
                NotificationType.WARNING,
                null
            ).notify(this)
    }
}