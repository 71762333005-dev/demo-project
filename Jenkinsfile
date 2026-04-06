pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('demo-project') {
                    sh 'mvn sonar:sonar'
                }
            }
        }

        stage('Quality Gate') {
            steps {
                script {
                    // Wait for SonarQube analysis result
                    def qg = waitForQualityGate()

                    // Fail pipeline if Quality Gate fails
                    if (qg.status != 'OK') {
                        error "Pipeline failed due to Quality Gate: ${qg.status}"
                    }
                }
            }
        }
    }
}
