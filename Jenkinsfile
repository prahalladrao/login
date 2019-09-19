pipeline
{
   agent any
   stages
   {
      stage('build')
      {
       steps
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
}