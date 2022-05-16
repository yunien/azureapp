pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
    }
    node('Linux') {
        stage('hostnamectl') {
            steps { 
                sh 'cat hostnamectl' 
            }
        }
    }
    
}
