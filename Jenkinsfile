#!/usr/bin/env groovy
@Library('jenkins-pipeline@master') _
node { 
    /*
    stage('Git Checkout') { 
        gitCheckout(
            branch: "master",
            url: "https://github.com/neerajkori/jenkins-pipeline.git"
        )
    }
    */ 
    } 
    */
    stage('Build') { 
        create_user.hellomessage()
    }
    stage('RUNSSH') { 
        sshCommand(pwd)
    }
}
println "Hello-Neeraj"
