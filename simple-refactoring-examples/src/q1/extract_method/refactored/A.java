package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
      // TODO: Your answer
      // other implementation
	   extractedMethod(nodes, p);
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
      // TODO: Your answer
      // other implementation
	   extractedMethod(edgeList, p);
      return null;
   }

   // TODO: Your answer
   // ? extractedMethod(?) {
   //
   // }
   <T extends Graphs> void extractedMethod(List<T> objs, String p) {
	   for(T obj: objs) {
		   
		  if(obj.contains(p))
			  System.out.println(obj);
	   }
   }
}
class Graphs {
	String name;
	
	public boolean contains(String p) {
		return name.contains(p);
	}
}
class Node extends Graphs{
	String name;

	public boolean contains(String p) {
		return name.contains(p);
	}
}

class Edge extends Graphs{
   String name;

   public boolean contains(String p) {
       return name.contains(p);
   }
}