package testMediaDevice;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher {
    List<Interceptor> interceptorList = new ArrayList<Interceptor>();

    void dispatch(Interceptor inter) {
        Interceptor i = iterateList(inter);
        if (i == null) {
            System.out.println("Interceptor not registered");
        } else {
            i.event();
        }

    }

    void register(Interceptor i) {
        interceptorList.add(i);
    }

    void remove(Interceptor i) {
        interceptorList.remove(i);
    }

    public Interceptor iterateList(Interceptor interceptor) {
        for (Interceptor i : interceptorList) {
            if (i == interceptor) {
                return interceptor;
            }
        }
        return null;
    }
}

