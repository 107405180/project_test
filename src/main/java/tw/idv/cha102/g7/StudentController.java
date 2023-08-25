//package tw.idv.cha102.g7;
//
//import org.springframework.web.bind.annotation.*;
//
//import javax.validation.Valid;
//
//@RestController
//public class StudentController {
//
//    // postMapping是spring boot針對下方程式碼的簡易寫法
//    // @RequestMapping(value="/students",method = RequestMethod.POST)
//    @PostMapping("/students")
//    public String create(@RequestBody @Valid Student student) {
//        // 當前端輸入要新增的學生資訊時，我們可以透過requestbody取得資訊
//
//        System.out.println("新增的學生id: " + student.getId());
//        System.out.println("新增的學生Name: " + student.getName());
//        return "執行資料庫create方法";
//    }
//
//    @GetMapping("/students/{studentId}")
//    public String read(@PathVariable Integer studentId) {
//        System.out.println("查詢的學生ID: " + studentId);
//        return "執行資料庫read方法";
//    }
//
//    @PutMapping("/students/{studentId}")
//    public String update(@PathVariable Integer studentId,
//                         @RequestBody Student student) {
//        return "執行資料庫update方法";
//
//    }
//
//    @DeleteMapping
//    public String delete(@PathVariable Student student) {
//        return "執行資料庫update方法";
//    }
//    //delete方法與get方法一樣，都是只能在URL中傳遞
//}
