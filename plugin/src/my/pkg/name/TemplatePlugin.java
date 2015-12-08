package my.pkg.name;

import net.avensome.dev.gnupolpot.api.Feature;
import net.avensome.dev.gnupolpot.api.Plugin;
import net.avensome.dev.gnupolpot.api.Tool;

import java.util.Arrays;
import java.util.Collection;

public class TemplatePlugin extends Plugin {
    @Override
    public String getName() {
        return "Template Plugin";   // Change this
    }

    @Override
    public Collection<Feature> getFeatures() {
        // Implement plugin-provided features and return them here
        return Arrays.<Feature>asList(
                new HelloWorldFeature()
        );
    }

    @Override
    public Collection<Tool> getTools() {
        // Implement plugin-provided tools and return them here
        return Arrays.<Tool>asList(
                // new Tool(...)
        );
    }
}
