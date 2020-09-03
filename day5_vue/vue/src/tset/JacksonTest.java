package tset;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import domain.Person;
import org.junit.Test;

import javax.print.attribute.standard.PrinterResolution;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class JacksonTest {
    @Test
    public void test1() throws IOException {
        //1,创建Person对象
        Person p=new Person();
        p.setName("zhangsan");
        p.setAge(23);
        p.setGender("男");
        //2,创建Jackson的核心对象
        ObjectMapper mapper = new ObjectMapper();
        //3,转换
        //writeValue()
        //writeValueAsString()
//        String json = mapper.writeValueAsString(p);
//        System.out.println(json);
        mapper.writeValue(new File("./a.txt"),p);
        mapper.writeValue(new FileWriter("./b.txt"),p);
    }
    @Test
    public void test2() throws JsonProcessingException {
        Person p=new Person();
        p.setName("lisi");
        p.setAge(24);
        p.setGender("女");
        p.setBirthday(new Date());
        //2,创建核心Jackson对象
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(p);
        System.out.println(json);
    }

    @Test
    public void test3() throws JsonProcessingException {
        Person p = new Person();
        p.setName("张三");
        p.setAge(23);
        p.setGender("男");
        p.setBirthday(new Date());

        Person p1 = new Person();
        p1.setName("张三");
        p1.setAge(23);
        p1.setGender("男");
        p1.setBirthday(new Date());

        Person p2 = new Person();
        p2.setName("张三");
        p2.setAge(23);
        p2.setGender("男");
        p2.setBirthday(new Date());

        ArrayList<Person> ps = new ArrayList<>();
        ps.add(p);
        ps.add(p1);
        ps.add(p2);

        ObjectMapper mapper = new ObjectMapper();

        String s = mapper.writeValueAsString(ps);
        System.out.println(s);
    }

    @Test
    public void test4() throws JsonProcessingException {
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "zhangsan");
        map.put("age", 23);
        map.put("gender", '男');

        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(map);
        System.out.println(s);
    }

    @Test
    public void test5() throws IOException {
        String json="{\"gender\":\"男\",\"name\":\"zhangsan\",\"age\":23}";
        ObjectMapper mapper = new ObjectMapper();
        Person person = mapper.readValue(json, Person.class);
        System.out.println(person);
    }

}

