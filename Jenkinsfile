
}pipeline {
    agent any

    stages {
        stage('Build and Test') {
            steps {
                echo 'Building and testing the project...'
                sh 'mvn clean install'
            }
        }
        stage('Publish Test Results') {
            steps {
                echo 'Publishing JUnit test results...'
                junit '**/target/surefire-reports/*.xml'
            }
        }
    }
}