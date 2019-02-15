package com.lxd;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXB;

import com.lxd.model.Student;
import com.lxd.model.StudentList;

public class Demo_BeanToXml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> hobby = new ArrayList<>();
        hobby.add("篮球");
        hobby.add("音乐");
        hobby.add("乒乓球");
        
        List<Student> studentList = new ArrayList<>();
        
        Student st = new Student("张三","男",10001,"尖子班",hobby);
        studentList.add(st);
        Student st1 = new Student("李四","男",10002,"普通班",hobby);
        studentList.add(st1);
        Student st2 = new Student("莉莉","女",10003,"普通班",hobby);
        studentList.add(st2);
        
        StudentList students = new StudentList();
        students.setStudents(studentList);
        
        JAXB.marshal(students, "E:\\test.xml");
	}

}
//1.7一下版本
//public class BeanToXml {
//    
//    /**
//     * java对象转换为xml文件
//     * @param xmlPath  xml文件路径
//     * @param load    java对象.Class
//     * @return    xml文件的String
//     * @throws JAXBException    
//     */
//    public static String beanToXml(Object obj,Class<?> load) throws JAXBException{
//        JAXBContext context = JAXBContext.newInstance(load);
//        Marshaller marshaller = context.createMarshaller();
//        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//        marshaller.setProperty(Marshaller.JAXB_ENCODING, "GBK");
//        StringWriter writer = new StringWriter();
//        marshaller.marshal(obj,writer);
//        return writer.toString();
//    }
//    public static void main(String[] args) throws JAXBException, IOException {
//            List<String> hobby = new ArrayList<>();
//            hobby.add("篮球");
//            hobby.add("音乐");
//            hobby.add("乒乓球");
//            
//            List<Student> studentList = new ArrayList<>();
//            
//            Student st = new Student("张三","男",10001,"尖子班",hobby);
//            studentList.add(st);
//            Student st1 = new Student("李四","男",10002,"普通班",hobby);
//            studentList.add(st1);
//            Student st2 = new Student("莉莉","女",10003,"普通班",hobby);
//            studentList.add(st2);
//            
//            StudentList students = new StudentList();
//            students.setStudents(studentList);
//            String str =  BeanToXml.beanToXml(students, StudentList.class);
//            
//            //写入到xml文件中
//            String xmlPath = "D:/testConfig.xml";
//            BufferedWriter bfw = new BufferedWriter(new FileWriter(new File(xmlPath)));
//            bfw.write(str);
//            bfw.close();
//    }
//}
