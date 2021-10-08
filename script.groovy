def buildApp(){
	echo " Building... from groovy"
}

def testApp(){
	echo "Tesing...groovy"
}

def deployApp(){
	echo "Deploying...groovy"
	echo "First name is : ${env.f_name}"
}

return this