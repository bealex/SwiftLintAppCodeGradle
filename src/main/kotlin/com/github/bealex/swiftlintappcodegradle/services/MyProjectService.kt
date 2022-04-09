package com.github.bealex.swiftlintappcodegradle.services

import com.intellij.openapi.project.Project
import com.github.bealex.swiftlintappcodegradle.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
