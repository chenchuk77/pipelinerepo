#!/usr/bin/groovy

// Jenkinsfile url:
// https://github.com/chenchuk77/pipelinerepo.git


node { // <1>
    stage('Build') { // <2>
        echo "entering stage 1 ..."
    }
    stage('Test') {
        echo "entering stage 2 ... build: ${env.BUILD_NUMBER}"
    }
    stage('Deploy') {
        /* .. snip .. */
    }
}