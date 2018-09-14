import java.util.HashMap;
import java.util.Map;

/**
 * @name:       Rohan Krishna Ramkhumar
 * @case-id:    rxr353
 * @project:    2) Parser
 * @class:      Connector
 */


public final class Connector extends AbstractListSymbol implements ListSymbol {

    private final Type type;

    HashMap<String, Type> map = new HashMap<String, Type>();//hashmap to make toString less complicated

    /**
     * Default constructor to create the different connectors.
     * @param type
     */
    private Connector(Type type){
        this.type = type;
        map.put("^", Type.AND);
        map.put("v", Type.OR);
        map.put("~", Type.NOT);
        map.put("(", Type.OPEN);
        map.put(")", Type.CLOSE);
    }

    public static final Connector Build(Type type){
        if ((type !=null) && !(type.equals(Type.VARIABLE) || type.equals(Type.TERM) || type.equals(Type.EXPRESSION)))//I don't know how to hashmap this
            return new Connector (type);
        else if (type.equals(Type.VARIABLE) || type.equals(Type.TERM) || type.equals(Type.EXPRESSION))//Same problem here
            throw new IllegalArgumentException("These are not Connector types");
        else
            throw new NullPointerException("Not null");

    }

    public final Type getType(){
        return this.type;
    }
    public String toString(){
        for (Map.Entry m: map.entrySet()){
            return (m.getKey()+""+m.getValue());
        }
        return "Done!";
    }

}
