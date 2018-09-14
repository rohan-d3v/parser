/**
 * @name:       Rohan Krishna Ramkhumar
 * @case-id:    rxr353
 * @project:    2) Parser
 * @class:      BooleanList
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;
import java.util.stream.Collectors;

public final class BooleanList implements Iterable<ListSymbol>{

    private final List<ListSymbol> listRepresentation;//As stated in the assignment

    @Override
    public Iterator<ListSymbol> iterator() {//overrides ListSymbol Iterator to prevent error being thrown
        return this.listRepresentation.iterator();
    }

    /**
     * Constructor to add ListSymbol to listRepresentation
     */
    public BooleanList(){
        listRepresentation = new ArrayList<ListSymbol>();
    }

    /**
     * Simple getter method
     * @return returns ArrayList as asked
     */
    public final List<ListSymbol> getList(){
        return listRepresentation;
    }

    /**
     * Adder but with ListSymbol instead of Type (both ways)
     * @param listSymbol
     * @return
     */
    public final Boolean add(ListSymbol listSymbol){
        listRepresentation.add(listSymbol);

        if (listRepresentation.contains(listSymbol))
            return true;
        else
            return false;
    }


    /**
     * Adds the connector, as stated in the assignment
     * @param type
     * @return
     */
    public final Boolean add(Type type){
            return listRepresentation.add(Connector.Build(type));
    }

    /**
     * Makes the list unmodifiable
     */
    public final void freeze(){
        Collections.unmodifiableList(listRepresentation);
    }

    /**
     * Simple Stram to convert to and output in String
     * @return
     */
    public String toString(){
        return listRepresentation.stream().map(i -> i.toString()).collect((Collectors.joining(" ")));
    }
}
