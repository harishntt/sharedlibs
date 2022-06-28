@Library("mylib")_

pipeline{
    agent any
    stages{
        stage('Test'){
            steps{
                script{
                    welcome.greet("Harish")
                }
            }
        }
    }
    
}
