#!/usr/bin/groovy

// Jenkinsfile url:
// https://github.com/chenchuk77/pipelinerepo.git


node {
    stage 'Build' {
        println '********** CHEN ***********'
        echo ${BUILD_NUMBER}
        echo "entering stage 1 ..."
        def workspace = pwd()
        load "utils.groovy"
        // load "${workspace}@script/esb_deploybar_pipeline/deploy_esb.groovy"
        sh """
            echo $pwd
            ls -lstr
            echo '--------------------------------'
        """
    }
    stage('Test') {
        echo "entering stage 2 ... build: ${env.BUILD_NUMBER}"
    }
    stage('Deploy') {
        /* .. snip .. */
    }
}