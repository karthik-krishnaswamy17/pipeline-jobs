def gv
pipeline{
agent any

stages{

	stage("init"){
		steps{
			gv= load 'script.groovy'
		}
	}


	stage("build jar"){
		steps{
			
			script{
				
				gv.buildJar()
			}
		}
	}


	stage("build image"){
		steps{
			script{
				gv.buildImage()
			}
			
		}
	}

	stage("deploy"){
		steps{
			script{
				gv.deployApp()
			}
			
		}
	}


}

}