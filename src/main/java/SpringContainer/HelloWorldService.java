package SpringContainer;

import org.springframework.stereotype.Service;

@Service("helloWorldService")
public class HelloWorldService {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String sayHello() {
        long z = 0;

        for ( long i=0; i<100000; i++)      {
            for ( long x=0; x<10000; x++)
                                    z++;
        }

        return "Hello from HelloWorld Service! " + name;
    }

}