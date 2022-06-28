@Library("mylib@feature1")_

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
