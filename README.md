dubbo-remoting-netty4
=====================

升级dubbo的netty版本，到目前最新版本4.1.0.Beta3
使用方法：

*将dubbo-remoting-netty4-0.0.1.Beta.jar放到工程lib下<br>
*配置provider
   ......
   &lt;dubbo:protocol name="dubbo" port="21880" server="netty4"/> 
   设置server为netty4
   ......
*配置consumer
   ......
   &lt;dubbo:reference id="demoService" client="netty4" interface="com.antrou.service.TestService" /> 
   设置client为netty4
   ......
