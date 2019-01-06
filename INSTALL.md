需要java环境，无需安装，原始代码需要java环境运行。
百度搜索‘jdk’，进入第一条下载地址。
1在downloads中选择JAVA DOWNLOAD进入Java下载列表（本项目需要下载java1.8）
2点选Accept License Agreement，选择Windows这一栏下载
3安装包下载好之后，进入文件夹，双击应用程序根据提示进行安装，直至安装完成
4测试jdk是否安装成功，可在【开始】中搜索cmd，输入【java -version】。
JAVA_HOME变量设置
1首先右击【计算机】进入【属性】然后选择其中的【高级系统设置】。
2点击进入【高级】中的【环境变量】，进入环境变量编辑界面。
3在下方的【系统变量】中，并不存在JAVA_HOME变量,那么我们需要点击【新建】
4变量名输入：JAVA_HOME
5变量值指的是实际的安装路径（比如小编的路径为：C:\Program Files\Java\jdk-9）。
Path变量设置
1同样是在【系统变量中】我们可以看到path变量已经存在，那么我们只需要点击【编辑】，进入path变量的编辑变量名不变，变量值改为【%JAVA_HOME%\bin;%JAVA_HOME%\jre\bin;】，最后点击确定。
由于java1.5版本之后可不需要设置classpath，所以不需要设置classpath
完成以上步骤变量配置之后不要忘了一步一步点击确定。
同样的，在【开始】中搜索【cmd】。
然后在键入【java】以及【javac】。
出现版本号等信息，说明配置成功
