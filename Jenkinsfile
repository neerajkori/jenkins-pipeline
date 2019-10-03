#!/usr/bin/env groovy
@Library('jenkins-pipeline@master') _
node { 
    /*
    stage('Git Checkout') { 
        gitCheckout(
            branch: "master",
            url: "https://github.com/neerajkori/jenkins-pipeline.git"
        )
<<<<<<< HEAD
    }
    */ 
=======
    } 
    */
>>>>>>> f33296ce180ca8038da85781c9f1fc1775ae171d
    stage('Build') { 
        create_user.hellomessage()
    }
    stage('RUNSSH') { 
        sshCommand(pwd)
    }
}
println "Hello-Neeraj"
