pipeline {
  agent any
  stages {
    stage('Build') {
      agent any
      steps {
        tool(name: 'maven ', type: 'maven 3.6.3')
        sh 'mvn -Dmaven.test.skip=true clean install'
        echo 'Building Pipeline ...'
      }
    }

  }
}