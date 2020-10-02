// ord.demo.buildUtils

package org.demo

class buildUtils implements Serializable {
   def steps
   buildUtils(steps) { this.steps = steps}
   def timedGradleBuild(tasks) {
      def gradleHome = 'gradle3.2'
      echo ${gradleHome}/bin/gradle ${steps} ${tasks}
   }
}
