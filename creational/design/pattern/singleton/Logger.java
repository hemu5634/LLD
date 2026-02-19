package creational.design.pattern.singleton;

public class Logger {
    private static volatile Logger logger;
    private Logger(){
    }
    public static Logger getInstance(){
        if(logger==null){
            synchronized(Logger.class){
                if(logger==null){
                    logger = new Logger();
                }
            }
        }
        return logger;
    }

    public void log(String log){
        System.out.println(log);
    }
}