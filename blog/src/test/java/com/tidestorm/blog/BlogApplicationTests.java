package com.tidestorm.blog;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;


@SpringBootTest
//@RunWith(SpringRunner.class)
    @RunWith(SpringRunner.class)
class BlogApplicationTests {
@Autowired
private DataSource dataSource;

    @Test
    void contextLoads() {
    }
    @Test
    public void t(){
    System.err.println(dataSource.getClass());
    }
}
