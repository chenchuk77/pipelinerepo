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
        echo "workspace is: ${workspace}"
        echo "files workspace is: ${workspace}@script"

        // load "utils.groovy"
        // load "utils.groovy"
        def utils = load "${workspace}@script/repo/utils.groovy"
        sh """
            pwd
            ls -lstr
            echo '333333333333'
            cat < hello.txt
            # cat Jenkinsfile
            echo "${BUILD_NUMBER}th build ..." >> build.num
        """
        echo "using utility from same block"
        utils.sayHello()

    }
    stage('Test') {
        echo "entering stage 2 ... build: ${env.BUILD_NUMBER}"
        echo "using utility from utils.groovy file"
        //utils.sayHello()
    }
    stage('Deploy') {
        /* .. snip .. */
    }
}