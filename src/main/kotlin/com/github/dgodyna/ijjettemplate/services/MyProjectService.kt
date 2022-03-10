package com.github.dgodyna.ijjettemplate.services

import com.intellij.openapi.project.Project
import com.github.dgodyna.ijjettemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
