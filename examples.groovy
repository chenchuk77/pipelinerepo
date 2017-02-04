#!groovy


// use "" for interpolation
//
echo 'Hello Mr. ${username}' // Hello Mr. ${username}
echo "I said, Hello Mr. ${username}" // I said, Hello Mr. Jenkins

// using jenkins script console (UI -> manage jenkins)
// echo not working ???
// print, println, printf works
//
def username = 'Jenkins'
print 'Hello Mr. ${username}'
print "I said, Hello Mr. ${username}"
sh "echo ' ${username.toUpperCase()} '"

// inject environment var to build, outside the node.
// can be accessed with or without prefix.
//
env.MYTOOL_VERSION = '1.33'
env.VER = 5
node {
   println "this is ver ${env.VER} of my app"
   sh 'echo ${VER}'
   sh '/usr/local/mytool-$MYTOOL_VERSION/bin/startqq'
   println "running ${env.JOB_NAME}, build #${env.BUILD_ID}" // injected by jenkins
} 

// parametrized build can accept user params. those can be evaluated during a build:
// assumig boolean:RUN_TESTS
//
if ("${RUN_TESTS}" == true){
  println "Running tests..."
} else {
  println "Bypassing tests..."
}

// archive artifacts ( jenkins core ) 
//
stage('Results') {
       sh 'tar cvf 1.tar *.txt'
       sh 'ls -lstr'
       sleep 2
       archiveArtifacts artifacts: '**/*.tar', fingerprint: true
   }

// popup dialog during build
//
def userInput = input(
    id: 'userInput', 
    message: 'Insert environment description', 
    parameters: [
        [ $class: 'TextParameterDefinition', 
          defaultValue: 'Jenkins - environment to test rating service.', 
          description: 'Environment', 
          name: 'env'
        ]
])
stage('xxx') { // for display purposes
       echo ("From user input during build : " + userInput)
   }

// check if file exists in workspace and pass result to shell
//
def exists = fileExists('1.txt')
sh " echo 'file exists eval to: ${exists}' "


