def call(String id){
  echo 'This is Dockerhub login stage'
  withCredentials([usernamePassword(credentialsId: ${id}, usernameVariable: ${USERNAME}, passwordVariable: ${PASSWORD})]) {
  sh 'docker login -u ${USERNAME} -p ${PASSWORD}'
  }
  echo 'Login to Dockerhub'
}
