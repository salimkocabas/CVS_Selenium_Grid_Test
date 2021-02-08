pipeline {
    agent { label 'master'}
    stages {
        stage('clean') {
            steps {
               sh mvn clean
              
            }
        }
         stage('run smoke test') {
            steps {
              sh mvn test -Dsuite=smoke.xml
            }
        }
         stage('run regrression test') {
            steps {
               sh mvn test -Dsuite=regression.xml
            }
        }
    }
}