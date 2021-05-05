import java.util.LinkedList;
class LinkedListPop{

  public static void main(String[] args) {

     LinkedList<String> list = new LinkedList<String>();
     list.add("Jack");
     list.add("Robert");
     list.add("Chaitanya");
     list.add("kate");

     System.out.println("LinkedList before: "+list);
  list.pop("jack");
     System.out.println("Element removed: "+list.pop());
     System.out.println("LinkedList after: "+list);
  }
}