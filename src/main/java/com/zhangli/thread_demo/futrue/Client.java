package com.zhangli.thread_demo.futrue;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author zhangli
 * date 2022/10/2 22:12
 */

public class Client {


//    public static void main(String[] args) {
//        Callable<String> callable = new TestCallable();
//
//        long start = System.currentTimeMillis();
//        FutureTask<String> future = new FutureTask<>(callable);
//
//        new Thread(future).start();
//        String result;
//        try {
//
//
//            while (true) {
//                Thread.currentThread().sleep(3 * 1000);
//                if(future.isDone()){
//                    result = future.get();
//                    System.out.println("out");
//                    break;
//                }
//                System.out.println("not yet");
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//            System.out.println("线程中断异常！");
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//            System.out.println("线程执行异常！D");
//        }
//
//        System.out.println(System.currentTimeMillis() - start);
//
//    }

//    public static void main(String[] args) throws Exception {
//        CompletableFuture<String> supplyAsync = CompletableFuture.supplyAsync(new Supplier<String>() {
//            @Override
//            public String get() {
//                return "suck";
//            }
//        });
//
//        CompletableFuture<Void> runAsync = CompletableFuture.runAsync(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("runAsync");
//            }
//        });
//        System.out.println(supplyAsync.get());
//    }

//    public static void main(String[] args) throws Exception {
////        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(new Supplier<Integer>() {
////            @Override
////            public Integer get() {
////                System.out.println("10086");
////                return 10086;
////            }
////        });
//
//        CompletableFuture<List<String>> listFuture = CompletableFuture.supplyAsync(new Supplier<List<String>>() {
//            @Override
//            public List<String> get() {
//                List<String> list = new ArrayList<>();
//                list.add("This is a new list");
//                return list;
//            }
//        });
//
////        CompletableFuture<Object> handle = listFuture.handle(new BiFunction<List<String>, Throwable, Object>() {
////            @Override
////            public Object apply(List<String> strings, Throwable throwable) {
////                // 如果报错，就打印出异常
////                throwable.printStackTrace();
////                System.out.println(strings);
////                // 如果不报错，返回一个包含Integer的全新的CompletableFuture
////                return strings.size();
////            }
////        });
////        System.out.println(handle.get());
//
//        CompletableFuture<Object> future = listFuture.thenApply(new Function<List<String>, Object>() {
//            @Override
//            public Object apply(List<String> strings) {
//
//                return strings.size();
////                throw new RuntimeException("素材库");
//            }
//        });
//
//        CompletableFuture<Object> exceptionally = future.exceptionally(new Function<Throwable, Object>() {
//            @Override
//            public Object apply(Throwable throwable) {
//                return throwable.getMessage();
//            }
//        });
//
//        exceptionally.thenAccept(new Consumer<Object>() {
//            @Override
//            public void accept(Object o) {
//                System.out.println(o);
//            }
//        });
//
//
////        future.whenComplete(new BiConsumer<Integer, Throwable>() {
////            @Override
////            public void accept(Integer integer, Throwable throwable) {
////                System.out.println(integer);
////                System.out.println(throwable.getMessage());
////            }
////        });
//
////        Thread.sleep(5000);
//
//
//    }

    static int m = 20;

    // TODO 此demo执行有问题，执行顺序紊乱，未找出原因
    public static void main(String[] args) {

        System.out.println(get().size());
    }

    private static List<String> get() {
        CompletableFuture<List<String>> lastFuture = null;
        for (int i = 0; i < 100; i++) {
            CompletableFuture<List<String>> future = CompletableFuture.supplyAsync(new Supplier<List<String>>() {
                @Override
                public List<String> get() {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ArrayList<String> strings = new ArrayList<>();
                    strings.add("suck" + inc());
                    return strings;
                }
            }, Executors.newFixedThreadPool(100));
            if (lastFuture == null) {
                lastFuture = future;
            } else {
                lastFuture = lastFuture.thenCombine(future, new BiFunction<List<String>, List<String>, List<String>>() {
                    @Override
                    public List<String> apply(List<String> s, List<String> s2) {
                        s.addAll(s2);
                        return s;
                    }
                });
            }
        }
        try {
            return lastFuture.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private synchronized static int inc() {
        m += 1;
        return m;
    }

}
