package com.example.demo;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.locks.ReentrantLock;

public class FIleDownLoadContuineUtil {

    public static Long getFileSize(String FilePath){
        File file = new File(FilePath);
        if(file.exists()) {
            return file.length();
        }

        file = null;
        return 0l;
    }

    public static void putFIle(byte[] bytes,String FilePath){
        File file = new File(FilePath);

        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
        FileChannel fileChannel =  null;
        ReentrantLock rl = new ReentrantLock();

        try {
            fileChannel =  FileChannel.open(file.toPath());
            FileLock fl = fileChannel.lock();

            fileChannel.write(byteBuffer);
            fileChannel.force(true);
            fl.release();


            while(!rl.tryLock()){
                Thread.sleep(1000);
                rl.unlock();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            rl.unlock();
            try {
                fileChannel.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
