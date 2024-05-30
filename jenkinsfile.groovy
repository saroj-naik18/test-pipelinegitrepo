
pipeline {
    agent any{
        
            stage("build")
            steps {
                echo 'builiding the application'

            }
        }
                stages{
            stage("test")
            steps {
                echo 'testing the app'

            }
        }
                stages{
            stage("deploy")
            steps {
                echo'deploying the app'

            }
        }
    }
}