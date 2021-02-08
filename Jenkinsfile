pipeline {
  
   agent {
        docker {
            image 'maven:3-alpine' 
            args '-v /root/.m2:/root/.m2' 
        }
        }

    stages {
    
    stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
            }
            
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