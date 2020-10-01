// demo.buildUtils

package demo

class buildUtils implements Serializable {
   def steps
   buildUtils(steps) { this.steps = steps}
   def timedGradleBuild(tasks) {
      def gradleHome = 'gradle3.2'
      sh "echo ${gradleHome}/bin/gradle ${tasks}"
   }
}
