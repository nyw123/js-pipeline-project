def buildApp() {
	echo 'building the applications...'
}

def testApp() {
	echo 'testing the applications...'
}

def deployApp() {
    echo '123'
	echo 'deploying the applicaiton...'
	echo "deploying version ${params.VERSION}"
}

return this