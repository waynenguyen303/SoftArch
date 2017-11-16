package org.apache.catalina.startup;

import java.io.File;

public interface IBootstrap {

    void initClassLoaders();

    ClassLoader createClassLoader(String name, ClassLoader parent) throws Exception;

    String replace(String str);

    void init() throws Exception;
    void load(String[] arguments) throws Exception;
    Object getServer() throws Exception;

    public void init(String[] arguments);
    void start();
    void stop();
    void stopServer();
    void stopServer(String[] arguments);

    void setAwait(boolean await);

    boolean getAwait();
    void destroy();

    void main(String args[]);

    String getCatalinaHome();

    String getCatalinaBase();
    File getCatalinaHomeFile();

    File getCatalinaBaseFile();
    void handleThrowable(Throwable t);
    String[] getPaths(String value);
    
}
