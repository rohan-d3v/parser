/**
 * @name:       Rohan Krishna Ramkhumar
 * @case-id:    rxr353
 * @project:    2) Parser
 * @class:      AbstractListSymbol
 */

abstract class AbstractListSymbol implements ListSymbol{

    /**
     *
     * @return Specific BooleanList
     */
    public BooleanList toList(){//Simply adds the Connector Type to List
        BooleanList list = new BooleanList();
        list.add(getType());
        return list;

    }


}
