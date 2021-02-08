pipeline {
    agent { docker { image 'jenkins/jenkins:lts ' } }
    stages {
        stage('clean') {
            steps {
                'mvn clean'
              
            }
        }
         stage('run smoke test') {
            steps {
               sh 'mvn test -Dsuite=smoke.xml'
            }
        }
         stage('run regrression test') {
            steps {
                'mvn test -Dsuite=regression.xml'
            }
        }
    }
}