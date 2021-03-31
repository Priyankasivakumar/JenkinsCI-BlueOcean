pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'mvn -Dmaven.test.skip=true clean install'
        echo 'Building Pipeline ...'
      }
    }

    stage('Code Analysis') {
      steps {
        script {
          withSonarQubeEnv('SonarQube') {
            sh "mvn sonar:sonar -Dsonar.projectKey=demo"
          }
        }

      }
    }

    stage('Quality Check') {
      steps {
        script {
          def qualitygate = waitForQualityGate()
          if (qualitygate.status != "OK") {
            error "Pipeline aborted due to quality gate coverage failure: ${qualitygate.status}"
          }
        }

      }
    }

  }
  tools {
    maven 'maven 3.6.3'
  }
}