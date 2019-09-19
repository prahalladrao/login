pipeline
{
   agent any
   stages
   {
      stage('build')
      {
         if(isUnix())
         {
           sh './gradlew clean build'
         }
         else
         {
            echo 'Build'
            bat 'gradlew.bat clean build'
          }
      }
   }
}