pipeline {
  agent {
    docker 'maven:3.3.3'
  }
  stages {
    stage('build') {
      steps {
        sh '''mvn --version'''
        sh '''mvn clean package'''
        sh '''mvn package'''
      }
    }

  }
}
