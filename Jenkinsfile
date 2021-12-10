pipeline {
	agent any
	tools {
		maven 'test'
		jdk 'JDK'
		}
	stages {
		stage ('Build') {
			steps {
				echo 'Building ..'
				sh 'mvn clean compile'
				}
		}
		stage ('Test') {
			steps {
				echo 'Testing ..'
				sh 'mvn test'
				}
		}
		
	}
}
			