def gv
pipeline {

    agent any

    environment{
        f_name='karthik'
    }
    parameters{
        choice(name:'name',choices:['10-20','20-30','30-40'])
    }

    stages{
        stage("init"){
            steps{
                script{
                    gv= load "script.groovy"
                }
             
            }

        }

        stage ("Build"){
            when{
                expression{
                    params.name=='20-30'
                }
            }
            steps{
                script{
                    gv.buildApp()
                }
            }

        }

        stage ("test"){
            steps{
                script{
                    gv.testApp()
                }
            }

        }
        stage ("Deploy"){
            steps{
                script{
                    gv.deployApp()
                }
            }

        }
    }
   

}
