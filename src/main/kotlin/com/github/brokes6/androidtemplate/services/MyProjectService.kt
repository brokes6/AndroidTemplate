package com.github.brokes6.androidtemplate.services

import com.intellij.openapi.project.Project
import com.github.brokes6.androidtemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
