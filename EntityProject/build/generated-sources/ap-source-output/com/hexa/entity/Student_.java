package com.hexa.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-23T15:48:06")
@StaticMetamodel(Student.class)
public class Student_ { 

    public static volatile SingularAttribute<Student, Integer> stuId;
    public static volatile SingularAttribute<Student, Date> dob;
    public static volatile SingularAttribute<Student, String> stuName;
    public static volatile SingularAttribute<Student, String> dept;
    public static volatile SingularAttribute<Student, Integer> marks;

}