import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandlerInvocation implements InvocationHandler {

    private Subject subject;

    public MyHandlerInvocation(RealSubject realSubject) {
        this.subject = realSubject;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        Object result = null;
        dazhe();

        result = method.invoke(subject,objects);

        return result;
    }


    private void dazhe(){
        System.out.println("打折");
    }

}
