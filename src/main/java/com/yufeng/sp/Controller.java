package com.yufeng.sp;

import com.yufeng.sp.service.AService;
import com.yufeng.sp.service.BService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Description
 * @Author yangwu
 * CreateTime        202011172327
 */
@RestController
public class Controller<T> {

    private AService aService;

    private BService bService;

    public Controller() {
        this.aService = new AService();
        this.bService = new BService();
    }




    @RequestMapping("/test")
    public void invokeMethod(@RequestParam String serviceClass,@RequestParam  String methodName) throws ClassNotFoundException,
            NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class c =  Class.forName("com.yufeng.sp.service."+serviceClass);
        Method method = c.getDeclaredMethod(methodName);
        method.invoke(c.newInstance(),null);
    }
}
