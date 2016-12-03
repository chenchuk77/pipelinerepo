#!groovy

// Jenkinsfile url:
// https://github.com/chenchuk77/pipelinerepo.git
//

node {
    stage ('Build') {
        println '********** CHEN ***********'
        echo '********** CHEN ***********'
        //echo "${BUILD_NUMBER}"
        echo "entering stage 1 ... of build: ${BUILD_NUMBER}"
        def workspace = pwd()
        echo workspace
        // load "utils.groovy"
        // load "utils.groovy"
        // load "${workspace}@script/esb_deploybar_pipeline/deploy_esb.groovy"
        sh """
            pwd
            ls -lstr
            echo '333333333333'
            cat < hello.txt
            # cat Jenkinsfile
            echo "${BUILD_NUMBER}th build ..." >> build.num
        """
    }
    stage('Test') {
        echo "entering stage 2 ... build: ${env.BUILD_NUMBER}"
    }
    stage('Deploy') {
        /* .. snip .. */
    }
}