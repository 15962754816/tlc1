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
