def call(){
    sh '''
    
        // sudo systemctl daemon-reload

        sudo systemctl restart sample-application

        sleep 20

        sudo systemctl status sample-application  --no-pager

        docker ps
    
    '''
}
