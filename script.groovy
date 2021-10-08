def buildApp(){
	echo " Building... from groovy"
}

def testApp(){
	echo "Tesing...groovy"
}

def deployApp(){
	echo "Deploying...groovy"
	echo "First name is : ${param.f_name}"
}

return this