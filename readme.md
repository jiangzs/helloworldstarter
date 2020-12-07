编码

上传到 github 
mvn install:install-file -DgroupId=com.demo.starter -DartifactId=helloworld -Dversion=0.0.1-SNAPSHOT -Dfile=/Users/jiangzhengshui/Desktop/wehotel/starter/target/helloworld-2.0.jar -Dpackaging=jar -DgeneratePom=true -DlocalRepositoryPath=.  -DcreateChecksum=true

客户端 maven 引用

<repositories>
    <repository>
        <id>my-repository</id>
        <name>my-repository</name>
        <url>https://raw.githubusercontent.com/jiangzs/repository/repository</url>
        <snapshots>
            <enabled>true</enabled>
        </snapshots>
        <releases>
            <enabled>true</enabled>
        </releases>
    </repository>
</repositories>

使用