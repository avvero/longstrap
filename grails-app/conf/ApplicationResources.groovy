modules = {
    application {
        resource url:'js/application.js'
    }
    bootstrap {
        dependsOn 'bootstrap'
        dependsOn 'bootstrap-tab'
    }
}