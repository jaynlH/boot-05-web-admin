package com.nlhui.admin;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@DisplayName("Junit测试")
public class NewTest {
    @DisplayName("测试display注解")
    @Test

    public void testDisplayName(){
        System.out.println("hi");
    }
    @Test
    @BeforeEach
    void beforeEach(){
        System.out.println("测试就要开始了");
    }
    @Test
    @BeforeAll
    static void testBeforeAll(){
        System.out.println("测试要开始了");
    }
    @Test
    @AfterAll
    static void testAfterAll(){
        System.out.println("测试结束了");
    }
    @DisplayName("断言测试")
    @Test
    public void testAssertion(){
        int cal = cal(2, 3);
        Assertions.assertEquals(6,cal,"业务逻辑计算错误");
    }
    int cal(int a,int b){
         int sum=a+b;
        return sum;
    }

}
