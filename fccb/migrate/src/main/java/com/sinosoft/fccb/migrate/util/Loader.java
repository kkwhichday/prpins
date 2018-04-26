package com.sinosoft.fccb.migrate.util;

import java.io.IOException;
import java.io.InputStream;

public class Loader extends ClassLoader {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        /*ClassLoader classLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                try{

                    String filename = name.substring(name.lastIndexOf('.')+1)+".class";
                    InputStream is = getClass().getResourceAsStream(filename);
                    if(is == null){
                        return super.loadClass(name);
                    }
                    byte[] b = new byte[is.available()];
                    is.read(b);
                    return defineClass(name,b,0,b.length);
                }catch (IOException e){
                    throw new ClassNotFoundException(name);
                }
            }
        };

        Object obj = classLoader.loadClass("com.sinosoft.fccb.migrate.util.Loader").newInstance();
        System.out.println(obj.getClass());
        System.out.println(obj instanceof com.sinosoft.fccb.migrate.util.Loader);
  */
        testHandlePromotion();
    }

    private static final int _1MB = 1024 * 1024;
    public static void testHandlePromotion(){
        byte[] allocation1,allocation2,allocation3,allocation4,
                allocation5,allocation6,allocation7;
      /*  allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];
        allocation1 = null;
        allocation4 = new byte[2 * _1MB];
        allocation5 = new byte[2 * _1MB];
        allocation6 = new byte[2 * _1MB];
        allocation4 = null;
        allocation5 = null;
        allocation6 = null;
        allocation7 = new byte[2 * _1MB];*/
        //allocation1 = new byte[2 * _1MB];
        //allocation2 = new byte[2 * _1MB];
//        allocation3 = new byte[2 * _1MB];
//        allocation4 = new byte[2 * _1MB];
//        allocation5 = new byte[2 * _1MB];
//        allocation6 = new byte[2 * _1MB];
//        allocation7 = new byte[2 * _1MB];


    }


}
