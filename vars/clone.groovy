def call(String url, String branch){
  echo 'This is clone stage'
  sh "git clone -b ${branch} ${url} ${branch}"
  // git url: "${url}", branch: "${branch}"
  echo 'Cloned successfully'
}
