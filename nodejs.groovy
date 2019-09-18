job('NodeJS Job') {
    scm {
        git('https://github.com/NotReady/jenkinstry.git') {  node ->
            node / gitConfigName('DSL User')
            node / gitConfigEmail('ohashi@musicsecurities.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs_v12')
    }
    steps {
        shell("npm install")
        shell("npm test")
    }
}
