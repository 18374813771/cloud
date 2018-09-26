package dept.Controller;

import cn.dhx.api.entity.Dept;
import dept.DeptService.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("dept/")
public class DeptController {
    @Autowired
    private DeptService deptService;

    /**
     * @author dhx
     * @Date 2018 8 30
     * <p>添加部门</>
     */
    @PostMapping("/add")
    public void addDept(@RequestBody Dept dept) throws IOException {
//        ObjectMapper mapper = new ObjectMapper();
//        Dept dept = mapper.readValue(deptInfo,Dept.class);
        deptService.addDept(dept);
    }
    /**
     * @author dhx
     * @Date 2018 8 30
     * <p>根据id查询部门<p/>
     * */
    @GetMapping("/get/{id}")
    public Dept getDept(@PathVariable Integer id){
        return deptService.findById(id);
    }

    /**
     * @author dhx
     * @Date 2018 8 30
     * <p>查询所有部门<p/>
     * */
    @GetMapping("/all/get")
    public List<Dept> getAllDept(){
        return deptService.findAll();
    }
}
