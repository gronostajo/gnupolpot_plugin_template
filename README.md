# gnupolpot plugin template

This template can be used to start developing [gnupolpot](https://github.com/gronostajo/gnupolpot) plugin in a blink of an eye.

Prerequisites:

- [IntelliJ IDEA](https://www.jetbrains.com/idea/) (may also work with other IDEs that support Gradle)


## Getting started

1. Clone this repository:

        git clone https://github.com/gronostajo/gnupolpot_plugin_template

2. Choose *Import* on IntelliJ's welcome screen *or* click *File > New > Project from Existing Sources*.

3. In the *Import Project* window select *Import project from external model*, then *Gradle* and click *Next*.

4. Check *Use auto-import* and make sure *Use default gradle wrapper (recommended)* is selected, click *Finish*.

5. Wait a moment until Gradle finishes bootstrapping your project.

6. Make sure all projects are selected and click *OK*.

7. Go to [gnupolpot releases](https://github.com/gronostajo/gnupolpot/releases) and download two JARs for the release you wish to use: `gnupolpot.jar` and `api.jar`.

8. Place downloaded JARs in the `libs` directory.

... and you're good to go!


## Implementing plugin goodness

You'd probably like to make your plugin do something useful, right? The first *Hello world* feature is already implemented in this template. Build your plugin and test it:

1. Open Gradle pane in IntelliJ, then expand *gnupolpot_plugin_template > build* and double-click *build*. Two JAR files should be created in the `jars` folder.

2. Double-click `gnupolpot_bundle.jar` and gnupolpot should start with example plugin loaded.

3. Click the plugin features button and then *Say hello*. It should work!

Alternatively, you can double-click *gnupolpot_template_plugin > application > run* to run it without building.

Open `src` folder in the `plugin` module. There's an example package, plugin and a feature in there. Editing them is the easiest way to get started.
