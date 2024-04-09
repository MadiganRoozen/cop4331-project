package edu.ucf.cop4331project.common.gradle


/**
 * Precompiled [jvm-conventions.gradle.kts][edu.ucf.cop4331project.common.gradle.Jvm_conventions_gradle] script plugin.
 *
 * @see edu.ucf.cop4331project.common.gradle.Jvm_conventions_gradle
 */
public
class JvmConventionsPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("edu.ucf.cop4331project.common.gradle.Jvm_conventions_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
