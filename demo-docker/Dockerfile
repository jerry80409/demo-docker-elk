# FROM: 指定 base image (https://hub.docker.com/r/cogniteev/oracle-java/)
FROM cogniteev/oracle-java

# expose 8080 port
EXPOSE 8080

# 版本管理, 接收 docker build --build-arg 指定的參數
ARG APP_VERSION

# 複製編譯後的 jar , 到容器裡面
COPY target/${APP_VERSION} /opt/app/app.jar

# WORKDIR: 指定 docker 執行起來時候的預設目錄位置
WORKDIR /opt/app

# 指定容器啟動後執行的命令，並且不會被 docker run 提供的參數覆蓋。
ENTRYPOINT ["java","-jar","app.jar"]
