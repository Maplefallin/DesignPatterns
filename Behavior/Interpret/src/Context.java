import java.util.HashMap;
import java.util.Map;

public class Context {
    private Map<String,Integer> variables = new HashMap<>();

    public void defineVariable(String variable,int value){
        variables.put(variable,value);
    }

    public int lookupVariable(String variable){
        return variables.getOrDefault(variable,0);
    }
}
