Differences Between TreeMap and TreeSet:

  -TreeMap implements the Map interface and TreeSet implements the Set interface
  -Similarly, TreeSet implements NavigableSet and TreeMap implements implements NavigableMap
  -TreeSet stores one Object (Objects in sorted order) while TreeMap stores a key and a value (keys are in sorted order)
  -Duplicates are allowed in TreeMap (for keys), but not in TreeSet
  
Differences between HashMap and HashSet: Similar to TreeMap/TreeSet

  -HashMap implements the Map interface while HashSet implements the Set interface
  -HashMap Stores data in form of  key value pair while only Objects are stored in the HashSet
  -In HashMap, the hash value is calculated through the key; in the HashSet, the hash value is calculated through the Object
  -Duplicate keys are allowed in HashMap, but no duplicates are allowed in HashSet
  
Differences between Hash and Tree:
  -HashMap:
      Lookup-array structure
      O(1) runtime complexity for inserting and searching
      unsorted
  -TreeMap:
      Tree structure
      O(log(N)) runtime complexity for inserting and searching
      sorted
      

Internally:
  HashMap is an array where each slot is a linked list of elements; every slot corresponds to a hashvalue
  TreeMap uses a red-black tree; the details of the tree are not exposed and there is no way to expose its structure;
      the purpose of using it is to get O(log n) performance for search and insert
      
Write code to try to do a speed comparison between HasMaps and TreeMaps. Report your findings.

Java's built in heap is called...

The rest is in other .java files
