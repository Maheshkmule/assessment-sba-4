pipeline{
    agent any 
 
    stages{
        stage('Build Maven'){
            steps{
               checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Maheshkmule/docker-automation.git']]])
//                 bat 'mvn clean install'
            }
        }
        stage('Build docker image and run'){
            steps{
                script{
                    bat 'docker-compose up --build -d'
                }
            }
        }
    }
}
