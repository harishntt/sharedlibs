@Library("mylib")_

pipeline{
    agent any
        parameters{
            gitParameter(branch: '', 
                        branchFilter: '.*', 
                        defaultValue: 'dev', 
                        description: 'Select the branch', 
                        name: 'Branch', 
                        quickFilterEnabled: false, 
                        selectedValue: 'NONE', 
                        sortMode: 'NONE', 
                        tagFilter: '*', 
                        type: 'GitParameterDefinition')
            }

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
