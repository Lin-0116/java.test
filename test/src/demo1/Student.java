package demo1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//学生类
public class Student {
    private String name;
    private char sex;
    private double score;
}
