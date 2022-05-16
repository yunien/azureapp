pipeline {
    agent { label 'master' }

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('linux') {
            agent { label 'linux' }
            options { skipDefaultCheckout() }
            steps {
                echo 'linux'
                sh 'hostnamectl'
            }
        }
    }
    
}
