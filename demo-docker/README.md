# demo-docker
整合 spring-boot 與 docker 的教學專案。專案啟動後可以在本地預覽簡單的靜態頁面([http://localhost:8080](http://localhost:8080))。

![bootstrap4-admin](https://user-images.githubusercontent.com/2173652/35085952-b30e389c-fc65-11e7-870f-17965068daa5.png)

## 安裝 DockerCE（MAC）
https://docs.docker.com/docker-for-mac/install/#download-docker-for-mac
```
$ docker --version
Docker version 17.12.0-ce, build c97c6d6
```

## 啟動專案
```
git clone jerry80409/demo-docker-elk.git
cd  demo-docker-elk
chmod +x mvnw *.sh

# run docker build
./docker-build.sh

# launch docker image
./docker-run.sh
```

