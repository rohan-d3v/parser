
/**
 * @name:       Rohan Krishna Ramkhumar
 * @case-id:    rxr353
 * @project:    2) Parser
 * @class:      Variable
 */

public class Variable implements ListSymbol {

    private final String representation;

    public BooleanList toList(){//Simply adds the Connector Type to List
        BooleanList list = new BooleanList();
        list.add(getType());
        return list;

    }

    public Type getType(){
        return Type.VARIABLE;
    }

    public final String getRep(){
        return representation;
    }

    private Variable(String representation){
        this.representation = representation;
    }
   public static final Variable build(String representation){
        if (representation != null){
            return new Variable(representation);
        }
        else
            throw new NullPointerException("String is null, enter string");
    }

    public String toString(){
       return this.representation;
    }
}
