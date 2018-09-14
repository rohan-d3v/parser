/**
 * @name:       Rohan Krishna Ramkhumar
 * @case-id:    rxr353
 * @project:    2) Parser
 * @class:      Symbol
 * Just an interface to be extended by AbstractListSymbol and Variable
 */
public interface Symbol {

     Type getType();

    BooleanList toList();


}
