pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
                sh 'cat hostnamectl' 
            }
        }
        stage('linux') {
            agent {label 'linux'}
            steps {
                sh 'cat hostnamectl' 
            }
        }
    }
    
}
