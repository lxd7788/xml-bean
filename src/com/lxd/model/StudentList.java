package com.lxd.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="list")
public class StudentList {
    
    List<Student> students;    //����ѧ����Ϣ�ļ���
    
    @XmlElement(name = "student")  
    public List<Student> getStudents() {
        return students;
    }
    
    public void setStudents(List<Student> students) {
        this.students = students;
    }

}
