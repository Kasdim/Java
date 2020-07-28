package test;

import domain.Student;
import service.StudentService;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestOrm {

    public static void main(String[] args) {
        StudentService service = StudentService.getInstance();
        //修改
//        System.out.println(service.update(new Student(4, "ahri", "female", 1949, new Date(System.currentTimeMillis() - 5400000))));//获取当前时间

//        Map<String,Object> map1 = new HashMap();
//        map1.put("id",1);
//        map1.put("name","Ahri");
//        map1.put("sex","feMale");
//        map1.put("birth",1977);
//        map1.put("ctime",new Date(System.currentTimeMillis() - 5400000));
//        System.out.println(service.update(map1));

        //新增
//        System.out.println(service.insert(new Student(7,"xin","male",1978,new Date(System.currentTimeMillis() - 5400000))));

//        Map<String,Object> map = new HashMap();
//        map.put("id",8);
//        map.put("name","alista");
//        map.put("sex","male");
//        map.put("birth",2005);
//        map.put("ctime",new Date(System.currentTimeMillis() - 5400000));
//        System.out.println(service.insert(map));

        //删除
//        System.out.println(service.delete(6));

        //单条查询
        Student student = service.selectOne(1);
        System.out.println(student.getId() + " - " + student.getName() + " - " + student.getSex() + " - " + student.getBirth() + " - " + student.getCtime());

        List<Student> list = service.selectList();
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).getId() + " - " + list.get(i).getName() + " - " + list.get(i).getSex() + " - " + list.get(i).getBirth() + " - " + list.get(i).getCtime());
        }

    }

}
