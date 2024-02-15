pipeline {
    agent any

    tools {
        maven "maven-3.9.6"
    }

    stages {
        stage('Source') {
            steps {    
              checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'b1cf5d5e-fb9c-4505-a48d-028ef165406e', url: 'https://github.com/ramanujds/vrzn-app-repo']])
            }
        }
            
            stage('Build') {
            steps {
                sh "mvn -Dmaven.test.failure.ignore=true clean package"
            }
            }

            stage('Build Docker Image') {
            steps {
                sh "docker build -t ram1uj/vrxn-spring-boot-app ."
            }
            }

    }
            
            post {
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                    echo 'Build Success'
                }
            }
        }
    

