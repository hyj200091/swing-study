package design;

/**
 * 单列模式

 */
public class Singleton {
    //创建一个Singleton的一个对象

    //单列模式中的饱汉式 private  static  Singleton instance  = new Singleton();
    private  static Singleton instance  = new Singleton();
    //让构造方法为privete 这样累就不会被实例化
    private  Singleton(){

    }
    //静态方法获取唯一可用的对象
    public  static Singleton getInstance(){
        return  instance;
    }
    //成员方法  显示消息
    public  void  showMessage(){
        System.out.println("Hello World!!!");
    }
}
