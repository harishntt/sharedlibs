@Library("mylib")_

pipeline{
    agent any
        properties([
        parameters([
            githubProjectProperty(displayName: 'repo', 
                                projectUrlStr: 'https://github.com/harishntt/sharedlibs.git')
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
        ])
    ])

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
