package okhttp3.guide;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class GetExample {
    OkHttpClient client = new OkHttpClient();

    String run(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = new OkHttpClient().newCall(request).execute()) {
            return response.body().string();
        }
    }

    public static void main(String[] args) throws IOException {
        GetExample example = new GetExample();
        String response = example.run("http://www.cnblogs.com/sharpxiajun/p/3936268.html#!comments");
//        String response = example.run("https://raw.githubusercontent.com/square/okhttp/master/README.md");
//        String response = example.run("https://raw.github.com/square/okhttp/master/README.md");
        System.out.println(response);


//        //获取本机的InetAddress实例
//        InetAddress address = InetAddress.getLocalHost();
//        //获取计算机名
//        System.out.println(address.getHostName());
//        //获取IP地址
//        System.out.println(address.getHostAddress());
//        //获取字节数组形式的IP地址,以点分隔的四部分
//        System.out.println(address.getAddress());

        //获取其他主机的InetAddress实例
        //        InetAddress address2 =InetAddress.getByName("其他主机名");
        //        InetAddress address3 =InetAddress.getByName("IP地址");


//
//        //创建一个URL的实例
//        URL myBlog = new URL("https://3dot141.cn");
//        URL url = new URL(myBlog, "/blogs/33521.html?username=3dot141#test");//？表示参数，#表示锚点
//        //获取协议
//        System.out.println(url.getProtocol());
//        //获取主机
//        System.out.println(url.getHost());
//        //如果没有指定端口号，根据协议不同使用默认端口。此时getPort()方法的返回值为 -1
//        System.out.println(url.getPort());
//        //获取文件路径
//        System.out.println(url.getPath());
//        //文件名，包括文件路径+参数
//        System.out.println(url.getFile());
//        //相对路径，就是锚点，即#号后面的内容
//        System.out.println(url.getRef());
//        //查询字符串，即参数
//        System.out.println(url.getQuery());

        //使用URL读取网页内容
        //创建一个URL实例

//        URL url = new URL("http://www.baidu.com");
//        InputStream is = url.openStream();//通过openStream方法获取资源的字节输入流
//        InputStreamReader isr = new InputStreamReader(is, "UTF-8");//将字节输入流转换为字符输入流,如果不指定编码，中文可能会出现乱码
//        BufferedReader br = new BufferedReader(isr);//为字符输入流添加缓冲，提高读取效率
//        String data = br.readLine();//读取数据
//        while (data != null) {
//            System.out.println(data);//输出数据
//            data = br.readLine();
//        }
//        br.close();
//        isr.close();
//        is.close();


    }


}
