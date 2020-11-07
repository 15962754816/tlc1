
1 Byte (B) = 8 bits (b) 字节=8个二进制位 
一、构造方法块
public test{

  String a;
  public test()
  {
  
     构造方法块默认加到构造方法里
  }
  
  public test(String a)
  {
     this();//this()调用要第一行，不会加构造方法块
     this.a = a;
  }
  //构造方法块
  {
     ...
  }

}



java.lang 默认导入包  ：String Math System  Integer Thread



二.super
   super 只能出现在子类的方法和构造方法中
   super 调用构造方法时只能是第一句
   super（）和this（）不能同时出现在构造方法中
   super不能访问父类的private成员
   super和this不能出现在static方法里
   static会被继承但不能重写



三.内部类
   可以直接访问外部类的私有属性
   外部类不可以直接访问内部类的私有属性（可以通过 在外部类中new一个内部对像访问）
   不能定义静态属性
   当成类中普通成员变量，只不过是class类型
   
   
   
四 try finally
   finally里有return  try里有return finally会覆盖try的return值返回
   finally里没return  try里有return  finally里代码执行好之后，再将try里的值return
   finally里没return 但修改值 try里有return，类似分为值传递和引用传递
     1.值传递不会改变try里作为返回的return值
     2.引用传递会改变成finally里修改的值
     

五、常量池1.7之后放在堆空间


六.集合

   
   ArrayList 底层实现是数组  查询快 插入删除慢
   LinkedList 底层实现是链表  插入删除快 查询慢
   HashSet  底层实现是HashMap 哈希表  唯一 无序
   TreeSet  底层是TreeMap  黑白二叉树   唯一  有序 
   
   ArrayList 线程不安全 扩容每次增加本身的一半
   vector  线程安全  扩容每次增加本身的大小
   
   HashSet：内部的数据结构是哈希表，是线程不安全的。
    HashSet中保证集合中元素是唯一的方法：通过对象的hashCode和equals方法来完成对象唯一性的判断。
 
    如果对象的hashCode值不同，则不用判断equals方法，就直接存到HashSet中。

    如果对象的hashCode值相同，需要用equals方法进行比较，如果结果为true，则视为相同元素，不存，如果结果为false，视为不同元素，进行存储。

   注意：如果元素要存储到HashCode中，必须覆盖hashCode方法和equals方法。


    TreeSet：可以对Set集合中的元素进行排序，是线程不安全的。

    TreeSet中判断元素唯一性的方法是：根据比较方法的返回结果是否为0，如果是0，则是相同元素，不存，如果不是0，则是不同元素，存储。

    TreeSet对元素进行排序的方式：


    元素自身具备比较功能，即自然排序，需要实现Comparable接口，并覆盖其compareTo方法。

    元素自身不具备比较功能，则需要实现Comparator接口，并覆盖其compare方法。


