package com.atguigu.springboot02quick.test;
 import java.io.File;
 import java.util.concurrent.*;

/**
 * @author hq.zheng
 * @create 2019-03-22-下午 2:30
 */
public class TestReadFileByThread {
    public static void main(String[] args) {
        BlockingQueue<File> rFile=new LinkedBlockingQueue<File>();
        File file=new File("E:\\test");
        ExecutorService executorService=Executors.newCachedThreadPool();
        TestReadFileByThread testReadFileByThread=new TestReadFileByThread();
        for (File f : file.listFiles()) {
            if(f.isDirectory()){
                executorService.execute(testReadFileByThread.new ReadFile(rFile,f));
            }else{
                System.out.println("根目录下文件【"+f.getName()+"】的路径【"+f.getPath()+"】");
                rFile.add(f);
            }
        }
        executorService.shutdown();

    }

    private class ReadFile implements   Runnable{
        BlockingQueue<File> rFile=null;
        File file=null;

        public ReadFile(BlockingQueue<File> rFile,File file){
            this.rFile=rFile;
            this.file=file;
        }

        private final  void getFileName(File[] fileDirectory){
            for (File file : fileDirectory) {
                if(file.isDirectory()){
                    getFileName(file.listFiles());
                }else{
                    System.out.println("子目录下文件【"+file.getName()+"】的路径【"+file.getPath()+"】");
                    rFile.add(file);
                }
            }
        }
        @Override
        public void run() {
            getFileName(file.listFiles());
        }
    }
}

