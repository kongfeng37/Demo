package com.kong

import org.gradle.api.Plugin
import org.gradle.api.Project

class MyPlugin implements Plugin<Project> {
    void apply(Project project) {
        //添加User属性
        def user = project.extensions.create('User', User)
        println('this is Myplugin')
        //定义showUser任务(通过gradlew showUser可运行)
        project.tasks.create('showUser') {
            doLast{
                println 'user name:' + user.name
                println 'user pwd:' + user.pass
            }
        }

        //配置完成后自动运行
        project.afterEvaluate {
            println 'afterEvaluate:'
            println 'user name:' + user.name
            println 'user pwd:' + user.pass
        }
    }
}