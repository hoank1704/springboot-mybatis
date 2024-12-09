# Bắt đầu với image OpenJDK 17
FROM openjdk:17-slim AS build

# Cài đặt Maven
RUN apt-get update && apt-get install -y maven

# Thiết lập thư mục làm việc
WORKDIR /app

# Copy file pom.xml và mã nguồn vào container
COPY pom.xml .
COPY src ./src

# Chạy lệnh Maven để build ứng dụng (clean và package)
RUN mvn clean package -DskipTests

# Tạo image chính cho việc chạy ứng dụng
FROM openjdk:17-jdk-slim

# Thiết lập thư mục làm việc
WORKDIR /app

# Copy file JAR đã build từ container build vào container chính với tên ngắn hơn
COPY --from=build /app/target/mybatis-0.0.1-SNAPSHOT.jar app.jar

# Chạy ứng dụng Spring Boot
ENTRYPOINT ["java", "-jar", "app.jar"]
