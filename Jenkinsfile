node{
	stage('Checkout project from GIT') {
		echo 'Checking out project from GIT...'
		git url: 'https://github.com/hshah108/sportskart-service.git'
	}
	stage('compile') {
		echo 'Compile the project..'
		def mvnHome = tool 'Maven 3.3.9'
		def mvnCMD = "${mvnHome}/bin/mvn"
		sh "${mvnCMD} clean package"
	}
	stage( 'Build Docker Image') {
		sh 'docker build -t hshah108/sportskart-service:1.0.0 .'
	}
	stage('Test') {
		echo 'Running test cases'
	}
	stage('Deploy') {
		echo 'Deploying the application'
		sh 'mvn install'
	}
	stage('Run an application') {
		echo 'Running an application..'
		sh 'java -jar sportskart-service-0.0.1-SNAPSHOT.jar'
	}
}