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
