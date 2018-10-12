node{
	stage('Build') {
		echo 'Building project'
		steps {
			withMaven(maven : 'Maven 3.3.9'){
			sh 'mvn clean compile'
		}
	}
	stage('Test') {
		echo 'Running test cases'
	}
	stage('Deploy') {
		echo 'Deploying the application'
		steps {
			withMaven(maven : 'Maven 3.3.9'){
			sh 'mvn deploy'
		}
	}
	
	
}