package com.zking.test;

import com.zking.model.SsmUser;
import com.zking.service.ISsmUserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class SsmUserMapperTest {
    @Autowired
    private ISsmUserService ssmUserService;
    private SsmUser ssmUser;
    @Before
    public void before(){
        ssmUser = new SsmUser();
    }


}