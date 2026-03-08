/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mephi.sem1maven;
 
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import org.yaml.snakeyaml.Yaml;

/**
 *
 * @author panda
 */
public class Sem1Maven {
    
    public static void main(String[] args) {
        Yaml yaml = new Yaml();
        InputStream inputStream = People.class.getClassLoader().getResourceAsStream("yamlPeople.yaml");
        People data = yaml.loadAs(inputStream, People.class);
        List<Person> people = data.getPeople();
        
        for (Person person : people) {
            System.out.println("Имя:"+person.getName()+"  "+"Адрес:"+person.getAdress());
            System.out.println();
        }
    }
}
