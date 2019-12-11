Idea显示微服务启动对象

修改workspace.xml文件即可：

1.查找workspace.xml文件，搜索RunDashboard，
2.添加如下xml节点到上图对应位置即可：

<option name="configurationTypes">
    <set>
       <option value="SpringBootApplicationConfigurationType" />
     </set>
</option>
 3.保存后自动显示
