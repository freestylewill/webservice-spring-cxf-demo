package com.guigu.jaxrs;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;
import org.apache.cxf.transport.http.HTTPTransportFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/4/11.
 */
public class Server {

    public static void main(String[] args){
        JAXRSServerFactoryBean factoryBean=new JAXRSServerFactoryBean();
        factoryBean.setResourceClasses(ProjectService.class);
        factoryBean.setResourceProvider(ProjectService.class,new SingletonResourceProvider(new ProjectServiceImpl()));
        factoryBean.setAddress("http://localhost:8082/");
        factoryBean.setDestinationFactory(new HTTPTransportFactory());

        Map<Object, Object> extmaps=new HashMap<Object,Object>();
        extmaps.put("json","application/json");
        extmaps.put("xml","application/xml");
        factoryBean.setExtensionMappings(extmaps);

        Map<Object, Object> lmaps=new HashMap<Object,Object>();
        lmaps.put("en","en-gb");
        factoryBean.setLanguageMappings(lmaps);
        org.apache.cxf.endpoint.Server server = factoryBean.create();

        try {
            Thread.sleep(1000*60*10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
