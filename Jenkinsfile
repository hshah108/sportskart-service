node{
	stage('Checkout project from GIT') {
		echo 'Checking out project from GIT...'
		git url: 'https://github.com/hshah108/sportskart-service.git'
	}
	stage('compile') {
		echo 'Compile the project..'
		def mvnHome = tool 'Maven 3.3.9'
		sh 'mvn clean package'
	}
	stage('Test') {
		echo 'Running test cases'
	}
	stage('Deploy') {
		echo 'Deploying the application'
		sh 'mvn install'
	}
}