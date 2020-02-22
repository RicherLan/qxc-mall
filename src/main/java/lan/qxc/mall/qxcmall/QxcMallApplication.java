package lan.qxc.mall.qxcmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("ltd.newbee.mall.dao")
public class QxcMallApplication {

    public static void main(String[] args) {
        SpringApplication.run(QxcMallApplication.class, args);
    }

}
