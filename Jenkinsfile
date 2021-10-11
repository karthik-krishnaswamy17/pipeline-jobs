pipeline{
    agent any

tools{
    maven 'Maven'
    jdk 'Java'
}
    stages{
        stage('Build jar'){
        steps{
            echo "Building Jar...."
            sh 'mvn package'

        }

        }

       stage('Build Image'){
            steps{
                script{
                echo "Building Image"
                withCredentials([usernamePassword(credentialsId:'docker-hub-account',usernameVariable:'user',passwordVariable:'pass')]){
                sh 'docker build -t karthik0517/java-maven-app:${BUILD_NUMBER} .'
                sh "echo $pass |docker login --username $user --password-stdin"
                sh 'docker push karthik0517/java-maven-app:${BUILD_NUMBER}'
                }
                }
                
            }
        }
    }

}