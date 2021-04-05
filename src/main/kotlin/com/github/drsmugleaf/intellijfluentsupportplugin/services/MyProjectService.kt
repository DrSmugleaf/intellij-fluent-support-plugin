package com.github.drsmugleaf.intellijfluentsupportplugin.services

import com.github.drsmugleaf.intellijfluentsupportplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
