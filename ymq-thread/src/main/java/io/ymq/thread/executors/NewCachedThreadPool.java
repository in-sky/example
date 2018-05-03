package io.ymq.thread.executors;

import java.util.concurrent.*;

/**
 * 描述:创建可缓冲的线程池。没有大小限制。由于corePoolSize为0所以任务会放入SynchronousQueue队列中，
 * SynchronousQueue只能存放大小为1，所以会立刻新起线程，由于maxumumPoolSize为Integer.MAX_VALUE所以可以认为大小为2147483647。受内存大小限制。
 *
 * @author yanpenglei
 * @create 2017-10-12 15:10
 **/
public class NewCachedThreadPool {


/*    public static ExecutorService newCachedThreadPool() {
        return new ThreadPoolExecutor(
                0,
                Integer.MAX_VALUE,
                60L,
                TimeUnit.SECONDS,
                new SynchronousQueue<Runnable>());
    }

    public NewCachedThreadPool(int corePoolSize,
                               int maximumPoolSize,
                               long keepAliveTime,
                               TimeUnit unit,
                               BlockingQueue<Runnable> workQueue) {
        this(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue,
                Executors.defaultThreadFactory(), defaultHandler);
    }*/

}
