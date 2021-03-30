pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'mvn -Dmaven.test.skip=true clean install'
        echo 'Building Pipeline ..'
      }
    }

  }
}