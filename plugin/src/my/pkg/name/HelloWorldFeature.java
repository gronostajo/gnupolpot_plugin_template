package my.pkg.name;

import javafx.scene.control.Alert;
import net.avensome.dev.gnupolpot.api.Api;
import net.avensome.dev.gnupolpot.api.Feature;
import net.avensome.dev.gnupolpot.api.PluginException;

public class HelloWorldFeature implements Feature {
    @Override
    public String getMenuItem() {
        return "Say hello";
    }

    @Override
    public String getDescription() {
        return "Simply says hello";
    }

    @Override
    public void execute(Api api) throws PluginException {
        Alert hello = new Alert(Alert.AlertType.INFORMATION);
        hello.setHeaderText("Hello World!");
        hello.setContentText("Apparently, your first plugin is working fine :)");
        hello.showAndWait();
    }
}
