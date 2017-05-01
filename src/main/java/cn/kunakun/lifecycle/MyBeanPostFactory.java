package cn.kunakun.lifecycle;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostFactory implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("cn.kunakun.lifecycle.MyBeanPostFactory.postProcessBeforeInitialization(Object, String) ");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(final Object bean, String beanName)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("cn.kunakun.lifecycle.MyBeanPostFactory.postProcessAfterInitialization(Object, String)");
		return Proxy.newProxyInstance(
				bean.getClass().getClassLoader(), 
				bean.getClass().getInterfaces(), 
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args)
							throws Throwable {
						// TODO Auto-generated method stub
						System.out.println("我在addUser前面执行  ---开启tx");
						Object object = method.invoke(bean, args);
						System.out.println("我在addUser后面执行   ---- 关闭tx");
						return object;
					}
				});
		
	}


}
