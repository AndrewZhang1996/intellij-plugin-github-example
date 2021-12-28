package com.github.andrewzhang1996.intellijplugingithubexample.services

import com.intellij.openapi.project.Project
import com.github.andrewzhang1996.intellijplugingithubexample.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
