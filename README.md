dubbo-remoting-netty4
=====================

升级dubbo的netty版本，到目前最新版本4.1.0.Beta3
使用方法：

1、将dubbo-remoting-netty4-0.0.1.Beta.jar放到工程lib下<br>
2、配置provider<br>
   ......<br>
   &lt;dubbo:protocol name="dubbo" port="21880" server="netty4"/> <br>
   设置server为netty4<br>
   ......<br>
3、配置consumer<br>
   ......<br>
   &lt;dubbo:reference id="demoService" client="netty4" interface="com.antrou.service.TestService" /> <br>
   设置client为netty4<br>
   ......<br>
