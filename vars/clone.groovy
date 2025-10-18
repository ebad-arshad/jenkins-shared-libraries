def call(String url, String branch){
  echo 'This is clone stage'
  git url: "${url}", branch: "${branch}"
  echo 'Cloned successfully'
}
