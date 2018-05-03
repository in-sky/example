package io.ymq.thread.executors;

import java.util.concurrent.*;

/**
 * 描述:创建线程数固定大小的线程池。 由于使用了LinkedBlockingQueue所以maximumPoolSize 没用，
 * ;当corePoolSize满了之后就加入到LinkedBlockingQueue队列中。每当某个线程执行完成之后就从LinkedBlockingQueue队列中取一个。所以这个是创建固定大小的线程池。
 *
 * @author yanpenglei
 * @create 2017-10-12 14:47
 **/
public class newFixedThreadPool {


    public static ExecutorService newFixedThreadPool(int nThreads) {
        return new ThreadPoolExecutor(
                nThreads,
                nThreads,
                0L,
                TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());
    }

}


