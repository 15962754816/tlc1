构造方法块
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
