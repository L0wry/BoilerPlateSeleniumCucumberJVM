package Utils;

import com.google.common.base.Charsets;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by mattlowry on 12/01/2017.
 */
public class ScriptFactory {
    private static Map<String, String> scripts = new HashMap();
    private static final Object lockObject = new Object();

    public static String getScript(String scriptName) {
        synchronized(lockObject) {
            if(!scripts.containsKey(scriptName)) {
                loadScript(scriptName);
            }
        }

        return scripts.get(scriptName);
    }

    private static void loadScript(String scriptName) {
        try {
            ClassLoader ioe = ScriptFactory.class.getClassLoader();
            InputStream in = ioe.getResourceAsStream("scripts/" + scriptName + ".js");
            scripts.put(scriptName, IOUtils.toString(in, Charsets.UTF_8));
        } catch (IOException e) {
            System.out.println("Could not load script from \'scripts/" + scriptName + ".js\'! " + e.getMessage());
        }

    }
}
