def call(){
    sh '''
    
        sudo systemctl restart sample-application

        sleep 20

        sudo systemctl status sample-application.service

        docker ps
    
    '''
}
