import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {

        RealSubject realSubject = new RealSubject();

        Subject subject = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(), new Class<?>[]{Subject.class}, new MyHandlerInvocation(realSubject));

        subject.sell();

    }


}


