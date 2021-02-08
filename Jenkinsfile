pipeline {
  

    stages {
        stage('Clean') {
            steps {
               sh 'mvn clean'
              
            }
        }
         stage('Smoke Test') {
            steps {
              sh 'mvn test -Dsuite=smoke.xml'
            }
        }
         stage('Regress  Test') {
            steps {
               sh 'mvn test -Dsuite=regression.xml'
            }
        }
    }
}