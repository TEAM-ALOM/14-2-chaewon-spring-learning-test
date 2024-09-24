package cholog.di;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjection {

    public String sayHello() {
        return injectionBean.hello();
    }
}
