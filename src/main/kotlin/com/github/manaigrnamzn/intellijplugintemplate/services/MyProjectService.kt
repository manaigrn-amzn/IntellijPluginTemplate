package com.github.manaigrnamzn.intellijplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.manaigrnamzn.intellijplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
