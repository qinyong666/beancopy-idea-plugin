package com.github.qinyong666.beancopyideaplugin.services

import com.intellij.openapi.project.Project
import com.github.qinyong666.beancopyideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
