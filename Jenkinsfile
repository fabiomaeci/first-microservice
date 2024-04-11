pipeline
{
    agent {label 'Master'}
    tools {
        jdk 'JAVA17'
        maven 'Maven3'
    }
    stages {
        stage("Cleanup Workspace") {
            steps{
                cleanWs()
            }
        }
        stage("Checkout from SCM"){
            steps {
                git branch: 'master', credentialsId: 'github', url: 'https://github.com/fabiomaeci/first-microservice'
            }
        }
        stage("Build Application") {
            steps {
                sh "mvn clean package"
            }
        }
        stage("Test Application") {
            steps {
                sh "nvn test"
            }
        }
    }

}