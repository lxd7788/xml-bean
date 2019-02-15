package com.lxd;

import java.io.File;

import javax.xml.bind.JAXB;

import com.lxd.model.StudentList;

public class Demo_XmlToBean {
	public static void main(String[] args) {
		StudentList studentList = JAXB.unmarshal(new File("E:\\test.xml"), StudentList.class);
		System.out.println(studentList.getStudents().get(0).getName());
	}
}
//1.7һ��
//public class XmlToBean {
//    
//    /**
//     * xml�ļ�����ת��Ϊ����
//     * @param xmlPath  xml�ļ�·��
//     * @param load    java����.Class
//     * @return    java����
//     * @throws JAXBException    
//     * @throws IOException
//     */
//    public static Object xmlToBean(String xmlPath,Class<?> load) throws JAXBException, IOException{
//        JAXBContext context = JAXBContext.newInstance(load);  
//        Unmarshaller unmarshaller = context.createUnmarshaller(); 
//        Object object = unmarshaller.unmarshal(new File(xmlPath));
//        return object;
//    }
//    
//    public static void main(String[] args) throws IOException, JAXBException {
//        String xmlPath =  "D:/testConfig.xml";
//        Object object = XmlToBean.xmlToBean(xmlPath,StudentList.class);
//        StudentList students = (StudentList)object;
//        List<Student> studentList = students.getStudents();
//        
//        for(int i=0;i<studentList.size();i++){
//            System.out.println(studentList.get(i).name);
//            System.out.println(studentList.get(i).sex);
//            System.out.println(studentList.get(i).number);
//            System.out.println(studentList.get(i).className);
//            for(String str :studentList.get(i).hobby){
//                System.out.print(str+" ");
//            }
//            System.out.println("-------------");
//        }
//    }
//}