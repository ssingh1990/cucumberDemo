#!groovy
node {
    stage('Git checkout') { // for display purposes
        git 'https://github.com/gkron/seleniumCucumber.git'
    }
    stage('Smoke') {
        try {
            sh "mvn clean verify -Dtags='regression'"
        } catch (err) {

        } finally {
            publishHTML (target: [
                    reportDir: 'target/site/selenoumcucumber',
                    reportFiles: 'index.html',
                    reportName: "Smoke tests report"
            ])
        }
    }

    stage('Results') {
        junit '**/target/failsafe-reports/*.xml'
    }
}