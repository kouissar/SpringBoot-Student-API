pipeline {
	agent any
	tools {
		maven 'test'
		jdk 'JDK11'
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
			