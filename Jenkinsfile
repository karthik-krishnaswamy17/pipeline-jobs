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


	stage(){
		steps{
			script{
				gv.buildImage()
			}
			
		}
	}

	stage(){
		steps{
			script{
				gv.deployApp()
			}
			
		}
	}


}

}