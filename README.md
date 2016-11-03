# Implementation of Dominator Chain Data structure
Finds the double vertex dominators in a directed acyclic graph  <br />
Dominator Chains are datastructures which allows representing all possible O(n<sup>2</sup>) double vertex dominators in O(n) space, where *n* is the number of vertices.

##Definition
A vertex v is said to dominate another vertex u if every path from u to the output of the circuit contains v.
If two vertices u1,u<sub>2</sub> together dominate a vetex v i.e every path from v to the output passes through either u<sub>1</sub> or u<sub>2</sub> and there exists atleast one path from v to output which contains u<sub>1</sub>(and u<sub>2</sub>) but does not contain u<sub>2</sub>(u<sub>1</sub>), then they are called the double vertex dominators of v.

##Usage
Obtain the .class files by running `javac *.java`. <br />
A graph has been hard-coded; executing `java DominatorChain` will give you the corresponding output.
