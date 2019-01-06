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
		sh 'sudo docker build -t hshah108/sportskart-service:1.0.0 .'
	}
	stage( 'Push Docker Image') {
	    withCredentials([string(credentialsId: 'DockerHubPwd', variable: 'DockerHubPwd')]) {
			sh "sudo docker login -u hardikshah78 -p navkar68"
		}
	    
		sh 'sudo docker push hshah108/sportskart-service:1.0.0'
	}
	stage(' Run container') {
		sh 'sudo docker run -p 8080:8080 -d --name sportskart-service hshah108/sportskart-service:1.0.0'
	}
}