package tw.idv.cha102.g7.classSheet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    StudentRepository studentRepository;

    @PostMapping("/student")
    public String insert(@RequestBody Student student) {
        studentRepository.save(student);
        return "執行create";
    }

    @PutMapping("/student/{studentId}")
    public String update(@PathVariable Integer studentId,
                         @RequestBody Student student) {
        student.setId(studentId);
        studentRepository.save(student);
        return "執行修改方法";
    }

    @DeleteMapping("/student/{studentId}")
    public String dis(@PathVariable Integer studentId){

        studentRepository.deleteById(studentId);

        return "執行資料庫的 Delete 操作";
    }
}
