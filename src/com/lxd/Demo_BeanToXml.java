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
        hobby.add("����");
        hobby.add("����");
        hobby.add("ƹ����");
        
        List<Student> studentList = new ArrayList<>();
        
        Student st = new Student("����","��",10001,"���Ӱ�",hobby);
        studentList.add(st);
        Student st1 = new Student("����","��",10002,"��ͨ��",hobby);
        studentList.add(st1);
        Student st2 = new Student("����","Ů",10003,"��ͨ��",hobby);
        studentList.add(st2);
        
        StudentList students = new StudentList();
        students.setStudents(studentList);
        
        JAXB.marshal(students, "E:\\test.xml");
	}

}
//1.7һ�°汾
//public class BeanToXml {
//    
//    /**
//     * java����ת��Ϊxml�ļ�
//     * @param xmlPath  xml�ļ�·��
//     * @param load    java����.Class
//     * @return    xml�ļ���String
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
//            hobby.add("����");
//            hobby.add("����");
//            hobby.add("ƹ����");
//            
//            List<Student> studentList = new ArrayList<>();
//            
//            Student st = new Student("����","��",10001,"���Ӱ�",hobby);
//            studentList.add(st);
//            Student st1 = new Student("����","��",10002,"��ͨ��",hobby);
//            studentList.add(st1);
//            Student st2 = new Student("����","Ů",10003,"��ͨ��",hobby);
//            studentList.add(st2);
//            
//            StudentList students = new StudentList();
//            students.setStudents(studentList);
//            String str =  BeanToXml.beanToXml(students, StudentList.class);
//            
//            //д�뵽xml�ļ���
//            String xmlPath = "D:/testConfig.xml";
//            BufferedWriter bfw = new BufferedWriter(new FileWriter(new File(xmlPath)));
//            bfw.write(str);
//            bfw.close();
//    }
//}
