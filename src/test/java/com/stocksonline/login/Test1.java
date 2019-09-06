//package com.stocksonline.login;
//
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class LoginApplicationTests {
//
//    //	@Test
////	public void contextLoads() {
////	}
//    @Test
//    public void stream()
//    {
//        List<Integer> list= Arrays.asList(new Integer(1),new Integer(2),new Integer(3));
//        Assert.assertEquals(1, list .stream(). parallel()
//                .filter(a-> (a%2==0))
//                .count());
//    }
//    @Test
//    public void collectors() {
//        List<Account> list= Arrays.asList(new Account(1,"praha",1000),new Account(2,"ram",2000),new Account(3,"laxman",3000));
//        Map<Integer, Long> map=list .stream(). parallel()
//
//                .filter(account-> (account.getBalance()>1000))
//
//                .collect(Collectors.groupingBy(Account::getId,
//                        Collectors.counting()))
//                ;
//        for(Integer i:map.keySet())
//        {
//            System.out.println(i);
//        }
//    }
//    @Test
//    public void mapreduce() {
//        List<Account> list= Arrays.asList(new Account(1,"praha",1000),new Account(2,"ram",2000),new Account(3,"laxman",3000));
//        Assert.assertEquals(6000,list .stream()
//                .map(account -> account.getBalance())
//                .reduce(0,Integer::sum).intValue());
//
//    }
//
//}
