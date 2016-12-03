#!groovy

// Jenkinsfile url: https://github.com/chenchuk77/pipelinerepo.git



node {
    // global for all stages
    def workspace = pwd()
    def utils = load "${workspace}@script/repo/utils.groovy"

    stage ('Build') {
        echo "entering stage 1"
        utils.buildCode()
    }
    stage('Test') {
        echo "entering stage 2 ... build: ${env.BUILD_NUMBER}"
        utils.runTests(5)
    }
    stage('Deploy') {
        echo "entering stage 3 ... deploy by shell block"
        sh """
            pwd
            echo "deploying build: ${BUILD_NUMBER}"
        """
    }
}