plugins {
    `maven-publish`
}

// Correct Kotlin DSL syntax for registering tasks
tasks.register("clean") {
    doLast { println("Cleaning...") }
}

tasks.register("assemble") {
    doLast { println("Assembling...") }
}

// This tells JitPack to look at the folders you already uploaded
publishing {
    publications {
        register<MavenPublication>("release") {
            groupId = "com.github.mayurr1512"
            artifactId = "sample-sdk"
            version = "1.0.0"

            // Ensure this path points to where your AAR is in the repo
            artifact("com/github/mayurr1512/sample-sdk/1.0.0/sample-sdk-1.0.0.aar")
        }
    }
}