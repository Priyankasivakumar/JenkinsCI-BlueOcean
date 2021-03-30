pipeline {
  agent any
  stages {
    stage('Build') {
      agent any
      steps {
        tool(name: 'maven 3.6.3', type: 'maven')
        sh 'mvn -Dmaven.test.skip=true clean install'
        echo 'Building Pipeline ...'
      }
    }

  }
}