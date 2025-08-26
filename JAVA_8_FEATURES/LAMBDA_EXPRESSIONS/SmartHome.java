import java.util.HashMap;
import java.util.Map;

interface LightAction {
    void activate();
}

public class SmartHome {
    public static void main(String[] args) {
        Map<String, LightAction> triggers = new HashMap<>();

        triggers.put("motion", () -> System.out.println("Lights ON with soft brightness (motion detected)."));
        triggers.put("time", () -> System.out.println("Lights ON dim at night."));
        triggers.put("voice", () -> System.out.println("Lights set to party mode via voice command."));

        triggers.get("motion").activate();
        triggers.get("time").activate();
        triggers.get("voice").activate();
    }
}
